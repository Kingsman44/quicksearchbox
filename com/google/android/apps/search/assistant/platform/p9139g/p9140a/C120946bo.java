package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

import android.os.Bundle;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108358ft;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3931f.p3942e.C52920a;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.platform.g.a.bo */
/* compiled from: PG */
final class C120946bo extends C52920a {

    /* renamed from: a */
    final String f336261a;

    /* renamed from: b */
    final String f336262b;

    /* renamed from: c */
    final Locale f336263c;

    /* renamed from: d */
    final String f336264d;

    /* renamed from: e */
    final String f336265e;

    /* renamed from: f */
    final String f336266f;

    /* renamed from: g */
    public boolean f336267g;

    /* renamed from: h */
    final C108358ft f336268h;

    public C120946bo(C120921aq aqVar) {
        this.f336261a = aqVar.mo104981b().getString(R.string.assistant_widget_fallback_text, new Object[]{aqVar.mo104986h()});
        this.f336262b = aqVar.mo104981b().getString(R.string.assistant_widget_fallback_text, new Object[]{aqVar.mo104985g()});
        this.f336263c = aqVar.mo104981b().getResources().getConfiguration().getLocales().get(0);
        this.f336264d = aqVar.mo104981b().getString(R.string.assistant_widget_preamble_text);
        this.f336265e = aqVar.mo104985g();
        this.f336266f = aqVar.mo104986h();
        this.f336268h = aqVar.mo104990l();
    }

    /* renamed from: b */
    private static String m200202b(Bundle bundle, String str, String str2) {
        if (TextUtils.isEmpty(bundle.getString(str))) {
            return str2;
        }
        return bundle.getString(str);
    }

    /* renamed from: a */
    public final void mo22098a(Bundle bundle) {
        if (!this.f336267g) {
            this.f336267g = true;
            String b = m200202b(bundle, "appActionsSpeechResponse", BuildConfig.FLAVOR);
            String b2 = m200202b(bundle, "appActionsTextResponse", BuildConfig.FLAVOR);
            String b3 = m200202b(bundle, "appActionsSpeechLanguage", Locale.getDefault().toLanguageTag());
            if (TextUtils.isEmpty(b) && TextUtils.isEmpty(b2)) {
                this.f336268h.mo96809b(this.f336262b);
                this.f336268h.mo96808a(b3, this.f336261a);
            } else if (TextUtils.isEmpty(b)) {
                this.f336268h.mo96809b(String.format(this.f336263c, this.f336264d, new Object[]{this.f336265e, b2}));
                this.f336268h.mo96808a(b3, String.format(this.f336263c, this.f336264d, new Object[]{this.f336266f, b2}));
            } else if (TextUtils.isEmpty(b2)) {
                if (b.contains("<speak>")) {
                    this.f336268h.mo96809b(this.f336262b);
                } else {
                    this.f336268h.mo96809b(String.format(this.f336263c, this.f336264d, new Object[]{this.f336265e, b}));
                }
                this.f336268h.mo96808a(b3, String.format(this.f336263c, this.f336264d, new Object[]{this.f336266f, b}));
            } else {
                this.f336268h.mo96809b(String.format(this.f336263c, this.f336264d, new Object[]{this.f336265e, b2}));
                this.f336268h.mo96808a(b3, String.format(this.f336263c, this.f336264d, new Object[]{this.f336266f, b}));
            }
        }
    }
}
