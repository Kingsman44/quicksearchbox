package com.google.android.apps.gsa.assistant.settings.devices.assistantsdk;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.p033v7.app.C0391l;
import androidx.preference.C4023s;
import androidx.preference.C4024t;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.gsa.assistant.settings.base.C9506h;
import com.google.android.apps.gsa.assistant.settings.devices.shared.C9730c;
import com.google.android.apps.gsa.assistant.settings.devices.shared.C9732e;
import com.google.android.apps.gsa.assistant.settings.shared.AddressPreference;
import com.google.android.apps.gsa.assistant.settings.shared.DeviceNamePreference;
import com.google.android.apps.gsa.assistant.settings.shared.o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3861at.C49897da;
import com.google.assistant.p3861at.C49898db;
import com.google.assistant.p3861at.C49903dg;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7805kp;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.assistantsdk.g */
/* compiled from: PG */
public final class C9549g extends C9730c implements C4023s, C4024t {

    /* renamed from: i */
    public static final C59071e f33080i = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.devices.assistantsdk.g");

    /* renamed from: j */
    public final o f33081j;

    /* renamed from: k */
    public final String f33082k;

    /* renamed from: l */
    public DeviceNamePreference f33083l;

    /* renamed from: m */
    public AddressPreference f33084m;

    /* renamed from: n */
    public TwoStatePreference f33085n;

    /* renamed from: o */
    public Preference f33086o;

    /* renamed from: p */
    private final C22871g f33087p;

    /* renamed from: q */
    private final C9732e f33088q;

    public C9549g(String str, C22871g gVar, o oVar, C9732e eVar) {
        this.f33087p = gVar;
        this.f33082k = str;
        this.f33081j = oVar;
        this.f33088q = eVar;
    }

    /* renamed from: F */
    public final void mo17862F(Preference preference) {
        String str = preference.f12748t;
        if ("assistantSDKDeviceName".equals(str)) {
            preference.f12742n = this;
            this.f33083l = (DeviceNamePreference) preference;
        } else if ("assistantSDKLocation".equals(str)) {
            AddressPreference addressPreference = (AddressPreference) preference;
            addressPreference.mo65201l();
            preference.f12742n = this;
            this.f33084m = addressPreference;
        } else if ("assistantSDKPersonalInfoPermission".equals(str)) {
            preference.f12742n = this;
            this.f33085n = (TwoStatePreference) preference;
        } else if ("assistantSDKRemoveDevice".equals(str)) {
            this.f33086o = preference;
            preference.f12743o = this;
        }
    }

    /* renamed from: G */
    public final void mo17865G() {
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= 512;
        acv.f128954j = true;
        mo17813x(acu, new C9545c(this), false);
    }

    /* renamed from: H */
    public final void mo17866H(C49903dg dgVar, C9506h hVar) {
        C49897da daVar = (C49897da) C49898db.f129704b.createBuilder();
        daVar.mo53372c(dgVar);
        C49898db dbVar = (C49898db) daVar.build();
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        dbVar.getClass();
        acx.f128991h = dbVar;
        acx.f128984a |= 32;
        mo17814y((acx) acw.build(), hVar);
    }

    /* renamed from: a */
    public final boolean mo8472a(Preference preference, Object obj) {
        String str = preference.f12748t;
        if ("assistantSDKLocation".equals(str)) {
            AddressPreference addressPreference = this.f33084m;
            if (addressPreference != null) {
                C7805kp kpVar = (C7805kp) obj;
                if (kpVar != null) {
                    addressPreference.mo8346M(R.string.google_home_device_address_title);
                    this.f33084m.mo8329n(kpVar.f27290e);
                } else {
                    addressPreference.mo8346M(R.string.google_home_add_device_address_title);
                    this.f33084m.mo8345L(R.string.device_id_add_device_address_summary);
                }
            }
        } else if ("assistantSDKPersonalInfoPermission".equals(str)) {
            Activity fX = mo17794fX();
            if (!(this.f33085n == null || fX == null)) {
                this.f33088q.mo17997a(fX, C9732e.m24475b(((Boolean) obj).booleanValue()), C58485gu.m89846n(this.f33082k));
            }
        }
        this.f33087p.mo28212l("saveAssistantDeviceSettings", new C9542a(this));
        return true;
    }

    /* renamed from: b */
    public final boolean mo8421b(Preference preference) {
        C0391l gh;
        if (!"assistantSDKRemoveDevice".equals(preference.f12748t) || (gh = mo17796gh()) == null) {
            return true;
        }
        C0391l title = gh.setTitle(preference.f12745q);
        title.mo1300f(R.string.assistant_settings_unlink_devices_common_text);
        title.setPositiveButton(R.string.assistant_settings_unlink, new C9547e(this)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create().show();
        return true;
    }

    /* renamed from: u */
    public final void mo17810u() {
        mo17865G();
    }
}
