package com.google.android.apps.gsa.staticplugins.opa.tapas.p8525e.p8529c;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80008e;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80012i;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8525e.p8526a.C111764a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8525e.p8526a.C111765b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58528ij;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54807a;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54827at;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54828au;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54914e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.e.c.c */
/* compiled from: PG */
public final /* synthetic */ class C111769c implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C111771e f310665a;

    /* renamed from: b */
    public final /* synthetic */ C80008e f310666b;

    /* renamed from: c */
    public final /* synthetic */ C113408es f310667c;

    public /* synthetic */ C111769c(C111771e eVar, C80008e eVar2, C113408es esVar) {
        this.f310665a = eVar;
        this.f310666b = eVar2;
        this.f310667c = esVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C111771e eVar = this.f310665a;
        C80008e eVar2 = this.f310666b;
        C113408es esVar = this.f310667c;
        C54914e eVar3 = (C54914e) obj;
        C111764a aVar = (C111764a) C111765b.f310654f.createBuilder();
        C80012i iVar = (C80012i) eVar2.build();
        aVar.copyOnWrite();
        C111765b bVar = (C111765b) aVar.instance;
        iVar.getClass();
        bVar.f310658c = iVar;
        bVar.f310657b = 2;
        C54807a aVar2 = (C54807a) eVar3.toBuilder();
        C54828au auVar = eVar3.f144347f;
        if (auVar == null) {
            auVar = C54828au.f143868g;
        }
        C54827at atVar = (C54827at) auVar.toBuilder();
        atVar.copyOnWrite();
        C54828au auVar2 = (C54828au) atVar.instance;
        auVar2.f143870a = 2 | auVar2.f143870a;
        auVar2.f143873d = 0;
        C54828au auVar3 = (C54828au) atVar.build();
        aVar2.copyOnWrite();
        C54914e eVar4 = (C54914e) aVar2.instance;
        auVar3.getClass();
        eVar4.f144347f = auVar3;
        eVar4.f144342a |= 8;
        C54914e eVar5 = (C54914e) aVar2.build();
        aVar.copyOnWrite();
        C111765b bVar2 = (C111765b) aVar.instance;
        eVar5.getClass();
        bVar2.f310660e = eVar5;
        bVar2.f310656a |= 4;
        C58528ij<C48672ag> d = esVar.mo100121d();
        aVar.copyOnWrite();
        C111765b bVar3 = (C111765b) aVar.instance;
        C62961ch chVar = bVar3.f310659d;
        if (!chVar.mo58948c()) {
            bVar3.f310659d = C62942bv.mutableCopy(chVar);
        }
        for (C48672ag agVar : d) {
            bVar3.f310659d.mo58916g(agVar.f125915O);
        }
        eVar.mo99226a((C111765b) aVar.build(), "tapas_suggestions.bin").getPath();
    }
}
