package com.google.android.libraries.p1963i;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60842bw;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.i.aa */
/* compiled from: PG */
final class C23826aa extends C60842bw implements C60872cz {

    /* renamed from: a */
    public volatile C60872cz f65245a;

    public C23826aa(C60870cx cxVar, C60872cz czVar) {
        super(cxVar);
        this.f65245a = czVar;
        cxVar.mo4106b(new C23922z(this), C60826bg.f164896a);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f65245a.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f65245a.getDelay(timeUnit);
    }
}
