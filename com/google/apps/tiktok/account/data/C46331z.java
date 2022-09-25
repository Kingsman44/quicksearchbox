package com.google.apps.tiktok.account.data;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.apps.tiktok.account.data.z */
/* compiled from: PG */
public final /* synthetic */ class C46331z implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C46155ag f121323a;

    public /* synthetic */ C46331z(C46155ag agVar) {
        this.f121323a = agVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C46155ag agVar = this.f121323a;
        C46159ak akVar = (C46159ak) agVar.f121067a.mo17428b();
        boolean z = akVar.f121078a;
        if (C58528ij.m90006F(akVar.mo50228a().values()).isEmpty()) {
            return agVar.mo50225b();
        }
        C46159ak akVar2 = (C46159ak) agVar.f121067a.mo17428b();
        boolean z2 = akVar2.f121078a;
        C58495hd a = akVar2.mo50228a();
        ArrayList arrayList = new ArrayList();
        C58800sl lA = a.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            arrayList.add(akVar2.mo50230c((String) entry.getKey(), (C46326u) entry.getValue()));
        }
        return C60922j.m93045h(C60922j.m93045h(C60838bs.m92859i(akVar2.mo50229b(arrayList)), C47810es.m84966f(new C46152ad(agVar)), agVar.f121074h), C47810es.m84966f(new C46153ae(agVar)), agVar.f121074h);
    }
}
