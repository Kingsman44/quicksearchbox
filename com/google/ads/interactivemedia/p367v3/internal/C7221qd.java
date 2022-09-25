package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Log;
import java.nio.ByteBuffer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.qd */
/* compiled from: PG */
final class C7221qd {

    /* renamed from: a */
    private long f23574a;

    /* renamed from: b */
    private long f23575b;

    /* renamed from: c */
    private boolean f23576c;

    /* renamed from: a */
    public final void mo16296a() {
        this.f23574a = 0;
        this.f23575b = 0;
        this.f23576c = false;
    }

    /* renamed from: b */
    public final long mo16297b(C6864cy cyVar, C7024iw iwVar) {
        if (this.f23576c) {
            return iwVar.f22517d;
        }
        ByteBuffer byteBuffer = iwVar.f22515b;
        ary.m19467t(byteBuffer);
        byte b = 0;
        for (int i = 0; i < 4; i++) {
            b = (b << 8) | (byteBuffer.get(i) & 255);
        }
        int b2 = C7013il.m20764b(b);
        if (b2 == -1) {
            this.f23576c = true;
            Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return iwVar.f22517d;
        }
        long j = this.f23574a;
        if (j == 0) {
            long j2 = iwVar.f22517d;
            this.f23575b = j2;
            this.f23574a = ((long) b2) - 529;
            return j2;
        }
        long j3 = (1000000 * j) / ((long) cyVar.f21826z);
        this.f23574a = j + ((long) b2);
        return this.f23575b + j3;
    }
}
