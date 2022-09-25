package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.education.pie.C75866e;
import com.google.android.apps.gsa.nga.engine.education.pie.C75906g;
import com.google.android.apps.gsa.nga.engine.education.pie.C75907h;
import com.google.android.apps.gsa.nga.engine.education.pie.C75909j;
import com.google.android.apps.gsa.nga.engine.education.pie.C75910k;
import com.google.android.apps.gsa.nga.engine.education.pie.C75912m;
import com.google.android.apps.gsa.nga.engine.education.pie.C75913n;
import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75784m;
import com.google.android.apps.gsa.nga.engine.education.pie.p6020b.C75855v;
import com.google.android.apps.gsa.nga.engine.education.pie.p6022d.C75864b;
import com.google.android.apps.gsa.nga.engine.education.pie.p6023e.C75867a;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.C75155d;
import com.google.android.apps.gsa.nga.engine.p5964av.C75158f;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78258h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80187ah;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80201av;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80203ax;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80210bd;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80238ce;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80242ci;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80246cm;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80739dn;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80741dp;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80744ds;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81377k;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81381o;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.ba */
/* compiled from: PG */
public final class C75942ba implements C75909j, C75864b, C78258h, C75155d {

    /* renamed from: g */
    private static final C59071e f210695g = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.education.pie.triggering.ba");

    /* renamed from: a */
    public final C91142g f210696a;

    /* renamed from: b */
    public final C75867a f210697b;

    /* renamed from: c */
    public boolean f210698c = false;

    /* renamed from: d */
    public final AtomicReference f210699d = new AtomicReference(Optional.empty());

    /* renamed from: e */
    public final AtomicReference f210700e = new AtomicReference(Optional.empty());

    /* renamed from: f */
    final AtomicReference f210701f = new AtomicReference(Optional.empty());

    /* renamed from: h */
    private final C75906g f210702h;

    /* renamed from: i */
    private final C75910k f210703i;

    /* renamed from: j */
    private final C75866e f210704j;

    /* renamed from: k */
    private final C75158f f210705k;

    /* renamed from: l */
    private final C75050a f210706l;

    /* renamed from: m */
    private final C75907h f210707m = new C75940az(this);

    /* renamed from: n */
    private final C76092h f210708n;

    /* renamed from: o */
    private final AtomicReference f210709o = new AtomicReference(Optional.empty());

    /* renamed from: p */
    private final C75855v f210710p;

    public C75942ba(C75855v vVar, C75866e eVar, C76092h hVar, C75906g gVar, C91142g gVar2, C75910k kVar, C75158f fVar, C75867a aVar, C75050a aVar2) {
        this.f210710p = vVar;
        this.f210704j = eVar;
        this.f210708n = hVar;
        this.f210702h = gVar;
        this.f210696a = gVar2;
        this.f210703i = kVar;
        this.f210705k = fVar;
        this.f210697b = aVar;
        this.f210706l = aVar2;
    }

