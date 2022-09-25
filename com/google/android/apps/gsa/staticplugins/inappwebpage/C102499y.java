package com.google.android.apps.gsa.staticplugins.inappwebpage;

import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.y */
/* compiled from: PG */
final class C102499y extends C90904ba {

    /* renamed from: a */
    final /* synthetic */ C102462af f286078a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102499y(C102462af afVar) {
        super("Title changed");
        this.f286078a = afVar;
    }

    public final void run() {
        C102475as asVar;
        C102497w wVar = (C102497w) this.f286078a.f285944a;
        if (wVar.mo93315e()) {
            C102481g gVar = wVar.f286075b.f285953f;
            if (gVar.f286030b == 1 && (asVar = gVar.f286031c) != null) {
                C102488n nVar = gVar.f286029a;
                nVar.f54539k.setTitle(asVar.f286003o);
            }
        }
    }
}
