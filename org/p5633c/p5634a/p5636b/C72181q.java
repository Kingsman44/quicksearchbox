package org.p5633c.p5634a.p5636b;

import java.util.Locale;
import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72233e;
import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.C72294r;
import org.p5633c.p5634a.p5638d.C72212b;

/* renamed from: org.c.a.b.q */
/* compiled from: PG */
class C72181q extends C72212b {

    /* renamed from: a */
    final C72233e f192120a;

    /* renamed from: b */
    final C72233e f192121b;

    /* renamed from: c */
    final long f192122c;

    /* renamed from: d */
    final boolean f192123d;

    /* renamed from: e */
    protected C72291o f192124e;

    /* renamed from: f */
    protected C72291o f192125f;

    /* renamed from: g */
    final /* synthetic */ C72184t f192126g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72181q(C72184t tVar, C72233e eVar, C72233e eVar2, long j, boolean z) {
        super(eVar2.mo63563z());
        this.f192126g = tVar;
        this.f192120a = eVar;
        this.f192121b = eVar2;
        this.f192122c = j;
        this.f192123d = z;
        this.f192124e = eVar2.mo63464A();
        C72291o C = eVar2.mo63466C();
        this.f192125f = C == null ? eVar.mo63466C() : C;
    }

    /* renamed from: A */
    public final C72291o mo63464A() {
        return this.f192124e;
    }

    /* renamed from: B */
    public final C72291o mo63465B() {
        return this.f192121b.mo63465B();
    }

    /* renamed from: C */
    public final C72291o mo63466C() {
        return this.f192125f;
    }

