package com.google.android.apps.gsa.speech.settingsui;

import android.content.Intent;
import android.preference.Preference;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.l */
/* compiled from: PG */
public final /* synthetic */ class C92635l implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    public final /* synthetic */ VoiceSettingsFragment f258588a;

    public /* synthetic */ C92635l(VoiceSettingsFragment voiceSettingsFragment) {
        this.f258588a = voiceSettingsFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        VoiceSettingsFragment voiceSettingsFragment = this.f258588a;
        if (voiceSettingsFragment.f258290g.u()) {
            String str = true != voiceSettingsFragment.f258289f.mo79746e(C90059dk.f249113bW) ? "phone_voice_match" : "speaker_id_enrollment";
            C18509a c = C18522b.m35986c();
            c.mo24023e("voice_settings");
            ((C18523c) c).f52492a = str;
            voiceSettingsFragment.startActivityForResult(c.mo24020b().mo24031a(), 12300);
        } else {
            voiceSettingsFragment.startActivityForResult(new Intent("android.intent.action.MAIN").setClassName(voiceSettingsFragment.getActivity(), "com.google.android.apps.gsa.velvet.ui.settings.SettingsActivity").putExtra(":android:no_headers", false).putExtra(":android:show_fragment", "com.google.android.apps.gsa.speech.settingsui.hotword.HotwordSettingsFragment").putExtra("smart_lock", true).putExtra("enrollment_entry_id", 2), 12300);
        }
        return true;
    }
}
