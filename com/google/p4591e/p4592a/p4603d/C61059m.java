package com.google.p4591e.p4592a.p4603d;

import java.io.Serializable;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Pattern;
import p3186j$.util.DesugarTimeZone;

/* renamed from: com.google.e.a.d.m */
/* compiled from: PG */
public final class C61059m implements Serializable {

    /* renamed from: a */
    public static final TimeZone f165323a = DesugarTimeZone.getTimeZone("GMT");

    /* renamed from: b */
    public static final Pattern f165324b = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d+)?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");
    private static final long serialVersionUID = 1;

    /* renamed from: c */
    private final long f165325c;

    /* renamed from: d */
    private final boolean f165326d;

    /* renamed from: e */
    private final int f165327e;

    public C61059m(boolean z, long j, Integer num) {
        this.f165326d = z;
        this.f165325c = j;
        this.f165327e = z ? 0 : num == null ? TimeZone.getDefault().getOffset(j) / 60000 : num.intValue();
    }

    /* renamed from: b */
    private static void m93421b(StringBuilder sb, int i, int i2) {
        if (i < 0) {
            sb.append('-');
            i = -i;
        }
        int i3 = i;
        while (i3 > 0) {
            i3 /= 10;
            i2--;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append('0');
        }
        if (i != 0) {
            sb.append(i);
        }
    }

    /* renamed from: a */
    public final String mo57627a() {
        StringBuilder sb = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f165323a);
        gregorianCalendar.setTimeInMillis(this.f165325c + (((long) this.f165327e) * 60000));
        m93421b(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        m93421b(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        m93421b(sb, gregorianCalendar.get(5), 2);
        if (!this.f165326d) {
            sb.append('T');
            m93421b(sb, gregorianCalendar.get(11), 2);
            sb.append(':');
            m93421b(sb, gregorianCalendar.get(12), 2);
            sb.append(':');
            m93421b(sb, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                sb.append('.');
                m93421b(sb, gregorianCalendar.get(14), 3);
            }
            int i = this.f165327e;
            if (i == 0) {
                sb.append('Z');
            } else {
                if (i > 0) {
                    sb.append('+');
                } else {
                    sb.append('-');
                    i = -i;
                }
                m93421b(sb, i / 60, 2);
                sb.append(':');
                m93421b(sb, i % 60, 2);
            }
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C61059m)) {
            return false;
        }
        C61059m mVar = (C61059m) obj;
        return this.f165326d == mVar.f165326d && this.f165325c == mVar.f165325c && this.f165327e == mVar.f165327e;
    }

    public final int hashCode() {
        long[] jArr = new long[3];
        jArr[0] = this.f165325c;
        jArr[1] = true != this.f165326d ? 0 : 1;
        jArr[2] = (long) this.f165327e;
        return Arrays.hashCode(jArr);
    }

    public final String toString() {
        return mo57627a();
    }
}
