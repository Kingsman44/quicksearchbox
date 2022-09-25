package org.p5633c.p5634a.p5636b;

import java.util.Locale;
import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72233e;
import org.p5633c.p5634a.C72288l;
import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.C72294r;
import org.p5633c.p5634a.C72295s;
import org.p5633c.p5634a.p5638d.C72212b;

/* renamed from: org.c.a.b.ai */
/* compiled from: PG */
final class C72163ai extends C72212b {

    /* renamed from: a */
    final C72233e f192032a;

    /* renamed from: b */
    final C72288l f192033b;

    /* renamed from: c */
    final C72291o f192034c;

    /* renamed from: d */
    final boolean f192035d;

    /* renamed from: e */
    final C72291o f192036e;

    /* renamed from: f */
    final C72291o f192037f;

    public C72163ai(C72233e eVar, C72288l lVar, C72291o oVar, C72291o oVar2, C72291o oVar3) {
        super(eVar.mo63563z());
        if (eVar.mo63558E()) {
            this.f192032a = eVar;
            this.f192033b = lVar;
            this.f192034c = oVar;
            this.f192035d = C72165ak.m105885X(oVar);
            this.f192036e = oVar2;
            this.f192037f = oVar3;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: F */
    private final int m105849F(long j) {
        int a = this.f192033b.mo37823a(j);
        long j2 = (long) a;
        if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
            return a;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    /* renamed from: A */
    public final C72291o mo63464A() {
        return this.f192034c;
    }

    /* renamed from: B */
    public final C72291o mo63465B() {
        return this.f192037f;
    }

    /* renamed from: C */
    public final C72291o mo63466C() {
        return this.f192036e;
    }

    /* renamed from: D */
    public final boolean mo63467D(long j) {
        return this.f192032a.mo63467D(this.f192033b.mo63663j(j));
    }

    /* renamed from: a */
    public final int mo63444a(long j) {
        return this.f192032a.mo63444a(this.f192033b.mo63663j(j));
    }

    /* renamed from: b */
    public final int mo63445b(long j, long j2) {
        int i;
        int F = m105849F(j2);
        C72233e eVar = this.f192032a;
        if (this.f192035d) {
            i = F;
        } else {
            i = m105849F(j);
        }
        return eVar.mo63445b(j + ((long) i), j2 + ((long) F));
    }

    /* renamed from: c */
    public final int mo63468c(Locale locale) {
        return this.f192032a.mo63468c(locale);
    }

    /* renamed from: d */
    public final int mo63446d() {
        return this.f192032a.mo63446d();
    }

    /* renamed from: e */
    public final int mo63469e(long j) {
        return this.f192032a.mo63469e(this.f192033b.mo63663j(j));
    }

    /* renamed from: f */
    public final int mo63482f(C72151ai aiVar) {
        return this.f192032a.mo63482f(aiVar);
    }

    /* renamed from: g */
    public final int mo63483g(C72151ai aiVar, int[] iArr) {
        return this.f192032a.mo63483g(aiVar, iArr);
    }

    /* renamed from: h */
    public final int mo63447h() {
        return this.f192032a.mo63447h();
    }

    /* renamed from: i */
    public final int mo63484i(C72151ai aiVar) {
        return this.f192032a.mo63484i(aiVar);
    }

    /* renamed from: j */
    public final int mo63485j(C72151ai aiVar, int[] iArr) {
        return this.f192032a.mo63485j(aiVar, iArr);
    }

    /* renamed from: k */
    public final long mo63448k(long j, int i) {
        if (this.f192035d) {
            long F = (long) m105849F(j);
            return this.f192032a.mo63448k(j + F, i) - F;
        }
        return this.f192033b.mo63667t(this.f192032a.mo63448k(this.f192033b.mo63663j(j), i), j);
    }

    /* renamed from: l */
    public final long mo63449l(long j, long j2) {
        if (this.f192035d) {
            long F = (long) m105849F(j);
            return this.f192032a.mo63449l(j + F, j2) - F;
        }
        return this.f192033b.mo63667t(this.f192032a.mo63449l(this.f192033b.mo63663j(j), j2), j);
    }

    /* renamed from: m */
    public final long mo63450m(long j, long j2) {
        int i;
        int F = m105849F(j2);
        C72233e eVar = this.f192032a;
        if (this.f192035d) {
            i = F;
        } else {
            i = m105849F(j);
        }
        return eVar.mo63450m(j + ((long) i), j2 + ((long) F));
    }

    /* renamed from: n */
    public final long mo63451n(long j) {
        return this.f192032a.mo63451n(this.f192033b.mo63663j(j));
    }

    /* renamed from: o */
    public final long mo63452o(long j) {
        if (this.f192035d) {
            long F = (long) m105849F(j);
            return this.f192032a.mo63452o(j + F) - F;
        }
        return this.f192033b.mo63667t(this.f192032a.mo63452o(this.f192033b.mo63663j(j)), j);
    }

    /* renamed from: p */
    public final long mo63453p(long j) {
        if (this.f192035d) {
            long F = (long) m105849F(j);
            return this.f192032a.mo63453p(j + F) - F;
        }
        return this.f192033b.mo63667t(this.f192032a.mo63453p(this.f192033b.mo63663j(j)), j);
    }

    /* renamed from: q */
    public final long mo63454q(long j, int i) {
        long q = this.f192032a.mo63454q(this.f192033b.mo63663j(j), i);
        long t = this.f192033b.mo63667t(q, j);
        if (mo63444a(t) == i) {
            return t;
        }
        C72295s sVar = new C72295s(q, this.f192033b.f192423d);
        C72294r rVar = new C72294r(this.f192032a.mo63563z(), Integer.valueOf(i), sVar.getMessage());
        rVar.initCause(sVar);
        throw rVar;
    }

    /* renamed from: r */
    public final long mo63470r(long j, String str, Locale locale) {
        return this.f192033b.mo63667t(this.f192032a.mo63470r(this.f192033b.mo63663j(j), str, locale), j);
    }

    /* renamed from: s */
    public final String mo63486s(int i, Locale locale) {
        return this.f192032a.mo63486s(i, locale);
    }

    /* renamed from: t */
    public final String mo63471t(long j, Locale locale) {
        return this.f192032a.mo63471t(this.f192033b.mo63663j(j), locale);
    }

    /* renamed from: v */
    public final String mo63487v(int i, Locale locale) {
        return this.f192032a.mo63487v(i, locale);
    }

    /* renamed from: w */
    public final String mo63472w(long j, Locale locale) {
        return this.f192032a.mo63472w(this.f192033b.mo63663j(j), locale);
    }
}
