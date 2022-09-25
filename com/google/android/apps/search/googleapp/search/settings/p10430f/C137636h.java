package com.google.android.apps.search.googleapp.search.settings.p10430f;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139871g;
import com.google.android.apps.search.googleapp.p10536x.C139875k;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46689ag;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.f.h */
/* compiled from: PG */
public final class C137636h implements C139875k, C139871g {

    /* renamed from: a */
    private final Context f374379a;

    /* renamed from: b */
    private final boolean f374380b;

    /* renamed from: c */
    private final C137632d f374381c;

    public C137636h(Context context, boolean z, C137632d dVar) {
        this.f374379a = context;
        this.f374380b = z;
        this.f374381c = dVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 149477;
    }

    /* renamed from: b */
    public final int mo111859b() {
        return -1;
    }

    /* renamed from: c */
    public final Fragment mo111860c(AccountId accountId) {
        return C137635g.m223634a(accountId);
    }

    /* renamed from: e */
    public final C46689ag mo111455e() {
        return this.f374381c.mo113869a();
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
        return this.f374379a.getResources().getString(R.string.googleapp_search_customization_settings_title);
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return !this.f374380b;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return !this.f374380b;
    }
}
