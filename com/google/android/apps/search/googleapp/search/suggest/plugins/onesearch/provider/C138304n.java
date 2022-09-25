package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138246cb;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69567e;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.OneSearchSuggestionSelector", mo61344c = "OneSearchSuggestionSelector.kt", mo61345d = "logSuggestSession", mo61346e = {170})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.n */
/* compiled from: PG */
final class C138304n extends C69565c {

    /* renamed from: a */
    /* synthetic */ Object f376266a;

    /* renamed from: b */
    final /* synthetic */ C138309s f376267b;

    /* renamed from: c */
    int f376268c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138304n(C138309s sVar, C69577g gVar) {
        super(gVar);
        this.f376267b = sVar;
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        this.f376266a = obj;
        this.f376268c |= LinearLayoutManager.INVALID_OFFSET;
        return this.f376267b.mo114236b((String) null, (C138246cb) null, (Duration) null, this);
    }
}
