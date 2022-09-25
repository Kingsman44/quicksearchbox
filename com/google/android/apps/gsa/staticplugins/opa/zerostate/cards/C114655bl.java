package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.bl */
/* compiled from: PG */
final class C114655bl extends MediaController.Callback {

    /* renamed from: a */
    final /* synthetic */ ZeroStateMediaController f318076a;

    public C114655bl(ZeroStateMediaController zeroStateMediaController) {
        this.f318076a = zeroStateMediaController;
    }

    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        if (mediaMetadata == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        this.f318076a.mo101462h(mediaMetadata);
    }

    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        C59104x b = ZeroStateMediaController.f317924a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ZSMiCtl");
        ((C59052c) ((C59052c) b).mo56372aa(29306)).mo56389s("Playback state changed: %d", playbackState != null ? Integer.valueOf(playbackState.getState()) : null);
        if (playbackState != null) {
            this.f318076a.mo101459e(playbackState, playbackState.getActions());
        }
    }

    public final void onSessionDestroyed() {
        C58976aa aaVar = C58975e.f156826a;
        ZeroStateMediaController zeroStateMediaController = this.f318076a;
        zeroStateMediaController.f317943l = null;
        zeroStateMediaController.mo101458d();
        this.f318076a.mo101456b();
    }
}
