package com.google.android.apps.gsa.staticplugins.gearhead;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13039a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13040b;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.al */
/* compiled from: PG */
public final /* synthetic */ class C101301al implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C101325be f282712a;

    public /* synthetic */ C101301al(C101325be beVar) {
        this.f282712a = beVar;
    }

    public final Object apply(Object obj) {
        C101325be beVar = this.f282712a;
        C13040b bVar = (C13040b) obj;
        C13039a aVar = (C13039a) C13040b.f40476c.createBuilder();
        long b = beVar.f282775e.mo26870b();
        aVar.copyOnWrite();
        C13040b bVar2 = (C13040b) aVar.instance;
        bVar2.f40478a |= 1;
        bVar2.f40479b = b;
        return (C13040b) aVar.build();
    }
}
