package androidx.media3.exoplayer.p142e;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.p134c.C2525c;
import java.nio.ByteBuffer;

/* renamed from: androidx.media3.exoplayer.e.d */
/* compiled from: PG */
final class C2974d implements C2987q {

    /* renamed from: a */
    public final MediaCodec f8534a;

    /* renamed from: b */
    public final C2980j f8535b;

    /* renamed from: c */
    public final C2978h f8536c;

    /* renamed from: d */
    public int f8537d = 0;

    /* renamed from: e */
    private boolean f8538e;

    public C2974d(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.f8534a = mediaCodec;
        this.f8535b = new C2980j(handlerThread);
        this.f8536c = new C2978h(mediaCodec, handlerThread2);
    }

    /* renamed from: d */
    public static String m8409d(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final int mo6868a() {
        int i;
        C2980j jVar = this.f8535b;
        synchronized (jVar.f8555a) {
            i = -1;
            if (!jVar.mo6891d()) {
                jVar.mo6889b();
                jVar.mo6890c();
                if (!jVar.f8558d.mo6902d()) {
                    i = jVar.f8558d.mo6899a();
                }
            }
        }
        return i;
    }

    /* renamed from: b */
    public final int mo6869b(MediaCodec.BufferInfo bufferInfo) {
        int i;
        C2980j jVar = this.f8535b;
        synchronized (jVar.f8555a) {
            i = -1;
            if (!jVar.mo6891d()) {
                jVar.mo6889b();
                jVar.mo6890c();
                if (!jVar.f8559e.mo6902d()) {
                    int a = jVar.f8559e.mo6899a();
                    if (a >= 0) {
                        C2601a.m6829a(jVar.f8562h);
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) jVar.f8560f.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (a == -2) {
                        jVar.f8562h = (MediaFormat) jVar.f8561g.remove();
                        i = -2;
                    }
                    i = a;
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    public final MediaFormat mo6870c() {
        MediaFormat mediaFormat;
        C2980j jVar = this.f8535b;
        synchronized (jVar.f8555a) {
            mediaFormat = jVar.f8562h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* renamed from: e */
    public final ByteBuffer mo6871e(int i) {
        return this.f8534a.getInputBuffer(i);
    }

    /* renamed from: f */
    public final ByteBuffer mo6872f(int i) {
        return this.f8534a.getOutputBuffer(i);
    }

    /* renamed from: g */
    public final void mo6873g() {
        this.f8536c.mo6885b();
        this.f8534a.flush();
        C2980j jVar = this.f8535b;
        synchronized (jVar.f8555a) {
            jVar.f8563i++;
            Handler handler = jVar.f8557c;
            int i = C2612ak.f7249a;
            handler.post(new C2979i(jVar));
        }
        this.f8534a.start();
    }

    /* renamed from: h */
    public final void mo6874h() {
        try {
            if (this.f8537d == 1) {
                C2978h hVar = this.f8536c;
                if (hVar.f8553h) {
                    hVar.mo6885b();
                    hVar.f8549d.quit();
                }
                hVar.f8553h = false;
                C2980j jVar = this.f8535b;
                synchronized (jVar.f8555a) {
                    jVar.f8564j = true;
                    jVar.f8556b.quit();
                    jVar.mo6888a();
                }
            }
            this.f8537d = 2;
            if (!this.f8538e) {
                this.f8534a.release();
                this.f8538e = true;
            }
        } catch (Throwable th) {
            if (!this.f8538e) {
                this.f8534a.release();
                this.f8538e = true;
            }
            throw th;
        }
    }

    /* renamed from: i */
    public final void mo6875i(int i, long j) {
        this.f8534a.releaseOutputBuffer(i, j);
    }

    /* renamed from: j */
    public final void mo6876j(Surface surface) {
        this.f8534a.setOutputSurface(surface);
    }

    /* renamed from: k */
    public final void mo6877k(Bundle bundle) {
        this.f8534a.setParameters(bundle);
    }

    /* renamed from: l */
    public final void mo6878l(int i) {
        this.f8534a.setVideoScalingMode(i);
    }

    /* renamed from: m */
    public final boolean mo6879m() {
        return false;
    }

    /* renamed from: n */
    public final void mo6880n(int i, int i2, long j, int i3) {
        C2978h hVar = this.f8536c;
        hVar.mo6886c();
        C2977g a = C2978h.m8427a();
        a.mo6884a(i, i2, j, i3);
        Handler handler = hVar.f8550e;
        int i4 = C2612ak.f7249a;
        handler.obtainMessage(0, a).sendToTarget();
    }

    /* renamed from: o */
    public final void mo6881o(int i, C2525c cVar, long j) {
        C2978h hVar = this.f8536c;
        hVar.mo6886c();
        C2977g a = C2978h.m8427a();
        a.mo6884a(i, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = a.f8543d;
        cryptoInfo.numSubSamples = cVar.f6949f;
        cryptoInfo.numBytesOfClearData = C2978h.m8429e(cVar.f6947d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = C2978h.m8429e(cVar.f6948e, cryptoInfo.numBytesOfEncryptedData);
        byte[] d = C2978h.m8428d(cVar.f6945b, cryptoInfo.key);
        d.getClass();
        cryptoInfo.key = d;
        byte[] d2 = C2978h.m8428d(cVar.f6944a, cryptoInfo.iv);
        d2.getClass();
        cryptoInfo.iv = d2;
        cryptoInfo.mode = cVar.f6946c;
        int i2 = C2612ak.f7249a;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f6950g, cVar.f6951h));
        hVar.f8550e.obtainMessage(1, a).sendToTarget();
    }

    /* renamed from: p */
    public final void mo6882p(int i) {
        this.f8534a.releaseOutputBuffer(i, false);
    }
}
