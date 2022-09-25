package com.google.android.apps.gsa.speech.settingsui.hotword;

import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.SwitchPreference;
import com.google.android.apps.gsa.search.core.C85767f;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92602a;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92607f;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92597d;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.t */
/* compiled from: PG */
public final class C92625t extends C88994i implements Preference.OnPreferenceChangeListener, C90991b {

    /* renamed from: a */
    public SwitchPreference f258521a;

    /* renamed from: b */
    private final C92597d f258522b;

    /* renamed from: c */
    private final C92602a f258523c;

    /* renamed from: d */
    private final C89994f f258524d;

    /* renamed from: e */
    private final SharedPreferences f258525e;

    /* renamed from: f */
    private final C90021c f258526f;

    public C92625t(C92597d dVar, C92602a aVar, C90021c cVar, C89994f fVar, SharedPreferences sharedPreferences, C91022f fVar2) {
        this.f258522b = dVar;
        this.f258523c = aVar;
        this.f258524d = fVar;
        this.f258525e = sharedPreferences;
        this.f258526f = cVar;
        fVar2.mo85301a(this);
        aVar.f258443a.add(new C92624s(this));
    }

    /* renamed from: a */
    private final boolean m152558a() {
        return this.f258525e.getBoolean("hotword_navigation_requirement_met", false);
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        if (C92607f.m152511a(preference) == 9) {
            preference.setOnPreferenceChangeListener(this);
            SwitchPreference switchPreference = (SwitchPreference) preference;
            this.f258521a = switchPreference;
            if (switchPreference == null) {
                return;
            }
            if (this.f258526f.mo79746e(C90059dk.f249040aC)) {
                this.f258521a.setSummary(R.string.hotword_pref_summary_during_navigation);
            } else if (!this.f258524d.mo83820i()) {
                this.f258521a.setSummary(R.string.hotword_pref_summary_during_gmm_navigation);
            } else if (!m152558a()) {
                this.f258521a.setSummary(R.string.hotword_pref_summary_androidauto_and_driving_mode);
            } else {
                this.f258521a.setSummary(R.string.hotword_pref_summary_during_gmm_and_androidauto_navigation);
            }
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r(getClass().getSimpleName());
        fVar.mo85279c("Hotword In GMM=").mo85276a(C90752i.m148229c(String.valueOf(m152558a())));
    }

    /* renamed from: l */
    public final boolean mo82950l(Preference preference) {
        if (C92607f.m152511a(preference) != 9 || m152558a() || this.f258524d.mo83820i()) {
            return false;
        }
        return true;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        if (C92607f.m152511a(preference) != 9) {
            return true;
        }
        C58976aa aaVar = C58975e.f156826a;
        C85767f.m137817a(this.f258522b.f258409b);
        this.f258522b.mo87372f();
        return true;
    }
}
