package com.google.android.apps.gsa.speech.settingsui;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92548a;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92555h;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92557j;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92558k;
import com.google.android.apps.search.assistant.platform.p9141h.p9169k.C121181d;
import com.google.android.apps.search.assistant.platform.p9141h.p9169k.p9170a.C121177c;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.f */
/* compiled from: PG */
public final class C92565f implements C92558k, C92555h {

    /* renamed from: a */
    private C92548a f258319a;

    /* renamed from: b */
    private final Context f258320b;

    /* renamed from: c */
    private final SharedPreferences f258321c;

    /* renamed from: d */
    private final C121181d f258322d;

    public C92565f(Context context, SharedPreferences sharedPreferences, C121181d dVar) {
        this.f258320b = context;
        this.f258321c = sharedPreferences;
        this.f258322d = dVar;
    }

    /* renamed from: e */
    private final void m152424e(String str) {
        String str2;
        if (str.equals(this.f258320b.getString(R.string.prefValue_ttsMode_handsFreeOnly))) {
            str2 = this.f258320b.getString(R.string.prefSummary_ttsModeHandsFreeOnly);
        } else {
            str2 = this.f258320b.getString(R.string.prefSummary_ttsModeOn);
        }
        this.f258319a.mo87335k(str2);
    }

    /* renamed from: b */
    public final void mo87342b() {
    }

    /* renamed from: c */
    public final void mo87343c() {
    }

    /* renamed from: gd */
    public final void mo87344gd(C92557j jVar) {
        C92548a aVar = (C92548a) jVar;
        this.f258319a = aVar;
        aVar.mo87332h(this);
        this.f258319a.mo87325c(this.f258321c.getString("ttsMode", this.f258320b.getString(R.string.prefDefault_ttsMode)));
        this.f258319a.mo87324b(this.f258320b.getString(R.string.prefValue_ttsMode_voiceOnly));
        this.f258319a.mo87326d();
        if (this.f258319a.mo87323a().equals(this.f258320b.getString(R.string.prefValue_ttsMode_on))) {
            this.f258319a.mo87325c(this.f258320b.getString(R.string.prefValue_ttsMode_voiceOnly));
        }
        m152424e(this.f258319a.mo87323a().toString());
    }

    /* renamed from: ge */
    public final boolean mo87340ge(C92557j jVar, Object obj) {
        String obj2 = obj.toString();
        m152424e(obj2);
        this.f258321c.edit().putString("ttsMode", obj2).apply();
        C121177c cVar = C121177c.ON;
        if (this.f258320b.getString(R.string.prefValue_ttsMode_handsFreeOnly).equals(obj2)) {
            cVar = C121177c.HANDS_FREE_ONLY;
        }
        this.f258322d.mo105071b(cVar);
        return true;
    }
}
