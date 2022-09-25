package com.google.ads.interactivemedia.p367v3.internal;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* renamed from: com.google.ads.interactivemedia.v3.internal.qw */
/* compiled from: PG */
final class C7240qw implements C7222qe {

    /* renamed from: a */
    private final MediaCodec f23672a;

    public C7240qw(MediaCodec mediaCodec) {
        this.f23672a = mediaCodec;
    }

    /* renamed from: a */
    public final void mo16298a() {
        this.f23672a.start();
    }

    /* renamed from: b */
    public final int mo16299b() {
        return this.f23672a.dequeueInputBuffer(0);
    }

    /* renamed from: c */
    public final int mo16300c(MediaCodec.BufferInfo bufferInfo) {
        return this.f23672a.dequeueOutputBuffer(bufferInfo, 0);
    }

    /* renamed from: d */
    public final MediaFormat mo16301d() {
        return this.f23672a.getOutputFormat();
    }

    /* renamed from: e */
    public final void mo16302e() {
        this.f23672a.flush();
    }

    /* renamed from: f */
    public final MediaCodec mo16303f() {
        return this.f23672a;
    }

    /* renamed from: g */
    public final void mo16304g(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        this.f23672a.configure(mediaFormat, surface, mediaCrypto, 0);
    }

    /* renamed from: h */
    public final void mo16305h(int i, int i2, long j, int i3) {
        this.f23672a.queueInputBuffer(i, 0, i2, j, i3);
    }

    /* renamed from: i */
    public final void mo16306i(int i, C7021it itVar, long j) {
        this.f23672a.queueSecureInputBuffer(i, 0, itVar.mo16039b(), j, 0);
    }
}
