package com.google.android.apps.gsa.velvet.p8863ui.settings;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.g */
/* compiled from: PG */
final class C118653g extends C90880an {

    /* renamed from: a */
    final /* synthetic */ PreferenceActivity.Header f331009a;

    /* renamed from: b */
    final /* synthetic */ SettingsActivity f331010b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118653g(SettingsActivity settingsActivity, PreferenceActivity.Header header) {
        super("Get launcher pref", 1, 8);
        this.f331010b = settingsActivity;
        this.f331009a = header;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("default_value", this.f331009a.fragmentArguments.containsKey("ENABLE_BY_DEFAULT"));
        return this.f331010b.getContentResolver().call(SettingsActivity.f330930b, "get_boolean_setting", this.f331009a.fragmentArguments.getString("LAUNCHER_PREF_KEY"), bundle);
    }
}
