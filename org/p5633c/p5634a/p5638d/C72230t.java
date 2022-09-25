package org.p5633c.p5634a.p5638d;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72233e;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72291o;

/* renamed from: org.c.a.d.t */
/* compiled from: PG */
public final class C72230t extends C72233e implements Serializable {

    /* renamed from: a */
    private static HashMap f192205a = null;
    private static final long serialVersionUID = -1934618396111902255L;

    /* renamed from: b */
    private final C72283g f192206b;

    /* renamed from: c */
    private final C72291o f192207c;

    private C72230t(C72283g gVar, C72291o oVar) {
        if (oVar != null) {
            this.f192206b = gVar;
            this.f192207c = oVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: F */
    public static synchronized C72230t m106425F(C72283g gVar, C72291o oVar) {
        synchronized (C72230t.class) {
            HashMap hashMap = f192205a;
            C72230t tVar = null;
            if (hashMap == null) {
                f192205a = new HashMap(7);
            } else {
                C72230t tVar2 = (C72230t) hashMap.get(gVar);
                if (tVar2 == null || tVar2.f192207c == oVar) {
                    tVar = tVar2;
                }
            }
            if (tVar != null) {
                return tVar;
            }
            C72230t tVar3 = new C72230t(gVar, oVar);
            f192205a.put(gVar, tVar3);
            return tVar3;
        }
    }

    /* renamed from: G */
    private final UnsupportedOperationException m106426G() {
        return new UnsupportedOperationException(this.f192206b.f192410z.concat(" field is unsupported"));
    }

    private Object readResolve() {
        return m106425F(this.f192206b, this.f192207c);
    }

    /* renamed from: A */
    public final C72291o mo63464A() {
        return this.f192207c;
    }

    /* renamed from: B */
    public final C72291o mo63465B() {
        return null;
    }

    /* renamed from: C */
    public final C72291o mo63466C() {
        return null;
    }

    /* renamed from: D */
    public final boolean mo63467D(long j) {
        throw m106426G();
    }

    /* renamed from: E */
    public final boolean mo63558E() {
        return false;
    }

    /* renamed from: a */
    public final int mo63444a(long j) {
        throw m106426G();
    }

    /* renamed from: b */
    public final int mo63445b(long j, long j2) {
        return this.f192207c.mo63473a(j, j2);
    }

    /* renamed from: c */
    public final int mo63468c(Locale locale) {
        throw m106426G();
    }

    /* renamed from: d */
    public final int mo63446d() {
        throw m106426G();
    }

    /* renamed from: e */
    public final int mo63469e(long j) {
        throw m106426G();
    }

    /* renamed from: f */
    public final int mo63482f(C72151ai aiVar) {
        throw m106426G();
    }

    /* renamed from: g */
    public final int mo63483g(C72151ai aiVar, int[] iArr) {
        throw m106426G();
    }

    /* renamed from: h */
    public final int mo63447h() {
        throw m106426G();
    }

    /* renamed from: i */
    public final int mo63484i(C72151ai aiVar) {
        throw m106426G();
    }

    /* renamed from: j */
    public final int mo63485j(C72151ai aiVar, int[] iArr) {
        throw m106426G();
    }

    /* renamed from: k */
    public final long mo63448k(long j, int i) {
        return this.f192207c.mo63474b(j, i);
    }

    /* renamed from: l */
    public final long mo63449l(long j, long j2) {
        return this.f192207c.mo63475c(j, j2);
    }

    /* renamed from: m */
    public final long mo63450m(long j, long j2) {
        return this.f192207c.mo63476d(j, j2);
    }

    /* renamed from: n */
    public final long mo63451n(long j) {
        throw m106426G();
    }

    /* renamed from: o */
    public final long mo63452o(long j) {
        throw m106426G();
    }

    /* renamed from: p */
    public final long mo63453p(long j) {
        throw m106426G();
    }

    /* renamed from: q */
    public final long mo63454q(long j, int i) {
        throw m106426G();
    }

    /* renamed from: r */
    public final long mo63470r(long j, String str, Locale locale) {
        throw m106426G();
    }

    /* renamed from: s */
    public final String mo63486s(int i, Locale locale) {
        throw m106426G();
    }

    /* renamed from: t */
    public final String mo63471t(long j, Locale locale) {
        throw m106426G();
    }

    public final String toString() {
        return "UnsupportedDateTimeField";
    }

    /* renamed from: u */
    public final String mo63560u(C72151ai aiVar, Locale locale) {
        throw m106426G();
    }

    /* renamed from: v */
    public final String mo63487v(int i, Locale locale) {
        throw m106426G();
    }

    /* renamed from: w */
    public final String mo63472w(long j, Locale locale) {
        throw m106426G();
    }

    /* renamed from: x */
    public final String mo63561x(C72151ai aiVar, Locale locale) {
        throw m106426G();
    }

    /* renamed from: y */
    public final String mo63562y() {
        return this.f192206b.f192410z;
    }

    /* renamed from: z */
    public final C72283g mo63563z() {
        return this.f192206b;
    }
}
