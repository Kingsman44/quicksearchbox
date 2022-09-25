package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.p8244a;

import com.google.android.apps.gsa.opa.smartspace.C83807w;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.h.a.d */
/* compiled from: PG */
final class C106716d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f297418a;

    /* renamed from: b */
    final /* synthetic */ boolean f297419b;

    /* renamed from: c */
    final /* synthetic */ C106717e f297420c;

    public C106716d(C106717e eVar, String str, boolean z) {
        this.f297420c = eVar;
        this.f297418a = str;
        this.f297419b = z;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f297420c.f297422b.mo77192a(C118569b.SMARTSPACE_HABITS_PROFILES_PRESENT, 0);
        this.f297420c.f297422b.mo77192a(C118569b.SMARTSPACE_HABITS_PROFILES_FAILURE, 1);
        if (this.f297419b) {
            this.f297420c.f297422b.mo77192a(C118569b.SMARTSPACE_HABITS_ON_FIRST_ACCESS_PRESENT, 0);
            this.f297420c.f297422b.mo77192a(C118569b.SMARTSPACE_HABITS_ON_FIRST_ACCESS_FAILURE, 1);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        String str = this.f297418a;
        if (str != null) {
            this.f297420c.f297423c.mo109938k(str, !guVar.isEmpty());
        }
        long j = 1;
        this.f297420c.f297422b.mo77192a(C118569b.SMARTSPACE_HABITS_PROFILES_PRESENT, true != guVar.isEmpty() ? 1 : 0);
        if (this.f297419b) {
            C83807w wVar = this.f297420c.f297422b;
            C118569b bVar = C118569b.SMARTSPACE_HABITS_ON_FIRST_ACCESS_PRESENT;
            if (true == guVar.isEmpty()) {
                j = 0;
            }
            wVar.mo77192a(bVar, j);
        }
    }
}
