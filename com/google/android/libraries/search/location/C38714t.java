package com.google.android.libraries.search.location;

import com.google.android.gms.location.GeofencingRequest;
import com.google.android.libraries.p3339v.C43205e;
import com.google.android.libraries.search.location.p3029a.p3031b.C38608a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.location.t */
/* compiled from: PG */
public final /* synthetic */ class C38714t implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C38715u f102229a;

    /* renamed from: b */
    public final /* synthetic */ C39226b f102230b;

    /* renamed from: c */
    public final /* synthetic */ GeofencingRequest f102231c;

    /* renamed from: d */
    public final /* synthetic */ C38716v f102232d;

    public /* synthetic */ C38714t(C38715u uVar, C39226b bVar, GeofencingRequest geofencingRequest, C38716v vVar) {
        this.f102229a = uVar;
        this.f102230b = bVar;
        this.f102231c = geofencingRequest;
        this.f102232d = vVar;
    }

    public final C60870cx apply(Object obj) {
        C38715u uVar = this.f102229a;
        C39226b bVar = this.f102230b;
        GeofencingRequest geofencingRequest = this.f102231c;
        C38716v vVar = this.f102232d;
        if (((Boolean) obj).booleanValue()) {
            return C43205e.m76192b(uVar.f102234b.mo41529c(bVar).mo120367a(geofencingRequest, vVar.mo23455a(uVar.f102233a)));
        }
        throw new C38608a();
    }
}
