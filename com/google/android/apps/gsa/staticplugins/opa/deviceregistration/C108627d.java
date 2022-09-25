package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.app.Activity;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import com.google.android.apps.gsa.shared.util.p7159c.C90891ay;
import com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8359ui.location.AddressEditFragment;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.d */
/* compiled from: PG */
final class C108627d extends C90891ay {

    /* renamed from: a */
    final /* synthetic */ C108654e f302163a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108627d(C108654e eVar) {
        super("Get current location");
        this.f302163a = eVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C108654e.f302200b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AddressFrag");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(24090)).mo56386p("Failed to get last location.");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Location location = (Location) obj;
        Activity activity = this.f302163a.getActivity();
        if (activity == null) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (location == null) {
            C59104x d = C108654e.f302200b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AddressFrag");
            ((C59052c) ((C59052c) d).mo56372aa(24093)).mo56386p("Received location is null.");
        } else {
            Double valueOf = Double.valueOf(location.getLatitude());
            Double valueOf2 = Double.valueOf(location.getLongitude());
            try {
                List<Address> fromLocation = new Geocoder(activity).getFromLocation(valueOf.doubleValue(), valueOf2.doubleValue(), 1);
                if (fromLocation == null || fromLocation.isEmpty()) {
                    C59104x d2 = C108654e.f302200b.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "AddressFrag");
                    ((C59052c) ((C59052c) d2).mo56372aa(24091)).mo56386p("Found no address for current location.");
                    return;
                }
                Address address = (Address) C58557jl.m90133n(fromLocation);
                String addressLine = address.getAddressLine(0);
                String addressLine2 = address.getAddressLine(1);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i <= address.getMaxAddressLineIndex(); i++) {
                    sb.append(address.getAddressLine(i));
                }
                AddressEditFragment addressEditFragment = this.f302163a.f302206h;
                addressEditFragment.f302442g = valueOf;
                addressEditFragment.f302443h = valueOf2;
                addressEditFragment.f302444i = addressLine;
                addressEditFragment.f302445j = addressLine2;
                addressEditFragment.f302446k = sb.toString();
                addressEditFragment.mo97131e();
            } catch (IOException unused) {
                C59104x c = C108654e.f302200b.mo56225c();
                c.mo56378ag(C58975e.f156826a, "AddressFrag");
                ((C59052c) ((C59052c) c).mo56372aa(24092)).mo56386p("Failed to parse current location.");
            }
        }
    }
}
