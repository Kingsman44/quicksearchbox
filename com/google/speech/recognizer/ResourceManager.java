package com.google.speech.recognizer;

/* compiled from: PG */
public abstract class ResourceManager {

    /* renamed from: a */
    public long f183250a = nativeConstruct();

    private native long nativeConstruct();

    private native void nativeDelete(long j);

    /* renamed from: b */
    public final synchronized void mo59861b() {
        long j = this.f183250a;
        if (j != 0) {
            nativeDelete(j);
            this.f183250a = 0;
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        mo59861b();
    }

    public native int nativeInitFromProto(long j, byte[] bArr, String[] strArr);
}
