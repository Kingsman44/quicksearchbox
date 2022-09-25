package com.google.android.apps.search.transcription.p10665a;

import android.media.AudioTrack;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.transcription.a.b */
/* compiled from: PG */
final class C141736b implements AudioTrack.OnPlaybackPositionUpdateListener {

    /* renamed from: a */
    final /* synthetic */ AudioTrack f384710a;

    /* renamed from: b */
    final /* synthetic */ C141738d f384711b;

    public C141736b(C141738d dVar, AudioTrack audioTrack) {
        this.f384711b = dVar;
        this.f384710a = audioTrack;
    }

    public final void onMarkerReached(AudioTrack audioTrack) {
        ((C59052c) ((C59052c) C141738d.f384712a.mo56224b()).mo56372aa(41824)).mo56386p("Audio track end of file reached");
        this.f384710a.release();
        this.f384711b.f384715d.set(false);
        this.f384711b.mo116700b();
    }

    public final void onPeriodicNotification(AudioTrack audioTrack) {
    }
}
