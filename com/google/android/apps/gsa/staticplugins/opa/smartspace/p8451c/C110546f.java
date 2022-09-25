package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.f */
/* compiled from: PG */
final class C110546f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ long f308186a;

    /* renamed from: b */
    final /* synthetic */ C110547g f308187b;

    public C110546f(C110547g gVar, long j) {
        this.f308187b = gVar;
        this.f308186a = j;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) this.f308187b.f308197j.mo56226d()).mo56372aa(26521)).mo56388r("Failed to update next alarm proto store, next alarm = %s", this.f308186a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        ((C58970a) ((C58970a) this.f308187b.f308197j.mo56224b()).mo56372aa(26522)).mo56388r("Updated next alarm proto store successfully, next alarm = %s", this.f308186a);
    }
}
