package com.google.android.apps.gsa.speech.settingsui.hotword;

import android.preference.Preference;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92607f;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.q */
/* compiled from: PG */
public final class C92622q extends C88994i implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    public static final /* synthetic */ int f258518a = 0;

    /* renamed from: b */
    private final C91097g f258519b;

    public C92622q(C91097g gVar) {
        this.f258519b = gVar;
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        if (C92607f.m152511a(preference) == 12) {
            preference.setOnPreferenceClickListener(this);
        }
    }

    public final boolean onPreferenceClick(Preference preference) {
        if (C92607f.m152511a(preference) != 12) {
            return true;
        }
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "speaker_id_enrollment";
        this.f258519b.mo65090b(c.mo24020b().mo24031a(), C92621p.f258517a);
        return true;
    }
}
