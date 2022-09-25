package com.google.android.apps.search.googleapp.search.voicesearch.settings;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139865b;
import com.google.android.apps.search.googleapp.search.voicesearch.p10468b.C138715a;
import com.google.android.apps.search.googleapp.search.voicesearch.settings.p10476a.C138879m;
import com.google.android.apps.search.googleapp.search.voicesearch.settings.p10476a.C138880n;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.s */
/* compiled from: PG */
public final class C138904s implements C139865b {

    /* renamed from: a */
    private final C138880n f377824a;

    /* renamed from: b */
    private final Context f377825b;

    public C138904s(C138880n nVar, Context context) {
        this.f377824a = nVar;
        this.f377825b = context;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 161990;
    }

    /* renamed from: b */
    public final C46689ag mo111453b() {
        C138880n nVar = this.f377824a;
        return new C46719bc(nVar.f377755a, new C138879m(nVar), "lockscreen_headset_request_data_source_key");
    }

    /* renamed from: f */
    public final C60870cx mo111456f(boolean z) {
        C138880n nVar = this.f377824a;
        C60870cx e = nVar.f377758d.mo104002e(C138715a.LOCKSCREEN_HEADSET_REQUEST_ENABLED, z);
        nVar.f377756b.mo50787a(e, "lockscreen_headset_request_data_source_key");
        return e;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return BuildConfig.FLAVOR;
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
        return this.f377825b.getResources().getString(R.string.googleapp_voice_settings_lockscreen_headset_request_setting_title);
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
