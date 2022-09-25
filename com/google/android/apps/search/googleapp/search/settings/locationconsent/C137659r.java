package com.google.android.apps.search.googleapp.search.settings.locationconsent;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139871g;
import com.google.android.apps.search.googleapp.p10536x.C139875k;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46689ag;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.locationconsent.r */
/* compiled from: PG */
public final class C137659r implements C139875k, C139871g {

    /* renamed from: a */
    private final Context f374435a;

    /* renamed from: b */
    private final boolean f374436b;

    /* renamed from: c */
    private final C137649i f374437c;

    public C137659r(Context context, boolean z, C137649i iVar) {
        this.f374435a = context;
        this.f374436b = z;
        this.f374437c = iVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 149315;
    }

    /* renamed from: b */
    public final int mo111859b() {
        return -1;
    }

    /* renamed from: c */
    public final Fragment mo111860c(AccountId accountId) {
        return C137651k.m223677a(accountId);
    }

    /* renamed from: e */
    public final C46689ag mo111455e() {
        return this.f374437c.mo113880a();
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
        return this.f374435a.getResources().getString(R.string.googleapp_location_consent_setting_title);
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return this.f374436b;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return false;
    }
}
