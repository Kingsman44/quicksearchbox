package com.google.android.play.core.p3525a;

import android.content.Context;
import java.io.File;

/* renamed from: com.google.android.play.core.a.r */
/* compiled from: PG */
final class C45045r {

    /* renamed from: a */
    public final Context f117679a;

    public C45045r(Context context) {
        this.f117679a = context;
    }

    /* renamed from: a */
    public static long m80194a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File a : listFiles) {
                j += m80194a(a);
            }
        }
        return j;
    }
}
