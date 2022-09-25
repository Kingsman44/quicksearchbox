package com.google.android.apps.gsa.velvet.p8863ui.settings;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.apps.gsa.voiceime.C118690b;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.PublicSettingsActivity */
/* compiled from: PG */
public class PublicSettingsActivity extends C118637b {

    /* renamed from: a */
    public C118690b f330927a;

    /* renamed from: b */
    public C92122r f330928b;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.aV);
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("android.search.action.SEARCH_SETTINGS".equals(action) || "com.google.android.googlequicksearchbox.action.PRIVACY_SETTINGS".equals(action)) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setClassName(this, "com.google.android.apps.gsa.velvet.ui.settings.SettingsActivity");
            startActivity(intent);
        } else if ("com.google.android.googlequicksearchbox.action.HOTWORD_DETECTION_SETTINGS".equals(action)) {
            startActivity(new Intent("android.intent.action.MAIN").setClassName(this, "com.google.android.apps.gsa.velvet.ui.settings.SettingsActivity").putExtra(":android:no_headers", false).putExtra(":android:show_fragment", "com.google.android.apps.gsa.speech.settingsui.hotword.HotwordSettingsFragment").putExtra("smart_lock", true).putExtra("enrollment_entry_id", 15));
        } else if ("com.google.android.googlequicksearchbox.action.VOICE_IME_SETTINGS".equals(action)) {
            C118690b bVar = this.f330927a;
            Bundle bundle2 = new Bundle();
            bundle2.putInt("extra_transcription_voice_settings_entry_point", 2);
            startActivity(((Intent) bVar.f331087a.mo17428b()).setFlags(402653184).putExtra(":android:show_fragment_args", bundle2));
        } else if ("com.google.android.apps.gsa.smartspace.SETTINGS".equals(action)) {
            this.f330928b.mo86769g();
        }
        finish();
    }
}
