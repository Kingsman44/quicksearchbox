package com.google.android.libraries.storage.p3304a.p3305a;

import android.accounts.Account;
import android.content.Context;
import com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42748i;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.storage.a.a.f */
/* compiled from: PG */
public final class C42719f {

    /* renamed from: a */
    static final Account f111973a = C42714a.f111955a;

    /* renamed from: b */
    public static final /* synthetic */ int f111974b = 0;

    /* renamed from: c */
    private static final Pattern f111975c = Pattern.compile("[a-z]+(_[a-z]+)*");

    /* renamed from: d */
    private static final Set f111976d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"default", "unused", "special", "reserved", "shared", "virtual", "managed"})));

    /* renamed from: e */
    private static final Set f111977e = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"files", "cache", "managed", "directboot-files", "directboot-cache", "external"})));

    /* renamed from: a */
    public static C42718e m75461a(Context context) {
        return new C42718e(context);
    }

    /* renamed from: b */
    public static void m75462b(String str) {
        Set set = f111977e;
        C42748i.m75526a(set.contains(str), "The only supported locations are %s: %s", set, str);
    }

    /* renamed from: c */
    public static void m75463c(String str) {
        C42748i.m75526a(f111975c.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        Object[] objArr = {str};
        C42748i.m75526a(!f111976d.contains(str), "Module name is reserved and cannot be used: %s", objArr);
    }
}
