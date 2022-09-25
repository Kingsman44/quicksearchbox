package com.google.android.libraries.lens.ondevice;

import com.google.android.libraries.lens.ondevice.p2024d.C24424r;
import com.google.android.libraries.lens.ondevice.p2037n.C24805p;
import com.google.android.libraries.lens.ondevice.p2037n.C24808s;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.lens.ondevice.n */
/* compiled from: PG */
final class C24766n implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C24823o f67672a;

    public C24766n(C24823o oVar) {
        this.f67672a = oVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C24823o.f67844a.mo56225c()).mo56382g(th)).mo56372aa(48754)).mo56389s("Cascade load failed %s", th);
        this.f67672a.f67846c.mo29947f(C24805p.ENGINE_INIT_ERROR, (C24808s) null);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C24424r rVar = (C24424r) obj;
        this.f67672a.f67846c.mo29947f(C24805p.ENGINE_INIT_SUCCESS, (C24808s) null);
    }
}
