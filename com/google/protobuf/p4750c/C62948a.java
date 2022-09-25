package com.google.protobuf.p4750c;

import com.google.common.p4573p.C60716f;
import com.google.common.p4573p.C60718h;
import com.google.protobuf.C62909aq;
import com.google.protobuf.C62910ar;

/* renamed from: com.google.protobuf.c.a */
/* compiled from: PG */
public final class C62948a {

    /* renamed from: a */
    public static final C62910ar f169986a;

    /* renamed from: b */
    public static final C62910ar f169987b;

    static {
        C62909aq aqVar = (C62909aq) C62910ar.f169858c.createBuilder();
        aqVar.copyOnWrite();
        ((C62910ar) aqVar.instance).f169860a = -315576000000L;
        aqVar.copyOnWrite();
        ((C62910ar) aqVar.instance).f169861b = -999999999;
        C62910ar arVar = (C62910ar) aqVar.build();
        C62909aq aqVar2 = (C62909aq) C62910ar.f169858c.createBuilder();
        aqVar2.copyOnWrite();
        ((C62910ar) aqVar2.instance).f169860a = 315576000000L;
        aqVar2.copyOnWrite();
        ((C62910ar) aqVar2.instance).f169861b = 999999999;
        f169986a = (C62910ar) aqVar2.build();
        C62909aq aqVar3 = (C62909aq) C62910ar.f169858c.createBuilder();
        aqVar3.copyOnWrite();
        ((C62910ar) aqVar3.instance).f169860a = 0;
        aqVar3.copyOnWrite();
        ((C62910ar) aqVar3.instance).f169861b = 0;
        f169987b = (C62910ar) aqVar3.build();
    }

    /* renamed from: a */
    public static int m95450a(C62910ar arVar, C62910ar arVar2) {
        m95465p(arVar);
        m95465p(arVar2);
        long j = arVar.f169860a;
        long j2 = arVar2.f169860a;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (j != j2) {
            return i;
        }
        int i2 = arVar.f169861b;
        int i3 = arVar2.f169861b;
        if (i2 == i3) {
            return 0;
        }
        return i2 < i3 ? -1 : 1;
    }

    /* renamed from: b */
    public static long m95451b(C62910ar arVar) {
        m95465p(arVar);
        return arVar.f169860a / 3600;
    }

    /* renamed from: c */
    public static long m95452c(C62910ar arVar) {
        m95465p(arVar);
        return C60718h.m92647a(C60718h.m92648b(arVar.f169860a, 1000000), (long) (arVar.f169861b / 1000));
    }

    /* renamed from: d */
    public static long m95453d(C62910ar arVar) {
        m95465p(arVar);
        return C60718h.m92647a(C60718h.m92648b(arVar.f169860a, 1000), (long) (arVar.f169861b / 1000000));
    }

    /* renamed from: e */
    public static long m95454e(C62910ar arVar) {
        m95465p(arVar);
        return arVar.f169860a / 60;
    }

    /* renamed from: f */
    public static long m95455f(C62910ar arVar) {
        m95465p(arVar);
        return C60718h.m92647a(C60718h.m92648b(arVar.f169860a, 1000000000), (long) arVar.f169861b);
    }

    /* renamed from: g */
    public static C62910ar m95456g(long j) {
        C62909aq aqVar = (C62909aq) C62910ar.f169858c.createBuilder();
        long b = C60718h.m92648b(j, 86400);
        aqVar.copyOnWrite();
        ((C62910ar) aqVar.instance).f169860a = b;
        aqVar.copyOnWrite();
        ((C62910ar) aqVar.instance).f169861b = 0;
        return (C62910ar) aqVar.build();
    }

    /* renamed from: h */
    public static C62910ar m95457h(long j) {
        C62909aq aqVar = (C62909aq) C62910ar.f169858c.createBuilder();
        long b = C60718h.m92648b(j, 3600);
        aqVar.copyOnWrite();
        ((C62910ar) aqVar.instance).f169860a = b;
        aqVar.copyOnWrite();
        ((C62910ar) aqVar.instance).f169861b = 0;
        return (C62910ar) aqVar.build();
    }

    /* renamed from: i */
    public static C62910ar m95458i(long j) {
        return m95462m(j / 1000000, (int) ((j % 1000000) * 1000));
    }

    /* renamed from: j */
    public static C62910ar m95459j(long j) {
        return m95462m(j / 1000, (int) ((j % 1000) * 1000000));
    }

    /* renamed from: k */
    public static C62910ar m95460k(long j) {
        C62909aq aqVar = (C62909aq) C62910ar.f169858c.createBuilder();
        long b = C60718h.m92648b(j, 60);
        aqVar.copyOnWrite();
        ((C62910ar) aqVar.instance).f169860a = b;
        aqVar.copyOnWrite();
        ((C62910ar) aqVar.instance).f169861b = 0;
        return (C62910ar) aqVar.build();
    }

    /* renamed from: l */
    public static C62910ar m95461l(long j) {
        return m95462m(j / 1000000000, (int) (j % 1000000000));
    }

    /* renamed from: m */
    public static C62910ar m95462m(long j, int i) {
        if (i <= -1000000000 || i >= 1000000000) {
            j = C60718h.m92647a(j, (long) (i / 1000000000));
            i %= 1000000000;
        }
        if (j > 0 && i < 0) {
            i += 1000000000;
            j--;
        }
        if (j < 0 && i > 0) {
            i -= 1000000000;
            j++;
        }
        C62909aq aqVar = (C62909aq) C62910ar.f169858c.createBuilder();
        aqVar.copyOnWrite();
        ((C62910ar) aqVar.instance).f169860a = j;
        aqVar.copyOnWrite();
        ((C62910ar) aqVar.instance).f169861b = i;
        C62910ar arVar = (C62910ar) aqVar.build();
        m95465p(arVar);
        return arVar;
    }

    /* renamed from: n */
    public static C62910ar m95463n(C62910ar arVar, C62910ar arVar2) {
        m95465p(arVar);
        m95465p(arVar2);
        return m95462m(C60718h.m92649c(arVar.f169860a, arVar2.f169860a), C60716f.m92645b(arVar.f169861b, arVar2.f169861b));
    }

    /* renamed from: o */
    public static boolean m95464o(C62910ar arVar) {
        m95465p(arVar);
        long j = arVar.f169860a;
        return j == 0 ? arVar.f169861b < 0 : j < 0;
    }

    /* renamed from: p */
    public static void m95465p(C62910ar arVar) {
        long j = arVar.f169860a;
        int i = arVar.f169861b;
        if (j >= -315576000000L && j <= 315576000000L && ((long) i) >= -999999999 && i < 1000000000) {
            if (j >= 0 && i >= 0) {
                return;
            }
            if (j <= 0 && i <= 0) {
                return;
            }
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", new Object[]{Long.valueOf(j), Integer.valueOf(i)}));
    }
}
