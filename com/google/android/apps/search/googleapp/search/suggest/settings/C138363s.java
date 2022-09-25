package com.google.android.apps.search.googleapp.search.suggest.settings;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139865b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.settings.s */
/* compiled from: PG */
public final class C138363s implements C139865b {

    /* renamed from: a */
    private final Context f376426a;

    /* renamed from: b */
    private final C138360p f376427b;

    public C138363s(Context context, C138360p pVar) {
        this.f376426a = context;
        this.f376427b = pVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 158900;
    }

    /* renamed from: b */
    public final C46689ag mo111453b() {
        return this.f376427b.mo114247a();
    }

    /* renamed from: f */
    public final C60870cx mo111456f(boolean z) {
        C138360p pVar = this.f376427b;
        C60870cx a = pVar.f376419a.mo46039a(new C138359o(z), C60826bg.f164896a);
        pVar.f376420b.mo50787a(a, "OFFLINE_SUGGEST_SETTING_DATA_SOURCE");
        return a;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return this.f376426a.getResources().getString(R.string.googleapp_offline_suggest_summary);
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
        return this.f376426a.getResources().getString(R.string.googleapp_offline_suggest_title);
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
