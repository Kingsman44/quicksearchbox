package com.google.android.apps.search.pronunciationlearning.p10628a;

import android.media.AudioTrack;
import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.search.p2904c.C37346ak;

/* renamed from: com.google.android.apps.search.pronunciationlearning.a.k */
/* compiled from: PG */
final class C141304k implements AudioTrack.OnPlaybackPositionUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C2164c f383613a;

    public C141304k(C2164c cVar) {
        this.f383613a = cVar;
    }

    public final void onMarkerReached(AudioTrack audioTrack) {
        C37346ak akVar = C141305l.f383614a;
        if (audioTrack != null) {
            audioTrack.release();
        }
        this.f383613a.mo5437b((Object) null);
    }

    public final void onPeriodicNotification(AudioTrack audioTrack) {
    }
}
