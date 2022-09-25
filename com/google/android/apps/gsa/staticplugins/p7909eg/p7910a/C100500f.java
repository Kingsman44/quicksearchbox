package com.google.android.apps.gsa.staticplugins.p7909eg.p7910a;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.shared.util.p7159c.C90908be;

/* renamed from: com.google.android.apps.gsa.staticplugins.eg.a.f */
/* compiled from: PG */
final class C100500f extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C100501g f280964a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100500f(C100501g gVar) {
        super("Wrapper of OnDone with cancelling of unfinished timepoint task", 1, 0);
        this.f280964a = gVar;
    }

    public final void run() {
        this.f280964a.f280965a.mo91943a();
        C90908be beVar = this.f280964a.f280966b;
        if (beVar != null) {
            beVar.run();
        }
    }
}
