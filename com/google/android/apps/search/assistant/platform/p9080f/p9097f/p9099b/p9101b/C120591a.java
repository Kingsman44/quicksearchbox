package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9099b.p9101b;

import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120578b;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120580d;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9099b.p9100a.C120589f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import dagger.p5295b.C68283d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.b.b.a */
/* compiled from: PG */
final class C120591a implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C120580d f335417a;

    /* renamed from: b */
    final /* synthetic */ C68283d f335418b;

    public C120591a(C120580d dVar, C68283d dVar2) {
        this.f335417a = dVar;
        this.f335418b = dVar2;
    }

    public final /* synthetic */ C60870cx apply(Object obj) {
        C120589f fVar = (C120589f) obj;
        C69664n.m101061g(fVar, "it");
        try {
            if (fVar.f335408a.isPresent()) {
                this.f335417a.mo104847c(C120578b.FLUID_ACTIONS);
                return C60856cj.m92900i(fVar);
            }
            C59052c cVar = (C59052c) C120598h.f335436a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceFulfill");
            cVar.mo56379ah(new C59094n(35515));
            cVar.mo56386p("#fluidActionsFulfillmentResult: FluidActions gave no result. Falling back to online fulfillment");
            this.f335417a.mo104846b(C120578b.ONLINE, true);
            return this.f335418b.mo60297gq();
        } catch (Throwable th) {
            C59052c cVar2 = (C59052c) C120598h.f335436a.mo56226d();
            cVar2.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceFulfill");
            C59052c cVar3 = (C59052c) cVar2.mo56382g(th);
            cVar3.mo56379ah(new C59094n(35516));
            cVar3.mo56386p("#fluidActionsFulfillmentResult: FluidActions failed. Using online fulfillment");
            this.f335417a.mo104845a(C120578b.ONLINE, true);
        }
    }
}
