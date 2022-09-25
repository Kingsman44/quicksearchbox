package com.android.p265e;

import android.content.Context;
import android.os.StrictMode;
import android.p017a.p019b.C0093g;
import java.util.Locale;

/* renamed from: com.android.e.a */
/* compiled from: PG */
public final class C5114a {
    /* renamed from: a */
    public static final String m13987a(Context context, int i, Object... objArr) {
        return m13988b(Locale.getDefault(), context.getResources().getString(i), objArr);
    }

    /* renamed from: b */
    public static final String m13988b(Locale locale, String str, Object... objArr) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return C0093g.m43a(locale, str, objArr);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
