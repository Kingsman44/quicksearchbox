package com.google.android.apps.gsa.p6487s3.producers;

import android.location.Location;
import android.util.Pair;
import com.google.android.apps.gsa.search.core.google.C85975du;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.s3.producers.k */
/* compiled from: PG */
final class C84312k implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C84313l f229450a;

    /* renamed from: b */
    private final C84316o f229451b;

    public C84312k(C84313l lVar, C84316o oVar) {
        this.f229450a = lVar;
        this.f229451b = oVar;
    }

    public final /* synthetic */ Object apply(Object obj) {
        Location location = (Location) obj;
        Location location2 = this.f229450a.f229452a;
        if ((location2 == null && location == null) || (location2 != null && location != null && location2.getLatitude() == location.getLatitude() && location2.getLongitude() == location.getLongitude() && location2.getAccuracy() == location.getAccuracy())) {
            C58976aa aaVar = C58975e.f156826a;
            return null;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C85975du duVar = new C85975du();
        duVar.f232481a = location;
        Pair pair = new Pair("X-Geo", duVar.mo79631a());
        C84316o oVar = this.f229451b;
        C84320s sVar = oVar.f229460a;
        sVar.f229471c.mo28207g("new S3 request update", new C84315n(sVar, oVar.f229461b, (String) pair.first, (String) pair.second));
        this.f229450a.f229452a = location;
        return null;
    }
}
