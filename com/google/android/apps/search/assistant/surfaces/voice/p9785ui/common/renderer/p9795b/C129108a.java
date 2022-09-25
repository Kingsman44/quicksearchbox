package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127135ab;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127137ad;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127163w;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127165y;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127166z;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.protobuf.p4750c.p4751a.C62949a;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.fluidactions.FluidActionsClientOpPrefetcher$startPrefetch$1$commit$1", mo61344c = "FluidActionsClientOpPrefetcher.kt", mo61345d = "invokeSuspend", mo61346e = {60})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.b.a */
/* compiled from: PG */
final class C129108a extends C69572j implements C69630p {

    /* renamed from: a */
    int f354687a;

    /* renamed from: b */
    final /* synthetic */ C129127c f354688b;

    /* renamed from: c */
    final /* synthetic */ C51809dy f354689c;

    /* renamed from: d */
    final /* synthetic */ C127289i f354690d;

    /* renamed from: e */
    final /* synthetic */ C119793ao f354691e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129108a(C129127c cVar, C51809dy dyVar, C127289i iVar, C119793ao aoVar, C69577g gVar) {
        super(2, gVar);
        this.f354688b = cVar;
        this.f354689c = dyVar;
        this.f354690d = iVar;
        this.f354691e = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C129108a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f354687a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127163w wVar = this.f354688b.f354731c;
            C51809dy dyVar = this.f354689c;
            C127289i iVar = this.f354690d;
            C119793ao aoVar = this.f354691e;
            C127165y yVar = (C127165y) C127166z.f350092g.createBuilder();
            C69664n.m101060f(yVar, "newBuilder()");
            C127135ab a = C69664n.m101061g(yVar, "builder");
            a.mo107958b(dyVar);
            Duration duration = C129127c.f354728a;
            C69664n.m101060f(duration, "PREFETCH_TIMEOUT");
            a.mo107962f(C62949a.m95466a(duration));
            a.mo107960d(C129127c.f354729b);
            a.mo107961e(iVar);
            a.mo107959c(aoVar);
            C127166z a2 = a.mo107957a();
            this.f354687a = 1;
            obj = wVar.mo107974d(a2, new C70334de(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C52070ec ecVar = ((C127137ad) obj).f350050b;
        if (ecVar == null) {
            ecVar = C52070ec.f136651d;
        }
        C69664n.m101060f(ecVar, "conversationDataStore\n  …          .clientOpResult");
        return ecVar;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C129108a(this.f354688b, this.f354689c, this.f354690d, this.f354691e, gVar);
    }
}
