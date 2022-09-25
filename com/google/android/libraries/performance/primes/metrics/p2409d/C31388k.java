package com.google.android.libraries.performance.primes.metrics.p2409d;

import android.content.Context;
import android.util.ArrayMap;
import android.view.FrameMetrics;
import android.view.Window;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import org.chromium.net.NetError;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.performance.primes.metrics.d.k */
/* compiled from: PG */
final class C31388k implements Window.OnFrameMetricsAvailableListener {

    /* renamed from: a */
    private final C58881cr f84501a;

    /* renamed from: b */
    private final C69464a f84502b;

    /* renamed from: c */
    private boolean f84503c;

    /* renamed from: d */
    private long f84504d;

    /* renamed from: e */
    private C31400u f84505e;

    /* renamed from: f */
    private final ArrayMap f84506f;

    public C31388k(Context context, ArrayMap arrayMap, C69464a aVar) {
        this.f84501a = C58886cw.m90973a(new C31387j(context));
        this.f84506f = arrayMap;
        this.f84502b = aVar;
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        long j;
        int i2;
        int i3;
        int i4;
        FrameMetrics frameMetrics2 = frameMetrics;
        if (!this.f84503c) {
            this.f84503c = true;
            C31400u uVar = null;
            if (C31400u.m58545b() && ((Boolean) this.f84502b.mo17428b()).booleanValue()) {
                uVar = new C31400u();
            }
            this.f84505e = uVar;
            this.f84504d = ((Long) this.f84501a.mo6453a()).longValue();
        }
        if (frameMetrics2.getMetric(9) == 1) {
            C31400u uVar2 = this.f84505e;
            if (uVar2 != null) {
                uVar2.mo37099a(frameMetrics2, this.f84504d);
                return;
            }
            return;
        }
        long metric = frameMetrics2.getMetric(8);
        C31400u uVar3 = this.f84505e;
        if (uVar3 != null) {
            j = uVar3.mo37099a(frameMetrics2, this.f84504d);
        } else {
            j = this.f84504d;
        }
        long metric2 = frameMetrics2.getMetric(13);
        ArrayMap arrayMap = this.f84506f;
        synchronized (arrayMap) {
            int size = arrayMap.size();
            int i5 = 0;
            while (i5 < size) {
                C31394o oVar = (C31394o) arrayMap.valueAt(i5);
                int i6 = i5;
                int i7 = (int) (metric / 1000000);
                if (((long) i7) < 0) {
                    oVar.f84546j++;
                } else {
                    oVar.f84545i++;
                    if (metric2 > 0) {
                        i2 = i7;
                        int i8 = (int) ((metric - metric2) / 1000000);
                        if (oVar.f84551o < i8) {
                            oVar.f84551o = i8;
                        }
                        int[] iArr = oVar.f84542f;
                        if (i8 < 20) {
                            i4 = i8 >= -20 ? ((i8 + 20) >> 1) + 12 : i8 >= -30 ? ((i8 + 30) / 5) + 10 : i8 >= -100 ? ((i8 + 100) / 10) + 3 : i8 >= -200 ? ((i8 + 200) / 50) + 1 : 0;
                        } else {
                            i4 = i8 < 30 ? ((i8 - 20) / 5) + 32 : i8 < 100 ? ((i8 - 30) / 10) + 34 : i8 < 200 ? ((i8 - 50) / 100) + 41 : i8 < 1000 ? ((i8 + NetError.ERR_CERT_COMMON_NAME_INVALID) / 100) + 43 : 51;
                        }
                        iArr[i4] = iArr[i4] + 1;
                        if (metric > metric2) {
                            oVar.f84543g++;
                            oVar.f84548l += i2;
                        }
                        if (metric > j) {
                            oVar.f84544h++;
                            oVar.f84549m += i2;
                        }
                    } else {
                        i2 = i7;
                        if (metric > j) {
                            oVar.f84543g++;
                            oVar.f84548l += i2;
                        }
                    }
                    int[] iArr2 = oVar.f84541e;
                    int i9 = i2;
                    if (i9 <= 20) {
                        i3 = i9 >= 8 ? (i9 >> 1) - 2 : i9 / 4;
                    } else {
                        i3 = i9 <= 30 ? (i9 / 5) + 4 : i9 <= 100 ? (i9 / 10) + 7 : i9 <= 200 ? (i9 / 50) + 15 : i9 <= 1000 ? (i9 / 100) + 17 : 27;
                    }
                    iArr2[i3] = iArr2[i3] + 1;
                    oVar.f84546j += i;
                    if (oVar.f84547k < i9) {
                        oVar.f84547k = i9;
                    }
                    oVar.f84550n += i9;
                }
                i5 = i6 + 1;
            }
        }
    }
}
