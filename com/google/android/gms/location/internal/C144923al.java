package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.C144893ax;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;

/* renamed from: com.google.android.gms.location.internal.al */
/* compiled from: PG */
public final class C144923al extends C144893ax {

    /* renamed from: a */
    final /* synthetic */ LocationSettingsRequest f391886a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144923al(C143851w wVar, LocationSettingsRequest locationSettingsRequest) {
        super(wVar);
        this.f391886a = locationSettingsRequest;
    }

    /* renamed from: c */
    public final /* synthetic */ C143711ad mo117683c(Status status) {
        return new LocationSettingsResult(status, (LocationSettingsStates) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ void mo117681h(C143717b bVar) {
        ((C144930h) ((C144918ag) bVar).mo119451G()).mo120445p(this.f391886a, new C144917af(this));
    }
}
