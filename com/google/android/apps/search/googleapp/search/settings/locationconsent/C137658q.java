package com.google.android.apps.search.googleapp.search.settings.locationconsent;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139871g;
import com.google.android.apps.search.googleapp.p10536x.C139875k;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46689ag;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.locationconsent.q */
/* compiled from: PG */
public final class C137658q implements C139875k, C139871g {

    /* renamed from: a */
    private final Context f374431a;

    /* renamed from: b */
    private final boolean f374432b;

    /* renamed from: c */
    private final C137649i f374433c;

    /* renamed from: d */
    private final boolean f374434d;

    public C137658q(Context context, boolean z, C137649i iVar, boolean z2) {
        this.f374431a = context;
        this.f374432b = z;
        this.f374433c = iVar;
        this.f374434d = z2;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 149315;
    }

    /* renamed from: b */
    public final int mo111859b() {
        return R.drawable.quantum_gm_ic_location_on_vd_theme_24;
    }

    /* renamed from: c */
    public final Fragment mo111860c(AccountId accountId) {
        return C137651k.m223677a(accountId);
    }

    /* renamed from: e */
    public final C46689ag mo111455e() {
        return this.f374433c.mo113880a();
    }

    /* renamed from: f */
    public final boolean mo111861f() {
        return false;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return this.f374434d ? this.f374431a.getResources().getString(R.string.googleapp_location_consent_setting_summary) : BuildConfig.FLAVOR;
    }

    /* renamed from: j */
    public final String mo111460j() {
        return this.f374431a.getResources().getString(R.string.googleapp_location_consent_setting_title);
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return !this.f374432b;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return false;
    }
}
