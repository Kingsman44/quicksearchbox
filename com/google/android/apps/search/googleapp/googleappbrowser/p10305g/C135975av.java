package com.google.android.apps.search.googleapp.googleappbrowser.p10305g;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8867w.p8879i.C118808i;
import com.google.android.apps.gsa.p8867w.p8879i.C118809j;
import com.google.android.apps.search.googleapp.p10536x.C139865b;
import com.google.android.apps.search.googleapp.p10536x.C139871g;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.g.av */
/* compiled from: PG */
public final class C135975av implements C139865b, C139871g {

    /* renamed from: a */
    private final Context f370327a;

    /* renamed from: b */
    private final C135973at f370328b;

    public C135975av(Context context, C135973at atVar) {
        this.f370327a = context;
        this.f370328b = atVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 4559957;
    }

    /* renamed from: b */
    public final C46689ag mo111453b() {
        return this.f370328b.mo112653b();
    }

    /* renamed from: e */
    public final C46689ag mo111455e() {
        return this.f370328b.mo112654c();
    }

    /* renamed from: f */
    public final C60870cx mo111456f(boolean z) {
        C135973at atVar = this.f370328b;
        C118809j jVar = atVar.f370320f;
        C60870cx g = jVar.f331379a.mo28207g("Set IsGabPreferred", new C118808i(jVar, z));
        atVar.f370317c.mo50787a(g, "open_pages_in_google_app_content_key");
        atVar.f370317c.mo50787a(g, "additional_safe_browsing_settings_enabled_content_key");
        return g;
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
        return this.f370327a.getResources().getString(R.string.googleapp_browser_enable_title);
    }

    /* renamed from: k */
    public final boolean mo111461k() {
        return true;
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
