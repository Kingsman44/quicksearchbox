package com.google.android.apps.gsa.staticplugins.opa.apa.migration;

import android.support.p031v4.app.Fragment;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3897e.p3921j.C52070ec;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.apa.migration.m */
/* compiled from: PG */
public final class C107227m {

    /* renamed from: a */
    public final Fragment f298425a;

    /* renamed from: b */
    private final AccountId f298426b;

    /* renamed from: c */
    private final C52070ec f298427c;

    public C107227m(AccountId accountId, C52070ec ecVar, Fragment fragment) {
        C69664n.m101061g(accountId, "accountId");
        this.f298426b = accountId;
        this.f298427c = ecVar;
        this.f298425a = fragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107227m)) {
            return false;
        }
        C107227m mVar = (C107227m) obj;
        return C69664n.m101066l(this.f298426b, mVar.f298426b) && C69664n.m101066l(this.f298427c, mVar.f298427c) && C69664n.m101066l(this.f298425a, mVar.f298425a);
    }

    public final int hashCode() {
        int hashCode = this.f298426b.hashCode() * 31;
        C52070ec ecVar = this.f298427c;
        int i = 0;
        int hashCode2 = (hashCode + (ecVar == null ? 0 : ecVar.hashCode())) * 31;
        Fragment fragment = this.f298425a;
        if (fragment != null) {
            i = fragment.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        AccountId accountId = this.f298426b;
        C52070ec ecVar = this.f298427c;
        Fragment fragment = this.f298425a;
        return "TngClientOpRendererResult(accountId=" + accountId + ", clientOpResult=" + ecVar + ", fragment=" + fragment + ")";
    }
}
