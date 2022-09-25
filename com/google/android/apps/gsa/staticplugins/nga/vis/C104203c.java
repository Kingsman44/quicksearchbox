package com.google.android.apps.gsa.staticplugins.nga.vis;

import com.google.android.apps.gsa.nga.api.C74718bv;
import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120058d;
import com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120059e;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.vis.c */
/* compiled from: PG */
final class C104203c implements C74718bv {

    /* renamed from: a */
    public static final C58974d f289872a = C58974d.m91136j();

    /* renamed from: b */
    public final Object f289873b = new Object();

    /* renamed from: c */
    public final C74720bx f289874c;

    /* renamed from: d */
    public final C120058d f289875d;

    /* renamed from: e */
    public C104205e f289876e;

    /* renamed from: f */
    public C120059e f289877f;

    public C104203c(C74720bx bxVar, C120058d dVar) {
        this.f289874c = bxVar;
        this.f289875d = dVar;
    }

    /* renamed from: a */
    public final void mo17497a(NgaState ngaState) {
        if (!mo94008c()) {
            mo94007b();
        }
    }

    /* renamed from: b */
    public final void mo94007b() {
        synchronized (this.f289873b) {
            C104205e eVar = this.f289876e;
            if (eVar != null) {
                ((C104196ao) eVar).mo93986g();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo94008c() {
        return this.f289874c.mo71089f().a();
    }
}
