package com.google.apps.tiktok.account.data;

import com.google.common.base.C58817ah;

/* renamed from: com.google.apps.tiktok.account.data.aa */
/* compiled from: PG */
public final /* synthetic */ class C46149aa implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C46155ag f121061a;

    public /* synthetic */ C46149aa(C46155ag agVar) {
        this.f121061a = agVar;
    }

    public final Object apply(Object obj) {
        C46155ag agVar = this.f121061a;
        C46162an anVar = (C46162an) ((C46163ao) obj).toBuilder();
        long b = agVar.f121070d.mo26870b();
        anVar.copyOnWrite();
        C46163ao aoVar = (C46163ao) anVar.instance;
        aoVar.f121084a |= 1;
        aoVar.f121085b = b;
        int i = agVar.f121073g;
        anVar.copyOnWrite();
        C46163ao aoVar2 = (C46163ao) anVar.instance;
        aoVar2.f121084a |= 2;
        aoVar2.f121086c = (long) i;
        return (C46163ao) anVar.build();
    }
}
