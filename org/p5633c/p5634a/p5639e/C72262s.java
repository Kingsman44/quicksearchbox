package org.p5633c.p5634a.p5639e;

import java.util.Locale;
import org.p5633c.p5634a.C72233e;

/* renamed from: org.c.a.e.s */
/* compiled from: PG */
final class C72262s implements Comparable {

    /* renamed from: a */
    final C72233e f192269a;

    /* renamed from: b */
    final int f192270b;

    /* renamed from: c */
    final String f192271c;

    /* renamed from: d */
    final Locale f192272d;

    public C72262s(C72233e eVar, int i) {
        this.f192269a = eVar;
        this.f192270b = i;
        this.f192271c = null;
        this.f192272d = null;
    }

    public C72262s(C72233e eVar, String str, Locale locale) {
        this.f192269a = eVar;
        this.f192270b = 0;
        this.f192271c = str;
        this.f192272d = locale;
    }

    /* renamed from: a */
    public final int compareTo(C72262s sVar) {
        C72233e eVar = sVar.f192269a;
        int a = C72264u.m106664a(this.f192269a.mo63466C(), eVar.mo63466C());
        if (a != 0) {
            return a;
        }
        return C72264u.m106664a(this.f192269a.mo63464A(), eVar.mo63464A());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo63636b(long j, boolean z) {
        long j2;
        String str = this.f192271c;
        if (str == null) {
            j2 = this.f192269a.mo63454q(j, this.f192270b);
        } else {
            j2 = this.f192269a.mo63470r(j, str, this.f192272d);
        }
        return z ? this.f192269a.mo63453p(j2) : j2;
    }
}
