package com.google.android.apps.search.googleapp.discover.streamui.impl;

import androidx.core.graphics.C1926c;
import com.google.android.apps.search.googleapp.discover.p10166a.p10171c.p10172a.C133978c;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.u */
/* compiled from: PG */
final class C134916u implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C1926c f367345a;

    public C134916u(C1926c cVar) {
        this.f367345a = cVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C133978c cVar = (C133978c) obj;
        C69664n.m101061g(cVar, "it");
        cVar.setPadding(0, this.f367345a.f5822c, 0, 0);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
