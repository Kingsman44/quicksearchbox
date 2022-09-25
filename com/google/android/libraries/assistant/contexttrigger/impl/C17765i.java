package com.google.android.libraries.assistant.contexttrigger.impl;

import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.impl.i */
/* compiled from: PG */
public final /* synthetic */ class C17765i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f51007a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f51008b;

    public /* synthetic */ C17765i(String str, AccountId accountId) {
        this.f51007a = str;
        this.f51008b = accountId;
    }

    public final Object apply(Object obj) {
        return this.f51007a.equals((String) obj) ? C58833ax.m90834k(this.f51008b) : C58836b.f156633a;
    }
}
