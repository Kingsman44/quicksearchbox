package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9099b.p9101b;

import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120578b;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120579c;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120580d;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9099b.p9100a.C120589f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import dagger.p5295b.C68283d;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.b.b.b */
/* compiled from: PG */
final class C120592b implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C120580d f335419a;

    /* renamed from: b */
    final /* synthetic */ C68283d f335420b;

    /* renamed from: c */
    final /* synthetic */ C68283d f335421c;

    /* renamed from: d */
    final /* synthetic */ C120579c f335422d;

    /* renamed from: e */
    final /* synthetic */ Executor f335423e;

    public C120592b(C120580d dVar, C68283d dVar2, C68283d dVar3, C120579c cVar, Executor executor) {
        this.f335419a = dVar;
        this.f335420b = dVar2;
        this.f335421c = dVar3;
        this.f335422d = cVar;
        this.f335423e = executor;
    }

    public final /* synthetic */ C60870cx apply(Object obj) {
        C120589f fVar = (C120589f) obj;
        C69664n.m101061g(fVar, "it");
        try {
            if (fVar.f335408a.isPresent()) {
                this.f335419a.mo104847c(C120578b.FLUID_ACTIONS);
                return C60856cj.m92900i(fVar);
            }
            C59052c cVar = (C59052c) C120598h.f335436a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceFulfill");
            cVar.mo56379ah(new C59094n(35517));
            cVar.mo56386p("#fluidActionsWithOnDeviceFallbackFulfill: FluidActions gave no result. Falling back to onDevice/online fulfillment");
            this.f335419a.mo104846b(C120578b.ONLINE_AND_ON_DEVICE, false);
            C68283d dVar = this.f335420b;
            C68283d dVar2 = this.f335421c;
            C120579c cVar2 = this.f335422d;
            Executor executor = this.f335423e;
            C120580d a = cVar2.mo104844a(C120578b.ONLINE_AND_ON_DEVICE);
            C60870cx gq = dVar.mo60297gq();
            C69664n.m101060f(gq, "onlineProducer.get()");
            C60870cx gq2 = dVar2.mo60297gq();
            C69664n.m101060f(gq2, "onDeviceFulfillmentProducer.get()");
            return C47633f.m84733g(gq2).mo51516i(new C120596f(a, gq, executor), C60826bg.f164896a).mo51514f(Exception.class, new C120597g(a, gq), C60826bg.f164896a);
        } catch (Throwable th) {
            C59052c cVar3 = (C59052c) C120598h.f335436a.mo56226d();
            cVar3.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceFulfill");
            C59052c cVar4 = (C59052c) cVar3.mo56382g(th);
            cVar4.mo56379ah(new C59094n(35518));
            cVar4.mo56386p("#fluidActionsWithOnDeviceFallbackFulfill: FluidActions failed. Using onDevice/online fulfillment");
            this.f335419a.mo104845a(C120578b.ONLINE_AND_ON_DEVICE, false);
        }
    }
}
