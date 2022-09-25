package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9331a;

import android.location.Location;
import com.google.android.apps.search.assistant.platform.pcp.p9327d.C123693c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.a.a */
/* compiled from: PG */
public final /* synthetic */ class C123799a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123809k f341995a;

    /* renamed from: b */
    public final /* synthetic */ Location f341996b;

    public /* synthetic */ C123799a(C123809k kVar, Location location) {
        this.f341995a = kVar;
        this.f341996b = location;
    }

    public final C60870cx apply(Object obj) {
        C123809k kVar = this.f341995a;
        Location location = this.f341996b;
        Location location2 = (Location) obj;
        if (location2 == null) {
            ((C58970a) ((C58970a) kVar.f342029m.mo56224b()).mo56372aa(35251)).mo56386p("Failed to find real time location.");
            kVar.f342030n.mo109869E("FAILED_TO_GET_REAL_TIME_LOCATION");
            return C60856cj.m92900i(Boolean.valueOf(!kVar.f342021e));
        }
        double a = C123693c.m203067a(location, location2);
        if (a >= ((double) kVar.f342024h)) {
            kVar.f342030n.mo109869E("FLIGHT_LANDING_DESTINATION_NOT_MATCHED_WITH_USER_LOCATION");
            kVar.f342030n.mo109928az(a);
            ((C58970a) ((C58970a) kVar.f342029m.mo56224b()).mo56372aa(35250)).mo56389s("Flight landing destination is not matched with user's real time location with distance %s meters.", Double.valueOf(a));
            if (kVar.f342021e) {
                return C60856cj.m92900i(false);
            }
        }
        kVar.f342030n.mo109869E("FLIGHT_LANDING_DESTINATION_MATCHED_WITH_USER_LOCATION");
        return C60856cj.m92900i(true);
    }
}
