package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.aa */
/* compiled from: PG */
public final /* synthetic */ class C127990aa implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C70862aj f352249a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f352250b;

    public /* synthetic */ C127990aa(C70862aj ajVar, C60870cx cxVar) {
        this.f352249a = ajVar;
        this.f352250b = cxVar;
    }

    public final void run() {
        C70862aj ajVar = this.f352249a;
        C60870cx cxVar = this.f352250b;
        C58974d dVar = C127999aj.f352260a;
        try {
            C128006d dVar2 = (C128006d) C128007e.f352279b.createBuilder();
            Iterable iterable = (Iterable) Collection.EL.stream((List) C60856cj.m92909r(cxVar)).filter(C128027y.f352302a).collect(C58370cn.f155946a);
            dVar2.copyOnWrite();
            C128007e eVar = (C128007e) dVar2.instance;
            C62971cq cqVar = eVar.f352281a;
            if (!cqVar.mo58948c()) {
                eVar.f352281a = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll(iterable, (List) eVar.f352281a);
            ajVar.mo20123c((C128007e) dVar2.build());
        } catch (Throwable th) {
            ((C58970a) ((C58970a) ((C58970a) C127999aj.f352260a.mo56225c()).mo56382g(th)).mo56372aa(37742)).mo56386p("Failed to get signals");
            ajVar.mo20123c(C128007e.f352279b);
        }
        ajVar.mo20121a();
    }
}
