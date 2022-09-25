package com.google.protobuf.p4750c;

import com.google.common.p4573p.C60716f;
import com.google.common.p4573p.C60718h;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63041ff;
import com.google.protobuf.C63042fg;
import java.util.Comparator;
import java.util.Locale;

/* renamed from: com.google.protobuf.c.e */
/* compiled from: PG */
public final class C62953e {

    /* renamed from: a */
    public static final C63042fg f169990a;

    /* renamed from: b */
    public static final ThreadLocal f169991b = new C62951c();

    static {
        C63041ff ffVar = (C63041ff) C63042fg.f170152c.createBuilder();
        ffVar.copyOnWrite();
        ((C63042fg) ffVar.instance).f170154a = -62135596800L;
        ffVar.copyOnWrite();
        ((C63042fg) ffVar.instance).f170155b = 0;
        C63042fg fgVar = (C63042fg) ffVar.build();
        C63041ff ffVar2 = (C63041ff) C63042fg.f170152c.createBuilder();
        ffVar2.copyOnWrite();
        ((C63042fg) ffVar2.instance).f170154a = 253402300799L;
        ffVar2.copyOnWrite();
        ((C63042fg) ffVar2.instance).f170155b = 999999999;
        C63042fg fgVar2 = (C63042fg) ffVar2.build();
        C63041ff ffVar3 = (C63041ff) C63042fg.f170152c.createBuilder();
        ffVar3.copyOnWrite();
        ((C63042fg) ffVar3.instance).f170154a = 0;
        ffVar3.copyOnWrite();
        ((C63042fg) ffVar3.instance).f170155b = 0;
        f169990a = (C63042fg) ffVar3.build();
    }

    /* renamed from: a */
    public static int m95476a(C63042fg fgVar, C63042fg fgVar2) {
        return C62952d.f169988a.compare(fgVar, fgVar2);
    }

    /* renamed from: b */
    public static long m95477b(C63042fg fgVar) {
        m95492q(fgVar);
        return C60718h.m92647a(C60718h.m92648b(fgVar.f170154a, 1000000), (long) (fgVar.f170155b / 1000));
    }

    /* renamed from: c */
    public static long m95478c(C63042fg fgVar) {
        m95492q(fgVar);
        return C60718h.m92647a(C60718h.m92648b(fgVar.f170154a, 1000), (long) (fgVar.f170155b / 1000000));
    }

    /* renamed from: d */
    public static long m95479d(C63042fg fgVar) {
        m95492q(fgVar);
        return C60718h.m92647a(C60718h.m92648b(fgVar.f170154a, 1000000000), (long) fgVar.f170155b);
    }

    /* renamed from: e */
    public static C62910ar m95480e(C63042fg fgVar, C63042fg fgVar2) {
        m95492q(fgVar);
        m95492q(fgVar2);
        return C62948a.m95462m(C60718h.m92649c(fgVar2.f170154a, fgVar.f170154a), C60716f.m92645b(fgVar2.f170155b, fgVar.f170155b));
    }

    /* renamed from: f */
    public static C63042fg m95481f(C63042fg fgVar, C62910ar arVar) {
        m95492q(fgVar);
        C62948a.m95465p(arVar);
        return m95486k(C60718h.m92647a(fgVar.f170154a, arVar.f169860a), C60716f.m92644a(fgVar.f170155b, arVar.f169861b));
    }

    /* renamed from: g */
    public static C63042fg m95482g(C63041ff ffVar) {
        C63042fg fgVar = (C63042fg) ffVar.build();
        m95492q(fgVar);
        return fgVar;
    }

    /* renamed from: h */
    public static C63042fg m95483h(long j) {
        return m95486k(j / 1000000, (int) ((j % 1000000) * 1000));
    }

    /* renamed from: i */
    public static C63042fg m95484i(long j) {
        return m95486k(j / 1000, (int) ((j % 1000) * 1000000));
    }

    /* renamed from: j */
    public static C63042fg m95485j(long j) {
        return m95486k(j / 1000000000, (int) (j % 1000000000));
    }

    /* renamed from: k */
    public static C63042fg m95486k(long j, int i) {
        if (i <= -1000000000 || i >= 1000000000) {
            j = C60718h.m92647a(j, (long) (i / 1000000000));
            i %= 1000000000;
        }
        if (i < 0) {
            i += 1000000000;
            j = C60718h.m92649c(j, 1);
        }
        C63041ff ffVar = (C63041ff) C63042fg.f170152c.createBuilder();
        ffVar.copyOnWrite();
        ((C63042fg) ffVar.instance).f170154a = j;
        ffVar.copyOnWrite();
        ((C63042fg) ffVar.instance).f170155b = i;
        C63042fg fgVar = (C63042fg) ffVar.build();
        m95492q(fgVar);
        return fgVar;
    }

    /* renamed from: l */
    public static C63042fg m95487l(C63042fg fgVar, C62910ar arVar) {
        m95492q(fgVar);
        C62948a.m95465p(arVar);
        return m95486k(C60718h.m92649c(fgVar.f170154a, arVar.f169860a), C60716f.m92645b(fgVar.f170155b, arVar.f169861b));
    }

    /* renamed from: m */
    public static String m95488m(int i) {
        if (i % 1000000 == 0) {
            return String.format(Locale.ENGLISH, "%1$03d", new Object[]{Integer.valueOf(i / 1000000)});
        } else if (i % 1000 == 0) {
            return String.format(Locale.ENGLISH, "%1$06d", new Object[]{Integer.valueOf(i / 1000)});
        } else {
            return String.format(Locale.ENGLISH, "%1$09d", new Object[]{Integer.valueOf(i)});
        }
    }

    /* renamed from: n */
    public static Comparator m95489n() {
        return C62952d.f169988a;
    }

    /* renamed from: o */
    public static boolean m95490o(C63042fg fgVar) {
        return m95491p(fgVar.f170154a, fgVar.f170155b);
    }

    /* renamed from: p */
    public static boolean m95491p(long j, int i) {
        return j >= -62135596800L && j <= 253402300799L && i >= 0 && i < 1000000000;
    }

    /* renamed from: q */
    public static void m95492q(C63042fg fgVar) {
        long j = fgVar.f170154a;
        int i = fgVar.f170155b;
        if (!m95491p(j, i)) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", new Object[]{Long.valueOf(j), Integer.valueOf(i)}));
        }
    }
}
