package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.content.Context;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.gms.common.internal.C143918bg;
import com.google.android.libraries.p1975k.C24019l;
import com.google.android.libraries.p1975k.p1980e.C24006d;
import com.google.android.libraries.p3339v.C43205e;
import com.google.common.base.C58837ba;
import com.google.common.p4575r.C60757n;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62961ch;
import p5304e.p5305a.p5306a.p5446y.p5447a.C69325ad;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej;

/* renamed from: com.google.android.libraries.performance.primes.transmitter.clearcut.g */
/* compiled from: PG */
public final /* synthetic */ class C31601g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ ClearcutMetricSnapshotTransmitter f85065a;

    /* renamed from: b */
    public final /* synthetic */ Context f85066b;

    /* renamed from: c */
    public final /* synthetic */ C71308ej f85067c;

    /* renamed from: d */
    public final /* synthetic */ C31596b f85068d;

    public /* synthetic */ C31601g(ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter, Context context, C71308ej ejVar, C31596b bVar) {
        this.f85065a = clearcutMetricSnapshotTransmitter;
        this.f85066b = context;
        this.f85067c = ejVar;
        this.f85068d = bVar;
    }

    public final C60870cx apply(Object obj) {
        C143658k kVar;
        ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter = this.f85065a;
        Context context = this.f85066b;
        C71308ej ejVar = this.f85067c;
        C31596b bVar = this.f85068d;
        if (!((Boolean) obj).booleanValue()) {
            return C60866ct.f164955a;
        }
        String str = bVar.f85045b;
        if (bVar.f85047d) {
            kVar = clearcutMetricSnapshotTransmitter.f85036c;
            if (kVar == null) {
                synchronized (clearcutMetricSnapshotTransmitter) {
                    kVar = clearcutMetricSnapshotTransmitter.f85036c;
                    if (kVar == null) {
                        C143658k a = C143658k.m233374c(context, str).mo118952a();
                        clearcutMetricSnapshotTransmitter.f85036c = a;
                        kVar = a;
                    }
                }
            }
        } else {
            kVar = clearcutMetricSnapshotTransmitter.f85035b;
            if (kVar == null) {
                synchronized (clearcutMetricSnapshotTransmitter) {
                    C143658k kVar2 = clearcutMetricSnapshotTransmitter.f85035b;
                    if (kVar2 == null) {
                        C143658k a2 = C143658k.m233373b(context, str).mo118952a();
                        clearcutMetricSnapshotTransmitter.f85035b = a2;
                        kVar2 = a2;
                    }
                }
            }
        }
        C143657j d = kVar.mo118999d(ejVar);
        if (C69325ad.f185485a.mo6453a().mo61008a(context)) {
            d.f389472n = C24006d.m44596b(context, (C24019l) ClearcutMetricSnapshotTransmitter.f85034a.mo6453a());
        }
        String str2 = bVar.f85048e;
        if (!C58837ba.m90859h(str2)) {
            d.mo118997f(str2);
        }
        if (!bVar.f85047d) {
            if ((bVar.f85044a & 2) != 0) {
                d.mo118994c(bVar.f85046c);
            }
            if ((bVar.f85044a & 16) != 0) {
                d.mo118996e(bVar.f85049f);
            }
            C62961ch chVar = bVar.f85050g;
            if (!chVar.isEmpty()) {
                d.mo118993b(C60757n.m92752m(chVar));
            }
        }
        return C43205e.m76192b(C143918bg.m233956b(d.mo118992a()));
    }
}
