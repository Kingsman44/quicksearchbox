package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81328x;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.m */
/* compiled from: PG */
public final /* synthetic */ class C81222m implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C81222m f222364a = new C81222m();

    private /* synthetic */ C81222m() {
    }

    public final Object apply(Object obj) {
        C81237ab abVar = (C81237ab) obj;
        if (abVar.f222392k >= Integer.MAX_VALUE) {
            return abVar;
        }
        C81328x xVar = (C81328x) abVar.toBuilder();
        int i = abVar.f222392k;
        xVar.copyOnWrite();
        C81237ab abVar2 = (C81237ab) xVar.instance;
        abVar2.f222382a |= 32;
        abVar2.f222392k = i + 1;
        return (C81237ab) xVar.build();
    }
}
