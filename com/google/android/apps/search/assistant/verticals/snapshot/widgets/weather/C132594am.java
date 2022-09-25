package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather;

import android.location.Location;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.p4479cg.C58078j;
import com.google.p4479cg.C58079k;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.am */
/* compiled from: PG */
public final /* synthetic */ class C132594am implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C132594am f361855a = new C132594am();

    private /* synthetic */ C132594am() {
    }

    public final Object apply(Object obj) {
        Location location = (Location) obj;
        if (location != null) {
            C58078j jVar = (C58078j) C58079k.f155250c.createBuilder();
            double latitude = location.getLatitude();
            jVar.copyOnWrite();
            ((C58079k) jVar.instance).f155252a = latitude;
            double longitude = location.getLongitude();
            jVar.copyOnWrite();
            ((C58079k) jVar.instance).f155253b = longitude;
            return (C58079k) jVar.build();
        }
        ((C59052c) ((C59052c) C132606ay.f361884a.mo56226d()).mo56372aa(39741)).mo56386p("Null location returned by Location Supplier");
        throw new C132654q();
    }
}
