package com.google.android.gms.droidguard.p10791b;

import java.io.File;

/* renamed from: com.google.android.gms.droidguard.b.c */
/* compiled from: PG */
public final class C144115c {
    /* renamed from: a */
    public static boolean m234321a(File file) {
        File[] listFiles;
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File a : listFiles) {
                m234321a(a);
            }
        }
        return file.delete();
    }
}
