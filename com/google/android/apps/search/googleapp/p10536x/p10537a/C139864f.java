package com.google.android.apps.search.googleapp.p10536x.p10537a;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.p10536x.C139858a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.x.a.f */
/* compiled from: PG */
public final class C139864f implements C139858a {

    /* renamed from: a */
    private final Fragment f380171a;

    /* renamed from: b */
    private final String f380172b;

    public C139864f(Fragment fragment, String str) {
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(str, "versionString");
        this.f380171a = fragment;
        this.f380172b = str;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 142250;
    }

    /* renamed from: b */
    public final int mo111854b() {
        return -1;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return "‎".concat(String.valueOf(this.f380172b));
    }

    /* renamed from: j */
    public final String mo111460j() {
        String string = this.f380171a.getString(R.string.googleapp_about_app_version);
        C69664n.m101060f(string, "fragment.getString(R.str…gleapp_about_app_version)");
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
        return C60866ct.f164955a;
    }
}
