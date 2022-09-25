package com.google.android.apps.search.googleapp.discover.settings.interestmanagement;

import android.content.Context;
import android.content.Intent;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.discover.p10202n.C134471a;
import com.google.android.apps.search.googleapp.p10536x.C139858a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.interestmanagement.h */
/* compiled from: PG */
public final class C134692h implements C139858a {

    /* renamed from: a */
    private final Context f366786a;

    /* renamed from: b */
    private final C134691g f366787b;

    /* renamed from: c */
    private final boolean f366788c;

    /* renamed from: d */
    private final boolean f366789d;

    public C134692h(Context context, C134691g gVar, boolean z, boolean z2) {
        C69664n.m101061g(context, "context");
        this.f366786a = context;
        this.f366787b = gVar;
        this.f366788c = z;
        this.f366789d = z2;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 147519;
    }

    /* renamed from: b */
    public final int mo111854b() {
        return R.drawable.quantum_gm_ic_auto_fix_high_vd_theme_24;
    }

    /* renamed from: g */
    public final String mo111457g() {
        String string = this.f366789d ? this.f366786a.getResources().getString(R.string.googleapp_disco_manage_your_interests_summary) : BuildConfig.FLAVOR;
        C69664n.m101060f(string, "if (enableGoogleMaterial…ests_summary)\n    else \"\"");
        return string;
    }

    /* renamed from: j */
    public final String mo111460j() {
        String str;
        if (this.f366788c) {
            str = this.f366786a.getResources().getString(R.string.googleapp_disco_channels_and_interests_tng_setting);
        } else {
            str = this.f366786a.getResources().getString(R.string.googleapp_disco_manage_your_interests_tng_setting);
        }
        C69664n.m101060f(str, "if (enableChannelsAndInt…erests_tng_setting)\n    }");
        return str;
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return true;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return false;
    }

    /* renamed from: o */
    public final C60870cx mo111855o() {
        Intent intent;
        Context context = this.f366786a;
        C134691g gVar = this.f366787b;
        C69664n.m101061g(context, "context");
        if (gVar.f366785c) {
            intent = new Intent();
            intent.setClassName(context, "com.google.android.apps.search.googleapp.discover.settings.interestmanagement.InterestManagementActivity");
            intent.putExtra("EXTRA_ENDPOINT_URL", "https://www.google.com/preferences/".concat(true != gVar.f366784b ? "interests/android-web-view" : "channels/android-web-view"));
            C45963aa.m82131a(intent, gVar.f366783a);
            intent.setFlags(268435456);
        } else {
            intent = C134471a.m218228a();
        }
        C47810es.m84979s(context, intent);
        return C60866ct.f164955a;
    }
}
