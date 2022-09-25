package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b;

import com.google.android.apps.search.assistant.platform.p9141h.p9156f.C121072a;
import com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a.C127628o;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.g.b.g */
/* compiled from: PG */
public final class C127651g implements C121072a {

    /* renamed from: a */
    public static final C59071e f351422a = C59071e.m91331h();

    /* renamed from: b */
    public final C127628o f351423b;

    /* renamed from: c */
    private final C71422aw f351424c;

    public C127651g(C127628o oVar, C71422aw awVar) {
        C69664n.m101061g(oVar, "triggeringClientStub");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f351423b = oVar;
        this.f351424c = awVar;
    }

    /* renamed from: a */
    public final void mo104661a() {
        C59052c cVar = (C59052c) f351422a.mo56224b();
        cVar.mo56379ah(new C59094n(37522));
        cVar.mo56386p("Ignoring event, only primary locale update needs to be processed");
    }

    /* renamed from: b */
    public final void mo104662b() {
        C59052c cVar = (C59052c) f351422a.mo56224b();
        cVar.mo56379ah(new C59094n(37523));
        cVar.mo56386p("onPrimaryMobileLocaleSettingsDataChanged received");
        C71803m.m105043d(this.f351424c, (C69585o) null, (C71424ay) null, new C127650f(this, (C69577g) null), 3);
    }
}
