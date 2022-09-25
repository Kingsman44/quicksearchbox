package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1094e;

import android.location.Location;
import com.google.android.gms.maps.C145005b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.e.l */
/* compiled from: PG */
public final /* synthetic */ class C15308l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C15312p f45965a;

    public /* synthetic */ C15308l(C15312p pVar) {
        this.f45965a = pVar;
    }

    public final C60870cx apply(Object obj) {
        C15312p pVar = this.f45965a;
        Location location = (Location) obj;
        if (location == null) {
            C59104x d = C15312p.f45970a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.LiveMapTileRndr");
            ((C59052c) ((C59052c) d).mo56372aa(46034)).mo56386p("#centerMapOnCurrentLocation got null location");
            return C60866ct.f164955a;
        }
        C145005b bVar = pVar.f45976g;
        if (bVar == null) {
            C59104x d2 = C15312p.f45970a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Morris.LiveMapTileRndr");
            ((C59052c) ((C59052c) d2).mo56372aa(46033)).mo56386p("#centerMapOnCurrentLocation map is null");
            return C60866ct.f164955a;
        }
        pVar.mo22184f(location, bVar.mo120496a().f392009b);
        return C60866ct.f164955a;
    }
}
