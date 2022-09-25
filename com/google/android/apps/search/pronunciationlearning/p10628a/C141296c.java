package com.google.android.apps.search.pronunciationlearning.p10628a;

import android.media.AudioTrack;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;

/* renamed from: com.google.android.apps.search.pronunciationlearning.a.c */
/* compiled from: PG */
public final /* synthetic */ class C141296c implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C141305l f383600a;

    public /* synthetic */ C141296c(C141305l lVar) {
        this.f383600a = lVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C141306m mVar = this.f383600a.f383616c;
        C141304k kVar = new C141304k(cVar);
        AudioTrack audioTrack = ((C141307n) mVar).f383625c;
        if (audioTrack == null) {
            return "PronTng.PlayAudio";
        }
        audioTrack.setPlaybackPositionUpdateListener(kVar);
        return "PronTng.PlayAudio";
    }
}
