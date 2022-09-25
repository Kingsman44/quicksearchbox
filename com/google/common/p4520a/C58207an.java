package com.google.common.p4520a;

import com.google.common.base.C58815af;
import com.google.common.base.C58838bb;
import com.google.common.base.C58889cz;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.a.an */
/* compiled from: PG */
class C58207an extends C58258m implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    final C58212as f155648b;

    /* renamed from: c */
    final C58212as f155649c;

    /* renamed from: d */
    final C58815af f155650d;

    /* renamed from: e */
    final C58815af f155651e;

    /* renamed from: f */
    final long f155652f;

    /* renamed from: g */
    final long f155653g;

    /* renamed from: h */
    final long f155654h;

    /* renamed from: i */
    final C58248ca f155655i;

    /* renamed from: j */
    final int f155656j;

    /* renamed from: k */
    final C58242bv f155657k;

    /* renamed from: l */
    final C58889cz f155658l;

    /* renamed from: m */
    final C58257l f155659m;

    /* renamed from: n */
    transient C58247c f155660n;

    public C58207an(C58234bn bnVar) {
        C58212as asVar = bnVar.f155741j;
        C58212as asVar2 = bnVar.f155742k;
        C58815af afVar = bnVar.f155739h;
        C58815af afVar2 = bnVar.f155740i;
        long j = bnVar.f155746o;
        long j2 = bnVar.f155745n;
        long j3 = bnVar.f155743l;
        C58248ca caVar = bnVar.f155744m;
        int i = bnVar.f155738g;
        C58242bv bvVar = bnVar.f155748q;
        C58889cz czVar = bnVar.f155749r;
        C58257l lVar = bnVar.f155752u;
        this.f155648b = asVar;
        this.f155649c = asVar2;
        this.f155650d = afVar;
        this.f155651e = afVar2;
        this.f155652f = j;
        this.f155653g = j2;
        this.f155654h = j3;
        this.f155655i = caVar;
        this.f155656j = i;
        this.f155657k = bvVar;
        this.f155658l = (czVar == C58889cz.f156731b || czVar == C58254i.f155785c) ? null : czVar;
        this.f155659m = lVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f155660n = mo54716f().mo54817a();
    }

    private Object readResolve() {
        return this.f155660n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C58247c mo54715e() {
        return this.f155660n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C58254i mo54716f() {
        C58254i iVar = new C58254i();
        C58212as asVar = this.f155648b;
        C58212as asVar2 = iVar.f155793j;
        boolean z = true;
        C58838bb.m90887v(asVar2 == null, "Key strength was already set to %s", asVar2);
        asVar.getClass();
        iVar.f155793j = asVar;
        C58212as asVar3 = this.f155649c;
        C58212as asVar4 = iVar.f155794k;
        C58838bb.m90887v(asVar4 == null, "Value strength was already set to %s", asVar4);
        asVar3.getClass();
        iVar.f155794k = asVar3;
        C58815af afVar = this.f155650d;
        C58815af afVar2 = iVar.f155797n;
        C58838bb.m90887v(afVar2 == null, "key equivalence was already set to %s", afVar2);
        afVar.getClass();
        iVar.f155797n = afVar;
        C58815af afVar3 = this.f155651e;
        C58815af afVar4 = iVar.f155798o;
        C58838bb.m90887v(afVar4 == null, "value equivalence was already set to %s", afVar4);
        afVar3.getClass();
        iVar.f155798o = afVar3;
        int i = this.f155656j;
        int i2 = iVar.f155789f;
        C58838bb.m90885t(i2 == -1, "concurrency level was already set to %s", i2);
        C58838bb.m90868c(i > 0);
        iVar.f155789f = i;
        C58242bv bvVar = this.f155657k;
        C58838bb.m90883r(iVar.f155799p == null);
        bvVar.getClass();
        iVar.f155799p = bvVar;
        iVar.f155787d = false;
        long j = this.f155652f;
        if (j > 0) {
            iVar.mo54822f(j, TimeUnit.NANOSECONDS);
        }
        long j2 = this.f155653g;
        if (j2 > 0) {
            iVar.mo54821e(j2, TimeUnit.NANOSECONDS);
        }
        if (this.f155655i != C58253h.f155781a) {
            C58248ca caVar = this.f155655i;
            C58838bb.m90883r(iVar.f155792i == null);
            if (iVar.f155787d) {
                long j3 = iVar.f155790g;
                C58838bb.m90886u(j3 == -1, "weigher can not be combined with maximum size (%s provided)", j3);
            }
            caVar.getClass();
            iVar.f155792i = caVar;
            long j4 = this.f155654h;
            if (j4 != -1) {
                long j5 = iVar.f155791h;
                C58838bb.m90886u(j5 == -1, "maximum weight was already set to %s", j5);
                long j6 = iVar.f155790g;
                if (j6 != -1) {
                    z = false;
                }
                C58838bb.m90886u(z, "maximum size was already set to %s", j6);
                iVar.f155791h = j4;
            }
        } else {
            long j7 = this.f155654h;
            if (j7 != -1) {
                iVar.mo54823g(j7);
            }
        }
        C58889cz czVar = this.f155658l;
        if (czVar != null) {
            iVar.mo54824h(czVar);
        }
        return iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f155660n;
    }
}
