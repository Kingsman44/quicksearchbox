package com.google.apps.tiktok.account.data;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58565jt;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.ArrayList;

/* renamed from: com.google.apps.tiktok.account.data.x */
/* compiled from: PG */
public final /* synthetic */ class C46329x implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C46155ag f121319a;

    /* renamed from: b */
    public final /* synthetic */ C58528ij f121320b;

    public /* synthetic */ C46329x(C46155ag agVar, C58528ij ijVar) {
        this.f121319a = agVar;
        this.f121320b = ijVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C46155ag agVar = this.f121319a;
        C58528ij ijVar = this.f121320b;
        C46159ak akVar = (C46159ak) agVar.f121067a.mo17428b();
        boolean z = akVar.f121078a;
        C58495hd a = akVar.mo50228a();
        ArrayList arrayList = new ArrayList(1);
        C58565jt jtVar = new C58565jt(((C58759qy) ijVar).f156534a);
        while (jtVar.hasNext()) {
            String str = (String) jtVar.next();
            C58838bb.m90873h(a.containsKey(str), "No AccountProvider found for type: %s", str);
            arrayList.add(akVar.mo50230c(str, (C46326u) a.get(str)));
        }
        return C60922j.m93045h(akVar.mo50229b(arrayList), C47810es.m84966f(new C46330y(agVar, ijVar)), agVar.f121074h);
    }
}
