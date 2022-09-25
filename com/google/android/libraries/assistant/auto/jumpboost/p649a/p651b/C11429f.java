package com.google.android.libraries.assistant.auto.jumpboost.p649a.p651b;

import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.libraries.assistant.auto.jumpboost.p671g.C11474a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.a.b.f */
/* compiled from: PG */
public final class C11429f implements C11474a {

    /* renamed from: a */
    public static final C59071e f37196a = C59071e.m91331h();

    /* renamed from: b */
    public final C87673aa f37197b;

    /* renamed from: c */
    public final C11425b f37198c;

    /* renamed from: d */
    private final C22871g f37199d;

    public C11429f(C87673aa aaVar, C11425b bVar, C22871g gVar) {
        C69664n.m101061g(aaVar, "searchServiceClient");
        C69664n.m101061g(bVar, "hotwordSettingsMonitor");
        C69664n.m101061g(gVar, "uiThreadRunner");
        this.f37197b = aaVar;
        this.f37198c = bVar;
        this.f37199d = gVar;
    }

    /* renamed from: a */
    public final void mo19962a() {
        this.f37199d.mo28212l("activate", new C11426c(this));
    }

    /* renamed from: b */
    public final void mo19963b() {
        this.f37199d.mo28212l("deactivate", new C11427d(this));
    }

    /* renamed from: c */
    public final void mo19964c() {
        this.f37199d.mo28212l("startAssistantSession", new C11428e(this));
    }
}
