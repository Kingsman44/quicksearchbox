package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127362j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.a */
/* compiled from: PG */
public final class C130149a {

    /* renamed from: a */
    public static final C59071e f356842a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.response.a");

    /* renamed from: b */
    public final C130299r f356843b;

    /* renamed from: c */
    public final C127362j f356844c;

    /* renamed from: d */
    BackNavigationTupleListViewModel f356845d;

    /* renamed from: e */
    private final C127118j f356846e;

    public C130149a(C127118j jVar, C130299r rVar, C127362j jVar2) {
        this.f356846e = jVar;
        this.f356843b = rVar;
        this.f356844c = jVar2;
    }

    /* renamed from: a */
    public final void mo109533a() {
        this.f356844c.mo108034b(C63088z.f170246b);
    }

    /* renamed from: b */
    public final void mo109534b() {
        C59104x b = f356842a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BackNavigationController");
        ((C59052c) ((C59052c) b).mo56372aa(38735)).mo56386p("Dismiss Response Layer due to back press.");
        this.f356846e.mo107933i();
    }
}
