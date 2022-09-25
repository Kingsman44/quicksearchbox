package com.google.android.libraries.search.location;

import android.location.Location;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.location.ad */
/* compiled from: PG */
public final /* synthetic */ class C38686ad implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C38689ag f102158a;

    /* renamed from: b */
    public final /* synthetic */ C38726z f102159b;

    /* renamed from: c */
    public final /* synthetic */ C38688af f102160c;

    public /* synthetic */ C38686ad(C38689ag agVar, C38726z zVar, C38688af afVar) {
        this.f102158a = agVar;
        this.f102159b = zVar;
        this.f102160c = afVar;
    }

    public final C60870cx apply(Object obj) {
        C38689ag agVar = this.f102158a;
        C38726z zVar = this.f102159b;
        C38688af afVar = this.f102160c;
        if (!((Boolean) obj).booleanValue()) {
            return C60866ct.f164955a;
        }
        Location b = agVar.f102163b.mo41570b(zVar.mo41554c(), zVar.mo41553b());
        if (b != null) {
            return C60856cj.m92900i(b);
        }
        return afVar.mo41551a(zVar);
    }
}
