package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.media.MediaPlayer;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.q */
/* compiled from: PG */
public final /* synthetic */ class C109120q implements MediaPlayer.OnPreparedListener {

    /* renamed from: a */
    public final /* synthetic */ C109100ar f303876a;

    public /* synthetic */ C109120q(C109100ar arVar) {
        this.f303876a = arVar;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        C109100ar arVar = this.f303876a;
        synchronized (arVar.f303784q) {
            arVar.f303745J = true;
            if (!arVar.f303744I) {
                mediaPlayer.setVolume(0.0f, 0.0f);
                mediaPlayer.seekTo(1);
                if (arVar.f303791x.mo79746e(C90014bt.f247438hE)) {
                    arVar.mo97604t();
                }
            }
        }
    }
}
