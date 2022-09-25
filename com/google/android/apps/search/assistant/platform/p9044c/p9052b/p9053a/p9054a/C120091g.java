package com.google.android.apps.search.assistant.platform.p9044c.p9052b.p9053a.p9054a;

import com.google.android.apps.search.assistant.platform.p9141h.p9156f.C121072a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.c.b.a.a.g */
/* compiled from: PG */
public final class C120091g implements C121072a {

    /* renamed from: b */
    private static final C59071e f334303b = C59071e.m91331h();

    /* renamed from: a */
    public final C120105u f334304a;

    /* renamed from: c */
    private final C71422aw f334305c;

    public C120091g(C120105u uVar, C71422aw awVar) {
        C69664n.m101061g(uVar, "changeListenerServiceStub");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f334304a = uVar;
        this.f334305c = awVar;
    }

    /* renamed from: a */
    public final void mo104661a() {
    }

    /* renamed from: b */
    public final void mo104662b() {
        C59052c cVar = (C59052c) f334303b.mo56224b();
        cVar.mo56379ah(new C59094n(34651));
        cVar.mo56386p("#onPrimaryMobileLocaleSettingsDataChanged()");
        C46459k.m82829b(C71663i.m104692e(this.f334305c, (C71424ay) null, new C120090f(this, (C69577g) null), 3), "Primary mobile locale changed propagation failed", new Object[0]);
    }
}
