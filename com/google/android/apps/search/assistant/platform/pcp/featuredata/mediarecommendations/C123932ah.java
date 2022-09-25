package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import android.content.ComponentName;
import android.support.p033v7.widget.LinearLayoutManager;
import p3186j$.time.Instant;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.MediaRecommendationsDataFetcher", mo61344c = "MediaRecommendationsDataFetcher.kt", mo61345d = "handleNoRecommendations", mo61346e = {93})
/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ah */
/* compiled from: PG */
final class C123932ah extends C69565c {

    /* renamed from: a */
    Object f342306a;

    /* renamed from: b */
    Object f342307b;

    /* renamed from: c */
    Object f342308c;

    /* renamed from: d */
    /* synthetic */ Object f342309d;

    /* renamed from: e */
    final /* synthetic */ C123935ak f342310e;

    /* renamed from: f */
    int f342311f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C123932ah(C123935ak akVar, C69577g gVar) {
        super(gVar);
        this.f342310e = akVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f342309d = obj;
        this.f342311f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f342310e.mo106194b((ComponentName) null, (Instant) null, this);
    }
}
