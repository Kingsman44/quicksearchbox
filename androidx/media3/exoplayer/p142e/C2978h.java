package androidx.media3.exoplayer.p142e;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.media3.common.p136b.C2619g;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.media3.exoplayer.e.h */
/* compiled from: PG */
final class C2978h {

    /* renamed from: a */
    public static final ArrayDeque f8546a = new ArrayDeque();

    /* renamed from: b */
    public static final Object f8547b = new Object();

    /* renamed from: c */
    public final MediaCodec f8548c;

    /* renamed from: d */
    public final HandlerThread f8549d;

    /* renamed from: e */
    public Handler f8550e;

    /* renamed from: f */
    public final AtomicReference f8551f = new AtomicReference();

    /* renamed from: g */
    public final C2619g f8552g;

    /* renamed from: h */
    public boolean f8553h;

    public C2978h(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C2619g gVar = new C2619g((byte[]) null);
        this.f8548c = mediaCodec;
        this.f8549d = handlerThread;
        this.f8552g = gVar;
    }

    /* renamed from: a */
    public static C2977g m8427a() {
        ArrayDeque arrayDeque = f8546a;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                C2977g gVar = new C2977g();
                return gVar;
            }
            C2977g gVar2 = (C2977g) arrayDeque.removeFirst();
            return gVar2;
        }
    }

    /* renamed from: b */
    public final void mo6885b() {
        if (this.f8553h) {
            try {
                Handler handler = this.f8550e;
                handler.getClass();
                handler.removeCallbacksAndMessages((Object) null);
                this.f8552g.mo6193e();
                Handler handler2 = this.f8550e;
                handler2.getClass();
                handler2.obtainMessage(2).sendToTarget();
                this.f8552g.mo6189a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: c */
    public final void mo6886c() {
        RuntimeException runtimeException = (RuntimeException) this.f8551f.getAndSet((Object) null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* renamed from: d */
    public static byte[] m8428d(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    /* renamed from: e */
    public static int[] m8429e(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }
}
