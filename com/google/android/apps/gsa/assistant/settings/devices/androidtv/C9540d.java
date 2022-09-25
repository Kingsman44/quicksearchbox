package com.google.android.apps.gsa.assistant.settings.devices.androidtv;

import android.app.Activity;
import androidx.preference.C4023s;
import androidx.preference.C4024t;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.gsa.assistant.settings.devices.shared.C9730c;
import com.google.android.apps.gsa.assistant.settings.devices.shared.C9732e;
import com.google.android.apps.gsa.assistant.settings.shared.AddressPreference;
import com.google.android.apps.gsa.assistant.settings.shared.o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7805kp;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.androidtv.d */
/* compiled from: PG */
public final class C9540d extends C9730c implements C4023s, C4024t {

    /* renamed from: i */
    public static final C59071e f33060i = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.devices.androidtv.d");

    /* renamed from: j */
    public final o f33061j;

    /* renamed from: k */
    public final String f33062k;

    /* renamed from: l */
    public AddressPreference f33063l;

    /* renamed from: m */
    public TwoStatePreference f33064m;

    /* renamed from: n */
    private final C22871g f33065n;

    /* renamed from: o */
    private final C9732e f33066o;

    public C9540d(String str, C22871g gVar, o oVar, C9732e eVar) {
        this.f33065n = gVar;
        this.f33062k = str;
        this.f33061j = oVar;
        this.f33066o = eVar;
    }

    /* renamed from: F */
    public final void mo17862F(Preference preference) {
        String str = preference.f12748t;
        if ("androidTvLocation".equals(str)) {
            AddressPreference addressPreference = (AddressPreference) preference;
            addressPreference.mo65201l();
            preference.f12742n = this;
            this.f33063l = addressPreference;
        } else if ("androidTvPersonalInfoPermission".equals(str)) {
            preference.f12742n = this;
            this.f33064m = (TwoStatePreference) preference;
        } else if ("androidTvUnlinkDevice".equals(str)) {
            preference.f12743o = this;
        }
    }

    /* renamed from: G */
    public final void mo17863G() {
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= 512;
        acv.f128954j = true;
        mo17813x(acu, new C9538b(this), false);
    }

    /* renamed from: a */
    public final boolean mo8472a(Preference preference, Object obj) {
        String str = preference.f12748t;
        if ("androidTvLocation".equals(str)) {
            AddressPreference addressPreference = this.f33063l;
            if (addressPreference != null) {
                C7805kp kpVar = (C7805kp) obj;
                if (kpVar != null) {
                    addressPreference.mo8346M(R.string.google_home_device_address_title);
                    this.f33063l.mo8329n(kpVar.f27290e);
                } else {
                    addressPreference.mo8346M(R.string.google_home_add_device_address_title);
                    this.f33063l.mo8345L(R.string.device_id_add_device_address_summary);
                }
            }
        } else if ("androidTvPersonalInfoPermission".equals(str)) {
            Activity fX = mo17794fX();
            if (!(this.f33064m == null || fX == null)) {
                this.f33066o.mo17997a(fX, C9732e.m24475b(((Boolean) obj).booleanValue()), C58485gu.m89846n(this.f33062k));
            }
        }
        this.f33065n.mo28212l("saveAssistantDeviceSettings", new C9536a(this));
        return true;
    }

    /* renamed from: b */
    public final boolean mo8421b(Preference preference) {
        if (!"androidTvUnlinkDevice".equals(preference.f12748t)) {
            return true;
        }
        mo17995T(this.f33062k, C49875cf.ANDROID_TV);
        return true;
    }

    /* renamed from: u */
    public final void mo17810u() {
        mo17863G();
    }
}
