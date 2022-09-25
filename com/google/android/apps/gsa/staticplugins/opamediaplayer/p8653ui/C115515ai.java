package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import android.os.Bundle;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115475s;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115476t;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115633i;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.ai */
/* compiled from: PG */
public final class C115515ai {

    /* renamed from: a */
    public final /* synthetic */ C115520an f320381a;

    public C115515ai(C115520an anVar) {
        this.f320381a = anVar;
    }

    /* renamed from: a */
    public final void mo102062a(C115633i iVar) {
        C115475s sVar = this.f320381a.f320405e;
        float floatValue = Float.valueOf(iVar.f320784a.floatValue()).floatValue();
        C115534ba baVar = (C115534ba) sVar;
        if (baVar.mo102079a()) {
            C115475s sVar2 = baVar.f320470a;
            Bundle bundle = new Bundle();
            bundle.putFloat("newSpeed", Float.valueOf(floatValue).floatValue());
            ((C115476t) sVar2).f320326a.mo28345s("onPlaybackSpeedChanged_float", "PlaybackPanelEventsDispatcher", bundle);
        }
    }
}
