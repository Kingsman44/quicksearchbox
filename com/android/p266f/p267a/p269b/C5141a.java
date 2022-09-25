package com.android.p266f.p267a.p269b;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.HashSet;
import java.util.regex.Pattern;

/* renamed from: com.android.f.a.b.a */
/* compiled from: PG */
public final class C5141a {

    /* renamed from: a */
    private static String f16343a;

    /* renamed from: b */
    private static TelephonyManager f16344b;

    /* renamed from: c */
    private static final char[] f16345c = {'-', '.', ',', '(', ')', ' ', '/', '\\', '*', '#', '+'};

    /* renamed from: d */
    private static HashSet f16346d = new HashSet(11);

    static {
        for (int i = 0; i < 11; i++) {
            f16346d.add(Character.valueOf(f16345c[i]));
        }
        Pattern.compile("\\s*(\"[^\"]*\"|[^<>\"]+)\\s*<([^<>]+)>\\s*");
    }

    private C5141a() {
    }

    /* renamed from: a */
    public static String m14058a(Context context) {
        if (f16343a == null) {
            synchronized (C5141a.class) {
                if (f16344b == null) {
                    f16344b = (TelephonyManager) context.getSystemService("phone");
                }
            }
            f16343a = f16344b.getLine1Number();
        }
        return f16343a;
    }
}
