package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.media.MediaPlayer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.r */
/* compiled from: PG */
public final /* synthetic */ class C109121r implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ C109100ar f303877a;

    public /* synthetic */ C109121r(C109100ar arVar) {
        this.f303877a = arVar;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        C109100ar arVar = this.f303877a;
        if (arVar.f303772e.getVisibility() == 0) {
            arVar.f303763ab.mo97161a();
        }
    }
}
