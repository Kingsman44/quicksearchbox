package com.google.android.apps.gsa.shared.bisto;

import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.gsa.shared.bisto.av */
/* compiled from: PG */
public final /* synthetic */ class C89624av {
    static {
        long j = C89625aw.f242704a;
    }

    /* renamed from: a */
    public static byte[] m145868a(int i, int i2, int i3) {
        return new byte[]{(byte) i, (byte) i2, (byte) ((i3 >> 8) & PrivateKeyType.INVALID), (byte) (i3 & PrivateKeyType.INVALID)};
    }
}
