package com.google.apps.tiktok.account.data.p3611a;

import android.accounts.Account;
import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.account.data.a.e */
/* compiled from: PG */
public final /* synthetic */ class C46127e implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C46127e f121018a = new C46127e();

    private /* synthetic */ C46127e() {
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        C58838bb.m90869d(str != null, "AccountId was not a Google account");
        return new Account(str, "com.google");
    }
}
