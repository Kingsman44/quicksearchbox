package androidx.media3.exoplayer.p142e;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.p134c.C2525c;
import java.nio.ByteBuffer;

/* renamed from: androidx.media3.exoplayer.e.ag */
/* compiled from: PG */
public final class C2971ag implements C2987q {

    /* renamed from: a */
    private final MediaCodec f8530a;

    public C2971ag(MediaCodec mediaCodec) {
        this.f8530a = mediaCodec;
        int i = C2612ak.f7249a;
    }

    /* renamed from: a */
    public final int mo6868a() {
        return this.f8530a.dequeueInputBuffer(0);
    }

    /* renamed from: b */
    public final int mo6869b(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f8530a.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3) {
                int i = C2612ak.f7249a;
                dequeueOutputBuffer = -3;
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    /* renamed from: c */
    public final MediaFormat mo6870c() {
        return this.f8530a.getOutputFormat();
    }

    /* renamed from: e */
    public final ByteBuffer mo6871e(int i) {
        int i2 = C2612ak.f7249a;
        return this.f8530a.getInputBuffer(i);
    }

    /* renamed from: f */
    public final ByteBuffer mo6872f(int i) {
        int i2 = C2612ak.f7249a;
        return this.f8530a.getOutputBuffer(i);
    }

    /* renamed from: g */
    public final void mo6873g() {
        this.f8530a.flush();
    }

    /* renamed from: h */
    public final void mo6874h() {
        this.f8530a.release();
    }

    /* renamed from: i */
    public final void mo6875i(int i, long j) {
        this.f8530a.releaseOutputBuffer(i, j);
    }

    /* renamed from: j */
    public final void mo6876j(Surface surface) {
        this.f8530a.setOutputSurface(surface);
    }

    /* renamed from: k */
    public final void mo6877k(Bundle bundle) {
        this.f8530a.setParameters(bundle);
    }

    /* renamed from: l */
    public final void mo6878l(int i) {
        this.f8530a.setVideoScalingMode(i);
    }

    /* renamed from: m */
    public final boolean mo6879m() {
        return false;
    }

    /* renamed from: n */
    public final void mo6880n(int i, int i2, long j, int i3) {
        this.f8530a.queueInputBuffer(i, 0, i2, j, i3);
    }

    /* renamed from: o */
    public final void mo6881o(int i, C2525c cVar, long j) {
        this.f8530a.queueSecureInputBuffer(i, 0, cVar.f6952i, j, 0);
    }

    /* renamed from: p */
    public final void mo6882p(int i) {
        this.f8530a.releaseOutputBuffer(i, false);
    }
}
