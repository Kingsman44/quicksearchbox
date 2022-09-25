package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8489m;

import android.location.Location;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48602ar;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48603as;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48641cc;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48642cd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.m.b */
/* compiled from: PG */
public final /* synthetic */ class C111226b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C111227c f309530a;

    /* renamed from: b */
    public final /* synthetic */ long f309531b;

    public /* synthetic */ C111226b(C111227c cVar, long j) {
        this.f309530a = cVar;
        this.f309531b = j;
    }

    public final C60870cx apply(Object obj) {
        C111227c cVar = this.f309530a;
        long j = this.f309531b;
        Location location = (Location) obj;
        if (location == null) {
            return C111227c.m186307l(cVar.f309532a);
        }
        C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
        bvVar.copyOnWrite();
        ((C48635bx) bvVar.instance).f125708c = j;
        C48641cc ccVar = (C48641cc) C48642cd.f125720b.createBuilder();
        C48602ar arVar = (C48602ar) C48603as.f125613d.createBuilder();
        double latitude = location.getLatitude();
        arVar.copyOnWrite();
        ((C48603as) arVar.instance).f125615a = latitude;
        double longitude = location.getLongitude();
        arVar.copyOnWrite();
        ((C48603as) arVar.instance).f125616b = longitude;
        arVar.copyOnWrite();
        ((C48603as) arVar.instance).f125617c = j;
        ccVar.copyOnWrite();
        C48603as asVar = (C48603as) arVar.build();
        asVar.getClass();
        ((C48642cd) ccVar.instance).f125722a = asVar;
        bvVar.copyOnWrite();
        C48635bx bxVar = (C48635bx) bvVar.instance;
        C48642cd cdVar = (C48642cd) ccVar.build();
        cdVar.getClass();
        bxVar.f125707b = cdVar;
        bxVar.f125706a = 2;
        return C60856cj.m92900i((C48635bx) bvVar.build());
    }
}
