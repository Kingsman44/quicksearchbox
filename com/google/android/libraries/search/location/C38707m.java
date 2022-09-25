package com.google.android.libraries.search.location;

import com.google.android.gms.location.C144889at;
import com.google.android.gms.location.LocationRequest;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.location.m */
/* compiled from: PG */
public final /* synthetic */ class C38707m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C38712r f102205a;

    /* renamed from: b */
    public final /* synthetic */ LocationRequest f102206b;

    /* renamed from: c */
    public final /* synthetic */ C144889at f102207c;

    /* renamed from: d */
    public final /* synthetic */ C39226b f102208d;

    public /* synthetic */ C38707m(C38712r rVar, LocationRequest locationRequest, C144889at atVar, C39226b bVar) {
        this.f102205a = rVar;
        this.f102206b = locationRequest;
        this.f102207c = atVar;
        this.f102208d = bVar;
    }

    public final void run() {
        C38712r rVar = this.f102205a;
        LocationRequest locationRequest = this.f102206b;
        C144889at atVar = this.f102207c;
        C39226b bVar = this.f102208d;
        C60870cx b = rVar.f102227g.mo51512b(new C38708n(rVar, atVar), rVar.f102226f);
        C60870cx a = rVar.f102222b.mo41547a();
        C46459k.m82829b(C47638k.m84751b(b, a).mo51521b(new C38701g(rVar, a, atVar, bVar, locationRequest), C60826bg.f164896a), "Error creating cacheable location request", new Object[0]);
    }
}
