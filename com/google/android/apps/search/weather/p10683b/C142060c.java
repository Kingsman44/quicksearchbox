package com.google.android.apps.search.weather.p10683b;

import android.location.Location;
import com.google.common.base.C58817ah;
import com.google.p4017at.p4060h.p4075e.p4076a.C54263a;
import com.google.p4017at.p4060h.p4075e.p4076a.C54266b;
import com.google.p5269w.p5270a.C67959a;
import com.google.p5269w.p5270a.C67962d;

/* renamed from: com.google.android.apps.search.weather.b.c */
/* compiled from: PG */
public final /* synthetic */ class C142060c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C54266b f385437a;

    public /* synthetic */ C142060c(C54266b bVar) {
        this.f385437a = bVar;
    }

    public final Object apply(Object obj) {
        C54266b bVar = this.f385437a;
        Location location = (Location) obj;
        int i = C142066i.f385447i;
        C54263a aVar = (C54263a) bVar.toBuilder();
        if (location != null) {
            C67959a aVar2 = (C67959a) C67962d.f184173g.createBuilder();
            double latitude = location.getLatitude();
            aVar2.copyOnWrite();
            C67962d dVar = (C67962d) aVar2.instance;
            dVar.f184175a |= 2;
            dVar.f184177c = (float) latitude;
            double longitude = location.getLongitude();
            aVar2.copyOnWrite();
            C67962d dVar2 = (C67962d) aVar2.instance;
            dVar2.f184175a |= 4;
            dVar2.f184178d = (float) longitude;
            C67962d dVar3 = (C67962d) aVar2.build();
            aVar.copyOnWrite();
            C54266b bVar2 = (C54266b) aVar.instance;
            dVar3.getClass();
            bVar2.f142490b = dVar3;
            bVar2.f142489a |= 1;
        }
        return (C54266b) aVar.build();
    }
}
