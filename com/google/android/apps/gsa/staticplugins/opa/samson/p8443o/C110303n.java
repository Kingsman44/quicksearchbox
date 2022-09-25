package com.google.android.apps.gsa.staticplugins.opa.samson.p8443o;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.o.n */
/* compiled from: PG */
final class C110303n extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C110305p f307425a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110303n(C110305p pVar) {
        super((Handler) null);
        this.f307425a = pVar;
    }

    public final void onChange(boolean z) {
        C110305p pVar = this.f307425a;
        pVar.f307436i.mo28212l("onContentObserverNotified", new C110302m(pVar));
    }
}
