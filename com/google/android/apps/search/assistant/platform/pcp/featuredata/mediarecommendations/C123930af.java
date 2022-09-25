package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import android.support.p033v7.widget.LinearLayoutManager;
import p3186j$.time.Instant;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.MediaRecommendationsDataFetcher", mo61344c = "MediaRecommendationsDataFetcher.kt", mo61345d = "fetch", mo61346e = {60, 62, 64})
/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.af */
/* compiled from: PG */
final class C123930af extends C69565c {

    /* renamed from: a */
    Object f342297a;

    /* renamed from: b */
    Object f342298b;

    /* renamed from: c */
    Object f342299c;

    /* renamed from: d */
    /* synthetic */ Object f342300d;

    /* renamed from: e */
    final /* synthetic */ C123935ak f342301e;

    /* renamed from: f */
    int f342302f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C123930af(C123935ak akVar, C69577g gVar) {
        super(gVar);
        this.f342301e = akVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f342300d = obj;
        this.f342302f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f342301e.mo106193a((Instant) null, this);
    }
}
