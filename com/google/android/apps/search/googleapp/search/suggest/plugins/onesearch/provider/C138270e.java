package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138255f;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.OneSearchInteractionHandler", mo61344c = "OneSearchInteractionHandler.kt", mo61345d = "deleteSuggestionInternal", mo61346e = {49, 54, 58})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.e */
/* compiled from: PG */
final class C138270e extends C69565c {

    /* renamed from: a */
    Object f376188a;

    /* renamed from: b */
    Object f376189b;

    /* renamed from: c */
    /* synthetic */ Object f376190c;

    /* renamed from: d */
    final /* synthetic */ C138273h f376191d;

    /* renamed from: e */
    int f376192e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138270e(C138273h hVar, C69577g gVar) {
        super(gVar);
        this.f376191d = hVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f376190c = obj;
        this.f376192e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f376191d.mo114226a((C138255f) null, this);
    }
}
