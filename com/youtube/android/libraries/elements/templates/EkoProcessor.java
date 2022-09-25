package com.youtube.android.libraries.elements.templates;

import com.google.android.libraries.elements.C20697c;
import p5488io.grpc.Status;

/* compiled from: PG */
public final class EkoProcessor {
    static {
        C20697c.m38871a();
    }

    private EkoProcessor() {
    }

    /* renamed from: a */
    public static C68105a m98450a(byte[] bArr, byte[] bArr2, boolean z) {
        byte[][] bArr3 = {null, null};
        Status nativeProcess = nativeProcess(bArr, bArr2, z, bArr3);
        return nativeProcess.mo61679g() ? new C68105a(nativeProcess, bArr3[0]) : new C68105a(nativeProcess, (byte[]) null);
    }

    private static native Status nativeProcess(byte[] bArr, byte[] bArr2, boolean z, byte[][] bArr3);
}
