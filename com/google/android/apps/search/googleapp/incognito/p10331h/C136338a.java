package com.google.android.apps.search.googleapp.incognito.p10331h;

import android.support.p031v4.app.Fragment;
import com.android.p265e.C5114a;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.incognito.p10331h.p10332a.C136342d;
import com.google.android.apps.search.googleapp.p10536x.C139865b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.incognito.h.a */
/* compiled from: PG */
public final class C136338a implements C139865b {

    /* renamed from: a */
    private final Fragment f371219a;

    /* renamed from: b */
    private final C136342d f371220b;

    /* renamed from: c */
    private final Duration f371221c;

    public C136338a(Fragment fragment, long j, C136342d dVar) {
        C69664n.m101061g(fragment, "fragment");
        this.f371219a = fragment;
        this.f371220b = dVar;
        this.f371221c = Duration.ofMillis(j);
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 151856;
    }

    /* renamed from: b */
    public final C46689ag mo111453b() {
        return this.f371220b.mo112926a();
    }

    /* renamed from: f */
    public final C60870cx mo111456f(boolean z) {
        C47633f b = this.f371220b.mo112927b(z);
        C69664n.m101060f(b, "biometricsSettingsDataSe…ometricsSetting(newValue)");
        return b;
    }

    /* renamed from: g */
    public final String mo111457g() {
        String a = C5114a.m13987a(this.f371219a.requireContext(), R.string.googleapp_incognito_settings_biometrics_summary, "count", Long.valueOf(this.f371221c.toMinutes()));
        C69664n.m101060f(a, "formatNamedArgs(\n      f…uration.toMinutes()\n    )");
        return a;
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
        String string = this.f371219a.getString(R.string.googleapp_incognito_settings_biometrics_title);
        C69664n.m101060f(string, "fragment.getString(R.str…ettings_biometrics_title)");
        return string;
    }

    /* renamed from: k */
    public final boolean mo111461k() {
        return true;
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return false;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return true;
    }
}
