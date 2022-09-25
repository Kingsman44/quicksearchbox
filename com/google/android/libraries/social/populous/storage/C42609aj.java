package com.google.android.libraries.social.populous.storage;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.android.libraries.social.populous.storage.aj */
/* compiled from: PG */
public final /* synthetic */ class C42609aj implements FilenameFilter {

    /* renamed from: a */
    public static final /* synthetic */ C42609aj f111807a = new C42609aj();

    private /* synthetic */ C42609aj() {
    }

    public final boolean accept(File file, String str) {
        return str.startsWith("TopNContactsGrpc");
    }
}
