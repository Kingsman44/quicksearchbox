package androidx.preference;

import android.text.TextUtils;
import com.google.android.googlequicksearchbox.R;

/* renamed from: androidx.preference.j */
/* compiled from: PG */
public final class C4014j implements C4026v {

    /* renamed from: a */
    public static C4014j f12876a;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ CharSequence mo8450a(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(listPreference.mo8327l())) {
            return listPreference.f12738j.getString(R.string.not_set);
        }
        return listPreference.mo8327l();
    }
}
