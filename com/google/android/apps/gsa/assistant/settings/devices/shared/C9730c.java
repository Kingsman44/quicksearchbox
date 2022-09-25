package com.google.android.apps.gsa.assistant.settings.devices.shared;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p033v7.app.C0391l;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C49875cf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.shared.c */
/* compiled from: PG */
public abstract class C9730c extends C9504g {
    /* renamed from: F */
    public abstract void mo17862F(Preference preference);

    /* renamed from: S */
    public final void mo17994S(Preference preference) {
        mo17862F(preference);
        if (preference instanceof PreferenceGroup) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
            int j = preferenceGroup.mo8381j();
            while (true) {
                j--;
                if (j >= 0) {
                    Preference o = preferenceGroup.mo8383o(j);
                    C58976aa aaVar = C58975e.f156826a;
                    mo17994S(o);
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final void mo17995T(String str, C49875cf cfVar) {
        C0391l gh = mo17796gh();
        if (gh != null && str != null) {
            gh.mo1307l(R.string.assistant_settings_unlink_devices_common_title);
            gh.mo1300f(R.string.assistant_settings_unlink_devices_common_text);
            gh.setPositiveButton(R.string.assistant_settings_unlink, new C9728a(this, str, cfVar)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create().show();
        }
    }

    /* renamed from: o */
    public void mo17804o(Bundle bundle) {
        mo17994S(mo17792e());
    }
}
