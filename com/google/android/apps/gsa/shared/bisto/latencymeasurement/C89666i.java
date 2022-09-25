package com.google.android.apps.gsa.shared.bisto.latencymeasurement;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.shared.bisto.latencymeasurement.i */
/* compiled from: PG */
public final class C89666i implements C89670m {

    /* renamed from: a */
    AudioTrack f242783a;

    /* renamed from: a */
    public final int mo83568a() {
        return 44100;
    }

    /* renamed from: b */
    public final synchronized C60870cx mo83569b() {
        AudioTrack audioTrack = this.f242783a;
        if (audioTrack == null) {
            return C60856cj.m92899h(new Exception("playedJingle with null audioTrack"));
        }
        audioTrack.play();
        this.f242783a.flush();
        return C118826c.f331423b;
    }

    /* renamed from: c */
    public final synchronized void mo83570c(float[] fArr) {
        mo83571d();
        AudioTrack.Builder audioFormat = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).build()).setAudioFormat(new AudioFormat.Builder().setChannelMask(4).setEncoding(4).setSampleRate(44100).build());
        fArr.getClass();
        AudioTrack build = audioFormat.setBufferSizeInBytes(fArr.length * 4).setTransferMode(1).setSessionId(0).build();
        this.f242783a = build;
        build.write(fArr, 0, fArr.length, 1);
    }

    /* renamed from: d */
    public final synchronized void mo83571d() {
        AudioTrack audioTrack = this.f242783a;
        if (audioTrack != null) {
            audioTrack.release();
            this.f242783a = null;
        }
    }
}
