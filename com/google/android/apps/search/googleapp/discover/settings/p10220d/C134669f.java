package com.google.android.apps.search.googleapp.discover.settings.p10220d;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139875k;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.d.f */
/* compiled from: PG */
public final class C134669f implements C139875k {

    /* renamed from: a */
    private final Context f366723a;

    /* renamed from: b */
    private final boolean f366724b;

    public C134669f(Context context, boolean z) {
        this.f366723a = context;
        this.f366724b = z;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 160150;
    }

    /* renamed from: b */
    public final int mo111859b() {
        return R.drawable.quantum_gm_ic_info_vd_theme_24;
    }

    /* renamed from: c */
    public final Fragment mo111860c(AccountId accountId) {
        C134667d dVar = new C134667d();
        C68324h.m98669f(dVar);
        C47247a.m84047b(dVar, accountId);
        return dVar;
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
        return this.f366723a.getResources().getString(R.string.googleapp_media_providers_setting_title);
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return this.f366724b;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return false;
    }
}
