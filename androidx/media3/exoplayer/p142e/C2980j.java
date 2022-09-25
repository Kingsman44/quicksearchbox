package androidx.media3.exoplayer.p142e;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* renamed from: androidx.media3.exoplayer.e.j */
/* compiled from: PG */
final class C2980j extends MediaCodec.Callback {

    /* renamed from: a */
    public final Object f8555a = new Object();

    /* renamed from: b */
    public final HandlerThread f8556b;

    /* renamed from: c */
    public Handler f8557c;

    /* renamed from: d */
    public final C2984n f8558d;

    /* renamed from: e */
    public final C2984n f8559e;

    /* renamed from: f */
    public final ArrayDeque f8560f;

    /* renamed from: g */
    public final ArrayDeque f8561g;

    /* renamed from: h */
    public MediaFormat f8562h;

    /* renamed from: i */
    public long f8563i;

    /* renamed from: j */
    public boolean f8564j;

    /* renamed from: k */
    public IllegalStateException f8565k;

    /* renamed from: l */
    private MediaFormat f8566l;

    /* renamed from: m */
    private MediaCodec.CodecException f8567m;

    public C2980j(HandlerThread handlerThread) {
        this.f8556b = handlerThread;
        this.f8558d = new C2984n();
        this.f8559e = new C2984n();
        this.f8560f = new ArrayDeque();
        this.f8561g = new ArrayDeque();
    }

    /* renamed from: e */
    private final void m8432e(MediaFormat mediaFormat) {
        this.f8559e.mo6900b(-2);
        this.f8561g.add(mediaFormat);
    }

    /* renamed from: a */
    public final void mo6888a() {
        if (!this.f8561g.isEmpty()) {
            this.f8566l = (MediaFormat) this.f8561g.getLast();
        }
        this.f8558d.mo6901c();
        this.f8559e.mo6901c();
        this.f8560f.clear();
        this.f8561g.clear();
        this.f8567m = null;
    }

    /* renamed from: b */
    public final void mo6889b() {
        IllegalStateException illegalStateException = this.f8565k;
        if (illegalStateException != null) {
            this.f8565k = null;
            throw illegalStateException;
        }
    }

    /* renamed from: c */
    public final void mo6890c() {
        MediaCodec.CodecException codecException = this.f8567m;
        if (codecException != null) {
            this.f8567m = null;
            throw codecException;
        }
    }

    /* renamed from: d */
    public final boolean mo6891d() {
        return this.f8563i > 0 || this.f8564j;
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f8555a) {
            this.f8567m = codecException;
        }
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f8555a) {
            this.f8558d.mo6900b(i);
        }
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f8555a) {
            MediaFormat mediaFormat = this.f8566l;
            if (mediaFormat != null) {
                m8432e(mediaFormat);
                this.f8566l = null;
            }
            this.f8559e.mo6900b(i);
            this.f8560f.add(bufferInfo);
        }
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f8555a) {
            m8432e(mediaFormat);
            this.f8566l = null;
        }
    }
}
