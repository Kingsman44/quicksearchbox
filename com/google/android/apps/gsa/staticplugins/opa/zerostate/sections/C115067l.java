package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.l */
/* compiled from: PG */
final class C115067l extends MediaController.Callback {

    /* renamed from: a */
    final /* synthetic */ AmbientMediaSectionController f319400a;

    public C115067l(AmbientMediaSectionController ambientMediaSectionController) {
        this.f319400a = ambientMediaSectionController;
    }

    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        if (mediaMetadata == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        this.f319400a.mo101764l(mediaMetadata);
    }

    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        C59104x b = AmbientMediaSectionController.f319062a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AmbientMediaSC");
        ((C59052c) ((C59052c) b).mo56372aa(29451)).mo56389s("Playback state changed: %d", playbackState != null ? Integer.valueOf(playbackState.getState()) : null);
        if (playbackState != null) {
            this.f319400a.mo101763k(playbackState, playbackState.getActions());
        }
    }

    public final void onSessionDestroyed() {
        C58976aa aaVar = C58975e.f156826a;
        AmbientMediaSectionController ambientMediaSectionController = this.f319400a;
        ambientMediaSectionController.f319070i = null;
        ambientMediaSectionController.mo101762j();
    }
}
