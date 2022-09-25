package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import com.google.common.base.C58839bc;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.bk */
/* compiled from: PG */
public final class C86030bk implements C58839bc {

    /* renamed from: a */
    private final Set f232592a;

    public C86030bk(Set set) {
        this.f232592a = set;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo5941a(Object obj) {
        Account account = (Account) obj;
        account.getClass();
        return this.f232592a.contains(account.name);
    }
}
