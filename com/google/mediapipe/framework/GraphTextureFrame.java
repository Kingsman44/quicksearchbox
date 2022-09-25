package com.google.mediapipe.framework;

/* compiled from: PG */
public class GraphTextureFrame implements TextureFrame {

    /* renamed from: a */
    private long f169359a;

    /* renamed from: b */
    private int f169360b;

    /* renamed from: c */
    private int f169361c;

    /* renamed from: d */
    private int f169362d;

    /* renamed from: e */
    private long f169363e = Long.MIN_VALUE;

    public GraphTextureFrame(long j, long j2) {
        this.f169359a = j;
        this.f169360b = nativeGetTextureName(j);
        this.f169361c = nativeGetWidth(this.f169359a);
        this.f169362d = nativeGetHeight(this.f169359a);
        this.f169363e = j2;
    }

    private native long nativeCreateSyncTokenForCurrentExternalContext(long j);

    private native int nativeGetHeight(long j);

    private native int nativeGetTextureName(long j);

    private native int nativeGetWidth(long j);

    private native void nativeGpuWait(long j);

    private native void nativeReleaseBuffer(long j, long j2);

    public final int getHeight() {
        return this.f169362d;
    }

    public final int getTextureName() {
        if (this.f169359a == 0) {
            return 0;
        }
        return this.f169360b;
    }

    public final long getTimestamp() {
        return this.f169363e;
    }

    public final int getWidth() {
        return this.f169361c;
    }

    public final void release() {
        release(new GraphGlSyncToken(nativeCreateSyncTokenForCurrentExternalContext(this.f169359a)));
    }

    public final void release(GlSyncToken glSyncToken) {
        long j;
        if (this.f169359a != 0) {
            if (glSyncToken == null) {
                j = 0;
            } else {
                j = glSyncToken.nativeToken();
            }
            nativeReleaseBuffer(this.f169359a, j);
            this.f169359a = 0;
        }
        if (glSyncToken != null) {
            glSyncToken.release();
        }
    }
}
