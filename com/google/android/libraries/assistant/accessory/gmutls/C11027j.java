package com.google.android.libraries.assistant.accessory.gmutls;

import javax.net.ssl.SSLEngineResult;

/* renamed from: com.google.android.libraries.assistant.accessory.gmutls.j */
/* compiled from: PG */
public final class C11027j {
    /* renamed from: a */
    public static SSLEngineResult m26118a(int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        SSLEngineResult.Status status = SSLEngineResult.Status.CLOSED;
        int i5 = iArr[0];
        if (i5 <= 3 && i5 >= 0) {
            status = SSLEngineResult.Status.values()[iArr[0]];
        }
        SSLEngineResult.HandshakeStatus handshakeStatus = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
        int i6 = iArr[1];
        if (i6 <= 4 && i6 >= 0) {
            handshakeStatus = SSLEngineResult.HandshakeStatus.values()[iArr[1]];
        }
        return new SSLEngineResult(status, handshakeStatus, Math.max(iArr[2], 0), Math.max(iArr[3], 0));
    }
}
