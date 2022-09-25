package com.google.android.apps.gsa.sidekick.main.p7203f;

import android.accounts.Account;

/* renamed from: com.google.android.apps.gsa.sidekick.main.f.b */
/* compiled from: PG */
final class C91372b extends C91378h {

    /* renamed from: a */
    private final Account f254937a;

    /* renamed from: b */
    private final boolean f254938b;

    /* renamed from: c */
    private final boolean f254939c;

    /* renamed from: d */
    private final boolean f254940d;

    public C91372b(Account account, boolean z, boolean z2, boolean z3) {
        this.f254937a = account;
        this.f254938b = z;
        this.f254939c = z2;
        this.f254940d = z3;
    }

    /* renamed from: a */
    public final Account mo85673a() {
        return this.f254937a;
    }

    /* renamed from: b */
    public final boolean mo85674b() {
        return false;
    }

    /* renamed from: c */
    public final boolean mo85675c() {
        return this.f254938b;
    }

    /* renamed from: d */
    public final boolean mo85676d() {
        return this.f254940d;
    }

    /* renamed from: e */
    public final boolean mo85677e() {
        return this.f254939c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C91378h) {
            C91378h hVar = (C91378h) obj;
            Account account = this.f254937a;
            if (account != null ? account.equals(hVar.mo85673a()) : hVar.mo85673a() == null) {
                return this.f254938b == hVar.mo85675c() && this.f254939c == hVar.mo85677e() && this.f254940d == hVar.mo85676d() && !hVar.mo85674b();
            }
        }
    }

    public final int hashCode() {
        Account account = this.f254937a;
        int i = 1231;
        int hashCode = ((((((account == null ? 0 : account.hashCode()) ^ 1000003) * 1000003) ^ (true != this.f254938b ? 1237 : 1231)) * 1000003) ^ (true != this.f254939c ? 1237 : 1231)) * 1000003;
        if (true != this.f254940d) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ 1237;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f254937a);
        boolean z = this.f254938b;
        boolean z2 = this.f254939c;
        boolean z3 = this.f254940d;
        return "RequestConfig{account=" + valueOf + ", ignoreNetworkAvailability=" + z + ", includeLocation=" + z2 + ", includeAnsweredQuestions=" + z3 + ", abortIfNoActions=false}";
    }
}
