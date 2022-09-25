package com.google.android.apps.search.googleapp.googleappbrowser.p10305g;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139865b;
import com.google.android.apps.search.googleapp.p10536x.C139869e;
import com.google.android.apps.search.googleapp.p10536x.C139871g;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.g.bb */
/* compiled from: PG */
public final class C135982bb implements C139865b, C139871g, C139869e {

    /* renamed from: a */
    private final Context f370348a;

    /* renamed from: b */
    private final C135994n f370349b;

    /* renamed from: c */
    private final C135973at f370350c;

    public C135982bb(Context context, C46723bg bgVar, C135994n nVar, C135973at atVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(bgVar, "dataSources");
        C69664n.m101061g(nVar, "firstRunExperienceChecker");
        C69664n.m101061g(atVar, "googleAppBrowserSettingsDataService");
        this.f370348a = context;
        this.f370349b = nVar;
        this.f370350c = atVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 147223;
    }

    /* renamed from: b */
    public final C46689ag mo111453b() {
        C135973at atVar = this.f370350c;
        return new C46719bc(atVar.f370315a, new C135964ak(atVar), "url_keyed_metric_browsing_setting_content_key");
    }

    /* renamed from: e */
    public final C46689ag mo111455e() {
        return this.f370349b.mo112671a();
    }

    /* renamed from: f */
    public final C60870cx mo111456f(boolean z) {
        C135973at atVar = this.f370350c;
        C60870cx d = atVar.mo112655d();
        C135968ao aoVar = new C135968ao(z);
        C60870cx h = C60922j.m93045h(d, C47810es.m84966f(aoVar), atVar.f370318d);
        atVar.f370317c.mo50787a(h, "url_keyed_metric_browsing_setting_content_key");
        return h;
    }

    /* renamed from: g */
    public final String mo111457g() {
        String string = this.f370348a.getResources().getString(R.string.googleapp_browser_settings_ukm_summary);
        C69664n.m101060f(string, "context.resources.getStr…ser_settings_ukm_summary)");
        return string;
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
        String string = this.f370348a.getResources().getString(R.string.googleapp_browser_settings_ukm_title);
        C69664n.m101060f(string, "context.resources.getStr…owser_settings_ukm_title)");
        return string;
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
        return this.f370350c.mo112653b();
    }
}
