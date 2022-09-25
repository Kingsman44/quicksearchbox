package com.google.android.libraries.search.location;

import com.google.android.gms.location.C144889at;
import com.google.android.gms.location.LocationRequest;
import com.google.android.libraries.p3339v.C43205e;
import com.google.android.libraries.search.location.p3029a.p3031b.C38608a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.search.location.p */
/* compiled from: PG */
public final /* synthetic */ class C38710p implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C38712r f102214a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f102215b;

    /* renamed from: c */
    public final /* synthetic */ C144889at f102216c;

    /* renamed from: d */
    public final /* synthetic */ C39226b f102217d;

    /* renamed from: e */
    public final /* synthetic */ LocationRequest f102218e;

    public /* synthetic */ C38710p(C38712r rVar, C60870cx cxVar, C144889at atVar, C39226b bVar, LocationRequest locationRequest) {
        this.f102214a = rVar;
        this.f102215b = cxVar;
        this.f102216c = atVar;
        this.f102217d = bVar;
        this.f102218e = locationRequest;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C38712r rVar = this.f102214a;
        C60870cx cxVar = this.f102215b;
        C144889at atVar = this.f102216c;
        C39226b bVar = this.f102217d;
        LocationRequest locationRequest = this.f102218e;
        if (!((Boolean) C60856cj.m92909r(cxVar)).booleanValue()) {
            throw new C38608a();
        } else if (!rVar.f102225e.containsKey(atVar)) {
            return C60866ct.f164955a;
        } else {
            C60870cx b = C43205e.m76192b(rVar.f102228h.mo41528b(bVar).mo120479e(locationRequest, (C144889at) rVar.f102225e.get(atVar), rVar.f102224d.getMainLooper()));
            C38691ai.m67970a(b, new C38703i(rVar, atVar, bVar));
            return b;
        }
    }
}
