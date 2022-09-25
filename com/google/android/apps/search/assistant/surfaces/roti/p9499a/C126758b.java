package com.google.android.apps.search.assistant.surfaces.roti.p9499a;

import android.media.AudioTrack;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.a.b */
/* compiled from: PG */
final class C126758b implements AudioTrack.OnPlaybackPositionUpdateListener {

    /* renamed from: a */
    final /* synthetic */ AudioTrack f349075a;

    /* renamed from: b */
    final /* synthetic */ C126760d f349076b;

    public C126758b(C126760d dVar, AudioTrack audioTrack) {
        this.f349076b = dVar;
        this.f349075a = audioTrack;
    }

    public final void onMarkerReached(AudioTrack audioTrack) {
        ((C59052c) ((C59052c) C126760d.f349077a.mo56224b()).mo56372aa(37137)).mo56386p("Audio track end of file reached");
        this.f349075a.release();
        this.f349076b.f349080d.set(false);
        this.f349076b.mo107752b();
    }

    public final void onPeriodicNotification(AudioTrack audioTrack) {
    }
}
