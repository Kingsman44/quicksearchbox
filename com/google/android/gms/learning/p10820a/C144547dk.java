package com.google.android.gms.learning.p10820a;

import android.content.Context;
import java.io.File;

/* renamed from: com.google.android.gms.learning.a.dk */
/* compiled from: PG */
public final class C144547dk {

    /* renamed from: a */
    public final Context f391188a;

    public C144547dk(Context context) {
        this.f391188a = context;
    }

    /* renamed from: a */
    public static boolean m234922a(File file) {
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            return true;
        }
        boolean z = true;
        for (File a : file.listFiles()) {
            z &= m234922a(a);
        }
        if (!file.delete() || !z) {
            return false;
        }
        return true;
    }
}
