package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c;

import com.google.android.apps.gsa.opa.smartspace.p6455d.C83767j;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.e */
/* compiled from: PG */
final class C110545e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ long f308184a;

    /* renamed from: b */
    final /* synthetic */ C110547g f308185b;

    public C110545e(C110547g gVar, long j) {
        this.f308185b = gVar;
        this.f308184a = j;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) this.f308185b.f308197j.mo56226d()).mo56372aa(26519)).mo56386p("Failed to get next alarm from proto store, scheduling a new alarm.");
        C110547g gVar = this.f308185b;
        gVar.mo98762a(this.f308184a, gVar.f308198k);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        long j = ((C83767j) obj).f228316b;
        long j2 = this.f308184a;
        if (j2 == j) {
            ((C58970a) ((C58970a) this.f308185b.f308197j.mo56224b()).mo56372aa(26520)).mo56386p("Next alarm time is unchanged, do not reschedule alarm.");
            return;
        }
        C110547g gVar = this.f308185b;
        gVar.mo98762a(j2, gVar.f308198k);
    }
}
