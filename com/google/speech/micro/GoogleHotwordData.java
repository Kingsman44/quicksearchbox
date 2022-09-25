package com.google.speech.micro;

/* compiled from: PG */
public class GoogleHotwordData {
    private long nativeHotwordData;

    public GoogleHotwordData(byte[] bArr, int i, int i2, int i3) {
        this(bArr, i, i2, i3, false);
    }

    private static native void nativeClose(long j);

    private static native String nativeGetHotwordModelId(long j);

    private static native int nativeIdealBufferBytes(long j);

    private static native boolean nativeIsSpeakerModelCompatible(long j, byte[] bArr);

    private static native boolean nativeIsSpeakerVerificationEnabled(long j);

    private static native int nativeMaxNumImpostorAttemptsForVoiceUnlock(long j);

    private static native long nativeNew(byte[] bArr, int i, int i2, int i3, boolean z);

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            nativeClose(this.nativeHotwordData);
        } finally {
            super.finalize();
        }
    }

    public String getHotwordModelId() {
        return nativeGetHotwordModelId(this.nativeHotwordData);
    }

    public int idealBufferBytes() {
        return nativeIdealBufferBytes(this.nativeHotwordData);
    }

    public boolean isSpeakerModelCompatible(byte[] bArr) {
        return nativeIsSpeakerModelCompatible(this.nativeHotwordData, bArr);
    }

    public boolean isSpeakerVerificationEnabled() {
        return nativeIsSpeakerVerificationEnabled(this.nativeHotwordData);
    }

    public int maxNumImpostorAttemptsForVoiceUnlock() {
        return nativeMaxNumImpostorAttemptsForVoiceUnlock(this.nativeHotwordData);
    }

    public GoogleHotwordData(byte[] bArr, int i, int i2, int i3, boolean z) {
        this.nativeHotwordData = 0;
        this.nativeHotwordData = nativeNew(bArr, i, i2, i3, z);
    }
}
