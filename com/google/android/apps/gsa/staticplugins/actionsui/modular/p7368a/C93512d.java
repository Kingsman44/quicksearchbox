package com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a;

import android.database.ContentObserver;
import android.os.Handler;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93543au;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.a.d */
/* compiled from: PG */
final class C93512d extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C93543au f261129a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93512d(C93543au auVar) {
        super((Handler) null);
        this.f261129a = auVar;
    }

    public final boolean deliverSelfNotifications() {
        return true;
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        this.f261129a.mo87955a();
    }
}
