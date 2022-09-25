package com.google.android.apps.search.googleapp.searchwidget.settings;

import android.content.Context;
import android.content.Intent;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139858a;
import com.google.android.apps.search.googleapp.searchwidget.C139135z;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.c */
/* compiled from: PG */
public final class C139047c implements C139858a {

    /* renamed from: a */
    private final Context f378175a;

    /* renamed from: b */
    private final Fragment f378176b;

    /* renamed from: c */
    private final C139135z f378177c;

    public C139047c(Context context, Fragment fragment, C139135z zVar) {
        this.f378175a = context;
        this.f378176b = fragment;
        this.f378177c = zVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 146986;
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
        return this.f378175a.getResources().getString(R.string.googleapp_search_widget_switch_to_google_setting_title);
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return this.f378177c.mo114765n();
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return false;
    }

    /* renamed from: o */
    public final C60870cx mo111855o() {
        this.f378175a.sendBroadcast(new Intent().setAction("com.google.android.finsky.intent.action.UPDATE_DSE_APP_AGA").setPackage("com.android.vending").setFlags(268435456).putExtra("dse_package_name", "com.google.android.googlequicksearchbox"), "com.google.android.finsky.permission.DSE");
        C0167am activity = this.f378176b.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return C60866ct.f164955a;
    }
}
