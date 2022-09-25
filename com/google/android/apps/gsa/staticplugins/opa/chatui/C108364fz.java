package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120931b;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120940bi;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120941bj;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.fz */
/* compiled from: PG */
final class C108364fz implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C120941bj f301411a;

    public C108364fz(C120941bj bjVar) {
        this.f301411a = bjVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C120931b bVar = (C120931b) obj;
        C69664n.m101061g(bVar, "it");
        for (C120940bi b : this.f301411a.f336255a) {
            bVar.mo96545b(b);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
