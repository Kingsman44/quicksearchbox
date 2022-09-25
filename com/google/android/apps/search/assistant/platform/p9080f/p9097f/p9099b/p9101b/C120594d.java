package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9099b.p9101b;

import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120578b;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120580d;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.b.b.d */
/* compiled from: PG */
final class C120594d implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C120580d f335425a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f335426b;

    public C120594d(C120580d dVar, C60870cx cxVar) {
        this.f335425a = dVar;
        this.f335426b = cxVar;
    }

    public final /* synthetic */ C60870cx apply(Object obj) {
        C69664n.m101061g((Exception) obj, "it");
        C59052c cVar = (C59052c) C120598h.f335436a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceFulfill");
        cVar.mo56379ah(new C59094n(35519));
        cVar.mo56386p("ON-DEVICE(failure): Using online result");
        this.f335425a.mo104851g(C120578b.ONLINE);
        return C47633f.m84733g(this.f335426b).mo51516i(C120593c.f335424a, C60826bg.f164896a);
    }
}
