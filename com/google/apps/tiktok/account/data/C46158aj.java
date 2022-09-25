package com.google.apps.tiktok.account.data;

import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.apps.tiktok.account.data.aj */
/* compiled from: PG */
public final /* synthetic */ class C46158aj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f121076a;

    /* renamed from: b */
    public final /* synthetic */ C46326u f121077b;

    public /* synthetic */ C46158aj(String str, C46326u uVar) {
        this.f121076a = str;
        this.f121077b = uVar;
    }

    public final Object apply(Object obj) {
        String str = this.f121076a;
        C46326u uVar = this.f121077b;
        C58485gu guVar = (C58485gu) obj;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C46215j jVar = (C46215j) guVar.get(i);
            C58838bb.m90891z(str.equals(jVar.f121165j), "AccountProvider %s provides account(s) of different type from the declared one. Declared type: %s provided type: %s", uVar, str, jVar.f121165j);
        }
        return guVar;
    }
}
