package com.google.android.libraries.assistant.trainingcache.bindings;

import com.google.common.base.C58838bb;

/* compiled from: PG */
public final class EkhoMaterializerImpl implements AutoCloseable {

    /* renamed from: a */
    public final long f54359a;

    /* renamed from: b */
    public int f54360b = 1;

    public EkhoMaterializerImpl(long j) {
        this.f54359a = j;
    }

    private native void nativeClose(long j);

    private native void nativeNext(long j, byte[][] bArr);

    /* renamed from: a */
    public final EkhoMaterializerResult mo24639a() {
        boolean z = false;
        C58838bb.m90884s(this.f54360b != 1, "Not started yet.");
        C58838bb.m90884s(this.f54360b != 3, "Already closed.");
        byte[][] bArr = new byte[3][];
        nativeNext(this.f54359a, bArr);
        EkhoMaterializerResult ekhoMaterializerResult = new EkhoMaterializerResult();
        ekhoMaterializerResult.resumptionToken = bArr[0];
        byte[] bArr2 = bArr[1];
        if (!(bArr2 == null || bArr2.length <= 0 || bArr2[0] == 0)) {
            z = true;
        }
        ekhoMaterializerResult.isTfExample = z;
        ekhoMaterializerResult.exampleBytes = bArr[2];
        return ekhoMaterializerResult;
    }

    public final void close() {
        if (this.f54360b != 3) {
            nativeClose(this.f54359a);
            this.f54360b = 3;
        }
    }

    public native void nativeStart(long j, String str, byte[] bArr, byte[] bArr2);
}
