package com.google.android.libraries.social.populous.storage;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.android.libraries.social.populous.storage.al */
/* compiled from: PG */
public final /* synthetic */ class C42611al implements FilenameFilter {

    /* renamed from: a */
    public static final /* synthetic */ C42611al f111809a = new C42611al();

    private /* synthetic */ C42611al() {
    }

    public final boolean accept(File file, String str) {
        return str.startsWith("TopNContacts");
    }
}
