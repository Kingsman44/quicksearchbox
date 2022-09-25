package com.google.android.apps.gsa.assistant.settings.devices.libassistant;

import android.app.Activity;
import android.os.Bundle;
import androidx.preference.C4023s;
import androidx.preference.C4024t;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.gsa.assistant.settings.devices.shared.C9730c;
import com.google.android.apps.gsa.assistant.settings.devices.shared.C9732e;
import com.google.android.apps.gsa.assistant.settings.shared.AddressPreference;
import com.google.android.apps.gsa.assistant.settings.shared.DeviceNamePreference;
import com.google.android.apps.gsa.assistant.settings.shared.o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C50190nx;
import com.google.assistant.p3861at.C50191ny;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7805kp;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.libassistant.d */
/* compiled from: PG */
public final class C9721d extends C9730c implements C4023s, C4024t {

    /* renamed from: i */
    public static final C59071e f33584i = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.devices.libassistant.d");

    /* renamed from: j */
    public final o f33585j;

    /* renamed from: k */
    public String f33586k;

    /* renamed from: l */
    public final String f33587l;

    /* renamed from: m */
    public DeviceNamePreference f33588m;

    /* renamed from: n */
    public AddressPreference f33589n;

    /* renamed from: o */
    public TwoStatePreference f33590o;

    /* renamed from: p */
    public TwoStatePreference f33591p;

    /* renamed from: q */
    public TwoStatePreference f33592q;

    /* renamed from: r */
    public Preference f33593r;

    /* renamed from: s */
    private final C22871g f33594s;

    /* renamed from: t */
    private final C9732e f33595t;

    public C9721d(String str, String str2, C22871g gVar, o oVar, C9732e eVar) {
        this.f33594s = gVar;
        this.f33586k = str;
        this.f33587l = str2;
        this.f33585j = oVar;
        this.f33595t = eVar;
    }

    /* renamed from: F */
    public final void mo17862F(Preference preference) {
        String str = preference.f12748t;
        if ("libassistantDeviceName".equals(str)) {
            preference.f12742n = this;
            this.f33588m = (DeviceNamePreference) preference;
        } else if ("libassistantLocation".equals(str)) {
            AddressPreference addressPreference = (AddressPreference) preference;
            addressPreference.mo65201l();
            preference.f12742n = this;
            this.f33589n = addressPreference;
        } else if ("libassistantPersonalInfoPermission".equals(str)) {
            preference.f12742n = this;
            this.f33590o = (TwoStatePreference) preference;
        } else if ("libassistantNotificationPermission".equals(str)) {
            preference.f12742n = this;
            this.f33591p = (TwoStatePreference) preference;
        } else if ("libassistantPrivacyCrashLogsPermission".equals(str)) {
            preference.f12742n = this;
            this.f33592q = (TwoStatePreference) preference;
        } else if ("libassistantMediaTargetPreference".equals(str)) {
            preference.f12743o = this;
        } else if ("libassistantRemoveDevice".equals(str)) {
            this.f33593r = preference;
            preference.f12743o = this;
        }
    }

    /* renamed from: G */
    public final void mo17989G() {
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= 512;
        acv.f128954j = true;
        C50190nx nxVar = (C50190nx) C50191ny.f130478e.createBuilder();
        nxVar.copyOnWrite();
        C50191ny nyVar = (C50191ny) nxVar.instance;
        nyVar.f130480a |= 1;
        nyVar.f130481b = true;
        acu.copyOnWrite();
        acv acv2 = (acv) acu.instance;
        C50191ny nyVar2 = (C50191ny) nxVar.build();
        nyVar2.getClass();
        acv2.f128951g = nyVar2;
        acv2.f128945a |= 64;
        mo17813x(acu, new C9719b(this), false);
    }

    /* renamed from: a */
    public final boolean mo8472a(Preference preference, Object obj) {
        String str = preference.f12748t;
        if ("libassistantLocation".equals(str)) {
            AddressPreference addressPreference = this.f33589n;
            if (addressPreference != null) {
                C7805kp kpVar = (C7805kp) obj;
                if (kpVar != null) {
                    addressPreference.mo8346M(R.string.google_home_device_address_title);
                    this.f33589n.mo8329n(kpVar.f27290e);
                } else {
                    addressPreference.mo8346M(R.string.google_home_add_device_address_title);
                    this.f33589n.mo8345L(R.string.device_id_add_device_address_summary);
                }
            }
        } else if ("libassistantPersonalInfoPermission".equals(str)) {
            Activity fX = mo17794fX();
            if (!(this.f33590o == null || fX == null)) {
                this.f33595t.mo17997a(fX, C9732e.m24475b(((Boolean) obj).booleanValue()), C58485gu.m89846n(this.f33586k));
            }
        }
        this.f33594s.mo28212l("saveAssistantDeviceSettings", new C9717a(this));
        return true;
    }

    /* renamed from: b */
    public final boolean mo8421b(Preference preference) {
        String str = preference.f12748t;
        if ("libassistantMediaTargetPreference".equals(str)) {
            String str2 = this.f33586k;
            Bundle bundle = new Bundle();
            bundle.putString("assistant_device_id", str2);
            mo17788B(MediaOutputSettingsFragment.class.getName(), bundle, R.string.media_output_preference_title);
            return true;
        } else if (!"libassistantRemoveDevice".equals(str)) {
            return true;
        } else {
            mo17995T(this.f33586k, C49875cf.LIBASSISTANT);
            return true;
        }
    }

    /* renamed from: u */
    public final void mo17810u() {
        mo17989G();
    }
}
