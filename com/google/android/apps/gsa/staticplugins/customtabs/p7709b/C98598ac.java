package com.google.android.apps.gsa.staticplugins.customtabs.p7709b;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.b.ac */
/* compiled from: PG */
public final /* synthetic */ class C98598ac implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C98610ao f275382a;

    public /* synthetic */ C98598ac(C98610ao aoVar) {
        this.f275382a = aoVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C98610ao aoVar = this.f275382a;
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            C59104x d = C98610ao.f275402a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ExploreBottomBarCtrl");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(19162)).mo56386p("Could not display bottom bar");
            ((C89911f) aoVar.f275404c.mo27525b()).mo83756b(new C90452a(211, C89885b.CUSTOM_TABS_BOTTOMBAR_LOADING_FAILED_VALUE)).mo83721a();
        }
        return C118826c.f331422a;
    }
}
