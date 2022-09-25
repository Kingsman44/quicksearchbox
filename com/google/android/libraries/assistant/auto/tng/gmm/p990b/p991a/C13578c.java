package com.google.android.libraries.assistant.auto.tng.gmm.p990b.p991a;

import android.location.Location;
import com.google.common.base.C58817ah;
import com.google.protos.p4813ah.p4814a.p4815a.C63174g;
import com.google.protos.p4813ah.p4814a.p4815a.C63175h;
import com.google.protos.p4813ah.p4814a.p4815a.C63178k;
import com.google.protos.p4813ah.p4814a.p4815a.C63179l;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.b.a.c */
/* compiled from: PG */
public final /* synthetic */ class C13578c implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C13578c f41575a = new C13578c();

    private /* synthetic */ C13578c() {
    }

    public final Object apply(Object obj) {
        Location location = (Location) obj;
        if (location == null) {
            return null;
        }
        C63178k kVar = (C63178k) C63179l.f170583h.createBuilder();
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
        C63179l lVar = (C63179l) kVar.instance;
        C63175h hVar3 = (C63175h) gVar.build();
        hVar3.getClass();
        lVar.f170589e = hVar3;
        lVar.f170585a |= 16;
        long micros = TimeUnit.MILLISECONDS.toMicros(location.getTime());
        kVar.copyOnWrite();
        C63179l lVar2 = (C63179l) kVar.instance;
        lVar2.f170585a |= 4;
        lVar2.f170588d = micros;
        if (location.hasAccuracy()) {
            float accuracy = location.getAccuracy();
            kVar.copyOnWrite();
            C63179l lVar3 = (C63179l) kVar.instance;
            lVar3.f170585a |= 128;
            double d = (double) accuracy;
            Double.isNaN(d);
            lVar3.f170590f = (float) (d * 1000.0d);
        }
        return (C63179l) kVar.build();
    }
}
