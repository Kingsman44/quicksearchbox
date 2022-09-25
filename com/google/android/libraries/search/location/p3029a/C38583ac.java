package com.google.android.libraries.search.location.p3029a;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.search.location.a.ac */
/* compiled from: PG */
public final class C38583ac implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C38633by f101985a;

    /* renamed from: b */
    final /* synthetic */ C38586af f101986b;

    public C38583ac(C38586af afVar, C38633by byVar) {
        this.f101986b = afVar;
        this.f101985a = byVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C38586af.f101990a.mo56226d()).mo56382g(th)).mo56372aa(53142)).mo56386p("Failed to set consent status.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        Collection.EL.stream(this.f101986b.f101998i.f102122a).forEach(new C38634bz(this.f101985a));
        C38586af afVar = this.f101986b;
        afVar.f102000k.mo50787a(afVar.mo41505a(), "compliance_location_data_access_app_setting");
    }
}
