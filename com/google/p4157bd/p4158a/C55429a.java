package com.google.p4157bd.p4158a;

import com.google.common.base.C58838bb;

/* renamed from: com.google.bd.a.a */
/* compiled from: PG */
public final class C55429a {

    /* renamed from: a */
    private static final String[] f146249a = {"/m/", "/g/", "/t/", "/x/", "/n/", "/p/", "/r/", "/s/"};

    /* renamed from: a */
    public static String m87691a(long j) {
        if (j == 0) {
            return "/m/0";
        }
        if (((int) (j >>> 62)) == 0) {
            StringBuilder sb = new StringBuilder();
            int i = (int) ((j >>> 59) & 7);
            C58838bb.m90871f(i < 6, "Invalid graph ID: %i", i);
            sb.append(f146249a[i]);
            sb.append("0123456789bcdfghjklmnpqrstvwxyz_".charAt(i));
            long j2 = j & 576460752303423487L;
            StringBuilder sb2 = new StringBuilder();
            for (int i2 = 0; i2 < 13; i2++) {
                sb2.append("0123456789bcdfghjklmnpqrstvwxyz_".charAt((int) (31 & j2)));
                j2 >>>= 5;
                if (j2 == 0) {
                    break;
                }
            }
            sb.append(sb2.reverse().toString());
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid MID version");
    }
}
