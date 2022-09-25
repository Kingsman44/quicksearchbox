package org.p5633c.p5634a.p5636b;

import java.util.Locale;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.C72294r;
import org.p5633c.p5634a.p5638d.C72224n;

/* renamed from: org.c.a.b.u */
/* compiled from: PG */
final class C72185u extends C72224n {

    /* renamed from: b */
    private final C72170f f192136b;

    public C72185u(C72170f fVar, C72291o oVar) {
        super(C72283g.f192398n, oVar);
        this.f192136b = fVar;
    }

    /* renamed from: C */
    public final C72291o mo63466C() {
        return this.f192136b.f192056d;
    }

    /* renamed from: a */
    public final int mo63444a(long j) {
        return this.f192136b.mo63493X(j);
    }

    /* renamed from: c */
    public final int mo63468c(Locale locale) {
        return C72187w.m106169a(locale).f192149k;
    }

    /* renamed from: d */
    public final int mo63446d() {
        return 7;
    }

    /* renamed from: h */
    public final int mo63447h() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: mu */
    public final int mo63524mu(String str, Locale locale) {
        Integer num = (Integer) C72187w.m106169a(locale).f192146h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new C72294r(C72283g.f192398n, str);
    }

    /* renamed from: s */
    public final String mo63486s(int i, Locale locale) {
        return C72187w.m106169a(locale).f192141c[i];
    }

    /* renamed from: v */
    public final String mo63487v(int i, Locale locale) {
        return C72187w.m106169a(locale).f192140b[i];
    }
}
