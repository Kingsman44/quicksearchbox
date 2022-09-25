package com.google.android.apps.gsa.staticplugins.inappwebpage;

import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.x */
/* compiled from: PG */
final class C102498x extends C90904ba {

    /* renamed from: a */
    final /* synthetic */ C102462af f286077a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102498x(C102462af afVar) {
        super("Page ready");
        this.f286077a = afVar;
    }

    public final void run() {
        C102497w wVar = (C102497w) this.f286077a.f285944a;
        if (wVar.mo93315e()) {
            C102464ah ahVar = wVar.f286075b;
            ahVar.mo93270a();
            C102481g gVar = ahVar.f285953f;
            C102475as asVar = gVar.f286031c;
            asVar.getClass();
            int i = gVar.f286030b;
            if (i == 0) {
                C102488n nVar = gVar.f286029a;
                nVar.f54539k.setTitle(asVar.f286003o);
                gVar.f286029a.mo93308p(asVar.f285991c);
                gVar.f286030b = 1;
            } else if (i == 2) {
                gVar.f286029a.mo93305h();
                C102488n nVar2 = gVar.f286029a;
                nVar2.f54539k.setTitle(asVar.f286003o);
                gVar.f286029a.mo93308p(asVar.f285991c);
                gVar.f286030b = 1;
            } else {
                return;
            }
            gVar.mo93299c();
        }
    }
}
