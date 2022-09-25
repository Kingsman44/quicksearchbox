package com.google.android.apps.gsa.staticplugins.bisto.p7486d;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.bisto.latencymeasurement.C89670m;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.d.k */
/* compiled from: PG */
public final class C95262k implements C89670m {

    /* renamed from: a */
    private AudioTrack f266544a;

    /* renamed from: b */
    private final AudioManager f266545b;

    public C95262k(Context context) {
        this.f266545b = (AudioManager) context.getSystemService("audio");
    }

    /* renamed from: a */
    public final int mo83568a() {
        return 16000;
    }

    /* renamed from: b */
    public final C60870cx mo83569b() {
        AudioManager audioManager = this.f266545b;
        if (audioManager != null && !audioManager.isBluetoothScoOn()) {
            return C60856cj.m92899h(new Exception("failed to switch to the right output mode"));
        }
        AudioTrack audioTrack = this.f266544a;
        if (audioTrack == null) {
            return C60856cj.m92899h(new Exception("playedJingle with null audioTrack"));
        }
        audioTrack.play();
        this.f266544a.flush();
        return C118826c.f331423b;
    }

    /* renamed from: c */
    public final void mo83570c(float[] fArr) {
        AudioTrack.Builder audioFormat = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).build()).setAudioFormat(new AudioFormat.Builder().setChannelMask(4).setEncoding(4).setSampleRate(16000).build());
        fArr.getClass();
        AudioTrack build = audioFormat.setBufferSizeInBytes(fArr.length * 4).setTransferMode(1).setSessionId(0).build();
        this.f266544a = build;
        build.write(fArr, 0, fArr.length, 1);
    }

    /* renamed from: d */
    public final void mo83571d() {
        AudioTrack audioTrack = this.f266544a;
        if (audioTrack != null) {
            audioTrack.release();
            this.f266544a.flush();
            this.f266544a = null;
        }
    }
}
