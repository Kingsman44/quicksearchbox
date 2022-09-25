package com.google.p3723ar.core;

import android.p022b.C0115a;
import com.google.p3723ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;

/* renamed from: com.google.ar.core.j */
/* compiled from: PG */
final class C47904j extends C0115a {

    /* renamed from: a */
    final /* synthetic */ ArImage f124042a;

    /* renamed from: b */
    private final long f124043b;

    /* renamed from: c */
    private final int f124044c;

    public C47904j(ArImage arImage, long j, int i) {
        this.f124042a = arImage;
        this.f124043b = j;
        this.f124044c = i;
    }

    public final ByteBuffer getBuffer() {
        ArImage arImage = this.f124042a;
        return arImage.nativeGetBuffer(arImage.f124020a.nativeWrapperHandle, this.f124043b, this.f124044c).asReadOnlyBuffer();
    }

    public final int getPixelStride() {
        ArImage arImage = this.f124042a;
        int nativeGetPixelStride = arImage.nativeGetPixelStride(arImage.f124020a.nativeWrapperHandle, this.f124043b, this.f124044c);
        if (nativeGetPixelStride != -1) {
            return nativeGetPixelStride;
        }
        throw new FatalException("Unknown error in ArImage.Plane.getPixelStride().");
    }

    public final int getRowStride() {
        ArImage arImage = this.f124042a;
        int nativeGetRowStride = arImage.nativeGetRowStride(arImage.f124020a.nativeWrapperHandle, this.f124043b, this.f124044c);
        if (nativeGetRowStride != -1) {
            return nativeGetRowStride;
        }
        throw new FatalException("Unknown error in ArImage.Plane.getRowStride().");
    }
}
