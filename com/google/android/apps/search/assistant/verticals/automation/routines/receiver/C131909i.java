package com.google.android.apps.search.assistant.verticals.automation.routines.receiver;

import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.receiver.i */
/* compiled from: PG */
public final /* synthetic */ class C131909i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ AccountId f360184a;

    public /* synthetic */ C131909i(AccountId accountId) {
        this.f360184a = accountId;
    }

    public final Object apply(Object obj) {
        return ((Boolean) obj).booleanValue() ? Optional.m71637of(this.f360184a) : Optional.empty();
    }
}
