package com.google.android.libraries.lens.common.p1999b;

import com.google.common.p4537i.C59290o;
import com.google.common.p4537i.C59294s;

/* renamed from: com.google.android.libraries.lens.common.b.a */
/* compiled from: PG */
public final class C24103a {

    /* renamed from: a */
    private static final C59290o f65808a = C59294s.m92132b();

    /* renamed from: a */
    public static String m44778a(String str, String str2) {
        String valueOf = String.valueOf(f65808a.mo56760b(str2));
        return str + ":" + valueOf;
    }

    @Deprecated
    /* renamed from: b */
    public static String m44779b(String str, String str2, float f, float f2, float f3, float f4, float f5) {
        StringBuilder sb = new StringBuilder();
        sb.append(f);
        sb.append(f2);
        sb.append(f3);
        sb.append(f4);
        sb.append(f5);
        String a = m44778a(str2, sb.toString());
        return str + ":" + a;
    }
}
