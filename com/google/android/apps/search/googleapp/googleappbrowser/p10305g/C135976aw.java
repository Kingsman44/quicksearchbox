package com.google.android.apps.search.googleapp.googleappbrowser.p10305g;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139865b;
import com.google.android.apps.search.googleapp.p10536x.C139869e;
import com.google.android.apps.search.googleapp.p10536x.C139871g;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.g.aw */
/* compiled from: PG */
public final class C135976aw implements C139865b, C139869e, C139871g {

    /* renamed from: a */
    private final Context f370329a;

    /* renamed from: b */
    private final C135994n f370330b;

    /* renamed from: c */
    private final C135973at f370331c;

    public C135976aw(Context context, C135994n nVar, C135973at atVar) {
        this.f370329a = context;
        this.f370330b = nVar;
        this.f370331c = atVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 132451;
    }

    /* renamed from: b */
    public final C46689ag mo111453b() {
        C135973at atVar = this.f370331c;
        return new C46719bc(atVar.f370315a, new C135971ar(atVar), "real_time_safe_browsing_setting_content_key");
    }

    /* renamed from: e */
    public final C46689ag mo111455e() {
        return this.f370330b.mo112671a();
    }

    /* renamed from: f */
    public final C60870cx mo111456f(boolean z) {
        C135973at atVar = this.f370331c;
        C60870cx d = atVar.mo112655d();
        C135969ap apVar = new C135969ap(z);
        C60870cx h = C60922j.m93045h(d, C47810es.m84966f(apVar), atVar.f370318d);
        atVar.f370317c.mo50787a(h, "real_time_safe_browsing_setting_content_key");
        return h;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return this.f370329a.getResources().getString(R.string.googleapp_browser_settings_real_time_safe_browsing_summary);
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
        return this.f370329a.getResources().getString(R.string.googleapp_browser_settings_real_time_safe_browsing_title);
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
        return true;
    }

    /* renamed from: n */
    public final C46689ag mo111464n() {
        return this.f370331c.mo112652a();
    }
}
