package com.google.android.apps.search.googleapp.p10536x.p10537a;

import android.net.Uri;
import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139858a;
import com.google.android.apps.search.googleapp.urlhandler.C139795f;
import com.google.android.apps.search.googleapp.urlhandler.C139798i;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.x.a.d */
/* compiled from: PG */
public final class C139862d implements C139858a {

    /* renamed from: a */
    private final Fragment f380167a;

    /* renamed from: b */
    private final C139795f f380168b;

    public C139862d(Fragment fragment, C139795f fVar) {
        C69664n.m101061g(fragment, "fragment");
        this.f380167a = fragment;
        this.f380168b = fVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 146955;
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
        String string = this.f380167a.getString(R.string.googleapp_settings_terms_of_service_title);
        C69664n.m101060f(string, "fragment.getString(R.str…s_terms_of_service_title)");
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
        C139795f fVar = this.f380168b;
        Uri parse = Uri.parse("https://www.google.com/policies/terms");
        C139798i iVar = (C139798i) C139823j.f380066m.createBuilder();
        C139851q qVar = C139851q.SETTINGS;
        iVar.copyOnWrite();
        C139823j jVar = (C139823j) iVar.instance;
        jVar.f380069b = qVar.f380143m;
        jVar.f380068a |= 1;
        fVar.mo115250a(parse, (C139823j) iVar.build());
        return C60866ct.f164955a;
    }
}
