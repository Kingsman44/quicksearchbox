package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122392ak;
import com.google.android.apps.search.assistant.platform.p9080f.p9081a.C120390a;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.C120601c;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.C120610a;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.C120643b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69648ae;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.d.a.aa */
/* compiled from: PG */
public final class C120615aa implements C120643b {

    /* renamed from: a */
    final /* synthetic */ C120637u f335489a;

    /* renamed from: b */
    final /* synthetic */ C120616ab f335490b;

    /* renamed from: c */
    final /* synthetic */ C52091ex f335491c;

    /* renamed from: d */
    final /* synthetic */ Optional f335492d;

    /* renamed from: e */
    final /* synthetic */ C122392ak f335493e;

    /* renamed from: f */
    final /* synthetic */ C69648ae f335494f;

    public C120615aa(C120637u uVar, C120616ab abVar, C52091ex exVar, Optional optional, C122392ak akVar, C69648ae aeVar) {
        this.f335489a = uVar;
        this.f335490b = abVar;
        this.f335491c = exVar;
        this.f335492d = optional;
        this.f335493e = akVar;
        this.f335494f = aeVar;
    }

    /* renamed from: a */
    public final C120601c mo104698a() {
        return this.f335489a;
    }

    /* renamed from: b */
    public final C60870cx mo104699b() {
        if (this.f335490b.f335497c.isPresent()) {
            return C47633f.m84733g(((C120390a) this.f335490b.f335497c.get()).mo104736a()).mo51516i(new C120642z(this.f335490b, this.f335491c, this.f335492d, this.f335493e, this.f335489a), C60826bg.f164896a);
        }
        C59052c cVar = (C59052c) C120616ab.f335495a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceFulfill");
        cVar.mo56379ah(new C59094n(35543));
        cVar.mo56386p("ON-DEVICE(mda): Local MDA disabled. Suppressing on-device fulfillment.");
        return C60856cj.m92899h(new Exception("Local MDA is not enabled. Suppressing on-device fulfillment."));
    }

    /* renamed from: c */
    public final C120610a mo104856c() {
        return (C120610a) this.f335494f.f186027a;
    }
}
