package com.google.apps.tiktok.account.data.manager;

import com.google.common.base.C58817ah;

/* renamed from: com.google.apps.tiktok.account.data.manager.am */
/* compiled from: PG */
public final /* synthetic */ class C46240am implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C46241an f121213a;

    public /* synthetic */ C46240am(C46241an anVar) {
        this.f121213a = anVar;
    }

    public final Object apply(Object obj) {
        C46241an anVar = this.f121213a;
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue()) {
            anVar.f121214a.set(new C46243ap(anVar.f121217d.f121220a.getSharedPreferences("accounts", 0)));
        }
        return bool;
    }
}
