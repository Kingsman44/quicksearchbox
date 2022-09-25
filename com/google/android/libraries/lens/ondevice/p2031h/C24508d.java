package com.google.android.libraries.lens.ondevice.p2031h;

import com.google.android.libraries.lens.ondevice.p2024d.C24424r;
import com.google.android.libraries.lens.ondevice.p2037n.C24805p;
import com.google.android.libraries.lens.ondevice.p2037n.C24808s;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.lens.ondevice.h.d */
/* compiled from: PG */
public final class C24508d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C24424r f67125a;

    /* renamed from: b */
    final /* synthetic */ C24509e f67126b;

    public C24508d(C24509e eVar, C24424r rVar) {
        this.f67126b = eVar;
        this.f67125a = rVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C24509e.f67127a.mo56225c()).mo56382g(th)).mo56372aa(48812)).mo56389s("Cascade load failed %s", th);
        this.f67126b.f67129c.mo29947f(C24805p.ENGINE_INIT_ERROR, (C24808s) null);
        this.f67126b.f67131e.remove(this.f67125a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        ((C58970a) ((C58970a) C24509e.f67127a.mo56224b()).mo56372aa(48813)).mo56389s("Cascade %s loaded successfully", (C24424r) obj);
        for (C24424r rVar : this.f67126b.f67131e.keySet()) {
        }
        this.f67126b.f67129c.mo29947f(C24805p.ENGINE_INIT_SUCCESS, (C24808s) null);
    }
}
