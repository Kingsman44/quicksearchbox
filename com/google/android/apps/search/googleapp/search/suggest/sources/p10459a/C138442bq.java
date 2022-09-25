package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.C138678v;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.bq */
/* compiled from: PG */
public final /* synthetic */ class C138442bq implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138445bt f376572a;

    /* renamed from: b */
    public final /* synthetic */ C138133o f376573b;

    public /* synthetic */ C138442bq(C138445bt btVar, C138133o oVar) {
        this.f376572a = btVar;
        this.f376573b = oVar;
    }

    public final C60870cx apply(Object obj) {
        Optional optional = (Optional) obj;
        return optional.isPresent() ? C60856cj.m92900i((C138678v) optional.get()) : this.f376572a.mo114284i(this.f376573b);
    }
}
