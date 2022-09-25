package com.google.android.apps.gsa.p8867w.p8872c.p8873a;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.staticplugins.opa.p8363f.C109029a;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.w.c.a.c */
/* compiled from: PG */
public final /* synthetic */ class C118738c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C86124t f331206a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f331207b;

    public /* synthetic */ C118738c(C86124t tVar, C58833ax axVar) {
        this.f331206a = tVar;
        this.f331207b = axVar;
    }

    public final Object apply(Object obj) {
        C86124t tVar = this.f331206a;
        C58833ax axVar = this.f331207b;
        Account account = (Account) obj;
        boolean z = false;
        if (tVar.mo79746e(C90086ek.f250444dJ) && ((C109029a) axVar.mo56107c()).mo97401f(account) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