    /* renamed from: a */
    public final void mo71137a(C75077bo boVar, C75077bo boVar2) {
        ((C59052c) ((C59052c) f210695g.mo56224b()).mo56372aa(3458)).mo56386p("Nga state changed");
        if (boVar.mo71473s()) {
            this.f210701f.set(Optional.empty());
            this.f210709o.set(Optional.empty());
            this.f210697b.mo71929a();
        } else if (boVar.mo71470p()) {
            this.f210709o.set(boVar.mo71467m());
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo71138b(bl blVar) {
    }

    /* renamed from: c */
    public final void mo71916c(C80203ax axVar) {
        if (mo71972f()) {
            int i = axVar.f220049a;
            if (i == 10) {
                C80187ah ahVar = ((C80238ce) axVar.f220050b).f220131b;
                if (ahVar == null) {
                    ahVar = C80187ah.f220007e;
                }
                mo71971e(ahVar, Optional.empty(), Optional.empty());
            } else if (i == 11) {
                AtomicReference atomicReference = this.f210701f;
                C80187ah ahVar2 = ((C80210bd) axVar.f220050b).f220068b;
                if (ahVar2 == null) {
                    ahVar2 = C80187ah.f220007e;
                }
                atomicReference.set(Optional.m71637of(ahVar2));
            } else if (i == 1) {
                this.f210697b.mo71934f();
            } else if (i == 12) {
                C75867a aVar = this.f210697b;
                int i2 = ((C80242ci) axVar.f220050b).f220136b;
                C80246cm cmVar = C80246cm.UI_STATE_UNKNOWN;
                aVar.mo71936h();
            }
        }
    }

    /* renamed from: d */
    public final void mo71970d(C80744ds dsVar) {
        if (mo71972f()) {
            dsVar.mo74548b().mo74643a();
            dsVar.mo74547a().mo74638b();
            if (dsVar.mo74548b().mo74643a() != C80741dp.EMPTY) {
                if (dsVar.mo74548b().mo74643a() == C80741dp.TRY_SAYING) {
                    this.f210698c = true;
                    this.f210700e.set(Optional.m71637of(dsVar.mo74548b().mo74650h()));
                } else if (dsVar.mo74548b().mo74643a() == C80741dp.GREETING) {
                    this.f210698c = false;
                    this.f210700e.set(Optional.empty());
                }
            } else if (dsVar.mo74547a().mo74638b() == C80739dn.EMPTY) {
            } else {
                if (dsVar.mo74547a().mo74638b() == C80739dn.FRE_SUGGESTION) {
                    this.f210698c = true;
                    this.f210699d.set(Optional.m71637of(dsVar.mo74547a().mo74641e()));
                    if (((Optional) this.f210709o.get()).orElse(e.a) == e.bb && this.f210706l.mo71417a().mo71470p()) {
                        this.f210697b.mo71930b();
                        return;
                    }
                    return;
                }
                this.f210698c = false;
                this.f210699d.set(Optional.empty());
                this.f210701f.set(Optional.empty());
            }
        }
    }

    /* renamed from: e */
    public final void mo71971e(C80187ah ahVar, Optional optional, Optional optional2) {
        Bundle bundle = new Bundle();
        C75784m.m122148g(bundle, ahVar, optional, optional2);
        try {
            C81377k.m129445c(bundle, C80267v.MULTI_STEP_TRY_SAYING);
            C75866e eVar = this.f210704j;
            C75912m f = C75913n.m122414f(15);
            f.mo71871b(C80248co.MULTI_STEP_EDUCATION);
            eVar.mo71904b(bundle, f.mo71870a());
        } catch (C81381o e) {
            ((C59052c) ((C59052c) ((C59052c) f210695g.mo56224b()).mo56382g(e)).mo56372aa(3462)).mo56386p("Multi-step try saying triggering exception");
        }
    }

    /* renamed from: f */
    public final boolean mo71972f() {
        return this.f210702h.mo71923b() == C80201av.PIE_ELIGIBLE && this.f210696a.mo85405j(C90037cp.f248451af);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x017d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x017f A[RETURN] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo71973g(java.lang.String r18, java.lang.String r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            com.google.android.apps.gsa.shared.util.v.g r3 = r0.f210696a
            com.google.android.apps.gsa.shared.m.f r4 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248512bn
            long r3 = r3.mo85399d(r4)
            double r3 = (double) r3
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            java.lang.Double.isNaN(r3)
            double r3 = r3 / r5
            com.google.android.apps.gsa.shared.util.v.g r5 = r0.f210696a
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248514bp
            boolean r5 = r5.mo85405j(r6)
            r6 = 0
            r7 = 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            if (r5 == 0) goto L_0x0060
            com.google.android.apps.gsa.nga.engine.g.h r5 = r0.f210708n
            com.google.android.apps.gsa.nga.engine.g.f r5 = r5.mo72021b()
            java.util.Locale r5 = r5.mo72039e()
            int r8 = r18.length()
            int r9 = r19.length()
            int r8 = java.lang.Math.max(r8, r9)
            com.google.common.c.k r9 = com.google.common.p4523c.C58929d.f156773b
            java.lang.String r1 = com.google.android.apps.gsa.assistant.shared.m.c.a(r1, r5)
            com.google.common.c.r r1 = r9.mo56208a(r1)
            java.lang.String r2 = com.google.android.apps.gsa.assistant.shared.m.c.a(r2, r5)
            r5 = 100
            int r1 = r1.mo56211a(r2, r5)
            int r1 = r8 - r1
            double r1 = (double) r1
            double r8 = (double) r8
            java.lang.Double.isNaN(r1)
            java.lang.Double.isNaN(r8)
            double r1 = r1 / r8
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x005f
            return r7
        L_0x005f:
            return r6
        L_0x0060:
            com.google.android.apps.gsa.shared.util.v.g r5 = r0.f210696a
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90037cp.f248513bo
            boolean r5 = r5.mo85405j(r9)
            if (r5 == 0) goto L_0x0181
            com.google.android.apps.gsa.nga.engine.g.h r5 = r0.f210708n
            com.google.android.apps.gsa.nga.engine.g.f r5 = r5.mo72021b()
            java.util.Locale r5 = r5.mo72039e()
            java.lang.String r1 = com.google.android.apps.gsa.assistant.shared.m.c.a(r1, r5)
            java.lang.String r2 = com.google.android.apps.gsa.assistant.shared.m.c.a(r2, r5)
            int r9 = r2.length()
            if (r9 != 0) goto L_0x008c
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0092
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x0179
        L_0x008c:
            int r9 = r1.length()
            if (r9 != 0) goto L_0x0096
        L_0x0092:
            r10 = 0
            goto L_0x0179
        L_0x0096:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            android.icu.text.BreakIterator r12 = android.icu.text.BreakIterator.getWordInstance(r5)
            r12.setText(r1)
            int r13 = r12.first()
            int r14 = r12.next()
            r16 = r14
            r14 = r13
            r13 = r16
        L_0x00af:
            java.lang.String r15 = " "
            r10 = -1
            if (r13 == r10) goto L_0x00ce
            java.lang.String r10 = r1.substring(r14, r13)
            boolean r10 = r10.equals(r15)
            if (r10 != 0) goto L_0x00c7
            java.lang.String r10 = r1.substring(r14, r13)
            com.google.android.apps.gsa.assistant.shared.m.a r11 = com.google.android.apps.gsa.assistant.shared.m.a.a
            p3186j$.util.Map.EL.merge(r9, r10, r8, r11)
        L_0x00c7:
            int r10 = r12.next()
            r14 = r13
            r13 = r10
            goto L_0x00af
        L_0x00ce:
            android.icu.text.BreakIterator r1 = android.icu.text.BreakIterator.getWordInstance(r5)
            r1.setText(r2)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            int r11 = r1.first()
        L_0x00de:
            int r12 = r1.next()
            r16 = r12
            r12 = r11
            r11 = r16
            if (r11 == r10) goto L_0x00fd
            java.lang.String r13 = r2.substring(r12, r11)
            boolean r13 = r13.equals(r15)
            if (r13 != 0) goto L_0x00de
            java.lang.String r12 = r2.substring(r12, r11)
            com.google.android.apps.gsa.assistant.shared.m.a r13 = com.google.android.apps.gsa.assistant.shared.m.a.a
            p3186j$.util.Map.EL.merge(r5, r12, r8, r13)
            goto L_0x00de
        L_0x00fd:
            java.util.Set r1 = r5.keySet()
            java.util.Iterator r1 = r1.iterator()
            r10 = 0
            r12 = 0
        L_0x0109:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0144
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r8 = r5.get(r2)
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.Integer r14 = java.lang.Integer.valueOf(r6)
            java.lang.Object r2 = p3186j$.util.Map.EL.getOrDefault(r9, r2, r14)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r14 = r8.intValue()
            int r2 = r2 * r14
            double r14 = (double) r2
            java.lang.Double.isNaN(r14)
            double r10 = r10 + r14
            int r2 = r8.intValue()
            int r8 = r8.intValue()
            int r2 = r2 * r8
            double r14 = (double) r2
            java.lang.Double.isNaN(r14)
            double r12 = r12 + r14
            goto L_0x0109
        L_0x0144:
            java.util.Set r1 = r9.keySet()
            java.util.Iterator r1 = r1.iterator()
            r14 = 0
        L_0x014e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0172
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r9.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r5 = r2.intValue()
            int r2 = r2.intValue()
            int r5 = r5 * r2
            double r6 = (double) r5
            java.lang.Double.isNaN(r6)
            double r14 = r14 + r6
            r6 = 0
            r7 = 1
            goto L_0x014e
        L_0x0172:
            double r12 = r12 * r14
            double r1 = java.lang.Math.sqrt(r12)
            double r10 = r10 / r1
        L_0x0179:
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x017f
            r5 = 1
            return r5
        L_0x017f:
            r6 = 0
            return r6
        L_0x0181:
            r5 = 1
            com.google.android.apps.gsa.nga.engine.g.h r7 = r0.f210708n
            com.google.android.apps.gsa.nga.engine.g.f r7 = r7.mo72021b()
            java.util.Locale r7 = r7.mo72039e()
            double r1 = com.google.android.apps.gsa.assistant.shared.m.b.a(r1, r2, r7)
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x0195
            return r5
        L_0x0195:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.education.pie.triggering.C75942ba.mo71973g(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: gH */
    public final C60870cx mo71906gH() {
        C75855v vVar = this.f210710p;
        vVar.f210485a.mo75092c(this.f210707m);
        this.f210703i.mo71909a(this);
        this.f210705k.mo71506b(this);
        return C118826c.f331423b;
    }

    /* renamed from: gI */
    public final void mo71907gI() {
        C75855v vVar = this.f210710p;
        vVar.f210485a.mo75093d(this.f210707m);
        this.f210703i.mo71911c(this);
        this.f210705k.mo71507c(this);
    }
}
