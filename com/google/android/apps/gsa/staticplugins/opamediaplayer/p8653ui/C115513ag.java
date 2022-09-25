package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115475s;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115476t;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.ag */
/* compiled from: PG */
public final /* synthetic */ class C115513ag implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115520an f320379a;

    public /* synthetic */ C115513ag(C115520an anVar) {
        this.f320379a = anVar;
    }

    public final void onClick(View view) {
        C115534ba baVar = (C115534ba) this.f320379a.f320405e;
        if (baVar.mo102079a()) {
            C115475s sVar = baVar.f320470a;
            ((C115476t) sVar).f320326a.mo28345s("onFastForward", "PlaybackPanelEventsDispatcher", new Bundle());
        }
    }
}
