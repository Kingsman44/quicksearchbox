package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9331a;

import android.location.Location;
import com.google.android.apps.search.assistant.platform.pcp.p9327d.C123693c;
import com.google.android.apps.search.assistant.platform.pcp.p9327d.C123694d;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123789r;
import com.google.android.libraries.search.location.C38570a;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.a.h */
/* compiled from: PG */
public final /* synthetic */ class C123806h implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C123809k f342010a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f342011b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f342012c;

    /* renamed from: d */
    public final /* synthetic */ AccountId f342013d;

    /* renamed from: e */
    public final /* synthetic */ C123789r f342014e;

    public /* synthetic */ C123806h(C123809k kVar, C60870cx cxVar, C60870cx cxVar2, AccountId accountId, C123789r rVar) {
        this.f342010a = kVar;
        this.f342011b = cxVar;
        this.f342012c = cxVar2;
        this.f342013d = accountId;
        this.f342014e = rVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C123809k kVar = this.f342010a;
        C60870cx cxVar2 = this.f342011b;
        C60870cx cxVar3 = this.f342012c;
        AccountId accountId = this.f342013d;
        C123789r rVar = this.f342014e;
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar2)).booleanValue();
        boolean booleanValue2 = ((Boolean) C60856cj.m92909r(cxVar3)).booleanValue();
        if (!booleanValue) {
            ((C58970a) ((C58970a) kVar.f342029m.mo56224b()).mo56372aa(35254)).mo56386p("Missing location permission when processing flight landing events.");
            kVar.f342030n.mo109869E("MISSING_LOCATION_PERMISSION");
            if (kVar.f342020d) {
                ((C58970a) ((C58970a) kVar.f342029m.mo56224b()).mo56372aa(35255)).mo56386p("Skip the flight landing events because the location permission is missing.");
                return C60856cj.m92900i(false);
            }
        } else if (!kVar.f342022f || booleanValue2) {
            C123693c V = ((C123694d) C47245e.m84045a(kVar.f342017a, C123694d.class, accountId)).mo106103V();
            C39226b bVar = C39226b.TAG_ASSISTANT_WEATHER_AT_FLIGHT_LANDING_LO;
            C58976aa aaVar = C58975e.f156826a;
            if (!((C58759qy) C123693c.f341661b).f156534a.equals(bVar)) {
                C59104x d = C123693c.f341660a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "PCP.LocationService");
                ((C59052c) ((C59052c) d).mo56372aa(35347)).mo56387q("Real-time location access is not allowed for attribution id: %s", bVar.getNumber());
                cxVar = C60866ct.f164955a;
            } else {
                C38725y d2 = C38726z.m68011d(bVar);
                ((C38570a) d2).f101954b = 3;
                cxVar = V.f341662c.mo41548b(d2.mo41492a());
            }
            int i = rVar.f341965a;
            if ((i & 16) == 0 || rVar.f341970f == C59203do.f157270a || (i & 32) == 0 || rVar.f341971g == C59203do.f157270a) {
                ((C58970a) ((C58970a) kVar.f342029m.mo56224b()).mo56372aa(35252)).mo56386p("Flight landing destination airport location is missing.");
                kVar.f342030n.mo109869E("NO_AIRPORT_LOCATION");
                if (kVar.f342021e) {
                    return C60856cj.m92900i(false);
                }
            } else {
                Location location = new Location("airport");
                location.setLatitude(rVar.f341970f);
                location.setLongitude(rVar.f341971g);
                C123799a aVar = new C123799a(kVar, location);
                return C60922j.m93045h(cxVar, C47810es.m84966f(aVar), kVar.f342018b);
            }
        } else {
            ((C58970a) ((C58970a) kVar.f342029m.mo56224b()).mo56372aa(35253)).mo56386p("Skip the flight landing events because the location history is not enabled by user.");
            kVar.f342030n.mo109869E("LOCATION_HISTORY_DISABLED");
            return C60856cj.m92900i(false);
        }
        return C60856cj.m92900i(true);
    }
}
