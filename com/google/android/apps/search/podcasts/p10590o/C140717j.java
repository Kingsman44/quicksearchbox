package com.google.android.apps.search.podcasts.p10590o;

import com.google.android.apps.search.podcasts.p10569h.C140385d;
import com.google.android.apps.search.podcasts.p10591p.C140747m;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58839bc;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4017at.p4082j.p4083a.C54372by;
import com.google.p4017at.p4082j.p4083a.C54373bz;
import com.google.p4017at.p4082j.p4083a.C54426dy;
import com.google.p4017at.p4082j.p4083a.C54427dz;
import com.google.p4017at.p4082j.p4083a.C54430eb;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63042fg;
import java.util.List;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.podcasts.o.j */
/* compiled from: PG */
public final /* synthetic */ class C140717j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C140725r f382138a;

    /* renamed from: b */
    public final /* synthetic */ C58839bc f382139b;

    public /* synthetic */ C140717j(C140725r rVar, C58839bc bcVar) {
        this.f382138a = rVar;
        this.f382139b = bcVar;
    }

    public final C60870cx apply(Object obj) {
        C140725r rVar = this.f382138a;
        C58839bc bcVar = this.f382139b;
        C140732y yVar = (C140732y) obj;
        C140730w wVar = yVar.f382167b;
        if (wVar == null) {
            wVar = C140730w.f382160c;
        }
        if (!bcVar.mo5941a(wVar)) {
            return C60856cj.m92898g();
        }
        C54426dy dyVar = (C54426dy) C54427dz.f142935d.createBuilder();
        C63042fg fgVar = yVar.f382168c;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        dyVar.copyOnWrite();
        fgVar.getClass();
        ((C54427dz) dyVar.instance).f142937a = fgVar;
        C140730w wVar2 = yVar.f382167b;
        if (wVar2 == null) {
            wVar2 = C140730w.f382160c;
        }
        C62971cq cqVar = wVar2.f382162a;
        dyVar.copyOnWrite();
        C54427dz dzVar = (C54427dz) dyVar.instance;
        C62971cq cqVar2 = dzVar.f142938b;
        if (!cqVar2.mo58948c()) {
            dzVar.f142938b = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) cqVar, (List) dzVar.f142938b);
        C140730w wVar3 = yVar.f382167b;
        if (wVar3 == null) {
            wVar3 = C140730w.f382160c;
        }
        C62971cq cqVar3 = wVar3.f382163b;
        dyVar.copyOnWrite();
        C54427dz dzVar2 = (C54427dz) dyVar.instance;
        C62971cq cqVar4 = dzVar2.f142939c;
        if (!cqVar4.mo58948c()) {
            dzVar2.f142939c = C62942bv.mutableCopy(cqVar4);
        }
        C62947c.addAll((Iterable) cqVar3, (List) dzVar2.f142939c);
        C54427dz dzVar3 = (C54427dz) dyVar.build();
        C140385d dVar = rVar.f382151c;
        C140747m mVar = dVar.f381341b;
        C54372by byVar = dVar.f381340a;
        C70888j jVar = byVar.f189039a;
        C70338di diVar = C54373bz.f142831m;
        if (diVar == null) {
            synchronized (C54373bz.class) {
                diVar = C54373bz.f142831m;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.podcasts.v1.PodcastsService", "SyncReactions");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C54427dz.f142935d);
                    d.f187486b = C70850d.m103697c(C54430eb.f142940c);
                    diVar = d.mo62040a();
                    C54373bz.f142831m = diVar;
                }
            }
        }
        C60870cx a = C70876o.m103760a(jVar.mo39510a(diVar, byVar.f189040b), dzVar3);
        mVar.mo115851a("PodcastsService", "SyncReactions", a);
        return C47633f.m84733g(a).mo51515h(new C140711d(dzVar3), C60826bg.f164896a);
    }
}
