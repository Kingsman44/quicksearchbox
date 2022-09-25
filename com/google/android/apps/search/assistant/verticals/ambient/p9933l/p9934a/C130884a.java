package com.google.android.apps.search.assistant.verticals.ambient.p9933l.p9934a;

import android.location.Location;
import android.os.Bundle;
import com.google.assistant.p4016z.C53676aa;
import com.google.assistant.p4016z.C53737v;
import com.google.assistant.p4016z.C53738w;
import com.google.assistant.p4016z.C53739x;
import com.google.assistant.p4016z.C53741z;
import com.google.common.base.C58817ah;
import com.google.p4479cg.C58078j;
import com.google.p4479cg.C58079k;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.l.a.a */
/* compiled from: PG */
public final /* synthetic */ class C130884a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130885b f358174a;

    public /* synthetic */ C130884a(C130885b bVar) {
        this.f358174a = bVar;
    }

    public final Object apply(Object obj) {
        int i;
        C130885b bVar = this.f358174a;
        Location location = (Location) obj;
        if (location != null) {
            C53737v vVar = (C53737v) C53738w.f141079d.createBuilder();
            C58078j jVar = (C58078j) C58079k.f155250c.createBuilder();
            double latitude = location.getLatitude();
            jVar.copyOnWrite();
            ((C58079k) jVar.instance).f155252a = latitude;
            double longitude = location.getLongitude();
            jVar.copyOnWrite();
            ((C58079k) jVar.instance).f155253b = longitude;
            vVar.copyOnWrite();
            C53738w wVar = (C53738w) vVar.instance;
            C58079k kVar = (C58079k) jVar.build();
            kVar.getClass();
            wVar.f141082b = kVar;
            wVar.f141081a |= 1;
            C53739x xVar = (C53739x) C53676aa.f140889i.createBuilder();
            Bundle extras = location.getExtras();
            if (extras == null) {
                i = 1;
            } else {
                i = C53741z.m86896a(extras.getInt("locationType"));
            }
            xVar.copyOnWrite();
            C53676aa aaVar = (C53676aa) xVar.instance;
            int i2 = i - 1;
            if (i != 0) {
                aaVar.f140892b = i2;
                aaVar.f140891a |= 1;
                float accuracy = location.getAccuracy();
                xVar.copyOnWrite();
                C53676aa aaVar2 = (C53676aa) xVar.instance;
                aaVar2.f140891a |= 2;
                aaVar2.f140893c = accuracy;
                boolean isFromMockProvider = location.isFromMockProvider();
                xVar.copyOnWrite();
                C53676aa aaVar3 = (C53676aa) xVar.instance;
                aaVar3.f140891a |= 4;
                aaVar3.f140894d = isFromMockProvider;
                C63042fg i3 = C62953e.m95484i(location.getTime());
                xVar.copyOnWrite();
                C53676aa aaVar4 = (C53676aa) xVar.instance;
                i3.getClass();
                aaVar4.f140897g = i3;
                aaVar4.f140891a |= 32;
                C62910ar e = C62953e.m95480e(C62953e.m95485j(location.getElapsedRealtimeNanos()), C62953e.m95485j(bVar.f358175a.mo26872d()));
                xVar.copyOnWrite();
                C53676aa aaVar5 = (C53676aa) xVar.instance;
                e.getClass();
                aaVar5.f140898h = e;
                aaVar5.f140891a |= 64;
                if (location.hasSpeed()) {
                    float speed = location.getSpeed();
                    xVar.copyOnWrite();
                    C53676aa aaVar6 = (C53676aa) xVar.instance;
                    aaVar6.f140891a |= 8;
                    aaVar6.f140895e = speed;
                }
                if (location.hasBearing()) {
                    float bearing = location.getBearing();
                    xVar.copyOnWrite();
                    C53676aa aaVar7 = (C53676aa) xVar.instance;
                    aaVar7.f140891a |= 16;
                    aaVar7.f140896f = bearing;
                }
                C53676aa aaVar8 = (C53676aa) xVar.build();
                vVar.copyOnWrite();
                C53738w wVar2 = (C53738w) vVar.instance;
                aaVar8.getClass();
                wVar2.f141083c = aaVar8;
                wVar2.f141081a |= 2;
                return (C53738w) vVar.build();
            }
            throw null;
        }
        throw new NullPointerException("Could not get location");
    }
}
