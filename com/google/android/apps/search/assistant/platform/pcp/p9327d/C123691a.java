package com.google.android.apps.search.assistant.platform.pcp.p9327d;

import android.location.Location;
import android.util.Base64;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60944c;
import com.google.protos.p4813ah.p4814a.p4815a.C63174g;
import com.google.protos.p4813ah.p4814a.p4815a.C63175h;
import com.google.protos.p4813ah.p4814a.p4815a.C63176i;
import com.google.protos.p4813ah.p4814a.p4815a.C63177j;
import com.google.protos.p4813ah.p4814a.p4815a.C63178k;
import com.google.protos.p4813ah.p4814a.p4815a.C63179l;
import com.google.protos.p4813ah.p4814a.p4815a.C63183p;
import com.google.protos.p4813ah.p4814a.p4815a.C63185r;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.d.a */
/* compiled from: PG */
public final /* synthetic */ class C123691a implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C123691a f341657a = new C123691a();

    private /* synthetic */ C123691a() {
    }

    public final Object apply(Object obj) {
        Location location = (Location) obj;
        C59071e eVar = C123693c.f341660a;
        if (location == null) {
            C58976aa aaVar = C58975e.f156826a;
            return "w ";
        }
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
        C63174g gVar = (C63174g) C63175h.f170573d.createBuilder();
        long round = Math.round(location.getLatitude() * 1.0E7d);
        gVar.copyOnWrite();
        C63175h hVar = (C63175h) gVar.instance;
        hVar.f170575a |= 1;
        hVar.f170576b = (int) round;
        long round2 = Math.round(location.getLongitude() * 1.0E7d);
        gVar.copyOnWrite();
        C63175h hVar2 = (C63175h) gVar.instance;
        hVar2.f170575a |= 2;
        hVar2.f170577c = (int) round2;
        kVar.copyOnWrite();
        C63179l lVar3 = (C63179l) kVar.instance;
        C63175h hVar3 = (C63175h) gVar.build();
        hVar3.getClass();
        lVar3.f170589e = hVar3;
        lVar3.f170585a |= 16;
        long b = C60944c.m93089b(Duration.ofMillis(location.getTime()));
        kVar.copyOnWrite();
        C63179l lVar4 = (C63179l) kVar.instance;
        lVar4.f170585a |= 4;
        lVar4.f170588d = b;
        if (location.hasAccuracy()) {
            float accuracy = location.getAccuracy();
            kVar.copyOnWrite();
            C63179l lVar5 = (C63179l) kVar.instance;
            lVar5.f170585a |= 128;
            lVar5.f170590f = accuracy * 1000.0f;
        }
        if (location.hasBearing() || location.hasSpeed()) {
            C63177j jVar = ((C63179l) kVar.instance).f170591g;
            if (jVar == null) {
                jVar = C63177j.f170578d;
            }
            C63176i iVar = (C63176i) jVar.toBuilder();
            int round3 = Math.round(location.getBearing());
            iVar.copyOnWrite();
            C63177j jVar2 = (C63177j) iVar.instance;
            jVar2.f170580a |= 2;
            jVar2.f170581b = round3;
            double speed = (double) location.getSpeed();
            Double.isNaN(speed);
            long round4 = Math.round(speed * 3.6d);
            iVar.copyOnWrite();
            C63177j jVar3 = (C63177j) iVar.instance;
            jVar3.f170580a |= 8;
            jVar3.f170582c = (int) round4;
            C63177j jVar4 = (C63177j) iVar.build();
            kVar.copyOnWrite();
            C63179l lVar6 = (C63179l) kVar.instance;
            jVar4.getClass();
            lVar6.f170591g = jVar4;
            lVar6.f170585a |= C89885b.HTTP_VALUE;
        }
        return "w ".concat(String.valueOf(Base64.encodeToString(((C63179l) kVar.build()).toByteArray(), 10)));
    }
}
