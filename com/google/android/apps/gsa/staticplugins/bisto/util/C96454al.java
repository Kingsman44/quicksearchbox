package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.media.session.MediaController;
import android.media.session.PlaybackState;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.al */
/* compiled from: PG */
final class C96454al extends MediaController.Callback {

    /* renamed from: a */
    final MediaController f269832a;

    /* renamed from: b */
    final /* synthetic */ C96456an f269833b;

    public C96454al(C96456an anVar, MediaController mediaController) {
        this.f269833b = anVar;
        this.f269832a = mediaController;
    }

    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        if (playbackState != null && playbackState.getState() == 3) {
            C59071e eVar = C96456an.f269836a;
            C58976aa aaVar = C58975e.f156826a;
            C96456an anVar = this.f269833b;
            anVar.f269838c.set(this.f269832a);
        }
    }

    public final void onSessionDestroyed() {
        C96456an anVar = this.f269833b;
        C96455am amVar = new C96455am(this.f269832a);
        anVar.f269837b.remove(amVar);
        MediaController mediaController = (MediaController) anVar.f269838c.get();
        if (mediaController != null && amVar.equals(new C96455am(mediaController))) {
            anVar.f269838c.set((Object) null);
        }
    }
}
