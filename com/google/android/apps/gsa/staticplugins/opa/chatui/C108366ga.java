package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120931b;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ga */
/* compiled from: PG */
final class C108366ga implements Consumer {

    /* renamed from: a */
    final /* synthetic */ String f301413a;

    public C108366ga(String str) {
        this.f301413a = str;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C120931b bVar = (C120931b) obj;
        C69664n.m101061g(bVar, "it");
        bVar.mo96548e(this.f301413a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
