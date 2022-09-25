package com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.velvet.p8863ui.settings.SettingsActivity;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.b.k */
/* compiled from: PG */
public final class C118648k {
    /* renamed from: a */
    public static Intent m196972a(Context context) {
        return new Intent("android.intent.action.MAIN").setClass(context, SettingsActivity.class).putExtra(":android:no_headers", false).putExtra(":android:show_fragment", "com.google.android.apps.gsa.speech.settingsui.VoiceSettingsFragment").putExtra(":android:show_fragment_title", R.string.voice_settings);
    }
}
