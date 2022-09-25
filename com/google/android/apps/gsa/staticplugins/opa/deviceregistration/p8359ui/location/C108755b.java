package com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8359ui.location;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146036p;
import com.google.android.libraries.places.api.p2437b.C31856l;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ui.location.b */
/* compiled from: PG */
final class C108755b implements C146036p {

    /* renamed from: a */
    final /* synthetic */ AddressEditFragment f302461a;

    public C108755b(AddressEditFragment addressEditFragment) {
        this.f302461a = addressEditFragment;
    }

    /* renamed from: a */
    public final void mo22590a(C146006ab abVar) {
        if (!abVar.mo122491j()) {
            C59104x d = AddressEditFragment.f302437b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AddressEditFragment");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(abVar.mo122487f())).mo56372aa(24253)).mo56386p("Place query did not complete. Error");
            C108758e eVar = this.f302461a.f302451p;
            if (eVar != null) {
                eVar.mo97046e();
                return;
            }
            return;
        }
        C59071e eVar2 = AddressEditFragment.f302437b;
        C58976aa aaVar = C58975e.f156826a;
        LatLng b = ((C31856l) abVar.mo122488g()).mo37413a().mo37503b();
        if (b != null) {
            AddressEditFragment addressEditFragment = this.f302461a;
            addressEditFragment.f302442g = Double.valueOf(b.f392012a);
            addressEditFragment.f302443h = Double.valueOf(b.f392013b);
            addressEditFragment.mo97131e();
            C108758e eVar3 = this.f302461a.f302451p;
            if (eVar3 != null) {
                eVar3.mo97046e();
            }
        }
    }
}
