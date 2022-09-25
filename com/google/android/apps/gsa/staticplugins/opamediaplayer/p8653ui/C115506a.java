package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115421a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115458b;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115612a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.a */
/* compiled from: PG */
public final /* synthetic */ class C115506a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115541c f320372a;

    public /* synthetic */ C115506a(C115541c cVar) {
        this.f320372a = cVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C115541c cVar = this.f320372a;
        if (!cVar.f63126Q.mo28316z()) {
            return true;
        }
        C115421a aVar = cVar.f320484b;
        byte[] a = C115612a.m191748a(cVar.mo28297il().getRootView());
        Bundle bundle = new Bundle();
        bundle.putByteArray("screenshot", a);
        ((C115458b) aVar).f320292a.mo28345s("onSentFeedback_byte[]", "AppbarEventsDispatcher", bundle);
        return true;
    }
}
