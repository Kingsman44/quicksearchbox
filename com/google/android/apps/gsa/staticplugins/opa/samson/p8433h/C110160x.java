package com.google.android.apps.gsa.staticplugins.opa.samson.p8433h;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.h.x */
/* compiled from: PG */
final class C110160x extends MediaController.Callback {

    /* renamed from: a */
    final /* synthetic */ C110161y f306931a;

    public C110160x(C110161y yVar) {
        this.f306931a = yVar;
    }

    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        if (mediaMetadata == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        this.f306931a.mo98437k(mediaMetadata);
    }

    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        C59104x b = C110161y.f306932a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MediaCtl");
        ((C59052c) ((C59052c) b).mo56372aa(25767)).mo56389s("Playback state changed: %d", playbackState != null ? Integer.valueOf(playbackState.getState()) : null);
        if (playbackState != null) {
            this.f306931a.mo98436j(playbackState, playbackState.getActions());
            this.f306931a.mo98439m(playbackState.getActions());
        }
    }

    public final void onSessionDestroyed() {
        C58976aa aaVar = C58975e.f156826a;
        this.f306931a.mo98430c(1);
    }
}
