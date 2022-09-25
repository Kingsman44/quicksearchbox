package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import com.google.android.apps.gsa.nga.engine.p6044n.C76248a;
import com.google.android.apps.gsa.nga.engine.p6044n.C76401e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80293ao;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80307bb;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.am */
/* compiled from: PG */
public final /* synthetic */ class C76356am implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C76363at f211453a;

    /* renamed from: b */
    public final /* synthetic */ C76401e f211454b;

    public /* synthetic */ C76356am(C76363at atVar, C76401e eVar) {
        this.f211453a = atVar;
        this.f211454b = eVar;
    }

    public final void accept(Object obj) {
        C80307bb bbVar;
        C76363at atVar = this.f211453a;
        C76401e eVar = this.f211454b;
        C80295aq aqVar = (C80295aq) obj;
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        C80293ao aoVar = (C80293ao) C80295aq.f220357c.createBuilder();
        if (aqVar.f220359a == 6) {
            bbVar = (C80307bb) aqVar.f220360b;
        } else {
            bbVar = C80307bb.f220382e;
        }
        C80303ay ayVar = (C80303ay) bbVar.toBuilder();
        ayVar.copyOnWrite();
        C80307bb bbVar2 = (C80307bb) ayVar.instance;
        bbVar2.f220385b = 1;
        bbVar2.f220384a = 1 | bbVar2.f220384a;
        aoVar.copyOnWrite();
        C80295aq aqVar2 = (C80295aq) aoVar.instance;
        C80307bb bbVar3 = (C80307bb) ayVar.build();
        bbVar3.getClass();
        aqVar2.f220360b = bbVar3;
        aqVar2.f220359a = 6;
        C81442m.m129555q(lVar, aoVar);
        C80905at.m128763g(atVar.mo72178d((C80401n) lVar.build(), ((C76248a) eVar).f211269b.mo71342q(), eVar.mo72186d().c(), eVar.mo72187e().mo71163q(), Optional.empty()), C76345ab.f211438a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
