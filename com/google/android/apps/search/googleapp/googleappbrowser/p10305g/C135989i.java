package com.google.android.apps.search.googleapp.googleappbrowser.p10305g;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.p10536x.C139869e;
import com.google.android.apps.search.googleapp.p10536x.C139871g;
import com.google.android.apps.search.googleapp.p10536x.C139875k;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.g.i */
/* compiled from: PG */
public final class C135989i implements C139875k, C139869e, C139871g {

    /* renamed from: a */
    private final Context f370367a;

    /* renamed from: b */
    private final C135973at f370368b;

    public C135989i(Context context, C135973at atVar) {
        this.f370367a = context;
        this.f370368b = atVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 132435;
    }

    /* renamed from: b */
    public final int mo111859b() {
        return -1;
    }

    /* renamed from: c */
    public final Fragment mo111860c(AccountId accountId) {
        C136005v vVar = new C136005v();
        C68324h.m98669f(vVar);
        C47247a.m84047b(vVar, accountId);
        return vVar;
    }

    /* renamed from: e */
    public final C46689ag mo111455e() {
        return this.f370368b.mo112654c();
    }

    /* renamed from: f */
    public final boolean mo111861f() {
        return false;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return this.f370367a.getResources().getString(R.string.googleapp_browser_settings_clear_browsing_data_summary);
    }

    /* renamed from: j */
    public final String mo111460j() {
        return this.f370367a.getResources().getString(R.string.googleapp_browser_settings_clear_browsing_data_title);
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return true;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return true;
    }

    /* renamed from: n */
    public final C46689ag mo111464n() {
        return this.f370368b.mo112653b();
    }
}
