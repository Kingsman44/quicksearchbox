package com.google.android.apps.gsa.sidekick.main.p7213i;

import com.google.android.apps.gsa.sidekick.shared.C91716e;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.p375ai.p378b.C7722hn;
import com.google.p375ai.p378b.C7744ii;

/* renamed from: com.google.android.apps.gsa.sidekick.main.i.b */
/* compiled from: PG */
final class C91441b implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C91442c f255060a;

    public C91441b(C91442c cVar) {
        this.f255060a = cVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C91442c.f255061a.mo56226d()).mo56382g(th)).mo56372aa(11693)).mo56386p("Error downloading entries.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C7722hn e;
        C91716e eVar = (C91716e) obj;
        if (eVar != null && (e = eVar.mo86028e()) != null && e.f26996b.size() != 0) {
            this.f255060a.f255063c.mo86660l((C7744ii) e.f26996b.get(0));
        }
    }
}
