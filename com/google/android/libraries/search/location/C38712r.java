package com.google.android.libraries.search.location;

import android.content.Context;
import com.google.android.gms.location.C144889at;
import com.google.android.gms.location.LocationRequest;
import com.google.android.libraries.search.location.p3029a.p3032c.C38636a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.location.r */
/* compiled from: PG */
public final class C38712r implements C38700f {

    /* renamed from: a */
    public final Optional f102221a;

    /* renamed from: b */
    public final C38683aa f102222b;

    /* renamed from: c */
    public final C38717w f102223c;

    /* renamed from: d */
    public final Context f102224d;

    /* renamed from: e */
    public final Map f102225e = new HashMap();

    /* renamed from: f */
    public final Executor f102226f;

    /* renamed from: g */
    public final C47632e f102227g = new C47632e();

    /* renamed from: h */
    public final C38636a f102228h;

    public C38712r(C38636a aVar, Optional optional, C38683aa aaVar, Context context, Executor executor, C38717w wVar) {
        this.f102228h = aVar;
        this.f102221a = optional;
        this.f102222b = aaVar;
        this.f102223c = wVar;
        this.f102224d = context;
        this.f102226f = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C60870cx mo41561a(C144889at atVar, C39226b bVar) {
        return this.f102227g.mo51512b(new C38709o(this, atVar, bVar), this.f102226f);
    }

    /* renamed from: b */
    public final C60870cx mo41562b(LocationRequest locationRequest, C144889at atVar, C39226b bVar) {
        C60870cx a = mo41561a(atVar, bVar);
        C38691ai.m67970a(a, new C38707m(this, locationRequest, atVar, bVar));
        return a;
    }
}
