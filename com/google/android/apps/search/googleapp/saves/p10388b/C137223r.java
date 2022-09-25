package com.google.android.apps.search.googleapp.saves.p10388b;

import com.google.common.util.concurrent.C60866ct;
import p3186j$.util.Collection;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.saves.b.r */
/* compiled from: PG */
public final /* synthetic */ class C137223r implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C137230y f373347a;

    /* renamed from: b */
    public final /* synthetic */ boolean f373348b;

    public /* synthetic */ C137223r(C137230y yVar, boolean z) {
        this.f373347a = yVar;
        this.f373348b = z;
    }

    public final void accept(Object obj) {
        C137230y yVar = this.f373347a;
        Collection.EL.stream(yVar.f373363d).forEach(new C137225t((String) obj, this.f373348b));
        yVar.f373365f.mo50787a(C60866ct.f164955a, "SavedPagesCacheContentKey");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
