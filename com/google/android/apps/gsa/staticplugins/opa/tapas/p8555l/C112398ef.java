package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79890l;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79891m;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80008e;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80012i;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80014k;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121509q;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54807a;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54828au;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54861c;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54888d;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54913dy;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54914e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ef */
/* compiled from: PG */
public final /* synthetic */ class C112398ef implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C112435fh f311848a;

    /* renamed from: b */
    public final /* synthetic */ C80012i f311849b;

    public /* synthetic */ C112398ef(C112435fh fhVar, C80012i iVar) {
        this.f311848a = fhVar;
        this.f311849b = iVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        Object obj;
        C112435fh fhVar = this.f311848a;
        C80012i iVar = this.f311849b;
        C80008e eVar = (C80008e) iVar.toBuilder();
        eVar.copyOnWrite();
        C80012i iVar2 = (C80012i) eVar.instance;
        iVar2.f219561a |= 1024;
        iVar2.f219568h = false;
        C79891m mVar = (C79891m) C112435fh.f311928a.mo105236e("model_scrape", new C112431fd(fhVar, (C80012i) eVar.build()));
        if (mVar == null) {
            C59104x c = C112435fh.f311929b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "CortexScoreAdjuster");
            ((C59052c) ((C59052c) c).mo56372aa(27613)).mo56386p("Failed to scrape model data, ModelResponse is null.");
            return C54914e.f144340k;
        }
        C121509q l = C112435fh.f311928a.mo105243l("convertModelDataForLog");
        try {
            C54807a aVar = (C54807a) C54914e.f144340k.createBuilder();
            C54828au a = fhVar.f311939l.apply(iVar);
            aVar.copyOnWrite();
            C54914e eVar2 = (C54914e) aVar.instance;
            a.getClass();
            eVar2.f144347f = a;
            eVar2.f144342a |= 8;
            C112229cg cgVar = fhVar.f311940m;
            C62940bt r1 = C62942bv.checkIsLite(C80014k.f219571e);
            mVar.mo58887l(r1);
            Object l2 = mVar.f169962ag.mo58854l(r1.f169971d);
            if (l2 == null) {
                obj = r1.f169969b;
            } else {
                obj = r1.mo58889c(l2);
            }
            C54913dy a2 = cgVar.apply((C80014k) obj);
            aVar.copyOnWrite();
            C54914e eVar3 = (C54914e) aVar.instance;
            a2.getClass();
            eVar3.f144348g = a2;
            eVar3.f144342a |= 16;
            for (C79890l lVar : mVar.f218978b) {
                C54861c cVar = (C54861c) C54888d.f144213e.createBuilder();
                String str = lVar.f218971b;
                cVar.copyOnWrite();
                C54888d dVar = (C54888d) cVar.instance;
                str.getClass();
                dVar.f144215a |= 1;
                dVar.f144216b = str;
                float f = lVar.f218972c;
                cVar.copyOnWrite();
                C54888d dVar2 = (C54888d) cVar.instance;
                dVar2.f144215a |= 2;
                dVar2.f144217c = f;
                float f2 = lVar.f218973d;
                cVar.copyOnWrite();
                C54888d dVar3 = (C54888d) cVar.instance;
                dVar3.f144215a |= 4;
                dVar3.f144218d = f2;
                C54888d dVar4 = (C54888d) cVar.build();
                aVar.copyOnWrite();
                C54914e eVar4 = (C54914e) aVar.instance;
                dVar4.getClass();
                C62971cq cqVar = eVar4.f144349h;
                if (!cqVar.mo58948c()) {
                    eVar4.f144349h = C62942bv.mutableCopy(cqVar);
                }
                eVar4.f144349h.add(dVar4);
            }
            C54914e eVar5 = (C54914e) aVar.build();
            l.close();
            return eVar5;
        } catch (Throwable th) {
            C112294dz.m186129a(th, th);
        }
        throw th;
    }
}
