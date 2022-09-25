package com.google.android.apps.gsa.staticplugins.opa.promo.p8407a;

import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.assistant.p4008y.C53618b;
import com.google.assistant.p4008y.p4011c.p4012a.C53627d;
import com.google.assistant.p4008y.p4011c.p4012a.C53628e;
import com.google.assistant.p4008y.p4013d.C53660l;
import com.google.assistant.p4008y.p4013d.p4014a.C53644m;
import com.google.assistant.p4008y.p4013d.p4014a.C53645n;
import com.google.assistant.p4008y.p4013d.p4014a.C53648q;
import com.google.assistant.p4008y.p4013d.p4014a.C53649r;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4671b.C61822o;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.a.q */
/* compiled from: PG */
public final /* synthetic */ class C109895q implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C109902x f306205a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f306206b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f306207c;

    public /* synthetic */ C109895q(C109902x xVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f306205a = xVar;
        this.f306206b = cxVar;
        this.f306207c = cxVar2;
    }

    public final Object call() {
        C61822o oVar;
        C109902x xVar = this.f306205a;
        C60870cx cxVar = this.f306206b;
        C60870cx cxVar2 = this.f306207c;
        C53627d dVar = (C53627d) C53628e.f140751f.createBuilder();
        Iterable iterable = (Iterable) C60856cj.m92909r(cxVar);
        dVar.copyOnWrite();
        C53628e eVar = (C53628e) dVar.instance;
        C62971cq cqVar = eVar.f140755c;
        if (!cqVar.mo58948c()) {
            eVar.f140755c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) eVar.f140755c);
        C53644m mVar = (C53644m) C53645n.f140798c.createBuilder();
        int a = ((bm) xVar.f306227d.mo27525b()).a();
        if (a == 1) {
            oVar = C61822o.ELIGIBLE_PREBUILT;
        } else if (a == 2) {
            oVar = C61822o.ELIGIBLE_FOR_UPGRADE;
        } else if (a == 3) {
            oVar = C61822o.ELIGIBLE_UPGRADING;
        } else if (a == 4) {
            oVar = C61822o.ELIGIBLE_UPGRADED;
        } else if (a != 5) {
            oVar = C61822o.NOT_ELIGIBLE;
        } else {
            oVar = C61822o.ELIGIBLE_UPGRADED_BYPASS;
        }
        mVar.copyOnWrite();
        C53645n nVar = (C53645n) mVar.instance;
        nVar.f140801b = oVar.f167065g;
        nVar.f140800a |= 1;
        dVar.copyOnWrite();
        C53628e eVar2 = (C53628e) dVar.instance;
        C53645n nVar2 = (C53645n) mVar.build();
        nVar2.getClass();
        eVar2.f140754b = nVar2;
        eVar2.f140753a |= 1;
        C53648q qVar = (C53648q) C53649r.f140806e.createBuilder();
        String b = ((bm) xVar.f306227d.mo27525b()).b();
        qVar.copyOnWrite();
        C53649r rVar = (C53649r) qVar.instance;
        b.getClass();
        rVar.f140808a = 1 | rVar.f140808a;
        rVar.f140809b = b;
        String id = TimeZone.getDefault().getID();
        qVar.copyOnWrite();
        C53649r rVar2 = (C53649r) qVar.instance;
        id.getClass();
        rVar2.f140808a |= 2;
        rVar2.f140810c = id;
        boolean w = ((bm) xVar.f306227d.mo27525b()).w();
        qVar.copyOnWrite();
        C53649r rVar3 = (C53649r) qVar.instance;
        rVar3.f140808a |= 4;
        rVar3.f140811d = w;
        dVar.copyOnWrite();
        C53628e eVar3 = (C53628e) dVar.instance;
        C53649r rVar4 = (C53649r) qVar.build();
        rVar4.getClass();
        eVar3.f140756d = rVar4;
        eVar3.f140753a |= 2;
        if (((C58833ax) C60856cj.m92909r(cxVar2)).mo56113h()) {
            C53660l lVar = ((C53618b) ((C58833ax) C60856cj.m92909r(cxVar2)).mo56107c()).f140735b;
            if (lVar == null) {
                lVar = C53660l.f140838d;
            }
            dVar.copyOnWrite();
            C53628e eVar4 = (C53628e) dVar.instance;
            lVar.getClass();
            eVar4.f140757e = lVar;
            eVar4.f140753a |= 4;
        }
        return (C53628e) dVar.build();
    }
}
