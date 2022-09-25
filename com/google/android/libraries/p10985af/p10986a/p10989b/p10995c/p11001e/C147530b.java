package com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.p11001e;

import com.google.common.base.C58838bb;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.af.a.b.c.e.b */
/* compiled from: PG */
public final class C147530b {
    /* renamed from: a */
    public static void m240534a(String str) {
        C58838bb.m90873h(Pattern.matches("[a-z]+", str), "Module must be non-empty and [a-z]: %s", str);
        C58838bb.m90873h(!Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"default", "unused", "special", "reserved", "shared", "virtual", "managed"}))).contains(str), "Module name is reserved and cannot be used: %s", str);
    }
}
