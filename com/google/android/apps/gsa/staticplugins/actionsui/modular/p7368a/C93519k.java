package com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93543au;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.a.k */
/* compiled from: PG */
final class C93519k extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C93520l f261141a;

    /* renamed from: b */
    final /* synthetic */ C93543au f261142b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93519k(C93520l lVar, Handler handler, C93543au auVar) {
        super(handler);
        this.f261141a = lVar;
        this.f261142b = auVar;
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        C93520l lVar = this.f261141a;
        if (lVar.f261143a != lVar.mo87936i()) {
            this.f261142b.mo87955a();
        }
    }
}
