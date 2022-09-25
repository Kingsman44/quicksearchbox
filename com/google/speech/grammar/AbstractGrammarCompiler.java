package com.google.speech.grammar;

import java.nio.charset.Charset;
import java.util.logging.Logger;

/* compiled from: PG */
public abstract class AbstractGrammarCompiler {

    /* renamed from: a */
    private long f180882a = nativeConstruct();

    static {
        Logger.getLogger(AbstractGrammarCompiler.class.getName());
    }

    /* renamed from: h */
    private final void m97224h() {
        if (this.f180882a == 0) {
            throw new IllegalStateException("Recognizer not initialized");
        }
    }

    private static native boolean nativeCompile(long j, byte[] bArr);

    private static native long nativeConstruct();

    private static native boolean nativeDelete(long j);

    private static native boolean nativeInitFromProto(long j, byte[] bArr, String[] strArr);

    private static native boolean nativeReadCache(long j, String str);

    private static native boolean nativeWriteCache(long j, String str, boolean z);

    private static native boolean nativeWriteClgFst(long j, String str, String str2);

    private static native boolean nativeWriteSemanticFst(long j, String str, String str2);

    /* renamed from: a */
    public final synchronized void mo59639a() {
        long j = this.f180882a;
        if (j != 0) {
            nativeDelete(j);
            this.f180882a = 0;
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo59640b(String str) {
        m97224h();
        return nativeCompile(this.f180882a, str.getBytes(Charset.forName("UTF-8")));
    }

    /* renamed from: c */
    public final synchronized boolean mo59641c(byte[] bArr, String[] strArr) {
        m97224h();
        return nativeInitFromProto(this.f180882a, bArr, strArr);
    }

    /* renamed from: d */
    public final synchronized boolean mo59642d(String str) {
        m97224h();
        return nativeReadCache(this.f180882a, str);
    }

    /* renamed from: e */
    public final synchronized boolean mo59643e(String str, String str2) {
        m97224h();
        return nativeWriteClgFst(this.f180882a, str, str2);
    }

    /* renamed from: f */
    public final synchronized boolean mo59644f(String str, String str2) {
        m97224h();
        return nativeWriteSemanticFst(this.f180882a, str, str2);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        mo59639a();
    }

    /* renamed from: g */
    public final synchronized boolean mo59646g(String str) {
        m97224h();
        return nativeWriteCache(this.f180882a, str, true);
    }
}
