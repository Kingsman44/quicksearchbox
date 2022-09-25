package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;

/* renamed from: androidx.media3.exoplayer.video.n */
/* compiled from: PG */
final class C3307n implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: a */
    public static final C3307n f9975a = new C3307n();

    /* renamed from: b */
    public volatile long f9976b = -9223372036854775807L;

    /* renamed from: c */
    public final Handler f9977c;

    /* renamed from: d */
    private final HandlerThread f9978d;

    /* renamed from: e */
    private Choreographer f9979e;

    /* renamed from: f */
    private int f9980f;

    private C3307n() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f9978d = handlerThread;
        handlerThread.start();
        Handler D = C2612ak.m6921D(handlerThread.getLooper(), this);
        this.f9977c = D;
        D.sendEmptyMessage(0);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            try {
                this.f9979e = Choreographer.getInstance();
            } catch (RuntimeException e) {
                C2633u.m7050e("VideoFrameReleaseHelper", C2633u.m7046a("Vsync sampling disabled due to platform error", e));
            }
            return true;
        } else if (i == 1) {
            Choreographer choreographer = this.f9979e;
            if (choreographer != null) {
                int i2 = this.f9980f + 1;
                this.f9980f = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            Choreographer choreographer2 = this.f9979e;
            if (choreographer2 != null) {
                int i3 = this.f9980f - 1;
                this.f9980f = i3;
                if (i3 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f9976b = -9223372036854775807L;
                }
            }
            return true;
        }
    }

    public final void doFrame(long j) {
        this.f9976b = j;
        Choreographer choreographer = this.f9979e;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500);
    }
}
