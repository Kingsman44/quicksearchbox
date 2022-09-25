package com.google.android.apps.search.googleapp.search.voicesearch.settings;

import android.content.Context;
import android.content.res.Resources;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8867w.p8879i.C118818s;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.search.googleapp.p10536x.C139867c;
import com.google.android.apps.search.googleapp.search.voicesearch.settings.p10476a.C138868b;
import com.google.android.apps.search.googleapp.search.voicesearch.settings.p10476a.C138880n;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.u */
/* compiled from: PG */
public final class C138906u implements C139867c {

    /* renamed from: a */
    private final C138880n f377828a;

    /* renamed from: b */
    private final Resources f377829b;

    public C138906u(C138880n nVar, Context context) {
        this.f377828a = nVar;
        this.f377829b = context.getResources();
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 142089;
    }

    /* renamed from: b */
    public final C46689ag mo111872b() {
        C138880n nVar = this.f377828a;
        return new C46719bc(nVar.f377755a, new C138868b(nVar), "spoken_results_data_source_key");
    }

    /* renamed from: c */
    public final C58485gu mo111873c() {
        return C58485gu.m89847o(this.f377829b.getString(R.string.googleapp_voice_settings_spoken_results_value_all_voices), this.f377829b.getString(R.string.googleapp_voice_settings_spoken_results_value_hands_free_only));
    }

    /* renamed from: d */
    public final C60870cx mo111874d(String str) {
        C138880n nVar = this.f377828a;
        String str2 = true != str.equals(nVar.f377759e.getString(R.string.googleapp_voice_settings_spoken_results_value_hands_free_only)) ? "voiceOnly" : "handsFreeOnly";
        C86337q b = ((C118818s) nVar.f377758d).f331393a.mo80076b();
        b.mo80073h("ttsMode", str2);
        b.apply();
        C60870cx cxVar = C60866ct.f164955a;
        nVar.f377756b.mo50787a(cxVar, "spoken_results_data_source_key");
        return cxVar;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: j */
    public final String mo111460j() {
        return this.f377829b.getString(R.string.googleapp_voice_settings_spoken_results_setting_title);
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
