package com.google.android.libraries.search.silk.p3162a.p3170h;

import android.location.Location;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.common.base.C58817ah;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56727c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4307l.C56728d;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56847c;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;
import java.security.ProviderException;

/* renamed from: com.google.android.libraries.search.silk.a.h.c */
/* compiled from: PG */
public final /* synthetic */ class C40577c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C40580f f106498a;

    public /* synthetic */ C40577c(C40580f fVar) {
        this.f106498a = fVar;
    }

    public final Object apply(Object obj) {
        C40580f fVar = this.f106498a;
        Location location = (Location) obj;
        if (location != null) {
            C56727c cVar = (C56727c) C56728d.f151406f.createBuilder();
            double latitude = location.getLatitude();
            cVar.copyOnWrite();
            C56728d dVar = (C56728d) cVar.instance;
            dVar.f151408a |= 2;
            dVar.f151410c = latitude;
            double longitude = location.getLongitude();
            cVar.copyOnWrite();
            C56728d dVar2 = (C56728d) cVar.instance;
            dVar2.f151408a |= 4;
            dVar2.f151411d = longitude;
            float accuracy = location.getAccuracy();
            cVar.copyOnWrite();
            C56728d dVar3 = (C56728d) cVar.instance;
            dVar3.f151408a |= 8;
            dVar3.f151412e = accuracy;
            long b = fVar.f106504b.mo26870b();
            cVar.copyOnWrite();
            C56728d dVar4 = (C56728d) cVar.instance;
            dVar4.f151408a |= 1;
            dVar4.f151409b = b;
            return (C56728d) cVar.build();
        }
        C56847c cVar2 = (C56847c) C56848d.f151669d.createBuilder();
        cVar2.copyOnWrite();
        C56848d dVar5 = (C56848d) cVar2.instance;
        dVar5.f151671a |= 1;
        dVar5.f151672b = "location_unavailable";
        cVar2.copyOnWrite();
        C56848d dVar6 = (C56848d) cVar2.instance;
        dVar6.f151671a |= 2;
        dVar6.f151673c = "The user's location could not be acquired.";
        throw new ProviderException(new C41742a((C56848d) cVar2.build()));
    }
}
