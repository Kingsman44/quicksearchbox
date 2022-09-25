package com.google.android.apps.search.googleapp.recents.p10383b;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.search.googleapp.p10536x.C139865b;
import com.google.android.apps.search.googleapp.recents.p10383b.p10384a.C137167a;
import com.google.android.apps.search.googleapp.recents.p10383b.p10384a.C137168b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.recents.b.a */
/* compiled from: PG */
public final class C137166a implements C139865b {

    /* renamed from: a */
    private final Context f373234a;

    /* renamed from: b */
    private final C137168b f373235b;

    public C137166a(Context context, C137168b bVar) {
        this.f373234a = context;
        this.f373235b = bVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 147530;
    }

    /* renamed from: b */
    public final C46689ag mo111453b() {
        C137168b bVar = this.f373235b;
        return new C46719bc(bVar.f373237a, new C137167a(bVar), "recent_pages_data_source_key");
    }

    /* renamed from: f */
    public final C60870cx mo111456f(boolean z) {
        C137168b bVar = this.f373235b;
        C86337q b = bVar.f373239c.f331387a.mo80076b();
        b.mo80067b("use_recently", z);
        b.apply();
        C47633f g = C47633f.m84733g(C60866ct.f164955a);
        bVar.f373238b.mo50787a(g, "recent_pages_data_source_key");
        return g;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return this.f373234a.getResources().getString(R.string.googleapp_recent_pages_enabled_setting_summary);
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
        return this.f373234a.getResources().getString(R.string.googleapp_recent_pages_enabled_setting_title);
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
