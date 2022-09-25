package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.os.Bundle;
import androidx.preference.C4023s;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124711i;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.a */
/* compiled from: PG */
public final class C9553a extends C9504g implements C4023s {

    /* renamed from: i */
    private final C89492cd f33111i;

    /* renamed from: j */
    private final String f33112j;

    /* renamed from: k */
    private C124711i f33113k;

    /* renamed from: l */
    private CheckBoxPreference f33114l;

    /* renamed from: m */
    private CheckBoxPreference f33115m;

    public C9553a(C89492cd cdVar, String str, C124711i iVar) {
        this.f33111i = cdVar;
        this.f33112j = str;
        this.f33113k = iVar;
    }

    /* renamed from: b */
    private final void m24248b() {
        CheckBoxPreference checkBoxPreference = this.f33114l;
        boolean z = true;
        if (checkBoxPreference != null) {
            checkBoxPreference.mo8391j(this.f33113k != C124711i.BUTTON_ACTION_NEXT_TRACK);
        }
        CheckBoxPreference checkBoxPreference2 = this.f33115m;
        if (checkBoxPreference2 != null) {
            if (this.f33113k != C124711i.BUTTON_ACTION_NEXT_TRACK) {
                z = false;
            }
            checkBoxPreference2.mo8391j(z);
        }
    }

    /* renamed from: a */
    public final boolean mo8472a(Preference preference, Object obj) {
        String str = preference.f12748t;
        Boolean bool = (Boolean) obj;
        if (this.f33112j == null || !bool.booleanValue()) {
            return false;
        }
        CheckBoxPreference checkBoxPreference = this.f33114l;
        if (checkBoxPreference == null || !str.equals(checkBoxPreference.f12748t)) {
            CheckBoxPreference checkBoxPreference2 = this.f33115m;
            if (checkBoxPreference2 != null && str.equals(checkBoxPreference2.f12748t)) {
                this.f33113k = C124711i.BUTTON_ACTION_NEXT_TRACK;
            }
        } else {
            this.f33113k = C124711i.BUTTON_ACTION_ASSISTANT;
        }
        m24248b();
        this.f33111i.mo83367I(this.f33112j, this.f33113k);
        return false;
    }

    /* renamed from: o */
    public final void mo17804o(Bundle bundle) {
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) mo17792e().mo8382l(mo17795g(R.string.bisto_device_double_tap_assistant_mode_value));
        this.f33114l = checkBoxPreference;
        if (checkBoxPreference != null) {
            checkBoxPreference.f12742n = this;
        }
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) mo17792e().mo8382l(mo17795g(R.string.bisto_device_double_tap_next_mode_value));
        this.f33115m = checkBoxPreference2;
        if (checkBoxPreference2 != null) {
            checkBoxPreference2.f12742n = this;
        }
    }

    /* renamed from: u */
    public final void mo17810u() {
        m24248b();
    }
}
