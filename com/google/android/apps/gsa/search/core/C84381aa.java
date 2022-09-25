package com.google.android.apps.gsa.search.core;

import com.google.android.apps.gsa.search.core.google.gaia.C86045f;
import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90945k;

/* renamed from: com.google.android.apps.gsa.search.core.aa */
/* compiled from: PG */
public final class C84381aa extends C90945k {

    /* renamed from: a */
    final /* synthetic */ C91043j f229638a;

    /* renamed from: b */
    final /* synthetic */ C84413ad f229639b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84381aa(C84413ad adVar, C90929bz bzVar, C91043j jVar) {
        super("getGooglePlayServicesAvailability", bzVar, 1, 0);
        this.f229639b = adVar;
        this.f229638a = jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo77936a(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return Integer.valueOf(this.f229639b.mo77964a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo77937b(Object obj) {
        ((C86045f) this.f229638a).mo17709a((Integer) obj);
    }
}
