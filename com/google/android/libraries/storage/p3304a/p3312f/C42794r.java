package com.google.android.libraries.storage.p3304a.p3312f;

import android.net.Uri;
import android.os.Process;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.libraries.storage.a.f.r */
/* compiled from: PG */
final class C42794r {

    /* renamed from: a */
    private static final AtomicLong f112058a = new AtomicLong();

    /* renamed from: a */
    static Uri m75566a(Uri uri) {
        int myPid = Process.myPid();
        long id = Thread.currentThread().getId();
        long currentTimeMillis = System.currentTimeMillis();
        long andIncrement = f112058a.getAndIncrement();
        return uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".mobstore_tmp-" + myPid + "-" + id + "-" + currentTimeMillis + "-" + andIncrement)).build();
    }
}
