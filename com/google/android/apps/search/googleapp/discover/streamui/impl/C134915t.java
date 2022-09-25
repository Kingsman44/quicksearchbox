package com.google.android.apps.search.googleapp.discover.streamui.impl;

import androidx.core.graphics.C1926c;
import com.google.android.libraries.p1649b.p1652c.C19622a;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.t */
/* compiled from: PG */
final class C134915t implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C1926c f367344a;

    public C134915t(C1926c cVar) {
        this.f367344a = cVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C19622a aVar = (C19622a) obj;
        C69664n.m101061g(aVar, "it");
        aVar.setPadding(0, this.f367344a.f5822c, 0, 0);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
