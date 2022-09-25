package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.dd */
/* compiled from: PG */
public final /* synthetic */ class C108287dd implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C108303dt f301240a;

    public /* synthetic */ C108287dd(C108303dt dtVar) {
        this.f301240a = dtVar;
    }

    public final Object apply(Object obj) {
        C108303dt dtVar = this.f301240a;
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            return C58485gu.m89845m();
        }
        C58480gp gpVar = new C58480gp(4);
        for (int i = 0; i < list.size(); i++) {
            C108267ck ckVar = dtVar.f301292w;
            ckVar.getClass();
            gpVar.mo55395g(ckVar.mo96721a((C105930ak) list.get(i)));
        }
        return gpVar.mo55394f();
    }
}
