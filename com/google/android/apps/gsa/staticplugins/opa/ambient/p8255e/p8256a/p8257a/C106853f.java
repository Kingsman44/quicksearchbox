package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8256a.p8257a;

import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.assistant.p3886c.C50715b;
import com.google.assistant.p3886c.C50835g;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.a.a.f */
/* compiled from: PG */
public final /* synthetic */ class C106853f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C106855h f297729a;

    public /* synthetic */ C106853f(C106855h hVar) {
        this.f297729a = hVar;
    }

    public final void accept(Object obj) {
        C50715b bVar = (C50715b) obj;
        C130895ag agVar = this.f297729a.f297737g;
        int b = C50835g.m85970b(bVar.f131976b);
        if (b == 0) {
            b = 1;
        }
        agVar.mo109900aI(b, bVar.f131977c.size());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
