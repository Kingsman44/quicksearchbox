package com.google.p3723ar.core;

import android.graphics.Rect;
import android.media.Image;
import android.p022b.C0116b;
import com.google.p3723ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;

/* renamed from: com.google.ar.core.ArImage */
/* compiled from: PG */
class ArImage extends C0116b {

    /* renamed from: a */
    public final Session f124020a;

    /* renamed from: b */
    long f124021b;

    /* renamed from: c */
    private final long f124022c;

    public ArImage(Session session, long j) {
        this.f124020a = session;
        this.f124021b = j;
        this.f124022c = session.nativeSymbolTableHandle;
    }

    private native void nativeClose(long j, long j2);

    private native int nativeGetFormat(long j, long j2);

    private native int nativeGetHeight(long j, long j2);

    private native int nativeGetNumberOfPlanes(long j, long j2);

    private native long nativeGetTimestamp(long j, long j2);

    private native int nativeGetWidth(long j, long j2);

    static native void nativeLoadSymbols();

    public final void close() {
        nativeClose(this.f124022c, this.f124021b);
        this.f124021b = 0;
    }

    public final Rect getCropRect() {
        return new Rect(0, 0, getWidth(), getHeight());
    }

    public final int getFormat() {
        int nativeGetFormat = nativeGetFormat(this.f124020a.nativeWrapperHandle, this.f124021b);
        if (nativeGetFormat != -1) {
            return nativeGetFormat;
        }
        throw new FatalException("Unknown error in ArImage.getFormat().");
    }

    public final int getHeight() {
        int nativeGetHeight = nativeGetHeight(this.f124020a.nativeWrapperHandle, this.f124021b);
        if (nativeGetHeight != -1) {
            return nativeGetHeight;
        }
        throw new FatalException("Unknown error in ArImage.getHeight().");
    }

    public final Image.Plane[] getPlanes() {
        int nativeGetNumberOfPlanes = nativeGetNumberOfPlanes(this.f124020a.nativeWrapperHandle, this.f124021b);
        if (nativeGetNumberOfPlanes != -1) {
            C47904j[] jVarArr = new C47904j[nativeGetNumberOfPlanes];
            for (int i = 0; i < nativeGetNumberOfPlanes; i++) {
                jVarArr[i] = new C47904j(this, this.f124021b, i);
            }
            return jVarArr;
        }
        throw new FatalException("Unknown error in ArImage.getPlanes().");
    }

    public final long getTimestamp() {
        long nativeGetTimestamp = nativeGetTimestamp(this.f124020a.nativeWrapperHandle, this.f124021b);
        if (nativeGetTimestamp != -1) {
            return nativeGetTimestamp;
        }
        throw new FatalException("Unknown error in ArImage.getTimestamp().");
    }

    public final int getWidth() {
        int nativeGetWidth = nativeGetWidth(this.f124020a.nativeWrapperHandle, this.f124021b);
        if (nativeGetWidth != -1) {
            return nativeGetWidth;
        }
        throw new FatalException("Unknown error in ArImage.getWidth().");
    }

    public native ByteBuffer nativeGetBuffer(long j, long j2, int i);

    public native int nativeGetPixelStride(long j, long j2, int i);

    public native int nativeGetRowStride(long j, long j2, int i);

    public final void setCropRect(Rect rect) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }

    public final void setTimestamp(long j) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }
}
