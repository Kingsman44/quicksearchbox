package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.afi */
/* compiled from: PG */
final class afi implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: b */
    private static final afi f20555b = new afi();

    /* renamed from: a */
    public volatile long f20556a = -9223372036854775807L;

    /* renamed from: c */
    private final Handler f20557c;

    /* renamed from: d */
    private final HandlerThread f20558d;

    /* renamed from: e */
    private Choreographer f20559e;

    /* renamed from: f */
    private int f20560f;

    private afi() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f20558d = handlerThread;
        handlerThread.start();
        Handler n = aeu.m18544n(handlerThread.getLooper(), this);
        this.f20557c = n;
        n.sendEmptyMessage(0);
    }

    /* renamed from: a */
    public static afi m18625a() {
        return f20555b;
    }

    /* renamed from: b */
    public final void mo14659b() {
        this.f20557c.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public final void mo14660c() {
        this.f20557c.sendEmptyMessage(2);
    }

    public final void doFrame(long j) {
        this.f20556a = j;
        this.f20559e.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f20559e = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            int i2 = this.f20560f + 1;
            this.f20560f = i2;
            if (i2 == 1) {
                this.f20559e.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.f20560f - 1;
            this.f20560f = i3;
            if (i3 == 0) {
                this.f20559e.removeFrameCallback(this);
                this.f20556a = -9223372036854775807L;
            }
            return true;
        }
    }
}
