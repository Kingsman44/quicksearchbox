package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9099b.p9101b;

import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120578b;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120580d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.b.b.g */
/* compiled from: PG */
final class C120597g implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C120580d f335434a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f335435b;

    public C120597g(C120580d dVar, C60870cx cxVar) {
        this.f335434a = dVar;
        this.f335435b = cxVar;
    }

    public final /* synthetic */ C60870cx apply(Object obj) {
        Exception exc = (Exception) obj;
        C69664n.m101061g(exc, "it");
        C59052c cVar = (C59052c) C120598h.f335436a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceFulfill");
        cVar.mo56379ah(new C59094n(35524));
        cVar.mo56386p("ON-DEVICE(exception): On-device fulfillment encountered an exception. Using online result");
        C59052c cVar2 = (C59052c) C120598h.f335436a.mo56226d();
        cVar2.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceFulfill");
        C59052c cVar3 = (C59052c) cVar2.mo56382g(exc);
        cVar3.mo56379ah(new C59094n(35525));
        cVar3.mo56384n();
        this.f335434a.mo104845a(C120578b.ONLINE, true);
        return this.f335435b;
    }
}
