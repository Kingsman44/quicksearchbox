package com.google.android.libraries.search.assistant.p2828y.p2859r;

import android.media.AudioManager;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.r.c */
/* compiled from: PG */
public final class C37075c {

    /* renamed from: a */
    public final AudioManager f96570a;

    public C37075c(AudioManager audioManager) {
        C69664n.m101061g(audioManager, "audioManager");
        this.f96570a = audioManager;
    }

    /* renamed from: a */
    public final int mo40609a(int i) {
        int streamVolume = this.f96570a.getStreamVolume(i);
        int streamMaxVolume = this.f96570a.getStreamMaxVolume(i);
        if (streamMaxVolume == 0) {
            return 0;
        }
        double d = (double) streamVolume;
        double d2 = (double) streamMaxVolume;
        Double.isNaN(d);
        Double.isNaN(d2);
        return (int) ((d / d2) * 100.0d);
    }
}
