package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81293bx;
import com.google.android.apps.gsa.nga.shared.p6345h.C81294by;
import com.google.android.apps.gsa.nga.shared.p6345h.C81297ca;
import com.google.android.apps.gsa.nga.shared.p6345h.C81328x;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.l */
/* compiled from: PG */
public final /* synthetic */ class C127795l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f351758a;

    public /* synthetic */ C127795l(String str) {
        this.f351758a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f351758a;
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
        C81297ca a = C127804u.m208819a(caVar, (C81294by) bxVar.build());
        C81328x xVar = (C81328x) abVar.toBuilder();
        xVar.copyOnWrite();
        C81237ab abVar2 = (C81237ab) xVar.instance;
        a.getClass();
        abVar2.f222383b = a;
        abVar2.f222382a |= 1;
        return (C81237ab) xVar.build();
    }
}
