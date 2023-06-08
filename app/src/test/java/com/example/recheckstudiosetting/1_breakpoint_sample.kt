package com.example.recheckstudiosetting

import com.example.recheckstudiosetting.list.F_Build_Execution_Deployment.dependency_breakpoint
import com.example.recheckstudiosetting.list.F_Build_Execution_Deployment.fooBreakpoints
import com.example.recheckstudiosetting.list.F_Build_Execution_Deployment.trigger_breakpoint
import org.junit.Test

class BreakPointSampleTest {
    @Test
    fun test_logging() {
        for (i in (0..10)) {
            fooBreakpoints(i)
        }
    }

    @Test
    fun test_dependency() {
        trigger_breakpoint(1)
        dependency_breakpoint(2)
        trigger_breakpoint(3)
    }
}