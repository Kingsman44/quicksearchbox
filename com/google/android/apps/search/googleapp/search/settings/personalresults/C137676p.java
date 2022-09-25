package com.google.android.apps.search.googleapp.search.settings.personalresults;

import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139871g;
import com.google.android.apps.search.googleapp.p10536x.C139875k;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.personalresults.p */
/* compiled from: PG */
public final class C137676p implements C139875k, C139871g {

    /* renamed from: a */
    private final C137669i f374475a;

    /* renamed from: b */
    private final boolean f374476b;

    public C137676p(C137669i iVar, boolean z) {
        this.f374475a = iVar;
        this.f374476b = z;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 149209;
    }

    /* renamed from: b */
    public final int mo111859b() {
        return R.drawable.quantum_gm_ic_auto_awesome_vd_theme_24;
    }

    /* renamed from: c */
    public final Fragment mo111860c(AccountId accountId) {
        return C137674n.m223742a(accountId);
    }

    /* renamed from: e */
    public final C46689ag mo111455e() {
        C137669i iVar = this.f374475a;
        return new C46719bc(iVar.f374460c, new C137668h(iVar), "PersonalResultsKey");
    }

    /* renamed from: f */
    public final boolean mo111861f() {
        return false;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return this.f374476b ? this.f374475a.f374461d.getResources().getString(R.string.googleapp_personal_results_settings_summary) : BuildConfig.FLAVOR;
    }

    /* renamed from: j */
    public final String mo111460j() {
        return this.f374475a.f374461d.getResources().getString(R.string.googleapp_personal_results_settings_title);
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return true;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return false;
    }
}
