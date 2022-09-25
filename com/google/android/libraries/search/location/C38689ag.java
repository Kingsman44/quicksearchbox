package com.google.android.libraries.search.location;

import android.content.Context;
import com.google.android.libraries.search.location.p3029a.C38627bs;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.location.ag */
/* compiled from: PG */
public final class C38689ag implements C38683aa {

    /* renamed from: a */
    public final Context f102162a;

    /* renamed from: b */
    public final C38717w f102163b;

    /* renamed from: c */
    private final Optional f102164c;

    public C38689ag(Context context, C38717w wVar, Optional optional) {
        this.f102162a = context;
        this.f102163b = wVar;
        this.f102164c = optional;
    }

    /* renamed from: e */
    private final C60870cx m67963e(C38726z zVar, C38688af afVar) {
        if (C38724x.m68008a(zVar.mo41552a(), zVar.mo41554c())) {
            return C47633f.m84733g(mo41547a()).mo51516i(new C38686ad(this, zVar, afVar), C60826bg.f164896a).mo51515h(new C38687ae(this), C60826bg.f164896a);
        }
        throw new IllegalArgumentException("AttributionId not in APPROVED_REAL_TIME_REQUESTERS.");
    }

    /* renamed from: a */
    public final C60870cx mo41547a() {
        if (this.f102164c.isEmpty()) {
            return C60856cj.m92900i(true);
        }
        return ((C38627bs) this.f102164c.get()).mo41508d();
    }

    /* renamed from: b */
    public final C60870cx mo41548b(C38726z zVar) {
        return m67963e(zVar, new C38685ac(this));
    }

    /* renamed from: c */
    public final C60870cx mo41549c(C38726z zVar) {
        return m67963e(zVar, new C38684ab(this));
    }

    /* renamed from: d */
    public final C60870cx mo41550d(C39226b bVar, int i) {
        C38725y d = C38726z.m68011d(bVar);
        ((C38570a) d).f101954b = i;
        return mo41549c(d.mo41492a());
    }
}
