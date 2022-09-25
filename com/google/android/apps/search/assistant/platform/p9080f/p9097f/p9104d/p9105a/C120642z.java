package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122392ak;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120578b;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3950h.p3951a.C52963b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.d.a.z */
/* compiled from: PG */
final class C120642z implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C120616ab f335577a;

    /* renamed from: b */
    final /* synthetic */ C52091ex f335578b;

    /* renamed from: c */
    final /* synthetic */ Optional f335579c;

    /* renamed from: d */
    final /* synthetic */ C122392ak f335580d;

    /* renamed from: e */
    final /* synthetic */ C120637u f335581e;

    public C120642z(C120616ab abVar, C52091ex exVar, Optional optional, C122392ak akVar, C120637u uVar) {
        this.f335577a = abVar;
        this.f335578b = exVar;
        this.f335579c = optional;
        this.f335580d = akVar;
        this.f335581e = uVar;
    }

    public final /* synthetic */ C60870cx apply(Object obj) {
        if (!((C52963b) obj).f138862a) {
            C59052c cVar = (C59052c) C120616ab.f335495a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceFulfill");
            cVar.mo56379ah(new C59094n(35542));
            cVar.mo56386p("ON-DEVICE(mda): Local MDA lost. Suppressing on-device fulfillment.");
            return C60856cj.m92899h(new Exception("Local MDA did not select the device to respond. Suppressing on-device fulfillment."));
        }
        if (this.f335577a.f335498d) {
            C58976aa aaVar = C58975e.f156826a;
            this.f335577a.f335496b.mo104579c(this.f335578b);
            this.f335577a.f335496b.mo104580d(this.f335579c);
            this.f335577a.f335496b.mo104578b(this.f335580d);
        }
        C59052c cVar2 = (C59052c) C120616ab.f335495a.mo56224b();
        cVar2.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceFulfill");
        cVar2.mo56379ah(new C59094n(35540));
        cVar2.mo56386p("ON-DEVICE(success): Using on-device fulfillment result");
        this.f335577a.f335499e.mo104853b(C120578b.ON_DEVICE);
        return C60856cj.m92900i(this.f335581e);
    }
}
