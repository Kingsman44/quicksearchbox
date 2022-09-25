package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8234b;

import com.google.android.libraries.search.assistant.p2566g.C33393a;
import com.google.android.libraries.search.assistant.p2566g.C33411f;
import com.google.android.libraries.search.assistant.p2566g.C33414i;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.b.n */
/* compiled from: PG */
public final /* synthetic */ class C106635n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C33393a f297287a;

    public /* synthetic */ C106635n(C33393a aVar) {
        this.f297287a = aVar;
    }

    public final void accept(Object obj) {
        C33393a aVar = this.f297287a;
        C33411f fVar = (C33411f) obj;
        aVar.copyOnWrite();
        C33414i iVar = (C33414i) aVar.instance;
        C33414i iVar2 = C33414i.f89489h;
        fVar.getClass();
        iVar.f89497g = fVar;
        iVar.f89491a |= 8;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
