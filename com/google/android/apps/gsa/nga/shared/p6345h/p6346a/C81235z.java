package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81328x;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.z */
/* compiled from: PG */
public final /* synthetic */ class C81235z implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C81235z f222377a = new C81235z();

    private /* synthetic */ C81235z() {
    }

    public final Object apply(Object obj) {
        C81237ab abVar = (C81237ab) obj;
        int i = (abVar.f222382a & 65536) != 0 ? abVar.f222405x : 0;
        C81328x xVar = (C81328x) abVar.toBuilder();
        xVar.copyOnWrite();
        C81237ab abVar2 = (C81237ab) xVar.instance;
        abVar2.f222382a = 65536 | abVar2.f222382a;
        abVar2.f222405x = i + 1;
        return (C81237ab) xVar.build();
    }
}
