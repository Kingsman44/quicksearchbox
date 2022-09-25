package com.google.android.gms.common.util;

import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.common.util.o */
/* compiled from: PG */
public final class C144015o {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    /* renamed from: a */
    public static boolean m234195a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
