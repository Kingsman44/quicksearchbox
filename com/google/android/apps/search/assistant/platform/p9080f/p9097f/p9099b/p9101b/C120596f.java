package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9099b.p9101b;

import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120578b;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120580d;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.C120610a;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.C120643b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.b.b.f */
/* compiled from: PG */
final class C120596f implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C120580d f335431a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f335432b;

    /* renamed from: c */
    final /* synthetic */ Executor f335433c;

    public C120596f(C120580d dVar, C60870cx cxVar, Executor executor) {
        this.f335431a = dVar;
        this.f335432b = cxVar;
        this.f335433c = executor;
    }

    public final /* synthetic */ C60870cx apply(Object obj) {
        C120643b bVar = (C120643b) obj;
        C69664n.m101061g(bVar, "it");
        C120610a c = bVar.mo104856c();
        if (c != null) {
            int ordinal = c.ordinal();
            if (ordinal == 0) {
                return C60856cj.m92900i(new C120595e(bVar, this.f335433c, this.f335431a, this.f335432b));
            }
            if (ordinal == 1) {
                C59052c cVar = (C59052c) C120598h.f335436a.mo56224b();
                cVar.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceFulfill");
                cVar.mo56379ah(new C59094n(35520));
                cVar.mo56386p("ON-DEVICE(mda): On-device fulfillment result is not selected because on-device MDA failed. Using online result");
                this.f335431a.mo104850f(C120578b.ONLINE);
                return this.f335432b;
            } else if (ordinal == 2) {
                C59052c cVar2 = (C59052c) C120598h.f335436a.mo56224b();
                cVar2.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceFulfill");
                cVar2.mo56379ah(new C59094n(35521));
                cVar2.mo56386p("ON-DEVICE(mda): On-device fulfillment result is not selected because on-device MDA lost. Using online result");
                this.f335431a.mo104851g(C120578b.ONLINE);
                return this.f335432b;
            } else if (ordinal == 3) {
                C59052c cVar3 = (C59052c) C120598h.f335436a.mo56224b();
                cVar3.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceFulfill");
                cVar3.mo56379ah(new C59094n(35522));
                cVar3.mo56386p("ON-DEVICE(mda): On-device fulfillment result is not selected because on-device MDA is disabled. Using online result");
                this.f335431a.mo104849e(C120578b.ONLINE);
                return this.f335432b;
            } else if (ordinal == 4) {
                C59052c cVar4 = (C59052c) C120598h.f335436a.mo56224b();
                cVar4.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceFulfill");
                cVar4.mo56379ah(new C59094n(35523));
                cVar4.mo56386p("ON-DEVICE(fallback): On-device fulfillment result is not high-quality. Using online result");
                this.f335431a.mo104848d(C120578b.ONLINE);
                return this.f335432b;
            }
        }
        throw new IllegalStateException("Unexpected value");
    }
}
