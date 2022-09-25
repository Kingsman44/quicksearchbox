package com.google.android.apps.search.googleapp.searchwidget.settings;

import android.content.Context;
import android.content.Intent;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139858a;
import com.google.android.apps.search.googleapp.searchwidget.C139135z;
import com.google.android.apps.search.googleapp.searchwidget.settings.customization.WidgetCustomizationActivity;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.a */
/* compiled from: PG */
public final class C139042a implements C139858a {

    /* renamed from: a */
    private final Context f378163a;

    /* renamed from: b */
    private final AccountId f378164b;

    /* renamed from: c */
    private final C139135z f378165c;

    public C139042a(Context context, AccountId accountId, C139135z zVar) {
        this.f378163a = context;
        this.f378164b = accountId;
        this.f378165c = zVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 147144;
    }

    /* renamed from: b */
    public final int mo111854b() {
        return -1;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: j */
    public final String mo111460j() {
        return this.f378163a.getResources().getString(R.string.googleapp_search_widget_customization_setting_title);
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return !this.f378165c.mo114765n();
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return false;
    }

    /* renamed from: o */
    public final C60870cx mo111855o() {
        Intent intent = new Intent();
        intent.setFlags(268468224);
        intent.setClass(this.f378163a, WidgetCustomizationActivity.class);
        C45963aa.m82131a(intent, this.f378164b);
        C47810es.m84979s(this.f378163a, intent);
        return C60866ct.f164955a;
    }
}
