package com.example.recheckstudiosetting.list.C_Editor;

import org.jetbrains.annotations.Nullable;

public class ExternalAnnotationSample {
    private String safeString;
    private String unsafeString;

    @Nullable
    public String getSafeString() {
        return safeString;
    }

    public String getUnsafeString() {
        return unsafeString;
    }
}
