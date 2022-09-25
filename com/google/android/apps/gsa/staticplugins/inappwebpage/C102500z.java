package com.google.android.apps.gsa.staticplugins.inappwebpage;

import com.google.android.apps.gsa.search.core.p6513aj.C84563w;
import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.z */
/* compiled from: PG */
final class C102500z extends C90904ba {

    /* renamed from: a */
    final /* synthetic */ Object f286079a;

    /* renamed from: b */
    final /* synthetic */ C102462af f286080b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102500z(C102462af afVar, Object obj) {
        super("Page load failed");
        this.f286080b = afVar;
        this.f286079a = obj;
    }

    public final void run() {
        C102473aq aqVar = this.f286080b.f285944a;
        Object obj = this.f286079a;
        C102497w wVar = (C102497w) aqVar;
        if (wVar.mo93315e()) {
            wVar.f286075b.mo93274e();
            wVar.f286075b.f285962o = new C84563w("%s", obj);
            C102464ah ahVar = wVar.f286075b;
            ahVar.f285961n.mo93268a(ahVar.f285962o);
        }
    }
}
