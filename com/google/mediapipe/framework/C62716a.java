package com.google.mediapipe.framework;

/* renamed from: com.google.mediapipe.framework.a */
/* compiled from: PG */
public class C62716a implements TextureFrame {

    /* renamed from: b */
    public final int f169366b;

    /* renamed from: c */
    public final int f169367c;

    /* renamed from: d */
    public final int f169368d;

    /* renamed from: e */
    public long f169369e = Long.MIN_VALUE;

    /* renamed from: f */
    public boolean f169370f = false;

    /* renamed from: g */
    public GlSyncToken f169371g = null;

    public C62716a(int i, int i2, int i3) {
        this.f169366b = i;
        this.f169367c = i2;
        this.f169368d = i3;
    }

    public final void finalize() {
        GlSyncToken glSyncToken = this.f169371g;
        if (glSyncToken != null) {
            glSyncToken.release();
            this.f169371g = null;
        }
    }

    public final int getHeight() {
        return this.f169368d;
    }

    public final int getTextureName() {
        return this.f169366b;
    }

    public final long getTimestamp() {
        return this.f169369e;
    }

    public final int getWidth() {
        return this.f169367c;
    }

    public void release() {
        synchronized (this) {
            this.f169370f = false;
            notifyAll();
        }
    }

    public void release(GlSyncToken glSyncToken) {
        synchronized (this) {
            GlSyncToken glSyncToken2 = this.f169371g;
            if (glSyncToken2 != null) {
                glSyncToken2.release();
            }
            this.f169371g = glSyncToken;
            notifyAll();
        }
    }
}
