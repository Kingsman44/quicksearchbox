package com.google.speech.context;

/* compiled from: PG */
public abstract class AbstractContextCompiler {

    /* renamed from: a */
    private long f180767a = nativeConstruct();

    public AbstractContextCompiler() {
        m97216d();
    }

    /* renamed from: d */
    private final void m97216d() {
        if (this.f180767a == 0) {
            throw new IllegalStateException("Recognizer not initialized");
        }
    }

    private native boolean nativeCompile(long j, byte[] bArr, String str, String str2);

    private native long nativeConstruct();

    private native boolean nativeDelete(long j);

    private native boolean nativeInitFromProto(long j, byte[] bArr, String[] strArr);

    /* renamed from: a */
    public final synchronized void mo59634a() {
        long j = this.f180767a;
        if (j != 0) {
            nativeDelete(j);
            this.f180767a = 0;
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo59635b(byte[] bArr, String str, String str2) {
        m97216d();
        return nativeCompile(this.f180767a, bArr, str, str2);
    }

    /* renamed from: c */
    public final synchronized boolean mo59636c(byte[] bArr, String[] strArr) {
        m97216d();
        return nativeInitFromProto(this.f180767a, bArr, strArr);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        mo59634a();
    }
}
