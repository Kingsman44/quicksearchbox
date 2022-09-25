package com.google.android.apps.search.assistant.platform.p9044c.p9052b.p9053a.p9054a;

import com.google.android.apps.search.assistant.platform.p9141h.p9148c.C121030c;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.c.b.a.a.b */
/* compiled from: PG */
public final class C120086b implements C121030c {

    /* renamed from: b */
    private static final C59071e f334294b = C59071e.m91331h();

    /* renamed from: a */
    public final C120105u f334295a;

    /* renamed from: c */
    private final C71422aw f334296c;

    public C120086b(C71422aw awVar, C120105u uVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(uVar, "changeListenerServiceStub");
        this.f334296c = awVar;
        this.f334295a = uVar;
    }

    /* renamed from: a */
    public final void mo104659a() {
        C59052c cVar = (C59052c) f334294b.mo56224b();
        cVar.mo56379ah(new C59094n(34650));
        cVar.mo56386p("#onAssistantEnabledSettingsDataChanged()");
        C46459k.m82829b(C71663i.m104692e(this.f334296c, (C71424ay) null, new C120085a(this, (C69577g) null), 3), "IsAssistantEnabled setting change propagation failed", new Object[0]);
    }
}
