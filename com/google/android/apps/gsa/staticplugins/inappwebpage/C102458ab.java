package com.google.android.apps.gsa.staticplugins.inappwebpage;

import com.google.android.apps.gsa.search.shared.inappwebpage.Request;
import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.ab */
/* compiled from: PG */
final class C102458ab extends C90904ba {

    /* renamed from: a */
    final /* synthetic */ Request f285937a;

    /* renamed from: b */
    final /* synthetic */ C102462af f285938b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102458ab(C102462af afVar, Request request) {
        super("Load uri in app");
        this.f285938b = afVar;
        this.f285937a = request;
    }

    public final void run() {
        C102473aq aqVar = this.f285938b.f285944a;
        Request request = this.f285937a;
        C102497w wVar = (C102497w) aqVar;
        if (wVar.mo93315e()) {
            C102464ah ahVar = wVar.f286075b;
            ahVar.f285959l.f285932a.addFirst(request);
            ahVar.mo93272c();
        }
    }
}
