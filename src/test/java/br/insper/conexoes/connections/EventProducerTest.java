package br.insper.conexoes.connections;

import org.junit.jupiter.api.Test;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

class EventProducerTest {

    @Test
    @SuppressWarnings("unchecked")
    void sendShouldLeftPushEventToQueue() {
        RedisTemplate<String, Event> redisTemplate = mock(RedisTemplate.class);
        ListOperations<String, Event> listOps = mock(ListOperations.class);
        when(redisTemplate.opsForList()).thenReturn(listOps);

        EventProducer producer = new EventProducer(redisTemplate);
        Event event = new Event("CREATE", "desc", "src");

        producer.send(event);

        verify(listOps).leftPush(eq("events-queue"), eq(event));
    }
}
