package com.google.android.gms.reminders;

import android.accounts.Account;

/* renamed from: com.google.android.gms.reminders.b */
/* compiled from: PG */
public final class C145773b extends C145816j {

    /* renamed from: a */
    private final Account f394133a;

    public C145773b(Account account) {
        this.f394133a = account;
    }

    /* renamed from: a */
    public final Account mo119108a() {
        return this.f394133a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C145816j) {
            return this.f394133a.equals(((C145816j) obj).mo119108a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f394133a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f394133a.toString();
        return "RemindersClientOptions{account=" + obj + "}";
    }
}
