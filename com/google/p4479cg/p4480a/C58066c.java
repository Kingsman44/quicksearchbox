package com.google.p4479cg.p4480a;

import com.google.common.base.C58838bb;
import com.google.p4479cg.C58072d;

/* renamed from: com.google.cg.a.c */
/* compiled from: PG */
public final class C58066c {
    /* renamed from: a */
    static int m88819a(int i, boolean z) {
        boolean z2 = false;
        if (i > 0 && i <= 12) {
            z2 = true;
        }
        C58838bb.m90871f(z2, "invalid month %s", i);
        if (i == 2) {
            return z ? 29 : 28;
        }
        return ((5546 >> i) & 1) + 30;
    }

    /* renamed from: b */
    public static boolean m88820b(int i, int i2) {
        return i > 0 && i <= i2;
    }

    /* renamed from: c */
    public static void m88821c(C58072d dVar) {
        C58838bb.m90880o(C58065b.m88818a(m88822d(dVar), dVar), "Date is invalid. See type/date.proto definition for valid values. Year (%s) must be [1-9999], or 0 if specifying a month and day without a year. Month (%s) must be [1-12], or 0 if specifying a year without a month and day. Day (%s) must be [1-31] and valid for the year and month specified, or 0 if specifying a year or year and month without a day.", Integer.valueOf(dVar.f155220a), Integer.valueOf(dVar.f155221b), Integer.valueOf(dVar.f155222c));
    }

    /* renamed from: d */
    public static int m88822d(C58072d dVar) {
        int i = dVar.f155220a;
        int i2 = dVar.f155221b;
        int i3 = dVar.f155222c;
        if (i != 0 && i2 == 0) {
            if (i3 == 0) {
                return 5;
            }
            i2 = 0;
        }
        if (i == 0 && i2 != 0 && i3 != 0) {
            return 3;
        }
        if (i == 0 || i2 == 0 || i3 != 0) {
            return (i == 0 || i2 == 0 || i3 == 0) ? 1 : 2;
        }
        return 4;
    }
}
