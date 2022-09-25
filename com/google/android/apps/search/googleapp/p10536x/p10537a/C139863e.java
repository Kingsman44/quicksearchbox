package com.google.android.apps.search.googleapp.p10536x.p10537a;

import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.h.r.b;
import com.google.android.apps.search.googleapp.p10536x.C139858a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.x.a.e */
/* compiled from: PG */
public final class C139863e implements C139858a {

    /* renamed from: a */
    private final Fragment f380169a;

    /* renamed from: b */
    private final b f380170b;

    public C139863e(Fragment fragment, b bVar) {
        C69664n.m101061g(fragment, "fragment");
        this.f380169a = fragment;
        this.f380170b = bVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 146953;
    }

    /* renamed from: b */
    public final int mo111854b() {
        return -1;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: j */
    public final String mo111460j() {
        String string = this.f380169a.getString(R.string.googleapp_settings_open_source_licenses_title);
        C69664n.m101060f(string, "fragment.getString(R.str…en_source_licenses_title)");
        return string;
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
        this.f380170b.mo41490e((Object) null);
        return C60866ct.f164955a;
    }
}
