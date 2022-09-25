package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.aq */
/* compiled from: PG */
final class C111706aq implements C22868d {

    /* renamed from: a */
    final /* synthetic */ boolean f310531a;

    /* renamed from: b */
    final /* synthetic */ C111708as f310532b;

    public C111706aq(C111708as asVar, boolean z) {
        this.f310532b = asVar;
        this.f310531a = z;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C111708as.f310535a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TapasZPCacheControl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(27323)).mo56386p("#loadCachedResponseFromStore - Failed to fetch personal response.");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C58976aa aaVar = C58975e.f156826a;
        this.f310532b.mo99212d(((Boolean) obj).booleanValue(), this.f310531a);
    }
}
