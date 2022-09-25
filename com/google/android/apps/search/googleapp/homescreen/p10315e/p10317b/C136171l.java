package com.google.android.apps.search.googleapp.homescreen.p10315e.p10317b;

import com.google.android.gms.awareness.snapshot.internal.WeatherImpl;
import com.google.common.base.C58817ah;
import com.google.common.p4575r.C60757n;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.e.b.l */
/* compiled from: PG */
public final /* synthetic */ class C136171l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C136173n f370844a;

    public /* synthetic */ C136171l(C136173n nVar) {
        this.f370844a = nVar;
    }

    public final Object apply(Object obj) {
        C136173n nVar = this.f370844a;
        WeatherImpl weatherImpl = (WeatherImpl) obj;
        C136165f fVar = (C136165f) C136166g.f370833f.createBuilder();
        float f = weatherImpl.f387863a;
        fVar.copyOnWrite();
        C136166g gVar = (C136166g) fVar.instance;
        gVar.f370835a |= 2;
        gVar.f370838d = WeatherImpl.m231896a(f);
        float f2 = weatherImpl.f387863a;
        fVar.copyOnWrite();
        C136166g gVar2 = (C136166g) fVar.instance;
        gVar2.f370835a |= 4;
        gVar2.f370839e = f2;
        List j = C60757n.m92749j(weatherImpl.f387867e);
        fVar.copyOnWrite();
        C136166g gVar3 = (C136166g) fVar.instance;
        C62961ch chVar = gVar3.f370836b;
        if (!chVar.mo58948c()) {
            gVar3.f370836b = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll((Iterable) j, (List) gVar3.f370836b);
        C63042fg i = C62953e.m95484i(nVar.f370851f.mo26870b());
        fVar.copyOnWrite();
        C136166g gVar4 = (C136166g) fVar.instance;
        i.getClass();
        gVar4.f370837c = i;
        gVar4.f370835a |= 1;
        return (C136166g) fVar.build();
    }
}
