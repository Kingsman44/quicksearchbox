package com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b.s */
/* compiled from: PG */
final class C133236s extends C133237t {

    /* renamed from: a */
    private final boolean f363155a;

    /* renamed from: b */
    private final C58495hd f363156b;

    /* renamed from: c */
    private final boolean f363157c;

    public C133236s(boolean z, C58495hd hdVar, boolean z2) {
        this.f363155a = z;
        if (hdVar != null) {
            this.f363156b = hdVar;
            this.f363157c = z2;
            return;
        }
        throw new NullPointerException("Null saaSettingsForAvailableAccounts");
    }

    /* renamed from: a */
    public final C58495hd mo111041a() {
        return this.f363156b;
    }

    /* renamed from: b */
    public final boolean mo111042b() {
        return this.f363157c;
    }

    /* renamed from: c */
    public final boolean mo111043c() {
        return this.f363155a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C133237t) {
            C133237t tVar = (C133237t) obj;
            return this.f363155a == tVar.mo111043c() && this.f363156b.equals(tVar.mo111041a()) && this.f363157c == tVar.mo111042b();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int a = ((((true != this.f363155a ? 1237 : 1231) ^ 1000003) * 1000003) ^ C58758qx.m90643a(this.f363156b.entrySet())) * 1000003;
        if (true == this.f363157c) {
            i = 1231;
        }
        return a ^ i;
    }

    public final String toString() {
        boolean z = this.f363155a;
        String obj = this.f363156b.toString();
        boolean z2 = this.f363157c;
        return "RestrictedAccountsState{openAccountMenuOnStart=" + z + ", saaSettingsForAvailableAccounts=" + obj + ", isMinusOnePanelOpened=" + z2 + "}";
    }
}
