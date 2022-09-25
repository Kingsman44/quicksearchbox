package org.p5633c.p5634a.p5638d;

import java.util.Locale;
import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72233e;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.C72294r;

/* renamed from: org.c.a.d.b */
/* compiled from: PG */
public abstract class C72212b extends C72233e {

    /* renamed from: i */
    public final C72283g f192177i;

    protected C72212b(C72283g gVar) {
        if (gVar != null) {
            this.f192177i = gVar;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    /* renamed from: A */
    public abstract C72291o mo63464A();

    /* renamed from: B */
    public C72291o mo63465B() {
        return null;
    }

    /* renamed from: D */
    public boolean mo63467D(long j) {
        return false;
    }

    /* renamed from: E */
    public final boolean mo63558E() {
        return true;
    }

    /* renamed from: a */
    public abstract int mo63444a(long j);

    /* renamed from: b */
    public int mo63445b(long j, long j2) {
        return mo63464A().mo63473a(j, j2);
    }

    /* renamed from: c */
    public int mo63468c(Locale locale) {
        int d = mo63446d();
        if (d >= 0) {
            if (d < 10) {
                return 1;
            }
            if (d < 100) {
                return 2;
            }
            if (d < 1000) {
                return 3;
            }
        }
        return Integer.toString(d).length();
    }

    /* renamed from: d */
    public abstract int mo63446d();

    /* renamed from: e */
    public int mo63469e(long j) {
        return mo63446d();
    }

    /* renamed from: f */
    public int mo63482f(C72151ai aiVar) {
        return mo63446d();
    }

    /* renamed from: g */
    public int mo63483g(C72151ai aiVar, int[] iArr) {
        return mo63482f(aiVar);
    }

    /* renamed from: h */
    public abstract int mo63447h();

    /* renamed from: i */
    public int mo63484i(C72151ai aiVar) {
        return mo63447h();
    }

    /* renamed from: j */
    public int mo63485j(C72151ai aiVar, int[] iArr) {
        return mo63484i(aiVar);
    }

    /* renamed from: k */
    public long mo63448k(long j, int i) {
        return mo63464A().mo63474b(j, i);
    }

    /* renamed from: l */
    public long mo63449l(long j, long j2) {
        return mo63464A().mo63475c(j, j2);
    }

    /* renamed from: m */
    public long mo63450m(long j, long j2) {
        return mo63464A().mo63476d(j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: mu */
    public int mo63524mu(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new C72294r(this.f192177i, str);
        }
    }

    /* renamed from: n */
    public long mo63451n(long j) {
        return j - mo63453p(j);
    }

    /* renamed from: o */
    public long mo63452o(long j) {
        long p = mo63453p(j);
        return p != j ? mo63448k(p, 1) : j;
    }

    /* renamed from: p */
    public abstract long mo63453p(long j);

    /* renamed from: q */
    public abstract long mo63454q(long j, int i);

    /* renamed from: r */
    public long mo63470r(long j, String str, Locale locale) {
        return mo63454q(j, mo63524mu(str, locale));
    }

    /* renamed from: s */
    public String mo63486s(int i, Locale locale) {
        return mo63487v(i, locale);
    }

    /* renamed from: t */
    public String mo63471t(long j, Locale locale) {
        return mo63486s(mo63444a(j), locale);
    }

    public final String toString() {
        String str = this.f192177i.f192410z;
        return "DateTimeField[" + str + "]";
    }

    /* renamed from: u */
    public final String mo63560u(C72151ai aiVar, Locale locale) {
        return mo63486s(aiVar.mo63392b(this.f192177i), locale);
    }

    /* renamed from: v */
    public String mo63487v(int i, Locale locale) {
        return Integer.toString(i);
    }

    /* renamed from: w */
    public String mo63472w(long j, Locale locale) {
        return mo63487v(mo63444a(j), locale);
    }

    /* renamed from: x */
    public final String mo63561x(C72151ai aiVar, Locale locale) {
        return mo63487v(aiVar.mo63392b(this.f192177i), locale);
    }

    /* renamed from: y */
    public final String mo63562y() {
        return this.f192177i.f192410z;
    }

    /* renamed from: z */
    public final C72283g mo63563z() {
        return this.f192177i;
    }
}
