package com.google.android.apps.gsa.staticplugins.opa.samson.p8442n;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.n.r */
/* compiled from: PG */
final class C110281r extends MediaController.Callback {

    /* renamed from: a */
    final /* synthetic */ C110283t f307311a;

    public C110281r(C110283t tVar) {
        this.f307311a = tVar;
    }

    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        C58976aa aaVar = C58975e.f156826a;
        this.f307311a.f307319g.mo98518b(mediaMetadata);
    }

    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        C58976aa aaVar = C58975e.f156826a;
        this.f307311a.mo98533d();
    }

    public final void onSessionDestroyed() {
        C58976aa aaVar = C58975e.f156826a;
        try {
            C110283t tVar = this.f307311a;
            MediaController mediaController = tVar.f307321i;
            if (mediaController != null) {
                mediaController.unregisterCallback(tVar.f307314b);
            }
        } catch (Exception e) {
            C59104x c = C110283t.f307313a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SmartSpaceCtrl");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25944)).mo56386p("#onSessionDestroyed(): error unregistering callback");
        }
        C110283t tVar2 = this.f307311a;
        tVar2.f307321i = null;
        tVar2.f307319g.mo98517a();
        this.f307311a.mo98533d();
    }
}
