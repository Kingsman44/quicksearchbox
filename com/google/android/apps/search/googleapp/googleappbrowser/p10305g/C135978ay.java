package com.google.android.apps.search.googleapp.googleappbrowser.p10305g;

import android.content.Intent;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.p10536x.C139858a;
import com.google.android.apps.search.googleapp.p10536x.C139869e;
import com.google.android.apps.search.googleapp.p10536x.C139871g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.profile.C44070e;
import com.google.android.libraries.web.profile.C44075j;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.g.ay */
/* compiled from: PG */
public final class C135978ay implements C139858a, C139869e, C139871g {

    /* renamed from: a */
    private final Fragment f370334a;

    /* renamed from: b */
    private final C44075j f370335b;

    /* renamed from: c */
    private final C44070e f370336c;

    /* renamed from: d */
    private final C135973at f370337d;

    public C135978ay(Fragment fragment, C135973at atVar, C44075j jVar, C44070e eVar) {
        this.f370334a = fragment;
        this.f370337d = atVar;
        this.f370335b = jVar;
        this.f370336c = eVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 132399;
    }

    /* renamed from: b */
    public final int mo111854b() {
        return -1;
    }

    /* renamed from: e */
    public final C46689ag mo111455e() {
        return this.f370337d.mo112654c();
    }

    /* renamed from: g */
    public final String mo111457g() {
        return this.f370334a.requireContext().getResources().getString(R.string.googleapp_browser_settings_site_settings_summary);
    }

    /* renamed from: j */
    public final String mo111460j() {
        return this.f370334a.requireContext().getResources().getString(R.string.googleapp_browser_settings_site_settings_title);
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
        return this.f370337d.mo112653b();
    }

    /* renamed from: o */
    public final C60870cx mo111855o() {
        Intent b = this.f370336c.mo47027a(this.f370335b.mo47043a(C43271v.WEB_LAYER)).mo47029b();
        b.getClass();
        C47810es.m84979s(this.f370334a.requireContext(), b);
        return C60866ct.f164955a;
    }
}
