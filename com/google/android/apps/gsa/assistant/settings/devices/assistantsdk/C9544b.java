package com.google.android.apps.gsa.assistant.settings.devices.assistantsdk;

import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.gsa.assistant.settings.base.C9506h;
import com.google.android.apps.gsa.assistant.settings.shared.AddressPreference;
import com.google.android.apps.gsa.assistant.settings.shared.DeviceNamePreference;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49886cq;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49893cx;
import com.google.assistant.p3861at.C50094ki;
import com.google.assistant.p3861at.C50096kk;
import com.google.assistant.p3861at.C50251qd;
import com.google.assistant.p3861at.act;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7804ko;
import com.google.p375ai.p378b.C7805kp;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.assistantsdk.b */
/* compiled from: PG */
final class C9544b extends C9506h {

    /* renamed from: a */
    final /* synthetic */ C49891cv f33073a;

    /* renamed from: b */
    final /* synthetic */ act f33074b;

    /* renamed from: c */
    final /* synthetic */ C9545c f33075c;

    public C9544b(C9545c cVar, C49891cv cvVar, act act) {
        this.f33075c = cVar;
        this.f33073a = cvVar;
        this.f33074b = act;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo17818b(Object obj) {
        act act = (act) obj;
        C50096kk kkVar = act.f128915v;
        if (kkVar == null) {
            kkVar = C50096kk.f130240b;
        }
        if (kkVar.f130242a.size() == 0) {
            C59104x d = C9549g.f33080i.mo56226d();
            d.mo56378ag(C58975e.f156826a, "DevIdSDKSCntrl");
            ((C59052c) ((C59052c) d).mo56372aa(336)).mo56389s("Invalid device model ID: %s", this.f33073a.f129686y);
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        C9549g gVar = this.f33075c.f33076a;
        C49893cx cxVar = this.f33074b.f128900g;
        if (cxVar == null) {
            cxVar = C49893cx.f129688b;
        }
        C50096kk kkVar2 = act.f128915v;
        if (kkVar2 == null) {
            kkVar2 = C50096kk.f130240b;
        }
        C50094ki kiVar = (C50094ki) kkVar2.f130242a.get(0);
        C49891cv c = gVar.f33081j.c(C49875cf.ASSISTANT_SDK, gVar.f33082k, cxVar);
        if (c != null) {
            DeviceNamePreference deviceNamePreference = gVar.f33083l;
            if (deviceNamePreference != null) {
                deviceNamePreference.mo8323j(c.f129665c);
            }
            C50251qd qdVar = c.f129668f;
            if (qdVar == null) {
                qdVar = C50251qd.f130676e;
            }
            if ((c.f129663a & 128) == 0 || qdVar.f130679b.isEmpty()) {
                AddressPreference addressPreference = gVar.f33084m;
                if (addressPreference != null) {
                    addressPreference.mo8346M(R.string.google_home_add_device_address_title);
                    gVar.f33084m.mo8345L(R.string.device_id_add_device_address_summary);
                    gVar.f33084m.mo65200j((C7805kp) null);
                }
            } else {
                AddressPreference addressPreference2 = gVar.f33084m;
                if (addressPreference2 != null) {
                    addressPreference2.mo8346M(R.string.google_home_device_address_title);
                    gVar.f33084m.mo8329n(qdVar.f130679b);
                    AddressPreference addressPreference3 = gVar.f33084m;
                    C7804ko koVar = (C7804ko) C7805kp.f27284h.createBuilder();
                    String str = qdVar.f130679b;
                    koVar.copyOnWrite();
                    C7805kp kpVar = (C7805kp) koVar.instance;
                    str.getClass();
                    kpVar.f27286a |= 8;
                    kpVar.f27290e = str;
                    double d2 = qdVar.f130680c;
                    koVar.copyOnWrite();
                    C7805kp kpVar2 = (C7805kp) koVar.instance;
                    kpVar2.f27286a |= 1;
                    kpVar2.f27287b = d2;
                    double d3 = qdVar.f130681d;
                    koVar.copyOnWrite();
                    C7805kp kpVar3 = (C7805kp) koVar.instance;
                    kpVar3.f27286a |= 2;
                    kpVar3.f27288c = d3;
                    addressPreference3.mo65200j((C7805kp) koVar.build());
                }
            }
            TwoStatePreference twoStatePreference = gVar.f33085n;
            if (twoStatePreference != null) {
                int a = C49886cq.m85760a(c.f129666d);
                twoStatePreference.mo8391j(a != 0 && a == 2);
            }
            Preference preference = gVar.f33086o;
            if (preference != null) {
                preference.mo8347N(gVar.mo17797h(R.string.assistant_settings_unlink_devices_title, c.f129665c));
                return;
            }
            return;
        }
        C59104x d4 = C9549g.f33080i.mo56226d();
        d4.mo56378ag(C58975e.f156826a, "DevIdSDKSCntrl");
        ((C59052c) ((C59052c) d4).mo56372aa(341)).mo56389s("Invalid device ID: %s", gVar.f33082k);
        gVar.mo17798i();
    }
}
