package org.p5633c.p5634a.p5636b;

import java.util.Locale;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.C72293q;
import org.p5633c.p5634a.C72294r;
import org.p5633c.p5634a.p5638d.C72212b;
import org.p5633c.p5634a.p5638d.C72218h;
import org.p5633c.p5634a.p5638d.C72231u;

/* renamed from: org.c.a.b.v */
/* compiled from: PG */
final class C72186v extends C72212b {

    /* renamed from: a */
    private final C72170f f192137a;

    public C72186v(C72170f fVar) {
        super(C72283g.f192387c);
        this.f192137a = fVar;
    }

    /* renamed from: A */
    public final C72291o mo63464A() {
        return C72231u.m106458j(C72293q.f192436a);
    }

    /* renamed from: C */
    public final C72291o mo63466C() {
        return null;
    }

    /* renamed from: a */
    public final int mo63444a(long j) {
        return this.f192137a.mo63505al(j) <= 0 ? 0 : 1;
    }

    /* renamed from: c */
    public final int mo63468c(Locale locale) {
        return C72187w.m106169a(locale).f192148j;
    }

    /* renamed from: d */
    public final int mo63446d() {
        return 1;
    }

    /* renamed from: h */
    public final int mo63447h() {
        return 0;
    }

    /* renamed from: o */
    public final long mo63452o(long j) {
        if (mo63444a(j) == 0) {
            return this.f192137a.mo63510aw(0, 1);
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: p */
    public final long mo63453p(long j) {
        if (mo63444a(j) == 1) {
            return this.f192137a.mo63510aw(0, 1);
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: q */
    public final long mo63454q(long j, int i) {
        C72218h.m106360f(this, i, 0, 1);
        if (mo63444a(j) == i) {
            return j;
        }
        return this.f192137a.mo63510aw(j, -this.f192137a.mo63505al(j));
    }

    /* renamed from: r */
    public final long mo63470r(long j, String str, Locale locale) {
        Integer num = (Integer) C72187w.m106169a(locale).f192145g.get(str);
        if (num != null) {
            return mo63454q(j, num.intValue());
        }
        throw new C72294r(C72283g.f192387c, str);
    }

    /* renamed from: v */
    public final String mo63487v(int i, Locale locale) {
        return C72187w.m106169a(locale).f192139a[i];
    }
}
