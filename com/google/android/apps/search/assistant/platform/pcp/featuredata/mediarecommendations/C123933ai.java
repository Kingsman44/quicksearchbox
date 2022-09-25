package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import android.support.p033v7.widget.LinearLayoutManager;
import p3186j$.time.Instant;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.MediaRecommendationsDataFetcher", mo61344c = "MediaRecommendationsDataFetcher.kt", mo61345d = "handleNoSelectedApp", mo61346e = {80})
/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ai */
/* compiled from: PG */
final class C123933ai extends C69565c {

    /* renamed from: a */
    Object f342312a;

    /* renamed from: b */
    Object f342313b;

    /* renamed from: c */
    /* synthetic */ Object f342314c;

    /* renamed from: d */
    final /* synthetic */ C123935ak f342315d;

    /* renamed from: e */
    int f342316e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C123933ai(C123935ak akVar, C69577g gVar) {
        super(gVar);
        this.f342315d = akVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f342314c = obj;
        this.f342316e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f342315d.mo106195c((Instant) null, this);
    }
}
