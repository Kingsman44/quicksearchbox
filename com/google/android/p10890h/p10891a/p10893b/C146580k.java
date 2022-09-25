package com.google.android.p10890h.p10891a.p10893b;

import android.net.Uri;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.google.android.h.a.b.k */
/* compiled from: PG */
public final class C146580k {

    /* renamed from: e */
    private static final NumberFormat f395863e;

    /* renamed from: a */
    public final String f395864a;

    /* renamed from: b */
    public final HashMap f395865b = new HashMap();

    /* renamed from: c */
    public final StringBuilder f395866c = new StringBuilder();

    /* renamed from: d */
    public int f395867d;

    /* renamed from: f */
    private final long f395868f;

    static {
        NumberFormat instance = NumberFormat.getInstance(Locale.US);
        f395863e = instance;
        instance.setMinimumFractionDigits(3);
        instance.setMaximumFractionDigits(3);
        instance.setGroupingUsed(false);
    }

    public C146580k(String str, String str2, long j) {
        String str3 = str + "?cpn=" + Uri.encode(str2, ",:");
        this.f395864a = str3;
        this.f395868f = j;
        this.f395867d = str3.length();
    }

    /* renamed from: a */
    public static String m238793a(long j) {
        return f395863e.format((double) (((float) j) / 1000.0f));
    }

    /* renamed from: b */
    public final StringBuilder mo123372b(long j) {
        this.f395866c.setLength(0);
        StringBuilder sb = this.f395866c;
        sb.append(m238793a(Math.max(0, j - this.f395868f)));
        sb.append(':');
        return sb;
    }

    /* renamed from: c */
    public final void mo123373c(String str, String str2) {
        StringBuilder sb = (StringBuilder) this.f395865b.get(str);
        int length = str2.length();
        if (sb == null) {
            this.f395867d += str.length() + length + 2;
            HashMap hashMap = this.f395865b;
            StringBuilder sb2 = new StringBuilder(length);
            sb2.append(str2);
            hashMap.put(str, sb2);
            return;
        }
        this.f395867d += length + 1;
        sb.ensureCapacity(sb.length() + 1 + length);
        sb.append(',');
        sb.append(str2);
    }

    /* renamed from: d */
    public final void mo123374d(String str) {
        StringBuilder sb = (StringBuilder) this.f395865b.remove(str);
        if (sb != null) {
            this.f395867d -= (str.length() + sb.length()) + 2;
        }
    }
}
