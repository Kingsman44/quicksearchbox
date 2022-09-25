package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128078b;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128079ba;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128080bb;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128081bc;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128082bd;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128122w;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.p5573a.C71360an;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.titan.ui.connection.impl.VoicePlateClassicConnectionImpl$createConnectionFlow$1", mo61344c = "VoicePlateClassicConnectionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {437})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.ap */
/* compiled from: PG */
final class C128707ap extends C69572j implements C69630p {

    /* renamed from: a */
    int f353810a;

    /* renamed from: b */
    final /* synthetic */ C128735bq f353811b;

    /* renamed from: c */
    private /* synthetic */ Object f353812c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128707ap(C128735bq bqVar, C69577g gVar) {
        super(2, gVar);
        this.f353811b = bqVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C128707ap) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f353810a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71361ao aoVar = (C71361ao) this.f353812c;
            C128706ao aoVar2 = new C128706ao(aoVar);
            C128122w wVar = this.f353811b.f353888h;
            if (wVar != null) {
                C70862aj b = wVar.mo108343b(aoVar2);
                C128079ba baVar = (C128079ba) C128082bd.f352414c.createBuilder();
                C128080bb bbVar = (C128080bb) C128081bc.f352410c.createBuilder();
                C128078b bVar = C128078b.CLIENT_TITAN_VIS_VOICE_PLATE;
                bbVar.copyOnWrite();
                C128081bc bcVar = (C128081bc) bbVar.instance;
                bcVar.f352413b = bVar.f352409d;
                bcVar.f352412a |= 1;
                baVar.copyOnWrite();
                C128082bd bdVar = (C128082bd) baVar.instance;
                C128081bc bcVar2 = (C128081bc) bbVar.build();
                bcVar2.getClass();
                bdVar.f352417b = bcVar2;
                bdVar.f352416a = 1;
                C62942bv build = baVar.build();
                C69664n.m101060f(build, "newBuilder()\n           …   )\n            .build()");
                b.mo20123c((C128082bd) build);
                C128705an anVar = new C128705an(b);
                this.f353810a = 1;
                if (C71360an.m104022a(aoVar, anVar, this) == aVar) {
                    return aVar;
                }
            } else {
                throw new IllegalArgumentException("Missing VoicePlateClassicServiceStub");
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C128707ap apVar = new C128707ap(this.f353811b, gVar);
        apVar.f353812c = obj;
        return apVar;
    }
}
