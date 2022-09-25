package com.google.android.libraries.storage.p3304a.p3305a;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;

/* renamed from: com.google.android.libraries.storage.a.a.d */
/* compiled from: PG */
public final class C42717d {
    /* renamed from: a */
    public static File m75456a(Context context) {
        return m75457b(context.createDeviceProtectedStorageContext()).getParentFile();
    }

    /* renamed from: b */
    public static File m75457b(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            SystemClock.sleep(100);
            filesDir = context.getFilesDir();
            if (filesDir == null) {
                throw new IllegalStateException("getFilesDir returned null twice.");
            }
        }
        return filesDir;
    }
}
