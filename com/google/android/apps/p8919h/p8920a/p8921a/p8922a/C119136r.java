package com.google.android.apps.p8919h.p8920a.p8921a.p8922a;

import android.media.MediaPlayer;
import android.util.Log;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8924b.C119113e;

/* renamed from: com.google.android.apps.h.a.a.a.r */
/* compiled from: PG */
public final /* synthetic */ class C119136r implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ C119094ac f332298a;

    /* renamed from: b */
    public final /* synthetic */ int f332299b;

    public /* synthetic */ C119136r(C119094ac acVar, int i) {
        this.f332298a = acVar;
        this.f332299b = i;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        C119094ac acVar = this.f332298a;
        if (this.f332299b != acVar.f332205a) {
            Log.w("Player", "onPlayerError for the wrong session. Ignoring.");
        } else {
            String format = String.format("Internal player error: %d, %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            Log.e("Player", format);
            acVar.f332216l = 2;
            for (C119095ad adVar : acVar.f332211g) {
                adVar.mo30723k(3);
                adVar.mo30718f(new C119113e(format, (Throwable) null), 2);
            }
        }
        return true;
    }
}
