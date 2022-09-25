package com.google.android.apps.search.googleapp.searchwidget.settings;

import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8867w.p8879i.C118816q;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.search.googleapp.p10536x.C139865b;
import com.google.android.apps.search.googleapp.searchwidget.C139135z;
import com.google.android.apps.search.googleapp.searchwidget.settings.p10481a.C139044b;
import com.google.android.apps.search.googleapp.searchwidget.settings.p10481a.C139045c;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.b */
/* compiled from: PG */
public final class C139046b implements C139865b {

    /* renamed from: a */
    private final Fragment f378172a;

    /* renamed from: b */
    private final C139045c f378173b;

    /* renamed from: c */
    private final C139135z f378174c;

    public C139046b(Fragment fragment, C139045c cVar, C139135z zVar) {
        this.f378172a = fragment;
        this.f378173b = cVar;
        this.f378174c = zVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 144822;
    }

    /* renamed from: b */
    public final C46689ag mo111453b() {
        C139045c cVar = this.f378173b;
        return new C46719bc(cVar.f378168a, new C139044b(cVar), "doodle_setting_data_source_key");
    }

    /* renamed from: f */
    public final C60870cx mo111456f(boolean z) {
        C139045c cVar = this.f378173b;
        C86337q b = ((C118816q) cVar.f378170c).f331390a.mo80076b();
        b.mo80067b("search_widget_doodle_preference", z);
        b.apply();
        C60870cx cxVar = C60866ct.f164955a;
        cVar.f378169b.mo50787a(cxVar, "doodle_setting_data_source_key");
        C46459k.m82829b(cxVar, "Failed to update search widget doodle preferences.", new Object[0]);
        this.f378174c.mo114759h();
        return cxVar;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: h */
    public final String mo111458h() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: i */
    public final String mo111459i() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: j */
    public final String mo111460j() {
        return this.f378172a.getString(R.string.googleapp_search_widget_doodle_setting_title);
    }

    /* renamed from: k */
    public final boolean mo111461k() {
        return true;
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return !this.f378174c.mo114765n();
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return false;
    }
}
