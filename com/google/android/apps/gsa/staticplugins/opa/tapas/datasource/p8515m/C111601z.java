package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.z */
/* compiled from: PG */
final class C111601z implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Map f310336a;

    /* renamed from: b */
    final /* synthetic */ C111575aa f310337b;

    public C111601z(C111575aa aaVar, Map map) {
        this.f310337b = aaVar;
        this.f310336a = map;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C111575aa.f310299a.mo56226d()).mo56382g(th)).mo56372aa(27273)).mo56386p("#preloadAndroidShortcuts - failure extracting appUsageMap");
        C111575aa aaVar = this.f310337b;
        aaVar.f310300b = aaVar.mo99180e(this.f310336a, new HashMap());
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C111575aa aaVar = this.f310337b;
        aaVar.f310300b = aaVar.mo99180e(this.f310336a, (Map) obj);
    }
}
