package com.google.android.apps.search.googleapp.search.settings.adspersonalization;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139875k;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.adspersonalization.q */
/* compiled from: PG */
public final class C137582q implements C139875k {

    /* renamed from: a */
    private final Context f374218a;

    /* renamed from: b */
    private final boolean f374219b;

    /* renamed from: c */
    private final boolean f374220c;

    public C137582q(Context context, boolean z, boolean z2) {
        this.f374218a = context;
        this.f374219b = z;
        this.f374220c = z2;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 149681;
    }

    /* renamed from: b */
    public final int mo111859b() {
        return -1;
    }

    /* renamed from: c */
    public final Fragment mo111860c(AccountId accountId) {
        return C137576k.m223500a(accountId);
    }

    /* renamed from: f */
    public final boolean mo111861f() {
        return false;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: j */
    public final String mo111460j() {
        return this.f374218a.getResources().getString(R.string.googleapp_ads_personalization_settings_title);
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return this.f374219b && this.f374220c;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return false;
    }
}
