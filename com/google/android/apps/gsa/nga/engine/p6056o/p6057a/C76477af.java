package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6260x.C79878z;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82836cf;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82838ch;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82839ci;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82841ck;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82843cm;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82988hw;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.af */
/* compiled from: PG */
public final /* synthetic */ class C76477af implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C76490as f211652a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f211653b;

    /* renamed from: c */
    public final /* synthetic */ C74965n f211654c;

    /* renamed from: d */
    public final /* synthetic */ Optional f211655d;

    /* renamed from: e */
    public final /* synthetic */ C80401n f211656e;

    public /* synthetic */ C76477af(C76490as asVar, C58485gu guVar, C74965n nVar, Optional optional, C80401n nVar2) {
        this.f211652a = asVar;
        this.f211653b = guVar;
        this.f211654c = nVar;
        this.f211655d = optional;
        this.f211656e = nVar2;
    }

    public final void run() {
        C76490as asVar = this.f211652a;
        C58485gu guVar = this.f211653b;
        C74965n nVar = this.f211654c;
        Optional optional = this.f211655d;
        C80401n nVar2 = this.f211656e;
        C82836cf cfVar = (C82836cf) C82839ci.f225884b.createBuilder();
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C82838ch chVar = (C82838ch) ((Supplier) guVar.get(i2)).get();
            cfVar.copyOnWrite();
            C82839ci ciVar = (C82839ci) cfVar.instance;
            chVar.getClass();
            ciVar.mo76625a();
            ciVar.f225886a.add(chVar);
        }
        asVar.f211682d.mo75546d(C82887ec.FULFILLMENT_CANDIDATES_SENSITIVE, C79878z.m128031f((C82839ci) cfVar.build()), nVar.mo71336k());
        Collection.EL.stream(asVar.f211681c).forEach(new C76476ae());
        if (optional.isPresent() && !C81442m.m129553o(nVar2)) {
            C82843cm cmVar = ((C82838ch) ((Supplier) optional.get()).get()).f225882g;
            if (cmVar == null) {
                cmVar = C82843cm.f225889f;
            }
            C82841ck ckVar = (C82841ck) C82843cm.f225889f.createBuilder(cmVar);
            C82988hw a = C81442m.m129539a(nVar2);
            ckVar.copyOnWrite();
            a.getClass();
            ((C82843cm) ckVar.instance).f225895e = a;
            Collection.EL.stream(asVar.f211681c).forEach(new C76531y());
            asVar.f211682d.mo75546d(C82887ec.FULFILLMENT_RESULT_SENSITIVE, C79878z.m128032g((C82843cm) ckVar.build()), nVar.mo71336k());
        }
    }
}
