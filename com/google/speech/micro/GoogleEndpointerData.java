package com.google.speech.micro;

/* compiled from: PG */
public class GoogleEndpointerData {
    private long nativeEndpointerData = 0;

    public GoogleEndpointerData(byte[] bArr, int i) {
        this.nativeEndpointerData = nativeNew(bArr, i);
    }

    private static native void nativeClose(long j);

    private static native String nativeGetEndpointerModelId(long j);

    private static native int nativeIdealBufferBytes(long j);

    private static native long nativeNew(byte[] bArr, int i);

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            nativeClose(this.nativeEndpointerData);
        } finally {
            super.finalize();
        }
    }

    public String getEndpointerModelId() {
        return nativeGetEndpointerModelId(this.nativeEndpointerData);
    }

    public int idealBufferBytes() {
        return nativeIdealBufferBytes(this.nativeEndpointerData);
    }
}
