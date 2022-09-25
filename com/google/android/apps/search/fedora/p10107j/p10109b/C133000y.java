package com.google.android.apps.search.fedora.p10107j.p10109b;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.search.fedora.j.b.y */
/* compiled from: PG */
final class C133000y implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof CancellationException) {
            C59071e eVar = C133001z.f362708a;
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C59104x d = C133001z.f362708a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "FedoraCacheServer");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(39958)).mo56386p("Failed to close the Ekho writer！");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
    }
}
