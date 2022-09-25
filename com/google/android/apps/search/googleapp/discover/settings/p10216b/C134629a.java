package com.google.android.apps.search.googleapp.discover.settings.p10216b;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.discover.settings.p10216b.p10217a.C134630a;
import com.google.android.apps.search.googleapp.discover.settings.p10216b.p10217a.C134631b;
import com.google.android.apps.search.googleapp.p10536x.C139865b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.b.a */
/* compiled from: PG */
public final class C134629a implements C139865b {

    /* renamed from: a */
    private final Context f366622a;

    /* renamed from: b */
    private final C134631b f366623b;

    public C134629a(Context context, C134631b bVar) {
        C69664n.m101061g(context, "context");
        this.f366622a = context;
        this.f366623b = bVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 141450;
    }

    /* renamed from: b */
    public final C46689ag mo111453b() {
        C134631b bVar = this.f366623b;
        return new C46719bc(bVar.f366625a, new C134630a(bVar), "DISCOVER_ENABLED_DATA_SOURCE");
    }

    /* renamed from: f */
    public final C60870cx mo111456f(boolean z) {
        C134631b bVar = this.f366623b;
        C47633f g = C47633f.m84733g(bVar.f366628d.mo85804b(z));
        C69664n.m101060f(g, "from(discoverEnabledWrit…DiscoverEnabled(enabled))");
        bVar.f366626b.mo50787a(g, "DISCOVER_ENABLED_DATA_SOURCE");
        return g;
    }

    /* renamed from: g */
    public final String mo111457g() {
        String string = this.f366622a.getResources().getString(R.string.googleapp_disco_enabled_setting_summary);
        C69664n.m101060f(string, "context.resources.getStr…_enabled_setting_summary)");
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
        String string = this.f366622a.getResources().getString(R.string.googleapp_disco_enabled_setting_title);
        C69664n.m101060f(string, "context.resources.getStr…co_enabled_setting_title)");
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
        return false;
    }
}
