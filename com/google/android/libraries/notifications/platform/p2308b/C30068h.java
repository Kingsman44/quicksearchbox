package com.google.android.libraries.notifications.platform.p2308b;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60842bw;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.notifications.platform.b.h */
/* compiled from: PG */
final class C30068h extends C60842bw implements C60872cz {

    /* renamed from: a */
    public volatile C60872cz f81350a;

    public C30068h(C60870cx cxVar, C60872cz czVar) {
        super(cxVar);
        this.f81350a = czVar;
        cxVar.mo4106b(new C30067g(this), C60826bg.f164896a);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f81350a.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f81350a.getDelay(timeUnit);
    }
}
