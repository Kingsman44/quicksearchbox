package com.google.android.libraries.lens.sdk.avs.data;

import android.os.Bundle;
import com.google.apps.tiktok.account.AccountId;

/* renamed from: com.google.android.libraries.lens.sdk.avs.data.d */
/* compiled from: PG */
public final class C24869d {

    /* renamed from: a */
    public final Bundle f67929a;

    public C24869d() {
        this.f67929a = new Bundle();
    }

    public C24869d(Bundle bundle) {
        this.f67929a = bundle;
    }

    /* renamed from: a */
    public final int mo30068a() {
        return this.f67929a.getInt("surface");
    }

    /* renamed from: b */
    public final boolean mo30069b() {
        return this.f67929a.containsKey("surface");
    }

    /* renamed from: c */
    public final void mo30070c(AccountId accountId) {
        this.f67929a.putParcelable("account_id", accountId);
    }

    /* renamed from: d */
    public final void mo30071d(int i) {
        this.f67929a.putInt("surface", i);
    }

    /* renamed from: e */
    public final void mo30072e() {
        this.f67929a.putString("version_name", "0.1");
    }
}
