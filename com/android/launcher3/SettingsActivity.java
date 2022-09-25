package com.android.launcher3;

import android.app.Activity;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.SwitchPreference;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public final class SettingsActivity extends Activity {

    /* compiled from: PG */
    public class LauncherSettingsFragment extends PreferenceFragment implements Preference.OnPreferenceChangeListener {
        private final void setupBooleanPref(String str, boolean z) {
            SwitchPreference switchPreference = (SwitchPreference) findPreference(str);
            if (switchPreference != null) {
                switchPreference.setPersistent(false);
                Bundle bundle = new Bundle();
                bundle.putBoolean("default_value", z);
                switchPreference.setChecked(getActivity().getContentResolver().call(LauncherSettings$Settings.CONTENT_URI, "get_boolean_setting", str, bundle).getBoolean("value"));
                switchPreference.setOnPreferenceChangeListener(this);
            }
        }

        public final void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(R.xml.launcher_preferences);
            setupBooleanPref("pref_allowRotation", false);
            setupBooleanPref("pref_add_icon_to_home", true);
        }

        public final boolean onPreferenceChange(Preference preference, Object obj) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("value", ((Boolean) obj).booleanValue());
            getActivity().getContentResolver().call(LauncherSettings$Settings.CONTENT_URI, "set_boolean_setting", preference.getKey(), bundle);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentManager().beginTransaction().replace(16908290, new LauncherSettingsFragment()).commit();
    }
}
