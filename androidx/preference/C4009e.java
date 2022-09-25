package androidx.preference;

import android.text.TextUtils;
import com.google.android.googlequicksearchbox.R;

/* renamed from: androidx.preference.e */
/* compiled from: PG */
public final class C4009e implements C4026v {

    /* renamed from: a */
    public static C4009e f12867a;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ CharSequence mo8450a(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        return TextUtils.isEmpty(editTextPreference.f12703g) ? editTextPreference.f12738j.getString(R.string.not_set) : editTextPreference.f12703g;
    }
}
