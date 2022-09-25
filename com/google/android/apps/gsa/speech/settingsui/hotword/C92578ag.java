package com.google.android.apps.gsa.speech.settingsui.hotword;

import android.app.AlertDialog;
import android.content.Context;
import android.preference.Preference;
import android.preference.SwitchPreference;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92602a;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92607f;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.ag */
/* compiled from: PG */
public final class C92578ag extends C88994i implements Preference.OnPreferenceChangeListener {

    /* renamed from: a */
    public static final /* synthetic */ int f258349a = 0;

    /* renamed from: b */
    private final C92602a f258350b;

    /* renamed from: c */
    private final C92486a f258351c;

    /* renamed from: d */
    private SwitchPreference f258352d;

    public C92578ag(C92602a aVar, C92486a aVar2) {
        this.f258350b = aVar;
        this.f258351c = aVar2;
        aVar.f258443a.add(new C92577af(this));
    }

    /* renamed from: a */
    public final void mo87357a() {
        C58976aa aaVar = C58975e.f156826a;
        SwitchPreference switchPreference = this.f258352d;
        if (switchPreference != null) {
            switchPreference.setChecked(false);
        }
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        if (C92607f.m152511a(preference) == 6) {
            preference.setOnPreferenceChangeListener(this);
            this.f258352d = (SwitchPreference) preference;
        }
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        SwitchPreference switchPreference;
        if (C92607f.m152511a(preference) == 6 && ((Boolean) obj).booleanValue() && (switchPreference = this.f258352d) != null) {
            String d = this.f258351c.mo87230d();
            Context context = switchPreference.getContext();
            String upperCase = context.getString(17039370).toUpperCase(Locale.getDefault());
            new AlertDialog.Builder(context).setTitle(context.getString(R.string.hotword_pref_popup_title_from_lock_screen, new Object[]{d})).setMessage(R.string.hotword_pref_popup_from_lock_screen).setPositiveButton(upperCase, new C92575ad(switchPreference)).setNegativeButton(context.getString(17039360).toUpperCase(Locale.getDefault()), new C92576ae(switchPreference)).setCancelable(false).show();
        }
        return true;
    }
}
