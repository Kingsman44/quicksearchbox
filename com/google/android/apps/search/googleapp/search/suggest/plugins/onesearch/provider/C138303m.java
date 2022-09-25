package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138246cb;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.OneSearchSuggestionSelector", mo61344c = "OneSearchSuggestionSelector.kt", mo61345d = "getSource", mo61346e = {189})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.m */
/* compiled from: PG */
final class C138303m extends C69565c {

    /* renamed from: a */
    /* synthetic */ Object f376263a;

    /* renamed from: b */
    final /* synthetic */ C138309s f376264b;

    /* renamed from: c */
    int f376265c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138303m(C138309s sVar, C69577g gVar) {
        super(gVar);
        this.f376264b = sVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f376263a = obj;
        this.f376265c |= LinearLayoutManager.INVALID_OFFSET;
        return this.f376264b.mo114235a((C138246cb) null, this);
    }
}
