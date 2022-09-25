package org.p5633c.p5634a.p5636b;

import java.io.Serializable;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72152aj;
import org.p5633c.p5634a.C72233e;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.C72293q;
import org.p5633c.p5634a.C72294r;
import org.p5633c.p5634a.p5635a.C72141i;
import org.p5633c.p5634a.p5638d.C72218h;
import org.p5633c.p5634a.p5638d.C72230t;
import org.p5633c.p5634a.p5638d.C72231u;

/* renamed from: org.c.a.b.c */
/* compiled from: PG */
public abstract class C72167c extends C72132a implements Serializable {
    private static final long serialVersionUID = -7310865996721419676L;

    protected C72167c() {
    }

    /* renamed from: A */
    public C72233e mo63323A() {
        return C72230t.m106425F(C72283g.f192390f, mo63337O());
    }

    /* renamed from: B */
    public C72233e mo63324B() {
        return C72230t.m106425F(C72283g.f192388d, mo63337O());
    }

    /* renamed from: D */
    public C72291o mo63326D() {
        return C72231u.m106458j(C72293q.f192437b);
    }

    /* renamed from: E */
    public C72291o mo63327E() {
        return C72231u.m106458j(C72293q.f192442g);
    }

    /* renamed from: F */
    public C72291o mo63328F() {
        return C72231u.m106458j(C72293q.f192436a);
    }

    /* renamed from: G */
    public C72291o mo63329G() {
        return C72231u.m106458j(C72293q.f192443h);
    }

    /* renamed from: H */
    public C72291o mo63330H() {
        return C72231u.m106458j(C72293q.f192444i);
    }

    /* renamed from: I */
    public C72291o mo63331I() {
        return C72231u.m106458j(C72293q.f192447l);
    }

    /* renamed from: J */
    public C72291o mo63332J() {
        return C72231u.m106458j(C72293q.f192445j);
    }

    /* renamed from: K */
    public C72291o mo63333K() {
        return C72231u.m106458j(C72293q.f192440e);
    }

    /* renamed from: L */
    public C72291o mo63334L() {
        return C72231u.m106458j(C72293q.f192446k);
    }

    /* renamed from: M */
    public C72291o mo63335M() {
        return C72231u.m106458j(C72293q.f192441f);
    }

    /* renamed from: N */
    public C72291o mo63336N() {
        return C72231u.m106458j(C72293q.f192438c);
    }

    /* renamed from: O */
    public C72291o mo63337O() {
        return C72231u.m106458j(C72293q.f192439d);
    }

    /* renamed from: P */
    public final void mo63338P(C72151ai aiVar, int[] iArr) {
        int e = aiVar.mo63438e();
        int i = 0;
        int i2 = 0;
        while (i2 < e) {
            int i3 = iArr[i2];
            C72233e q = aiVar.mo63398q(i2);
            if (i3 < q.mo63447h()) {
                throw new C72294r(q.mo63563z(), Integer.valueOf(i3), Integer.valueOf(q.mo63447h()), (Number) null);
            } else if (i3 <= q.mo63446d()) {
                i2++;
            } else {
                throw new C72294r(q.mo63563z(), Integer.valueOf(i3), (Number) null, Integer.valueOf(q.mo63446d()));
            }
        }
        while (i < e) {
            int i4 = iArr[i];
            C72233e q2 = aiVar.mo63398q(i);
            if (i4 < q2.mo63485j(aiVar, iArr)) {
                throw new C72294r(q2.mo63563z(), Integer.valueOf(i4), Integer.valueOf(q2.mo63485j(aiVar, iArr)), (Number) null);
            } else if (i4 <= q2.mo63483g(aiVar, iArr)) {
                i++;
            } else {
                throw new C72294r(q2.mo63563z(), Integer.valueOf(i4), (Number) null, Integer.valueOf(q2.mo63483g(aiVar, iArr)));
            }
        }
    }

    /* renamed from: Q */
    public final int[] mo63339Q(C72151ai aiVar, long j) {
        int e = aiVar.mo63438e();
        int[] iArr = new int[e];
        for (int i = 0; i < e; i++) {
            iArr[i] = aiVar.mo63399r(i).mo63646a(this).mo63444a(j);
        }
        return iArr;
    }

