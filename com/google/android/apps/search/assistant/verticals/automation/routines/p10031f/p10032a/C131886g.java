package com.google.android.apps.search.assistant.verticals.automation.routines.p10031f.p10032a;

import android.location.Address;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.p4479cg.C58078j;
import com.google.p4479cg.C58079k;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.f.a.g */
/* compiled from: PG */
public final /* synthetic */ class C131886g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f360143a;

    public /* synthetic */ C131886g(String str) {
        this.f360143a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f360143a;
        C58485gu guVar = (C58485gu) obj;
        if (guVar == null || guVar.isEmpty()) {
            C59052c cVar = (C59052c) C131893n.f360160a.mo56226d();
            cVar.mo56374ac(30, TimeUnit.SECONDS);
            ((C59052c) cVar.mo56372aa(39485)).mo56389s("Geocoding '%s' returns empty result", str);
            return Optional.empty();
        }
        C58078j jVar = (C58078j) C58079k.f155250c.createBuilder();
        double latitude = ((Address) guVar.get(0)).getLatitude();
        jVar.copyOnWrite();
        ((C58079k) jVar.instance).f155252a = latitude;
        double longitude = ((Address) guVar.get(0)).getLongitude();
        jVar.copyOnWrite();
        ((C58079k) jVar.instance).f155253b = longitude;
        return Optional.m71637of((C58079k) jVar.build());
    }
}
