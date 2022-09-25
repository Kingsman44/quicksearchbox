package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8466q.p8468b;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.features.d.ao;
import com.google.android.apps.gsa.assistant.settings.features.d.ap;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4479cg.C58078j;
import com.google.p4479cg.C58079k;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.q.b.d */
/* compiled from: PG */
public final /* synthetic */ class C110902d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C110903e f308941a;

    public /* synthetic */ C110902d(C110903e eVar) {
        this.f308941a = eVar;
    }

    public final Object apply(Object obj) {
        C110903e eVar = this.f308941a;
        Location location = (Location) obj;
        if (location == null) {
            return C58836b.f156633a;
        }
        ao createBuilder = ap.d.createBuilder();
        C58078j jVar = (C58078j) C58079k.f155250c.createBuilder();
        double longitude = location.getLongitude();
        jVar.copyOnWrite();
        ((C58079k) jVar.instance).f155253b = longitude;
        double latitude = location.getLatitude();
        jVar.copyOnWrite();
        ((C58079k) jVar.instance).f155252a = latitude;
        createBuilder.copyOnWrite();
        ap apVar = createBuilder.instance;
        C58079k kVar = (C58079k) jVar.build();
        kVar.getClass();
        apVar.b = kVar;
        apVar.a |= 1;
        try {
            List<Address> fromLocation = new Geocoder(eVar.f308945d.f308936a).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            if (!fromLocation.isEmpty() && fromLocation.get(0) != null) {
                Address address = fromLocation.get(0);
                String str = BuildConfig.FLAVOR;
                if (!C58837ba.m90859h(address.getLocality())) {
                    str = str.concat(String.valueOf(address.getLocality()));
                }
                if (!C58837ba.m90859h(address.getAdminArea())) {
                    if (!C58837ba.m90859h(address.getLocality())) {
                        str = str.concat(", ");
                    }
                    str = str.concat(String.valueOf(address.getAdminArea()));
                }
                createBuilder.copyOnWrite();
                ap apVar2 = createBuilder.instance;
                apVar2.a |= 2;
                apVar2.c = str;
                C58976aa aaVar = C58975e.f156826a;
                String.valueOf(address.getAddressLine(0));
                String.valueOf(address.getLocality());
                String.valueOf(address.getAdminArea());
            }
        } catch (IOException e) {
            C59104x d = C110903e.f308942a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "DefaultWeather");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(26851)).mo56386p("Cannot get address");
        }
        return C58833ax.m90834k(createBuilder.build());
    }
}
