package com.google.android.apps.search.googleapp.search.voicesearch.settings;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139870f;
import com.google.android.apps.search.googleapp.p10536x.C139875k;
import com.google.android.apps.search.googleapp.search.voicesearch.settings.p10476a.C138873g;
import com.google.android.apps.search.googleapp.search.voicesearch.settings.p10476a.C138880n;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.q */
/* compiled from: PG */
public final class C138902q implements C139875k, C139870f {

    /* renamed from: a */
    private final Context f377820a;

    /* renamed from: b */
    private final C138880n f377821b;

    public C138902q(Context context, C138880n nVar) {
        this.f377820a = context;
        this.f377821b = nVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 143264;
    }

    /* renamed from: b */
    public final int mo111859b() {
        return -1;
    }

    /* renamed from: c */
    public final Fragment mo111860c(AccountId accountId) {
        C138896l lVar = new C138896l();
        C68324h.m98669f(lVar);
        C47247a.m84047b(lVar, accountId);
        return lVar;
    }

    /* renamed from: d */
    public final C46689ag mo111454d() {
        C138880n nVar = this.f377821b;
        return new C46719bc(nVar.f377755a, new C138873g(nVar, nVar.f377759e.getString(R.string.googleapp_voice_settings_languages_setting_summary_text_primary), nVar.f377759e.getString(R.string.googleapp_voice_settings_languages_setting_summary_text_others)), "voice_languages_setting_summary_data_source_key");
    }

    /* renamed from: f */
    public final boolean mo111861f() {
        return true;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: j */
    public final String mo111460j() {
        return this.f377820a.getResources().getString(R.string.googleapp_voice_settings_languages_setting_title);
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
