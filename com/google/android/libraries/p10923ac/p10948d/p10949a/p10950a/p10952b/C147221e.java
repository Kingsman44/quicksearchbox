package com.google.android.libraries.p10923ac.p10948d.p10949a.p10950a.p10952b;

import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.mdh.internal.C145053d;
import com.google.android.gms.mdh.internal.C145055f;
import com.google.android.gms.mdh.internal.C145057h;
import com.google.android.gms.mdh.internal.C145060k;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21638c;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21639d;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21640e;
import com.google.android.libraries.gcoreclient.p1794s.p1795a.C21646k;
import com.google.android.libraries.gcoreclient.p1809y.p1810a.C21742c;
import com.google.android.libraries.p10923ac.p10924a.C146765h;
import com.google.android.libraries.p10923ac.p10947c.C147204f;
import com.google.android.libraries.p10923ac.p10947c.C147205g;
import com.google.android.libraries.p10923ac.p10948d.p10949a.p10950a.p10951a.C147212b;
import com.google.android.libraries.p10923ac.p10948d.p10949a.p10950a.p10951a.C147214d;
import com.google.android.libraries.p10923ac.p10948d.p10949a.p10950a.p10951a.C147215e;
import com.google.android.libraries.p10923ac.p10948d.p10949a.p10950a.p10951a.C147216f;
import com.google.common.base.C58820ak;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62917ay;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.ac.d.a.a.b.e */
/* compiled from: PG */
public final class C147221e implements C147205g {

    /* renamed from: a */
    public final C62917ay f397441a;

    /* renamed from: b */
    private final Executor f397442b;

    /* renamed from: c */
    private final C21640e f397443c;

    public C147221e(Executor executor, C21640e eVar, C62917ay ayVar) {
        this.f397442b = executor;
        this.f397443c = eVar;
        this.f397441a = ayVar;
        new WeakHashMap();
    }

    /* renamed from: a */
    public final C60870cx mo124031a(C147204f fVar) {
        Executor executor = this.f397442b;
        C21640e eVar = this.f397443c;
        C21638c a = C147217a.m240073a(fVar);
        C145060k kVar = eVar.f59993a;
        LatestFootprintFilter latestFootprintFilter = a.f59991a;
        C146010af afVar = new C146010af();
        C145055f fVar2 = new C145055f(afVar, new C145053d(kVar, latestFootprintFilter, afVar));
        synchronized (kVar.f392131f) {
            if (!kVar.f392131f.isEmpty()) {
                C145057h hVar = (C145057h) kVar.f392131f.getLast();
                hVar.f392117a.add(fVar2);
                if (!hVar.f392118b && hVar == hVar.f392120d.f392131f.getFirst()) {
                    hVar.mo120581a();
                }
            } else {
                fVar2.mo120580a();
            }
        }
        C21742c cVar = new C21742c(afVar.f394698a, C21639d.f59992a);
        C147220d dVar = new C147220d(this);
        SettableFuture settableFuture = new SettableFuture();
        cVar.mo27083d(executor, new C147215e(settableFuture, dVar));
        Objects.requireNonNull(settableFuture);
        cVar.mo27081b(executor, new C147214d(settableFuture));
        return settableFuture;
    }

    /* renamed from: b */
    public final void mo124032b(C146765h hVar, C147204f fVar) {
        C146014aj ajVar;
        Executor executor = this.f397442b;
        C21640e eVar = this.f397443c;
        C21646k a = C147212b.m240067a(hVar);
        C21638c a2 = C147217a.m240073a(fVar);
        C145060k kVar = eVar.f59993a;
        SyncPolicy syncPolicy = a.f59998a;
        LatestFootprintFilter latestFootprintFilter = a2.f59991a;
        C146010af afVar = new C146010af();
        synchronized (kVar.f392131f) {
            C145057h hVar2 = new C145057h(kVar, afVar, syncPolicy, latestFootprintFilter);
            if (kVar.f392131f.isEmpty()) {
                hVar2.mo120581a();
            }
            kVar.f392131f.add(hVar2);
            ajVar = afVar.f394698a;
        }
        C147216f.m240072a(executor, new C21742c(ajVar, C58820ak.f156611a));
    }
}
