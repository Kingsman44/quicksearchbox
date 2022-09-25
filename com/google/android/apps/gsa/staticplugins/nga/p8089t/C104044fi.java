package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.gsa.p1931p.C23320a;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.fi */
/* compiled from: PG */
final class C104044fi implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C104045fj f289498a;

    public C104044fi(C104045fj fjVar) {
        this.f289498a = fjVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C104045fj.f289499a.mo56225c()).mo56382g(th)).mo56372aa(21768)).mo56386p("Native download failed!");
        if (this.f289498a.mo93930a()) {
            this.f289498a.f289500b.mo93878a(C58837ba.m90858g(th.getMessage()));
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C23320a aVar = (C23320a) obj;
        ((C58970a) ((C58970a) C104045fj.f289499a.mo56224b()).mo56372aa(21769)).mo56389s("Native library update finished with: %s", aVar);
        if (this.f289498a.mo93930a()) {
            this.f289498a.f289500b.mo93878a(aVar.name());
        }
    }
}
