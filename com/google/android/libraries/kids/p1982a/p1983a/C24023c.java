package com.google.android.libraries.kids.p1982a.p1983a;

import android.accounts.Account;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.kids.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C24023c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f65651a;

    public /* synthetic */ C24023c(String str) {
        this.f65651a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f65651a;
        for (Account account : (Account[]) obj) {
            if (str.equals(account.name)) {
                return true;
            }
        }
        return false;
    }
}
