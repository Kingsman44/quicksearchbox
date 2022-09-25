package com.google.android.apps.gsa.shared.logger.p7062h.p7063a;

import com.google.android.gms.clearcut.C143667t;
import com.google.android.gms.clearcut.C143673z;
import com.google.android.libraries.search.p3047m.p3048a.C39217a;
import com.google.android.libraries.search.p3047m.p3048a.p3049a.C39218a;
import com.google.android.libraries.search.p3047m.p3048a.p3049a.C39219b;
import com.google.android.libraries.search.p3047m.p3048a.p3049a.C39220c;
import com.google.android.libraries.search.p3047m.p3048a.p3049a.C39222e;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3050b.C39227c;
import com.google.common.p4552o.C59703cr;
import p3186j$.time.Instant;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.logger.h.a.a */
/* compiled from: PG */
public final class C89919a implements C39217a {

    /* renamed from: a */
    private final C39222e f246353a;

    public C89919a(C39222e eVar) {
        this.f246353a = eVar;
    }

    /* renamed from: a */
    public final void mo41729a(String str, String str2, C59703cr crVar, String str3, Integer num) {
        boolean z;
        C39222e eVar = this.f246353a;
        C39220c cVar = (C39220c) C39218a.f103176a.getOrDefault(str, C39220c.GROUP_OTHER);
        C39226b a = C39227c.m68657a(str2);
        C143667t tVar = (C143667t) eVar.f103242e.get(crVar);
        tVar.getClass();
        synchronized (eVar) {
            if (((Instant) Map.EL.getOrDefault(eVar.f103243f, cVar, Instant.EPOCH)).plusSeconds(60).compareTo(Instant.ofEpochMilli(eVar.f103241d.mo26870b())) <= 0) {
                eVar.f103243f.put(cVar, Instant.ofEpochMilli(eVar.f103241d.mo26870b()));
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            C143673z zVar = eVar.f103240c;
            C39219b bVar = (C39219b) C39222e.f103237a.get(cVar);
            bVar.getClass();
            zVar.mo119020d(bVar.name()).mo119005a((long) a.getNumber(), 1, tVar);
        }
        C143673z zVar2 = eVar.f103240c;
        C39219b bVar2 = (C39219b) C39222e.f103238b.get(cVar);
        bVar2.getClass();
        zVar2.mo119020d(bVar2.name()).mo119005a((long) a.getNumber(), 1, tVar);
    }
}
