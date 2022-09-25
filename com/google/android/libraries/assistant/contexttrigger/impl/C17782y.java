package com.google.android.libraries.assistant.contexttrigger.impl;

import android.accounts.Account;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.impl.y */
/* compiled from: PG */
public final /* synthetic */ class C17782y implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C48919u f51046a;

    public /* synthetic */ C17782y(C48919u uVar) {
        this.f51046a = uVar;
    }

    public final Object apply(Object obj) {
        Account account = (Account) obj;
        if (!account.name.equals(this.f51046a.f126590c)) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(account);
    }
}
