package com.google.android.apps.search.googleapp.saves.savefeature.p10392a;

import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137254l;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c.C137256n;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57531a;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57583b;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57584ba;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57585bb;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57587bd;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57601br;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57604bu;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57605bv;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57637d;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57648i;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57663x;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.a.g */
/* compiled from: PG */
public final /* synthetic */ class C137265g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C137274p f373436a;

    /* renamed from: b */
    public final /* synthetic */ C137254l f373437b;

    /* renamed from: c */
    public final /* synthetic */ C57648i f373438c;

    public /* synthetic */ C137265g(C137274p pVar, C137254l lVar, C57648i iVar) {
        this.f373436a = pVar;
        this.f373437b = lVar;
        this.f373438c = iVar;
    }

    public final C60870cx apply(Object obj) {
        C137274p pVar = this.f373436a;
        C137254l lVar = this.f373437b;
        C57648i iVar = this.f373438c;
        C57578av avVar = (C57578av) obj;
        C137256n nVar = lVar.f373412d;
        if (nVar != null) {
            C57584ba baVar = (C57584ba) C57585bb.f153848e.createBuilder();
            C57601br c = C137274p.m223026c(iVar);
            baVar.copyOnWrite();
            c.getClass();
            ((C57585bb) baVar.instance).f153850a = c;
            C57569am amVar = nVar.f373419b;
            if (amVar == null) {
                amVar = C57569am.f153797f;
            }
            C57663x xVar = amVar.f153801c;
            if (xVar == null) {
                xVar = C57663x.f153984d;
            }
            baVar.copyOnWrite();
            C57585bb bbVar = (C57585bb) baVar.instance;
            xVar.getClass();
            C62971cq cqVar = bbVar.f153851b;
            if (!cqVar.mo58948c()) {
                bbVar.f153851b = C62942bv.mutableCopy(cqVar);
            }
            bbVar.f153851b.add(xVar);
            C57578av avVar2 = nVar.f373418a;
            if (avVar2 == null) {
                avVar2 = C57578av.f153822h;
            }
            C57566aj ajVar = avVar2.f153824a;
            if (ajVar == null) {
                ajVar = C57566aj.f153791e;
            }
            baVar.copyOnWrite();
            ajVar.getClass();
            ((C57585bb) baVar.instance).f153852c = ajVar;
            C57566aj ajVar2 = avVar.f153824a;
            if (ajVar2 == null) {
                ajVar2 = C57566aj.f153791e;
            }
            baVar.copyOnWrite();
            ajVar2.getClass();
            ((C57585bb) baVar.instance).f153853d = ajVar2;
            C57585bb bbVar2 = (C57585bb) baVar.build();
            C57604bu buVar = pVar.f373452d;
            C70888j jVar = buVar.f189039a;
            C70338di diVar = C57605bv.f153888e;
            if (diVar == null) {
                synchronized (C57605bv.class) {
                    diVar = C57605bv.f153888e;
                    if (diVar == null) {
                        C70335df d = C70338di.m102603d();
                        d.f187487c = C70337dh.UNARY;
                        d.f187488d = C70338di.m102602c("google.search.platform.save.v2.SaveService", "MoveItems");
                        d.f187489e = true;
                        d.f187485a = C70850d.m103697c(C57585bb.f153848e);
                        d.f187486b = C70850d.m103697c(C57587bd.f153855a);
                        C70338di a = d.mo62040a();
                        C57605bv.f153888e = a;
                        diVar = a;
                    }
                }
            }
            C60870cx a2 = C70876o.m103760a(jVar.mo39510a(diVar, buVar.f189040b), bbVar2);
            C137233a aVar = new C137233a(pVar, avVar, nVar);
            return C60922j.m93045h(a2, C47810es.m84966f(aVar), pVar.f373458j);
        }
        C57569am amVar2 = lVar.f373411c;
        if (amVar2 == null) {
            amVar2 = C57569am.f153797f;
        }
        C57566aj ajVar3 = avVar.f153824a;
        if (ajVar3 == null) {
            ajVar3 = C57566aj.f153791e;
        }
        C57531a aVar2 = (C57531a) C57583b.f153841e.createBuilder();
        C57601br c2 = C137274p.m223026c(iVar);
        aVar2.copyOnWrite();
        c2.getClass();
        ((C57583b) aVar2.instance).f153843a = c2;
        aVar2.copyOnWrite();
        ajVar3.getClass();
        ((C57583b) aVar2.instance).f153844b = ajVar3;
        aVar2.mo54490a(amVar2);
        aVar2.copyOnWrite();
        ((C57583b) aVar2.instance).f153846d = 2;
        C57583b bVar = (C57583b) aVar2.build();
        C57604bu buVar2 = pVar.f373452d;
        C70888j jVar2 = buVar2.f189039a;
        C70338di diVar2 = C57605bv.f153886c;
        if (diVar2 == null) {
            synchronized (C57605bv.class) {
                diVar2 = C57605bv.f153886c;
                if (diVar2 == null) {
                    C70335df d2 = C70338di.m102603d();
                    d2.f187487c = C70337dh.UNARY;
                    d2.f187488d = C70338di.m102602c("google.search.platform.save.v2.SaveService", "AddItems");
                    d2.f187489e = true;
                    d2.f187485a = C70850d.m103697c(C57583b.f153841e);
                    d2.f187486b = C70850d.m103697c(C57637d.f153936c);
                    diVar2 = d2.mo62040a();
                    C57605bv.f153886c = diVar2;
                }
            }
        }
        C60870cx a3 = C70876o.m103760a(jVar2.mo39510a(diVar2, buVar2.f189040b), bVar);
        C137270l lVar2 = new C137270l(pVar);
        return C60922j.m93045h(a3, C47810es.m84966f(lVar2), pVar.f373458j);
    }
}
