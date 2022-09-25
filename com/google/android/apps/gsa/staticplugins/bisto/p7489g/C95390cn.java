package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.cn */
/* compiled from: PG */
public final class C95390cn {

    /* renamed from: a */
    public final C95355bf f266907a;

    /* renamed from: b */
    private final C89656k f266908b;

    /* renamed from: c */
    private final C58495hd f266909c;

    /* renamed from: d */
    private C95385ci f266910d;

    public C95390cn(C89656k kVar, C95355bf bfVar) {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(1, new C95383cg(this));
        gzVar.mo55429h(2, new C95382cf(this));
        gzVar.mo55429h(3, new C95386cj(this));
        gzVar.mo55429h(4, new C95389cm(this));
        gzVar.mo55429h(5, new C95388cl(this));
        gzVar.mo55429h(6, new C95387ck(this));
        gzVar.mo55429h(7, new C95384ch(this));
        C58495hd f = gzVar.mo55427f(false);
        this.f266909c = f;
        C95385ci ciVar = (C95385ci) f.get(1);
        ciVar.getClass();
        this.f266910d = ciVar;
        this.f266908b = kVar;
        this.f266907a = bfVar;
    }

    /* renamed from: a */
    public static List m157744a(int i) {
        return Collections.nCopies(4, Integer.valueOf(i));
    }

    /* renamed from: e */
    public static C95395cs m157745e(int i, List list) {
        C95394cr e = C95395cs.m157761e();
        C95434g gVar = (C95434g) e;
        gVar.f267035b = 1;
        gVar.f267036c = i;
        gVar.f267037d = 256;
        gVar.f267034a = C58485gu.m89842j(list);
        return e.mo89336a();
    }

    /* renamed from: f */
    public static C95395cs m157746f(int i, int i2) {
        C95394cr e = C95395cs.m157761e();
        C95434g gVar = (C95434g) e;
        gVar.f267035b = 1;
        gVar.f267036c = i;
        gVar.f267037d = i2;
        return e.mo89336a();
    }

    /* renamed from: b */
    public final synchronized void mo89324b(int i) {
        C95385ci ciVar = (C95385ci) this.f266909c.get(Integer.valueOf(i));
        ciVar.getClass();
        this.f266910d = ciVar;
        ciVar.mo89323d();
    }

    /* renamed from: c */
    public final synchronized void mo89325c(int i) {
        if (!this.f266908b.mo83553h("ledUsage")) {
            this.f266910d.mo89322c(i);
        }
    }

    /* renamed from: d */
    public final boolean mo89326d() {
        return this.f266908b.mo83553h("enableLegacyLedControl");
    }
}
