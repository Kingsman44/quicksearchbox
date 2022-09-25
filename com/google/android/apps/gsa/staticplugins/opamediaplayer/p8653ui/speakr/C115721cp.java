package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.os.Bundle;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115449s;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115450t;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115612a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.cp */
/* compiled from: PG */
public final /* synthetic */ class C115721cp implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C115725ct f320969a;

    public /* synthetic */ C115721cp(C115725ct ctVar) {
        this.f320969a = ctVar;
    }

    public final void run() {
        C115725ct ctVar = this.f320969a;
        C115449s sVar = ctVar.f320973e;
        byte[] a = C115612a.m191748a(ctVar.mo28297il().getRootView());
        Bundle bundle = new Bundle();
        bundle.putByteArray("screenshot", a);
        ((C115450t) sVar).f320288a.mo28345s("onSendFeedback_byte[]", "SpeakrPlaylistEventsDispatcher", bundle);
    }
}
