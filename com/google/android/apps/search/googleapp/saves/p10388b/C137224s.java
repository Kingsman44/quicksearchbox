package com.google.android.apps.search.googleapp.saves.p10388b;

import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.googleapp.saves.b.s */
/* compiled from: PG */
public final /* synthetic */ class C137224s implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C137230y f373349a;

    /* renamed from: b */
    public final /* synthetic */ List f373350b;

    /* renamed from: c */
    public final /* synthetic */ boolean f373351c;

    public /* synthetic */ C137224s(C137230y yVar, List list, boolean z) {
        this.f373349a = yVar;
        this.f373350b = list;
        this.f373351c = z;
    }

    public final Object call() {
        C137230y yVar = this.f373349a;
        Collection.EL.stream(this.f373350b).map(C137221p.f373345a).filter(C137222q.f373346a).distinct().forEach(new C137223r(yVar, this.f373351c));
        return null;
    }
}
