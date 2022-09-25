package com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.activity;

import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.p7129r.C90471m;
import com.google.android.apps.gsa.staticplugins.opa.p8621x.C114514b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.activity.f */
/* compiled from: PG */
public final class C126891f implements C90471m {

    /* renamed from: a */
    public final TransparentActivity f349395a;

    /* renamed from: b */
    public final C90465g f349396b;

    /* renamed from: c */
    public final C114514b f349397c;

    /* renamed from: d */
    public final String f349398d = "Is TNG";

    public C126891f(TransparentActivity transparentActivity, C90465g gVar, C114514b bVar) {
        C69664n.m101061g(gVar, "feedbackHelperFactory");
        C69664n.m101061g(bVar, "feedbackOrHelperHandlerFactory");
        this.f349395a = transparentActivity;
        this.f349396b = gVar;
        this.f349397c = bVar;
    }

    /* renamed from: a */
    public final void mo84220a() {
        this.f349395a.finish();
        this.f349395a.overridePendingTransition(0, 0);
    }
}
