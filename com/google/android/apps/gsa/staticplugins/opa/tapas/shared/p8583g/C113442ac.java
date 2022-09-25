package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g;

import com.google.android.apps.gsa.search.shared.service.p6935b.C88343yd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88344ye;
import com.google.assistant.p3858ar.p3859a.C49714d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.ac */
/* compiled from: PG */
public final /* synthetic */ class C113442ac implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C88343yd f314129a;

    public /* synthetic */ C113442ac(C88343yd ydVar) {
        this.f314129a = ydVar;
    }

    public final void accept(Object obj) {
        C88343yd ydVar = this.f314129a;
        C49714d dVar = (C49714d) obj;
        ydVar.copyOnWrite();
        C88344ye yeVar = (C88344ye) ydVar.instance;
        C88344ye yeVar2 = C88344ye.f238913h;
        dVar.getClass();
        yeVar.f238920f = dVar;
        yeVar.f238915a |= 16;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