    /* renamed from: R */
    public final int[] mo63340R(C72152aj ajVar, long j) {
        int i = ajVar.mo63405i();
        int[] iArr = new int[i];
        long j2 = 0;
        if (j != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                C72291o a = ajVar.mo63406j(i2).mo63674a(this);
                if (a.mo63489h()) {
                    int a2 = a.mo63473a(j, j2);
                    j2 = a.mo63474b(j2, a2);
                    iArr[i2] = a2;
                }
            }
        }
        return iArr;
    }

    /* renamed from: S */
    public final int[] mo63341S(C72152aj ajVar, long j, long j2) {
        C72141i iVar = (C72141i) ajVar;
        int length = iVar.f191965a.f191978h.length;
        int[] iArr = new int[length];
        if (j != j2) {
            for (int i = 0; i < length; i++) {
                C72291o a = iVar.f191965a.f191978h[i].mo63674a(this);
                int a2 = a.mo63473a(j2, j);
                j = a.mo63474b(j, a2);
                iArr[i] = a2;
            }
        }
        return iArr;
    }

    /* renamed from: T */
    public long mo63342T(long j, int i, int i2) {
        return mo63360q().mo63454q(mo63366v().mo63454q(mo63362s().mo63454q(mo63357n().mo63454q(j, i), i2), 0), 0);
    }

    /* renamed from: U */
    public final long mo63343U(C72151ai aiVar) {
        int e = aiVar.mo63438e();
        long j = 0;
        for (int i = 0; i < e; i++) {
            j = aiVar.mo63399r(i).mo63646a(this).mo63454q(j, aiVar.mo63437c(i));
        }
        return j;
    }

    /* renamed from: a */
    public final long mo63344a(long j, long j2, int i) {
        return (j2 == 0 || i == 0) ? j : C72218h.m106356b(j, C72218h.m106357c(j2, i));
    }

    /* renamed from: b */
    public long mo63345b(int i, int i2, int i3, int i4) {
        return mo63359p().mo63454q(mo63352i().mo63454q(mo63363t().mo63454q(mo63370z().mo63454q(0, i), i2), i3), i4);
    }

    /* renamed from: c */
    public long mo63346c(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return mo63360q().mo63454q(mo63366v().mo63454q(mo63362s().mo63454q(mo63357n().mo63454q(mo63352i().mo63454q(mo63363t().mo63454q(mo63370z().mo63454q(0, i), i2), i3), i4), i5), i6), i7);
    }

    /* renamed from: f */
    public C72233e mo63349f() {
        return C72230t.m106425F(C72283g.f192389e, mo63326D());
    }

    /* renamed from: g */
    public C72233e mo63350g() {
        return C72230t.m106425F(C72283g.f192402r, mo63330H());
    }

    /* renamed from: h */
    public C72233e mo63351h() {
        return C72230t.m106425F(C72283g.f192401q, mo63330H());
    }

    /* renamed from: i */
    public C72233e mo63352i() {
        return C72230t.m106425F(C72283g.f192394j, mo63327E());
    }

    /* renamed from: j */
    public C72233e mo63353j() {
        return C72230t.m106425F(C72283g.f192398n, mo63327E());
    }

    /* renamed from: k */
    public C72233e mo63354k() {
        return C72230t.m106425F(C72283g.f192392h, mo63327E());
    }

    /* renamed from: l */
    public C72233e mo63355l() {
        return C72230t.m106425F(C72283g.f192387c, mo63328F());
    }

    /* renamed from: m */
    public C72233e mo63356m() {
        return C72230t.m106425F(C72283g.f192399o, mo63329G());
    }

    /* renamed from: n */
    public C72233e mo63357n() {
        return C72230t.m106425F(C72283g.f192403s, mo63330H());
    }

    /* renamed from: o */
    public C72233e mo63358o() {
        return C72230t.m106425F(C72283g.f192400p, mo63330H());
    }

    /* renamed from: p */
    public C72233e mo63359p() {
        return C72230t.m106425F(C72283g.f192408x, mo63331I());
    }

    /* renamed from: q */
    public C72233e mo63360q() {
        return C72230t.m106425F(C72283g.f192409y, mo63331I());
    }

    /* renamed from: r */
    public C72233e mo63361r() {
        return C72230t.m106425F(C72283g.f192404t, mo63332J());
    }

    /* renamed from: s */
    public C72233e mo63362s() {
        return C72230t.m106425F(C72283g.f192405u, mo63332J());
    }

    /* renamed from: t */
    public C72233e mo63363t() {
        return C72230t.m106425F(C72283g.f192393i, mo63333K());
    }

    /* renamed from: u */
    public C72233e mo63365u() {
        return C72230t.m106425F(C72283g.f192406v, mo63334L());
    }

    /* renamed from: v */
    public C72233e mo63366v() {
        return C72230t.m106425F(C72283g.f192407w, mo63334L());
    }

    /* renamed from: w */
    public C72233e mo63367w() {
        return C72230t.m106425F(C72283g.f192397m, mo63335M());
    }

    /* renamed from: x */
    public C72233e mo63368x() {
        return C72230t.m106425F(C72283g.f192396l, mo63336N());
    }

    /* renamed from: y */
    public C72233e mo63369y() {
        return C72230t.m106425F(C72283g.f192395k, mo63336N());
    }

    /* renamed from: z */
    public C72233e mo63370z() {
        return C72230t.m106425F(C72283g.f192391g, mo63337O());
    }
}
