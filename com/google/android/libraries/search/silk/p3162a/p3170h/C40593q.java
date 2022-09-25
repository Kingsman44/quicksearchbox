package com.google.android.libraries.search.silk.p3162a.p3170h;

import android.location.Location;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.common.base.C58817ah;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56725a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56726b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56731g;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56732h;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56847c;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;
import java.security.ProviderException;

/* renamed from: com.google.android.libraries.search.silk.a.h.q */
/* compiled from: PG */
public final /* synthetic */ class C40593q implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C40595s f106535a;

    public /* synthetic */ C40593q(C40595s sVar) {
        this.f106535a = sVar;
    }

    public final Object apply(Object obj) {
        C40595s sVar = this.f106535a;
        Location location = (Location) obj;
        if (location != null) {
            C56731g gVar = (C56731g) C56732h.f151417c.createBuilder();
            C56725a aVar = (C56725a) C56726b.f151397h.createBuilder();
            double latitude = location.getLatitude();
            aVar.copyOnWrite();
            C56726b bVar = (C56726b) aVar.instance;
            bVar.f151399a |= 2;
            bVar.f151401c = latitude;
            double longitude = location.getLongitude();
            aVar.copyOnWrite();
            C56726b bVar2 = (C56726b) aVar.instance;
            bVar2.f151399a |= 4;
            bVar2.f151402d = longitude;
            float accuracy = location.getAccuracy();
            aVar.copyOnWrite();
            C56726b bVar3 = (C56726b) aVar.instance;
            bVar3.f151399a |= 8;
            bVar3.f151403e = accuracy;
            long b = sVar.f106540b.mo26870b();
            aVar.copyOnWrite();
            C56726b bVar4 = (C56726b) aVar.instance;
            bVar4.f151399a |= 1;
            bVar4.f151400b = b;
            C56726b bVar5 = (C56726b) aVar.build();
            gVar.copyOnWrite();
            C56732h hVar = (C56732h) gVar.instance;
            bVar5.getClass();
            hVar.f151420b = bVar5;
            hVar.f151419a |= 1;
            return (C56732h) gVar.build();
        }
        C56847c cVar = (C56847c) C56848d.f151669d.createBuilder();
        cVar.copyOnWrite();
        C56848d dVar = (C56848d) cVar.instance;
        dVar.f151671a |= 1;
        dVar.f151672b = "location_unavailable";
        cVar.copyOnWrite();
        C56848d dVar2 = (C56848d) cVar.instance;
        dVar2.f151671a |= 2;
        dVar2.f151673c = "The user's location could not be acquired.";
        throw new ProviderException(new C41742a((C56848d) cVar.build()));
    }
}
