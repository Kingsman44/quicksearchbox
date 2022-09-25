package androidx.media3.exoplayer;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import androidx.media3.common.C2672p;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2632t;
import androidx.media3.common.p136b.C2633u;

/* renamed from: androidx.media3.exoplayer.dd */
/* compiled from: PG */
final class C2960dd {

    /* renamed from: a */
    public final Context f8502a;

    /* renamed from: b */
    public final Handler f8503b;

    /* renamed from: c */
    public final AudioManager f8504c;

    /* renamed from: d */
    public C2959dc f8505d;

    /* renamed from: e */
    public int f8506e = 3;

    /* renamed from: f */
    private int f8507f;

    /* renamed from: g */
    private boolean f8508g;

    /* renamed from: h */
    private final C2845bo f8509h;

    public C2960dd(Context context, Handler handler, C2845bo boVar) {
        Context applicationContext = context.getApplicationContext();
        this.f8502a = applicationContext;
        this.f8503b = handler;
        this.f8509h = boVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        C2601a.m6829a(audioManager);
        this.f8504c = audioManager;
        this.f8507f = m8376c(audioManager, 3);
        int i = this.f8506e;
        int i2 = C2612ak.f7249a;
        this.f8508g = audioManager.isStreamMute(i);
        C2959dc dcVar = new C2959dc(this);
        try {
            C2612ak.m6919B(applicationContext, dcVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f8505d = dcVar;
        } catch (RuntimeException e) {
            C2633u.m7050e("StreamVolumeManager", C2633u.m7046a("Error registering stream volume receiver", e));
        }
    }

    /* renamed from: c */
    private static int m8376c(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            C2633u.m7050e("StreamVolumeManager", C2633u.m7046a("Could not retrieve stream volume for stream type " + i, e));
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* renamed from: a */
    public final void mo6859a(int i) {
        if (this.f8506e != i) {
            this.f8506e = i;
            mo6860b();
            C2845bo boVar = this.f8509h;
            C2672p aA = C2848br.m7814aA(boVar.f7944a.f7998j);
            if (!aA.equals(boVar.f7944a.f7952A)) {
                C2848br brVar = boVar.f7944a;
                brVar.f7952A = aA;
                C2632t tVar = brVar.f7992d;
                tVar.mo6204c(29, new C2842bl(aA));
                tVar.mo6203b();
            }
        }
    }

    /* renamed from: b */
    public final void mo6860b() {
        int c = m8376c(this.f8504c, this.f8506e);
        AudioManager audioManager = this.f8504c;
        int i = this.f8506e;
        int i2 = C2612ak.f7249a;
        boolean isStreamMute = audioManager.isStreamMute(i);
        if (this.f8507f != c || this.f8508g != isStreamMute) {
            this.f8507f = c;
            this.f8508g = isStreamMute;
            C2632t tVar = this.f8509h.f7944a.f7992d;
            tVar.mo6204c(30, new C2840bj(c, isStreamMute));
            tVar.mo6203b();
        }
    }
}
