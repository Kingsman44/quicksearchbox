package com.google.android.apps.search.googleapp.search.voicesearch.settings;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10536x.C139865b;
import com.google.android.apps.search.googleapp.search.voicesearch.p10468b.C138715a;
import com.google.android.apps.search.googleapp.search.voicesearch.settings.p10476a.C138876j;
import com.google.android.apps.search.googleapp.search.voicesearch.settings.p10476a.C138880n;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.d */
/* compiled from: PG */
public final class C138887d implements C139865b {

    /* renamed from: a */
    private final C138880n f377772a;

    /* renamed from: b */
    private final Context f377773b;

    public C138887d(C138880n nVar, Context context) {
        this.f377772a = nVar;
        this.f377773b = context;
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 161730;
    }

    /* renamed from: b */
    public final C46689ag mo111453b() {
        C138880n nVar = this.f377772a;
        return new C46719bc(nVar.f377755a, new C138876j(nVar), "bluetooth_audio_recording_data_source_key");
    }

    /* renamed from: f */
    public final C60870cx mo111456f(boolean z) {
        C138880n nVar = this.f377772a;
        C60870cx e = nVar.f377758d.mo104002e(C138715a.BLUETOOTH_AUDIO_RECORDING_ENABLED, z);
        nVar.f377756b.mo50787a(e, "bluetooth_audio_recording_data_source_key");
        return e;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return this.f377773b.getResources().getString(R.string.googleapp_voice_settings_bluetooth_audio_recording_setting_summary);
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
        return this.f377773b.getResources().getString(R.string.googleapp_voice_settings_bluetooth_audio_recording_setting_title);
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
