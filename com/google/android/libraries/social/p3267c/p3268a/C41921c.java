package com.google.android.libraries.social.p3267c.p3268a;

import android.net.Uri;

/* renamed from: com.google.android.libraries.social.c.a.c */
/* compiled from: PG */
public final class C41921c {

    /* renamed from: a */
    public static final /* synthetic */ int f109365a = 0;

    /* renamed from: b */
    private static final C41920b f109366b = new C41920b();

    static {
        Uri.parse("https://lh3.googleusercontent.com");
    }

    /* renamed from: a */
    public static boolean m73452a(String str) {
        if (str == null) {
            return false;
        }
        return f109366b.mo44383a(str);
    }

    /* renamed from: b */
    public static String m73453b(String str, int i, int i2) {
        int i3 = C41919a.f109324a;
        String b = f109366b.mo44384b(str, 0, i, i2, -1, -1);
        if (b != null) {
            return b;
        }
        if (i == 0) {
            if (i2 == 0) {
                return str;
            }
            i = 0;
        }
        return C41922d.m73455a(i, i2, str);
    }

    /* renamed from: c */
    public static String m73454c(String str, int i, int i2, int i3, int i4, int i5) {
        int i6 = C41919a.f109324a;
        String b = f109366b.mo44384b(str, i, i2, i3, i4, i5);
        if (b != null) {
            return b;
        }
        if (i2 == 0) {
            if (i3 == 0) {
                return str;
            }
            i2 = 0;
        }
        return C41922d.m73455a(i2, i3, str);
    }
}
