package app.jammes.babynap.domain.model

import org.junit.Test
import org.junit.Assert.assertEquals

class BabyTest {

    @Test
    fun `data class equality compares by contebt`() {
        val baby1 = Baby(id = "1", name = "James")
        val baby2 = Baby(id = "1", name = "James")
        assertEquals(baby1, baby2)
    }
}