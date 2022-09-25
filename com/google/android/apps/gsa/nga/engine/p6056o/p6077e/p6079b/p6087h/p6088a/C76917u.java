package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6087h.p6088a;

import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.h.a.u */
/* compiled from: PG */
public final class C76917u {
    /* renamed from: a */
    public static String m123539a(String str) {
        if (str.isEmpty()) {
            return str;
        }
        int i = 1;
        if (str.length() > 1 && Character.isSurrogate(str.charAt(0))) {
            i = 2;
        }
        return String.valueOf(str.substring(0, i).toUpperCase(Locale.US)).concat(String.valueOf(str.substring(i)));
    }
}
