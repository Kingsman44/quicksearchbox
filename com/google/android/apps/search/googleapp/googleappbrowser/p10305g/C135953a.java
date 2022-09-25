package com.google.android.apps.search.googleapp.googleappbrowser.p10305g;

import android.content.Context;
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
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.g.a */
/* compiled from: PG */
public final class C135953a implements C139858a, C139871g, C139869e {

    /* renamed from: a */
    private final boolean f370288a;

    /* renamed from: b */
    private final Fragment f370289b;

    /* renamed from: c */
    private final C135973at f370290c;

    /* renamed from: d */
    private final C44075j f370291d;

    /* renamed from: e */
    private final C44070e f370292e;

    public C135953a(boolean z, Fragment fragment, C135973at atVar, C44075j jVar, C44070e eVar) {
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(atVar, "googleAppBrowserSettingsDataService");
        C69664n.m101061g(eVar, "profileManagerFactory");
        this.f370288a = z;
        this.f370289b = fragment;
        this.f370290c = atVar;
        this.f370291d = jVar;
        this.f370292e = eVar;
    }

    /* renamed from: f */
    private final Intent m220633f() {
        return this.f370292e.mo47027a(this.f370291d.mo47043a(C43271v.WEB_LAYER)).mo47028a();
    }

    /* renamed from: h */
    private final String m220634h(int i) {
        String string = this.f370289b.requireContext().getResources().getString(i);
        C69664n.m101060f(string, "fragment.requireContext().resources.getString(id)");
        return string;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 155819;
    }

    /* renamed from: b */
    public final int mo111854b() {
        return -1;
    }

    /* renamed from: e */
    public final C46689ag mo111455e() {
        return this.f370290c.mo112654c();
    }

    /* renamed from: g */
    public final String mo111457g() {
        return m220634h(R.string.googleapp_browser_settings_a11y_summary);
    }

    /* renamed from: j */
    public final String mo111460j() {
        return m220634h(R.string.googleapp_browser_settings_a11y_title);
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return this.f370288a && m220633f() != null;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return true;
    }

    /* renamed from: n */
    public final C46689ag mo111464n() {
        return this.f370290c.mo112653b();
    }

    /* renamed from: o */
    public final C60870cx mo111855o() {
        Context requireContext = this.f370289b.requireContext();
        Intent f = m220633f();
        C69664n.m101058d(f);
        C47810es.m84979s(requireContext, f);
        return C60866ct.f164955a;
    }
}
