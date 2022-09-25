package com.google.android.apps.gsa.staticplugins.bisto.p7481af;

import android.content.Intent;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.af.f */
/* compiled from: PG */
public final /* synthetic */ class C95149f implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C95144aj f266229a;

    public /* synthetic */ C95149f(C95144aj ajVar) {
        this.f266229a = ajVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C95144aj ajVar = this.f266229a;
        C58976aa aaVar = C58975e.f156826a;
        if (ajVar.mo89063D()) {
            return C118826c.f331423b;
        }
        ajVar.mo89073y();
        if (!((C89656k) ajVar.f266203k.mo27525b()).mo83553h("key_personal_results_settings_migration_complete")) {
            new C90873ag(((C89492cd) ajVar.f266201i.mo27525b()).mo83402i(), ajVar.f266199g, "get-device-infos", new C95153j(ajVar)).mo85223a(new C95154k(ajVar));
        }
        ajVar.mo79080r();
        ajVar.mo79079q();
        ajVar.mo79069f();
        return ajVar.mo89069u(new Intent("com.google.android.apps.gsa.shared.bisto.ACTION_DEVICE_BOOT_OR_APP_INSTALL"), true);
    }
}
