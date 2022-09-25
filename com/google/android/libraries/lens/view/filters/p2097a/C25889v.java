package com.google.android.libraries.lens.view.filters.p2097a;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceLikelihood;
import com.google.android.libraries.places.api.p2437b.C31862r;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.filters.a.v */
/* compiled from: PG */
final class C25889v implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C25891x f70325a;

    public C25889v(C25891x xVar) {
        this.f70325a = xVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C25891x.f70327a.mo56226d()).mo56382g(th)).mo56372aa(49362)).mo56386p("Cannot find nearby places");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f70325a.f70333D.clear();
        for (PlaceLikelihood b : ((C31862r) obj).mo37443a()) {
            Place b2 = b.mo37526b();
            List<Place.Type> t = b2.mo37523t();
            if (t != null) {
                for (Place.Type contains : t) {
                    if (C25891x.f70328b.contains(contains) && C25891x.m47753l(b2) && !this.f70325a.f70333D.containsKey(b2.mo37518o())) {
                        this.f70325a.f70333D.put(b2.mo37518o(), this.f70325a.mo31052a(b2));
                    }
                }
            }
        }
    }
}
