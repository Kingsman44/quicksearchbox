package com.google.android.apps.search.fedora.p10106i;

import androidx.work.C4377aa;
import androidx.work.C4632m;
import androidx.work.C4645z;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.fedora.i.al */
/* compiled from: PG */
final class C132923al implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C132924am.f362584a.mo56226d()).mo56382g(th)).mo56372aa(39946)).mo56386p("startSyncInternal Failed!");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C4377aa aaVar = (C4377aa) obj;
        if (new C4645z(C4632m.f14549a).equals(aaVar)) {
            ((C59052c) ((C59052c) C132924am.f362584a.mo56224b()).mo56372aa(39948)).mo56386p("startSyncInternal Succeeded.");
        } else {
            ((C59052c) ((C59052c) C132924am.f362584a.mo56226d()).mo56372aa(39947)).mo56389s("startSyncInternal Failed with Result: %s!", aaVar);
        }
    }
}
