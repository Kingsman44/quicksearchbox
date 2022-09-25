package com.google.android.apps.search.googleapp.search.suggest.settings;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139865b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.settings.k */
/* compiled from: PG */
public final class C138355k implements C139865b {

    /* renamed from: a */
    private final Context f376409a;

    /* renamed from: b */
    private final C138354j f376410b;

    public C138355k(Context context, C138354j jVar) {
        this.f376409a = context;
        this.f376410b = jVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 145340;
    }

    /* renamed from: b */
    public final C46689ag mo111453b() {
        C138354j jVar = this.f376410b;
        return new C46719bc(jVar.f376407b, new C138353i(jVar), "AUTOCOMPLETE_WITH_TRENDING_SEARCHES_DATA_SOURCE");
    }

    /* renamed from: f */
    public final C60870cx mo111456f(boolean z) {
        C138354j jVar = this.f376410b;
        C60870cx h = jVar.f376406a.mo103988h(z);
        jVar.f376408c.mo50787a(h, "AUTOCOMPLETE_WITH_TRENDING_SEARCHES_DATA_SOURCE");
        return h;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return this.f376409a.getResources().getString(R.string.googleapp_autocomplete_with_trending_searches_summary);
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
        return this.f376409a.getResources().getString(R.string.googleapp_autocomplete_with_trending_searches_title);
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
