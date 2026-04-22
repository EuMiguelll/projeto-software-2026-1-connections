package br.insper.conexoes.connections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EventTest {

    @Test
    void constructorAndGettersShouldReturnValues() {
        Event event = new Event("CREATE", "desc", "src");
        assertEquals("CREATE", event.getType());
        assertEquals("desc", event.getDescription());
        assertEquals("src", event.getSource());
    }

    @Test
    void settersShouldUpdateValues() {
        Event event = new Event("a", "b", "c");
        event.setType("X");
        event.setDescription("Y");
        event.setSource("Z");
        assertEquals("X", event.getType());
        assertEquals("Y", event.getDescription());
        assertEquals("Z", event.getSource());
    }
}
