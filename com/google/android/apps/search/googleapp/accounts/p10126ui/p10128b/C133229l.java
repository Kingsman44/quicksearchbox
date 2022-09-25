package com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b.l */
/* compiled from: PG */
public final /* synthetic */ class C133229l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Boolean f363118a;

    public /* synthetic */ C133229l(Boolean bool) {
        this.f363118a = bool;
    }

    public final Object apply(Object obj) {
        Boolean bool = this.f363118a;
        C133233p pVar = (C133233p) obj;
        if (bool == null) {
            C133232o oVar = (C133232o) pVar.toBuilder();
            oVar.copyOnWrite();
            C133233p pVar2 = (C133233p) oVar.instance;
            pVar2.f363143a &= -3;
            pVar2.f363145c = false;
            return (C133233p) oVar.build();
        }
        C133232o oVar2 = (C133232o) pVar.toBuilder();
        boolean booleanValue = bool.booleanValue();
        oVar2.copyOnWrite();
        C133233p pVar3 = (C133233p) oVar2.instance;
        pVar3.f363143a |= 2;
        pVar3.f363145c = booleanValue;
        return (C133233p) oVar2.build();
    }
}
