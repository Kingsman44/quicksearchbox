package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.p9923a;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130808j;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.C130732b;
import com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.C130733c;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3860as.C49742ae;
import com.google.assistant.p4016z.C53691ap;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.ExecutorService;
import p3186j$.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.b.a.t */
/* compiled from: PG */
public final class C130725t implements C130733c, C130732b {

    /* renamed from: a */
    public static final C58495hd f357910a;

    /* renamed from: b */
    public final C130895ag f357911b;

    /* renamed from: c */
    public final C58495hd f357912c;

    /* renamed from: d */
    private final C38469m f357913d;

    /* renamed from: e */
    private final ExecutorService f357914e;

    /* renamed from: f */
    private final C130808j f357915f;

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
        f357910a = gzVar.mo55427f(false);
    }

    public C130725t(C130603a aVar, C38469m mVar, C130895ag agVar, C130808j jVar, ExecutorService executorService) {
        aVar.mo109740b(this);
        this.f357913d = mVar;
        this.f357911b = agVar;
        this.f357915f = jVar;
        this.f357914e = executorService;
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C53691ap.STORE, new C130712h());
        gzVar.mo55429h(C53691ap.TRANSIT_STATION, new C130712h());
        gzVar.mo55429h(C53691ap.RESTAURANT, new C130712h());
        gzVar.mo55429h(C53691ap.GAS_STATION, new C130712h());
        gzVar.mo55429h(C53691ap.PARKING, new C130712h());
        gzVar.mo55429h(C53691ap.CAFE, new C130712h());
        gzVar.mo55429h(C53691ap.SHOPPING_CENTER, new C130712h());
        gzVar.mo55429h(C53691ap.HOME, new C130712h());
        gzVar.mo55429h(C53691ap.WORK, new C130712h());
        this.f357912c = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public final C60870cx mo109805a(C53691ap apVar) {
        C60870cx a = this.f357915f.mo109812a();
        C130718m mVar = new C130718m(this, apVar);
        return C60922j.m93045h(a, C47810es.m84966f(mVar), this.f357914e);
    }

    /* renamed from: b */
    public final void mo109800b(C21850cf cfVar) {
        Map.EL.forEach(this.f357912c, new C130719n(this, cfVar));
    }

    /* renamed from: c */
    public final C60870cx mo109806c(C53691ap apVar) {
        String str = (String) f357910a.get(apVar);
        if (str == null) {
            return C60856cj.m92900i(Optional.empty());
        }
        C60870cx b = this.f357913d.mo41431b(C65753ak.HABITS_AA_PROFILES, str, C63662ac.f172144a, C49742ae.f128440a);
        C130721p pVar = new C130721p(this, str);
        return C60922j.m93044g(b, C47810es.m84963c(pVar), this.f357914e);
    }
}
