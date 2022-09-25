package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import android.media.AudioTrack;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.av */
/* compiled from: PG */
final class C125394av implements AudioTrack.OnPlaybackPositionUpdateListener {

    /* renamed from: a */
    final /* synthetic */ AudioTrack f345837a;

    /* renamed from: b */
    final /* synthetic */ C125396ax f345838b;

    public C125394av(C125396ax axVar, AudioTrack audioTrack) {
        this.f345838b = axVar;
        this.f345837a = audioTrack;
    }

    public final void onMarkerReached(AudioTrack audioTrack) {
        ((C59052c) ((C59052c) C125396ax.f345839a.mo56224b()).mo56372aa(36530)).mo56386p("Audio track end of file reached [SD]");
        this.f345837a.release();
        this.f345838b.f345842d.set(false);
        this.f345838b.mo106958a();
    }

    public final void onPeriodicNotification(AudioTrack audioTrack) {
    }
}
