package com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.p9751d;

import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128053ab;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128054ac;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128071at;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128075ax;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128120u;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128124y;
import com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.p9744a.p9746b.C128654a;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.impl.SidePanelFragmentPeer$keyboardClicked$1", mo61344c = "SidePanelFragmentPeer.kt", mo61345d = "invokeSuspend", mo61346e = {99})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.d.d */
/* compiled from: PG */
final class C128674d extends C69572j implements C69630p {

    /* renamed from: a */
    int f353724a;

    /* renamed from: b */
    final /* synthetic */ C128676f f353725b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128674d(C128676f fVar, C69577g gVar) {
        super(2, gVar);
        this.f353725b = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C128674d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f353724a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C128654a aVar2 = this.f353725b.f353736j;
            this.f353724a = 1;
            C128120u uVar = aVar2.f353676a;
            if (uVar != null) {
                C128124y yVar = (C128124y) C128071at.f352396c.createBuilder();
                C69664n.m101060f(yVar, "newBuilder()");
                C128075ax a = C69664n.m101061g(yVar, "builder");
                C128053ab abVar = (C128053ab) C128054ac.f352359a.createBuilder();
                C69664n.m101060f(abVar, "newBuilder()");
                C69664n.m101061g(abVar, "builder");
                C62942bv build = abVar.build();
                C69664n.m101060f(build, "_builder.build()");
                C128054ac acVar = (C128054ac) build;
                C69664n.m101061g(acVar, "value");
                C128124y yVar2 = a.f352402a;
                yVar2.copyOnWrite();
                C128071at atVar = (C128071at) yVar2.instance;
                acVar.getClass();
                atVar.f352399b = acVar;
                atVar.f352398a = 4;
                Object c = C71663i.m104690c(uVar.mo108342c(a.mo108336a()), this);
                if (c != C69554a.COROUTINE_SUSPENDED) {
                    c = C69788q.f186170a;
                }
                if (c == aVar) {
                    return aVar;
                }
            } else {
                throw new IllegalStateException("Missing VoicePlateClassicServiceFutureStub");
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C128674d(this.f353725b, gVar);
    }
}
