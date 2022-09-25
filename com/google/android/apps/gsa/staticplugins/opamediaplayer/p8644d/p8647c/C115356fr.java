package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import android.media.MediaPlayer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.fr */
/* compiled from: PG */
public final /* synthetic */ class C115356fr implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ C115368gc f320070a;

    public /* synthetic */ C115356fr(C115368gc gcVar) {
        this.f320070a = gcVar;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        C115368gc gcVar = this.f320070a;
        gcVar.f320086g.mo28212l("set-tts-playback-status", new C115361fw(gcVar));
    }
}
