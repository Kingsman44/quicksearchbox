package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81293bx;
import com.google.android.apps.gsa.nga.shared.p6345h.C81294by;
import com.google.android.apps.gsa.nga.shared.p6345h.C81297ca;
import com.google.android.apps.gsa.nga.shared.p6345h.C81328x;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.bo */
/* compiled from: PG */
public final /* synthetic */ class C81112bo implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f222234a;

    public /* synthetic */ C81112bo(String str) {
        this.f222234a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f222234a;
        C81237ab abVar = (C81237ab) obj;
        C81297ca caVar = abVar.f222383b;
        if (caVar == null) {
            caVar = C81297ca.f222540b;
        }
        C81293bx bxVar = (C81293bx) C81294by.f222536c.createBuilder();
        bxVar.copyOnWrite();
        C81294by byVar = (C81294by) bxVar.instance;
        str.getClass();
        byVar.f222538a |= 1;
        byVar.f222539b = str;
        C81297ca ag = C81122by.m129051ag(caVar, (C81294by) bxVar.build());
        C81328x xVar = (C81328x) abVar.toBuilder();
        xVar.copyOnWrite();
        C81237ab abVar2 = (C81237ab) xVar.instance;
        ag.getClass();
        abVar2.f222383b = ag;
        abVar2.f222382a |= 1;
        return (C81237ab) xVar.build();
    }
}
