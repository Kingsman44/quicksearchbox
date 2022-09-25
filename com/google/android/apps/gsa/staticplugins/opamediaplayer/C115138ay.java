package com.google.android.apps.gsa.staticplugins.opamediaplayer;

import android.os.Bundle;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.C0310l;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ay */
/* compiled from: PG */
final class C115138ay extends C0310l {

    /* renamed from: d */
    final /* synthetic */ C115157bb f319552d;

    public C115138ay(C115157bb bbVar) {
        this.f319552d = bbVar;
    }

    /* renamed from: d */
    public final void mo1005d(MediaMetadataCompat mediaMetadataCompat) {
        C58976aa aaVar = C58975e.f156826a;
        this.f319552d.f319594e.mo28212l("metadata-changed", new C115136aw(this, mediaMetadataCompat));
    }

    /* renamed from: e */
    public final void mo1006e(PlaybackStateCompat playbackStateCompat) {
        C58976aa aaVar = C58975e.f156826a;
        this.f319552d.f319594e.mo28212l("playback-state-changed", new C115137ax(this, playbackStateCompat));
    }

    /* renamed from: i */
    public final void mo1010i() {
        C58976aa aaVar = C58975e.f156826a;
        this.f319552d.f319594e.mo28212l("session-destroyed", new C115135av(this));
    }

    /* renamed from: j */
    public final void mo1011j(String str, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        if (str.equals("com.google.android.apps.gsa.search.core.work.audioplayer.EVENT_DISCONNECT_MEDIA_SESSION")) {
            mo1010i();
        }
    }
}
