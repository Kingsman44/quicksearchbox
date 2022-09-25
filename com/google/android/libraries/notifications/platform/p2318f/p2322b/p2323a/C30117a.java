package com.google.android.libraries.notifications.platform.p2318f.p2322b.p2323a;

import androidx.work.C4375a;
import androidx.work.C4380ad;
import androidx.work.C4399aw;
import androidx.work.impl.p207b.C4470ae;
import com.google.android.libraries.notifications.p2298k.p2299a.C30040c;
import java.util.concurrent.TimeUnit;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5480j.C69699g;

/* renamed from: com.google.android.libraries.notifications.platform.f.b.a.a */
/* compiled from: PG */
public final class C30117a {
    /* renamed from: a */
    public static final void m55953a(C4399aw awVar, C30040c cVar, Long l) {
        C4375a aVar;
        awVar.mo9338c("GNP_SDK_JOB");
        if (l != null) {
            awVar.mo9340e(l.longValue(), TimeUnit.MILLISECONDS);
        }
        int g = cVar.mo35379g();
        Long c = cVar.mo35375c();
        if (!(g == 0 || c == null)) {
            if (g - 1 != 0) {
                aVar = C4375a.EXPONENTIAL;
            } else {
                aVar = C4375a.LINEAR;
            }
            long longValue = c.longValue();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C69664n.m101061g(aVar, "backoffPolicy");
            C69664n.m101061g(timeUnit, "timeUnit");
            awVar.f14040a = true;
            C4470ae aeVar = awVar.f14042c;
            aeVar.f14228m = aVar;
            long millis = timeUnit.toMillis(longValue);
            if (millis > 18000000) {
                C4380ad.m12560h().mo9314f(C4470ae.f14216a, "Backoff delay duration exceeds maximum value");
            }
            if (millis < 10000) {
                C4380ad.m12560h().mo9314f(C4470ae.f14216a, "Backoff delay duration less than minimum value");
            }
            aeVar.f14229n = C69699g.m101120b(millis, 10000, 18000000);
        }
        C69664n.m101059e(awVar, "null cannot be cast to non-null type B of com.google.android.libraries.notifications.platform.internal.job.impl.GnpJobSchedulingApiImpl.Companion.setCommonParams");
    }
}
