package com.google.android.apps.search.googleapp.search.suggest.settings;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139865b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.settings.c */
/* compiled from: PG */
public final class C138347c implements C139865b {

    /* renamed from: a */
    private final Context f376391a;

    /* renamed from: b */
    private final C138346b f376392b;

    public C138347c(Context context, C138346b bVar) {
        this.f376391a = context;
        this.f376392b = bVar;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 147107;
    }

    /* renamed from: b */
    public final C46689ag mo111453b() {
        return this.f376392b.mo114243a();
    }

    /* renamed from: f */
    public final C60870cx mo111456f(boolean z) {
        C138346b bVar = this.f376392b;
        C60870cx m = bVar.f376388a.mo103993m(z);
        bVar.f376389b.mo50787a(m, "APP_SUGGESTIONS_DATA_SOURCE");
        return m;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return this.f376391a.getResources().getString(R.string.googleapp_app_suggestions_summary);
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
        return this.f376391a.getResources().getString(R.string.googleapp_app_suggestions_title);
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
