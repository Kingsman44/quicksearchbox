package com.google.android.libraries.lens.view.p2113h.p2114a;

import com.google.android.libraries.p1730f.C21370a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.lens.view.h.a.r */
/* compiled from: PG */
public final class C26657r {

    /* renamed from: a */
    private final Object f72684a = new Object();

    /* renamed from: b */
    private final C21370a f72685b;

    /* renamed from: c */
    private final long[] f72686c = new long[36];

    /* renamed from: d */
    private int f72687d = 0;

    public C26657r(C21370a aVar) {
        this.f72685b = aVar;
    }

    /* renamed from: c */
    private static int m49265c(int i) {
        if (i == 35) {
            return 0;
        }
        return i + 1;
    }

    /* renamed from: a */
    public final float mo31952a() {
        long[] jArr;
        long j;
        synchronized (this.f72684a) {
            long c = this.f72685b.mo26871c() - 1000;
            long[] jArr2 = this.f72686c;
            int i = this.f72687d;
            if (jArr2[i] < c) {
                return 0.0f;
            }
            int c2 = m49265c(i);
            while (true) {
                jArr = this.f72686c;
                j = jArr[c2];
                if (j >= c) {
                    break;
                }
                c2 = m49265c(c2);
            }
            int i2 = this.f72687d;
            long j2 = jArr[i2] - j;
            if (j2 == 0) {
                return 0.0f;
            }
            int i3 = i2 - c2;
            if (i3 < 0) {
                i3 += 36;
            }
            float millis = (((float) i3) / ((float) j2)) * ((float) TimeUnit.SECONDS.toMillis(1));
            return millis;
        }
    }

    /* renamed from: b */
    public final void mo31953b() {
        long c = this.f72685b.mo26871c();
        synchronized (this.f72684a) {
            int c2 = m49265c(this.f72687d);
            this.f72687d = c2;
            this.f72686c[c2] = c;
        }
    }
}
