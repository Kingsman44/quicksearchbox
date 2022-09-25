package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81293bx;
import com.google.android.apps.gsa.nga.shared.p6345h.C81294by;
import com.google.android.apps.gsa.nga.shared.p6345h.C81297ca;
import com.google.android.apps.gsa.nga.shared.p6345h.C81328x;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.at */
/* compiled from: PG */
public final /* synthetic */ class C81090at implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f222209a;

    /* renamed from: b */
    public final /* synthetic */ String f222210b;

    public /* synthetic */ C81090at(String str, String str2) {
        this.f222209a = str;
        this.f222210b = str2;
    }

    public final Object apply(Object obj) {
        String str = this.f222209a;
        String str2 = this.f222210b;
        C81237ab abVar = (C81237ab) obj;
        C81297ca caVar = C81297ca.f222540b;
        str.getClass();
        C62995dn dnVar = abVar.f222384c;
        if (dnVar.containsKey(str)) {
            caVar = (C81297ca) dnVar.get(str);
        }
        C81293bx bxVar = (C81293bx) C81294by.f222536c.createBuilder();
        bxVar.copyOnWrite();
        C81294by byVar = (C81294by) bxVar.instance;
        str2.getClass();
        byVar.f222538a |= 1;
        byVar.f222539b = str2;
        C81297ca ag = C81122by.m129051ag(caVar, (C81294by) bxVar.build());
        C81328x xVar = (C81328x) abVar.toBuilder();
        xVar.mo74998c(str, ag);
        return (C81237ab) xVar.build();
    }
}
