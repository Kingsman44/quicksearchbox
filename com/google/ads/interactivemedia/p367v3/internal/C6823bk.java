package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Log;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bk */
/* compiled from: PG */
public final class C6823bk {

    /* renamed from: a */
    private final acc f21617a;

    /* renamed from: b */
    private final long f21618b = C6821bi.m19755b(50000);

    /* renamed from: c */
    private final long f21619c = C6821bi.m19755b(50000);

    /* renamed from: d */
    private final long f21620d = C6821bi.m19755b(2500);

    /* renamed from: e */
    private final long f21621e = C6821bi.m19755b(5000);

    /* renamed from: f */
    private final int f21622f = -1;

    /* renamed from: g */
    private final long f21623g = C6821bi.m19755b(0);

    /* renamed from: h */
    private int f21624h = 13107200;

    /* renamed from: i */
    private boolean f21625i;

    public C6823bk() {
        acc acc = new acc();
        m19761j(2500, 0, "bufferForPlaybackMs", "0");
        m19761j(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m19761j(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        m19761j(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m19761j(50000, 50000, "maxBufferMs", "minBufferMs");
        m19761j(0, 0, "backBufferDurationMs", "0");
        this.f21617a = acc;
    }

    /* renamed from: i */
    private final void m19760i(boolean z) {
        this.f21624h = 13107200;
        this.f21625i = false;
        if (z) {
            this.f21617a.mo14435a();
        }
    }

    /* renamed from: j */
    private static void m19761j(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        StringBuilder sb = new StringBuilder(str.length() + 21 + str2.length());
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        ary.m19463p(z, sb.toString());
    }

    /* renamed from: a */
    public final void mo15532a() {
        m19760i(false);
    }

    /* renamed from: b */
    public final void mo15533b() {
        m19760i(true);
    }

    /* renamed from: c */
    public final void mo15534c() {
        m19760i(true);
    }

    /* renamed from: d */
    public final long mo15535d() {
        return this.f21623g;
    }

    /* renamed from: e */
    public final boolean mo15536e(long j, float f, boolean z, long j2) {
        long j3;
        long P = aeu.m18498P(j, f);
        if (z) {
            j3 = this.f21621e;
        } else {
            j3 = this.f21620d;
        }
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || P >= j3 || this.f21617a.mo14441g() >= this.f21624h;
    }

    /* renamed from: f */
    public final acc mo15537f() {
        return this.f21617a;
    }

    /* renamed from: g */
    public final void mo15538g(C6897ed[] edVarArr, abb abb) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = edVarArr.length;
            int i3 = 13107200;
            if (i < 2) {
                if (abb.mo14373a(i) != null) {
                    switch (edVarArr[i].mo15509a()) {
                        case 0:
                            i3 = 144310272;
                            break;
                        case 1:
                            break;
                        case 2:
                            i3 = 131072000;
                            break;
                        case 3:
                        case 4:
                        case 5:
                            i3 = C89885b.S3REQUEST_VALUE;
                            break;
                        case 6:
                            i3 = 0;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    i2 += i3;
                }
                i++;
            } else {
                int max = Math.max(13107200, i2);
                this.f21624h = max;
                this.f21617a.mo14436b(max);
                return;
            }
        }
    }

    /* renamed from: h */
    public final boolean mo15539h(long j, float f) {
        int g = this.f21617a.mo14441g();
        int i = this.f21624h;
        long j2 = this.f21618b;
        if (f > 1.0f) {
            j2 = Math.min(aeu.m18497O(j2, f), this.f21619c);
        }
        boolean z = false;
        if (j < Math.max(j2, 500000)) {
            if (g < i) {
                z = true;
            }
            this.f21625i = z;
            if (!z && j < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= this.f21619c || g >= i) {
            this.f21625i = false;
        }
        return this.f21625i;
    }
}
