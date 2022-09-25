package com.google.android.apps.search.googleapp.search.p10411g;

import android.location.Location;
import android.util.Base64;
import android.util.Pair;
import com.google.common.base.C58817ah;
import com.google.common.p4580v.C60944c;
import com.google.protos.p4813ah.p4814a.p4815a.C63174g;
import com.google.protos.p4813ah.p4814a.p4815a.C63175h;
import com.google.protos.p4813ah.p4814a.p4815a.C63178k;
import com.google.protos.p4813ah.p4814a.p4815a.C63179l;
import com.google.protos.p4813ah.p4814a.p4815a.C63183p;
import com.google.protos.p4813ah.p4814a.p4815a.C63185r;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.search.g.b */
/* compiled from: PG */
public final /* synthetic */ class C137453b implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C137453b f373853a = new C137453b();

    private /* synthetic */ C137453b() {
    }

    public final Object apply(Object obj) {
        Location location = (Location) obj;
        if (location == null) {
            return null;
        }
        Pair create = Pair.create(Integer.valueOf((int) Math.round(location.getLatitude() * 1.0E7d)), Integer.valueOf((int) Math.round(location.getLongitude() * 1.0E7d)));
        C63178k kVar = (C63178k) C63179l.f170583h.createBuilder();
        C63185r rVar = C63185r.CURRENT_LOCATION;
        kVar.copyOnWrite();
        C63179l lVar = (C63179l) kVar.instance;
        lVar.f170586b = rVar.f170696o;
        lVar.f170585a |= 1;
        C63183p pVar = C63183p.DEVICE_LOCATION;
        kVar.copyOnWrite();
        C63179l lVar2 = (C63179l) kVar.instance;
        lVar2.f170587c = pVar.f170679aE;
        lVar2.f170585a |= 2;
        long b = C60944c.m93089b(Duration.ofMillis(location.getTime()));
        kVar.copyOnWrite();
        C63179l lVar3 = (C63179l) kVar.instance;
        lVar3.f170585a |= 4;
        lVar3.f170588d = b;
        C63174g gVar = (C63174g) C63175h.f170573d.createBuilder();
        int intValue = ((Integer) create.first).intValue();
        gVar.copyOnWrite();
        C63175h hVar = (C63175h) gVar.instance;
        hVar.f170575a |= 1;
        hVar.f170576b = intValue;
        int intValue2 = ((Integer) create.second).intValue();
        gVar.copyOnWrite();
        C63175h hVar2 = (C63175h) gVar.instance;
        hVar2.f170575a |= 2;
        hVar2.f170577c = intValue2;
        kVar.copyOnWrite();
        C63179l lVar4 = (C63179l) kVar.instance;
        C63175h hVar3 = (C63175h) gVar.build();
        hVar3.getClass();
        lVar4.f170589e = hVar3;
        lVar4.f170585a |= 16;
        if (location.hasAccuracy()) {
            float accuracy = location.getAccuracy();
            kVar.copyOnWrite();
            C63179l lVar5 = (C63179l) kVar.instance;
            lVar5.f170585a |= 128;
            lVar5.f170590f = accuracy * 1000.0f;
        }
        return "w ".concat(String.valueOf(Base64.encodeToString(((C63179l) kVar.build()).toByteArray(), 10)));
    }
}
