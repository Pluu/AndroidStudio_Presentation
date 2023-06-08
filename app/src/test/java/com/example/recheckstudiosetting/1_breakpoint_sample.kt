package com.example.recheckstudiosetting

import com.example.recheckstudiosetting.list.F_Build_Execution_Deployment.fooBreakpoints
import org.junit.Test

class BreakPointSampleTest {
    @Test
    fun addition_isCorrect() {
        for (i in (0..10)) {
            fooBreakpoints(i)
        }
    }
}