    /* renamed from: D */
    public final boolean mo63467D(long j) {
        if (j >= this.f192122c) {
            return this.f192121b.mo63467D(j);
        }
        return this.f192120a.mo63467D(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final long mo63519F(long j) {
        if (this.f192123d) {
            C72184t tVar = this.f192126g;
            return C72184t.m106139W(j, tVar.f192132G, tVar.f192131F);
        }
        C72184t tVar2 = this.f192126g;
        return C72184t.m106140X(j, tVar2.f192132G, tVar2.f192131F);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final long mo63520G(long j) {
        if (!this.f192123d) {
            return this.f192126g.mo63521Y(j);
        }
        C72184t tVar = this.f192126g;
        return C72184t.m106139W(j, tVar.f192131F, tVar.f192132G);
    }

    /* renamed from: a */
    public final int mo63444a(long j) {
        if (j >= this.f192122c) {
            return this.f192121b.mo63444a(j);
        }
        return this.f192120a.mo63444a(j);
    }

    /* renamed from: b */
    public int mo63445b(long j, long j2) {
        return this.f192121b.mo63445b(j, j2);
    }

    /* renamed from: c */
    public final int mo63468c(Locale locale) {
        return Math.max(this.f192120a.mo63468c(locale), this.f192121b.mo63468c(locale));
    }

    /* renamed from: d */
    public final int mo63446d() {
        return this.f192121b.mo63446d();
    }

    /* renamed from: e */
    public int mo63469e(long j) {
        if (j >= this.f192122c) {
            return this.f192121b.mo63469e(j);
        }
        int e = this.f192120a.mo63469e(j);
        long q = this.f192120a.mo63454q(j, e);
        long j2 = this.f192122c;
        if (q < j2) {
            return e;
        }
        C72233e eVar = this.f192120a;
        return eVar.mo63444a(eVar.mo63448k(j2, -1));
    }

    /* renamed from: f */
    public final int mo63482f(C72151ai aiVar) {
        return mo63469e(C72184t.m106142aa().mo63343U(aiVar));
    }

    /* renamed from: g */
    public final int mo63483g(C72151ai aiVar, int[] iArr) {
        int e = aiVar.mo63438e();
        C72184t aa = C72184t.m106142aa();
        long j = 0;
        for (int i = 0; i < e; i++) {
            C72233e a = aiVar.mo63399r(i).mo63646a(aa);
            if (iArr[i] <= a.mo63469e(j)) {
                j = a.mo63454q(j, iArr[i]);
            }
        }
        return mo63469e(j);
    }

    /* renamed from: h */
    public final int mo63447h() {
        return this.f192120a.mo63447h();
    }

    /* renamed from: i */
    public final int mo63484i(C72151ai aiVar) {
        return this.f192120a.mo63484i(aiVar);
    }

    /* renamed from: j */
    public final int mo63485j(C72151ai aiVar, int[] iArr) {
        return this.f192120a.mo63485j(aiVar, iArr);
    }

    /* renamed from: k */
    public long mo63448k(long j, int i) {
        return this.f192121b.mo63448k(j, i);
    }

    /* renamed from: l */
    public long mo63449l(long j, long j2) {
        return this.f192121b.mo63449l(j, j2);
    }

    /* renamed from: m */
    public long mo63450m(long j, long j2) {
        return this.f192121b.mo63450m(j, j2);
    }

    /* renamed from: o */
    public final long mo63452o(long j) {
        if (j >= this.f192122c) {
            return this.f192121b.mo63452o(j);
        }
        long o = this.f192120a.mo63452o(j);
        long j2 = this.f192122c;
        return (o < j2 || o - this.f192126g.f192133H < j2) ? o : mo63520G(o);
    }

    /* renamed from: p */
    public final long mo63453p(long j) {
        if (j < this.f192122c) {
            return this.f192120a.mo63453p(j);
        }
        long p = this.f192121b.mo63453p(j);
        long j2 = this.f192122c;
        if (p >= j2 || this.f192126g.f192133H + p >= j2) {
            return p;
        }
        return mo63519F(p);
    }

    /* renamed from: q */
    public final long mo63454q(long j, int i) {
        long j2;
        if (j >= this.f192122c) {
            j2 = this.f192121b.mo63454q(j, i);
            long j3 = this.f192122c;
            if (j2 < j3) {
                if (this.f192126g.f192133H + j2 < j3) {
                    j2 = mo63519F(j2);
                }
                if (mo63444a(j2) != i) {
                    throw new C72294r(this.f192121b.mo63563z(), Integer.valueOf(i), (Number) null, (Number) null);
                }
            }
        } else {
            j2 = this.f192120a.mo63454q(j, i);
            long j4 = this.f192122c;
            if (j2 >= j4) {
                if (j2 - this.f192126g.f192133H >= j4) {
                    j2 = mo63520G(j2);
                }
                if (mo63444a(j2) != i) {
                    throw new C72294r(this.f192120a.mo63563z(), Integer.valueOf(i), (Number) null, (Number) null);
                }
            }
        }
        return j2;
    }

    /* renamed from: r */
    public final long mo63470r(long j, String str, Locale locale) {
        if (j >= this.f192122c) {
            long r = this.f192121b.mo63470r(j, str, locale);
            long j2 = this.f192122c;
            if (r >= j2 || this.f192126g.f192133H + r >= j2) {
                return r;
            }
            return mo63519F(r);
        }
        long r2 = this.f192120a.mo63470r(j, str, locale);
        long j3 = this.f192122c;
        return (r2 < j3 || r2 - this.f192126g.f192133H < j3) ? r2 : mo63520G(r2);
    }

    /* renamed from: s */
    public final String mo63486s(int i, Locale locale) {
        return this.f192121b.mo63486s(i, locale);
    }

    /* renamed from: t */
    public final String mo63471t(long j, Locale locale) {
        if (j >= this.f192122c) {
            return this.f192121b.mo63471t(j, locale);
        }
        return this.f192120a.mo63471t(j, locale);
    }

    /* renamed from: v */
    public final String mo63487v(int i, Locale locale) {
        return this.f192121b.mo63487v(i, locale);
    }

    /* renamed from: w */
    public final String mo63472w(long j, Locale locale) {
        if (j >= this.f192122c) {
            return this.f192121b.mo63472w(j, locale);
        }
        return this.f192120a.mo63472w(j, locale);
    }
}
