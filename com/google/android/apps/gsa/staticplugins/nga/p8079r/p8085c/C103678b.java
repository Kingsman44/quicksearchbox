package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80143bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80146bx;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80147by;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.b */
/* compiled from: PG */
public final /* synthetic */ class C103678b implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C103678b f288777a = new C103678b();

    private /* synthetic */ C103678b() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        String str;
        Exception exc = (Exception) obj;
        C80143bu buVar = (C80143bu) C80275dd.f220288c.createBuilder();
        C80146bx bxVar = (C80146bx) C80147by.f219936c.createBuilder();
        if (C58837ba.m90859h(exc.getMessage())) {
            str = "[AppActionsIcing] Icing search failed with unknown cause";
        } else {
            str = exc.getMessage();
        }
        bxVar.copyOnWrite();
        C80147by byVar = (C80147by) bxVar.instance;
        str.getClass();
        byVar.f219938a |= 1;
        byVar.f219939b = str;
        buVar.copyOnWrite();
        C80275dd ddVar = (C80275dd) buVar.instance;
        C80147by byVar2 = (C80147by) bxVar.build();
        byVar2.getClass();
        ddVar.f220291b = byVar2;
        ddVar.f220290a = 1;
        return (C80275dd) buVar.build();
    }
}
