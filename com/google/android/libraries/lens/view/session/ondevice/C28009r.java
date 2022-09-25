package com.google.android.libraries.lens.view.session.ondevice;

import com.google.android.libraries.lens.p2014e.C24229u;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.r */
/* compiled from: PG */
final class C28009r implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C28015x f76217a;

    /* renamed from: b */
    final /* synthetic */ C28017z f76218b;

    public C28009r(C28017z zVar, C28015x xVar) {
        this.f76218b = zVar;
        this.f76217a = xVar;
    }

    /* renamed from: c */
    private final void m52171c() {
        ((C58970a) ((C58970a) C28017z.f76238a.mo56224b()).mo56372aa(49962)).mo56389s("Query[%s] engine query complete", this.f76217a.f76229a.mo29680c());
        C28017z zVar = this.f76218b;
        zVar.f76247j = null;
        zVar.mo33471i();
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        m52171c();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C24229u uVar = (C24229u) obj;
        m52171c();
    }
}
