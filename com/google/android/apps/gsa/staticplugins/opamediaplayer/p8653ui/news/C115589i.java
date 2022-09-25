package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115479w;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115480x;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115612a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.i */
/* compiled from: PG */
public final /* synthetic */ class C115589i implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115595o f320663a;

    public /* synthetic */ C115589i(C115595o oVar) {
        this.f320663a = oVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C115595o oVar = this.f320663a;
        if (!oVar.f63126Q.mo28316z()) {
            return true;
        }
        C115479w wVar = oVar.f320670b;
        byte[] a = C115612a.m191748a(oVar.mo28297il().getRootView());
        Bundle bundle = new Bundle();
        bundle.putByteArray("screenshot", a);
        ((C115480x) wVar).f320328a.mo28345s("onSendFeedback_byte[]", "PlaylistEventsDispatcher", bundle);
        return true;
    }
}
