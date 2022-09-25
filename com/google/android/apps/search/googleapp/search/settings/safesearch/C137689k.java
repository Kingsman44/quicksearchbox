package com.google.android.apps.search.googleapp.search.settings.safesearch;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139875k;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.apps.tiktok.account.AccountId;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.safesearch.k */
/* compiled from: PG */
public final class C137689k implements C139875k {

    /* renamed from: a */
    private final Context f374504a;

    /* renamed from: b */
    private final boolean f374505b;

    /* renamed from: c */
    private final C38553h f374506c;

    public C137689k(Context context, C38553h hVar, boolean z) {
        this.f374504a = context;
        this.f374506c = hVar;
        this.f374505b = z;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 147430;
    }

    /* renamed from: b */
    public final int mo111859b() {
        if (this.f374506c.f101930a) {
            return -1;
        }
        return R.drawable.quantum_gm_ic_explicit_vd_theme_24;
    }

    /* renamed from: c */
    public final Fragment mo111860c(AccountId accountId) {
        return C137687i.m223784a(accountId);
    }

    /* renamed from: f */
    public final boolean mo111861f() {
        return false;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return this.f374505b ? this.f374504a.getResources().getString(R.string.googleapp_hide_explicit_results_settings_summary) : BuildConfig.FLAVOR;
    }

    /* renamed from: j */
    public final String mo111460j() {
        return this.f374504a.getResources().getString(R.string.googleapp_hide_explicit_results_settings_title);
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return true;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return true;
    }
}
