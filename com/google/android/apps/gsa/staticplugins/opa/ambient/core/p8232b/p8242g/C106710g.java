package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8242g;

import com.google.android.apps.gsa.opa.smartspace.C83807w;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.C106722b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.C106724d;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.C106725e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3860as.C49742ae;
import com.google.assistant.p4016z.C53691ap;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.g.g */
/* compiled from: PG */
public final class C106710g extends C106725e {

    /* renamed from: a */
    public static final C58495hd f297406a;

    /* renamed from: d */
    private static final C58495hd f297407d;

    /* renamed from: b */
    public final C83807w f297408b;

    /* renamed from: c */
    public final C58495hd f297409c;

    /* renamed from: e */
    private final C106724d f297410e;

    /* renamed from: f */
    private final C60887da f297411f;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C53691ap.STORE, "HP_SHOPPING_LOCATION_PROFILE");
        gzVar.mo55429h(C53691ap.TRANSIT_STATION, "HP_TRANSIT_STATION_PROFILE");
        gzVar.mo55429h(C53691ap.RESTAURANT, "HP_RESTAURANT_PROFILE");
        gzVar.mo55429h(C53691ap.GAS_STATION, "HP_GAS_STATION_PROFILE");
        gzVar.mo55429h(C53691ap.PARKING, "HP_PARKING_PROFILE");
        gzVar.mo55429h(C53691ap.CAFE, "HP_CAFE_PROFILE");
        gzVar.mo55429h(C53691ap.SHOPPING_CENTER, "HP_SHOPPING_CENTER_PROFILE");
        gzVar.mo55429h(C53691ap.HOME, "HP_HOME");
        gzVar.mo55429h(C53691ap.WORK, "HP_WORK");
        f297407d = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(C53691ap.STORE, C118569b.SMARTSPACE_HABITS_LOCATION_STORE_PROFILE_PRESENT);
        gzVar2.mo55429h(C53691ap.TRANSIT_STATION, C118569b.SMARTSPACE_HABITS_LOCATION_TRANSIT_STATION_PROFILE_PRESENT);
        gzVar2.mo55429h(C53691ap.RESTAURANT, C118569b.SMARTSPACE_HABITS_LOCATION_RESTAURANT_PROFILE_PRESENT);
        gzVar2.mo55429h(C53691ap.GAS_STATION, C118569b.SMARTSPACE_HABITS_LOCATION_GAS_STATION_PROFILE_PRESENT);
        gzVar2.mo55429h(C53691ap.PARKING, C118569b.SMARTSPACE_HABITS_LOCATION_PARKING_PROFILE_PRESENT);
        gzVar2.mo55429h(C53691ap.CAFE, C118569b.SMARTSPACE_HABITS_LOCATION_CAFE_PROFILE_PRESENT);
        gzVar2.mo55429h(C53691ap.SHOPPING_CENTER, C118569b.SMARTSPACE_HABITS_LOCATION_SHOPPING_CENTER_PROFILE_PRESENT);
        f297406a = gzVar2.mo55427f(false);
    }

    public C106710g(C106724d dVar, C60887da daVar, C83807w wVar) {
        this.f297410e = dVar;
        this.f297411f = daVar;
        this.f297408b = wVar;
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C53691ap.STORE, new C106722b());
        gzVar.mo55429h(C53691ap.TRANSIT_STATION, new C106722b());
        gzVar.mo55429h(C53691ap.RESTAURANT, new C106722b());
        gzVar.mo55429h(C53691ap.GAS_STATION, new C106722b());
        gzVar.mo55429h(C53691ap.PARKING, new C106722b());
        gzVar.mo55429h(C53691ap.CAFE, new C106722b());
        gzVar.mo55429h(C53691ap.SHOPPING_CENTER, new C106722b());
        gzVar.mo55429h(C53691ap.HOME, new C106722b());
        gzVar.mo55429h(C53691ap.WORK, new C106722b());
        this.f297409c = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public final C60870cx mo95618a(C53691ap apVar) {
        String str = (String) f297407d.get(apVar);
        if (str == null) {
            return C60856cj.m92900i(Optional.empty());
        }
        C60870cx a = this.f297410e.mo95624a(C65753ak.HABITS_AA_PROFILES, C49742ae.f128440a, str);
        C106709f fVar = new C106709f(this, apVar);
        return C60922j.m93044g(a, C47810es.m84963c(fVar), this.f297411f);
    }

    /* renamed from: b */
    public final void mo95606b(C65753ak akVar) {
        if (akVar == C65753ak.HABITS_AA_PROFILES) {
            Map.EL.forEach(this.f297409c, new C106706c(this));
        }
    }
}
