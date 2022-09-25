package com.google.apps.tiktok.account.data.p3614c;

import com.google.apps.tiktok.account.data.C46155ag;
import com.google.apps.tiktok.account.data.C46159ak;
import com.google.apps.tiktok.account.data.C46329x;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58565jt;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.apps.tiktok.account.data.c.c */
/* compiled from: PG */
public final /* synthetic */ class C46192c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C46194e f121125a;

    public /* synthetic */ C46192c(C46194e eVar) {
        this.f121125a = eVar;
    }

    public final C60870cx apply(Object obj) {
        C46194e eVar = this.f121125a;
        if (((Boolean) obj).booleanValue()) {
            return C60866ct.f164955a;
        }
        C46155ag agVar = eVar.f121128b;
        C58759qy qyVar = new C58759qy("pseudonymous");
        C58838bb.m90868c(!qyVar.isEmpty());
        C58565jt jtVar = new C58565jt(qyVar.f156534a);
        while (jtVar.hasNext()) {
            String str = (String) jtVar.next();
            str.getClass();
            C58838bb.m90868c(!str.isEmpty());
        }
        boolean z = ((C46159ak) agVar.f121067a.mo17428b()).f121078a;
        C60870cx b = agVar.f121071e.mo57305b(C47810es.m84965e(new C46329x(agVar, qyVar)), agVar.f121074h);
        agVar.mo50226c(b);
        return b;
    }
}
