package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c;

import com.google.android.apps.gsa.opa.smartspace.p6455d.C83766i;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83767j;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.d */
/* compiled from: PG */
public final /* synthetic */ class C110544d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ long f308183a;

    public /* synthetic */ C110544d(long j) {
        this.f308183a = j;
    }

    public final Object apply(Object obj) {
        long j = this.f308183a;
        long j2 = C110547g.f308188a;
        C83766i iVar = (C83766i) ((C83767j) obj).toBuilder();
        iVar.copyOnWrite();
        C83767j jVar = (C83767j) iVar.instance;
        jVar.f228315a |= 1;
        jVar.f228316b = j;
        return (C83767j) iVar.build();
    }
}
