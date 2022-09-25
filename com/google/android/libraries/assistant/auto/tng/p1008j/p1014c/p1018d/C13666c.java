package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.p1018d;

import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13703p;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13706s;
import com.google.android.libraries.assistant.auto.tng.p1008j.p1014c.C13707t;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.d.c */
/* compiled from: PG */
public final /* synthetic */ class C13666c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C13703p f41719a;

    public /* synthetic */ C13666c(C13703p pVar) {
        this.f41719a = pVar;
    }

    public final Object apply(Object obj) {
        C13703p pVar = this.f41719a;
        C59104x d = C13680e.f41747a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ClientOpDelegHandler");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g((Throwable) obj)).mo56372aa(44911)).mo56386p("Failed to execute delegated ClientOp");
        C13706s sVar = (C13706s) C13707t.f41806h.createBuilder();
        String str = pVar.f41798d;
        sVar.copyOnWrite();
        C13707t tVar = (C13707t) sVar.instance;
        str.getClass();
        tVar.f41808a |= 1;
        tVar.f41811d = str;
        String str2 = pVar.f41799e;
        sVar.copyOnWrite();
        C13707t tVar2 = (C13707t) sVar.instance;
        str2.getClass();
        tVar2.f41808a |= 2;
        tVar2.f41812e = str2;
        sVar.copyOnWrite();
        C13707t tVar3 = (C13707t) sVar.instance;
        tVar3.f41808a |= 4;
        tVar3.f41813f = true;
        sVar.copyOnWrite();
        ((C13707t) sVar.instance).f41814g = 3;
        return (C13707t) sVar.build();
    }
}
