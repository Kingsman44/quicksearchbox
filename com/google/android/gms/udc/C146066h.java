package com.google.android.gms.udc;

import android.accounts.Account;
import com.google.android.gms.common.api.C143719d;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.udc.h */
/* compiled from: PG */
public final class C146066h implements C143719d {

    /* renamed from: a */
    private final Account f394786a;

    public C146066h(Account account) {
        C143919bh.m233971n(account, "Must provide a valid account!");
        this.f394786a = account;
    }

    /* renamed from: a */
    public final Account mo119108a() {
        return this.f394786a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C146066h) && this.f394786a.equals(((C146066h) obj).f394786a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f394786a.hashCode();
    }
}
