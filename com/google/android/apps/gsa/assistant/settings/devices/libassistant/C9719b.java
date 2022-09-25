package com.google.android.apps.gsa.assistant.settings.devices.libassistant;

import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.gsa.assistant.settings.base.C9506h;
import com.google.android.apps.gsa.assistant.settings.shared.AddressPreference;
import com.google.android.apps.gsa.assistant.settings.shared.DeviceNamePreference;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49879cj;
import com.google.assistant.p3861at.C49886cq;
import com.google.assistant.p3861at.C49888cs;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49893cx;
import com.google.assistant.p3861at.C49915ds;
import com.google.assistant.p3861at.C50173ng;
import com.google.assistant.p3861at.C50181no;
import com.google.assistant.p3861at.C50189nw;
import com.google.assistant.p3861at.C50251qd;
import com.google.assistant.p3861at.act;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7804ko;
import com.google.p375ai.p378b.C7805kp;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.libassistant.b */
/* compiled from: PG */
final class C9719b extends C9506h {

    /* renamed from: a */
    final /* synthetic */ C9721d f33582a;

    public C9719b(C9721d dVar) {
        this.f33582a = dVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17818b(Object obj) {
        String str;
        String str2;
        act act = (act) obj;
        C9721d dVar = this.f33582a;
        C49893cx cxVar = act.f128900g;
        if (cxVar == null) {
            cxVar = C49893cx.f129688b;
        }
        C50189nw nwVar = act.f128898e;
        if (nwVar == null) {
            nwVar = C50189nw.f130472e;
        }
        C49891cv c = dVar.f33585j.c(C49875cf.LIBASSISTANT, dVar.f33586k, cxVar);
        if (!(c != null || (str = dVar.f33586k) == null || (str2 = dVar.f33587l) == null)) {
            C49875cf cfVar = C49875cf.LIBASSISTANT;
            Iterator it = nwVar.f130475b.iterator();
            loop0:
            while (true) {
                if (!it.hasNext()) {
                    r9 = null;
                    break;
                }
                C50173ng ngVar = (C50173ng) it.next();
                C50181no noVar = ngVar.f130427g;
                if (noVar == null) {
                    noVar = C50181no.f130444i;
                }
                if (str2.equals(noVar.f130446a) && ngVar.f130423c.equalsIgnoreCase(str)) {
                    String str3 = ngVar.f130422b;
                    for (C49879cj cjVar : cxVar.f129690a) {
                        C49875cf a = C49875cf.m85755a(cjVar.f129638i);
                        if (a == null) {
                            a = C49875cf.UNKNOWN;
                        }
                        if (a == cfVar) {
                            C49891cv cvVar = cjVar.f129639j;
                            if (cvVar == null) {
                                cvVar = C49891cv.f129647N;
                            }
                            if (cvVar.f129650A.equals(str3)) {
                                break loop0;
                            }
                        }
                    }
                    continue;
                }
            }
            if (cjVar != null) {
                dVar.f33586k = cjVar.f129631b;
                if ((cjVar.f129630a & 256) != 0) {
                    c = cjVar.f129639j;
                    if (c == null) {
                        c = C49891cv.f129647N;
                    }
                } else {
                    c = null;
                }
            }
        }
        if (c != null) {
            DeviceNamePreference deviceNamePreference = dVar.f33588m;
            if (deviceNamePreference != null) {
                deviceNamePreference.mo8323j(c.f129665c);
            }
            C50251qd qdVar = c.f129668f;
            if (qdVar == null) {
                qdVar = C50251qd.f130676e;
            }
            if ((c.f129663a & 128) == 0 || qdVar.f130679b.isEmpty()) {
                AddressPreference addressPreference = dVar.f33589n;
                if (addressPreference != null) {
                    addressPreference.mo8346M(R.string.google_home_add_device_address_title);
                    dVar.f33589n.mo8345L(R.string.device_id_add_device_address_summary);
                    dVar.f33589n.mo65200j((C7805kp) null);
                }
            } else {
                AddressPreference addressPreference2 = dVar.f33589n;
                if (addressPreference2 != null) {
                    addressPreference2.mo8346M(R.string.google_home_device_address_title);
                    dVar.f33589n.mo8329n(qdVar.f130679b);
                    AddressPreference addressPreference3 = dVar.f33589n;
                    C7804ko koVar = (C7804ko) C7805kp.f27284h.createBuilder();
                    String str4 = qdVar.f130679b;
                    koVar.copyOnWrite();
                    C7805kp kpVar = (C7805kp) koVar.instance;
                    str4.getClass();
                    kpVar.f27286a |= 8;
                    kpVar.f27290e = str4;
                    double d = qdVar.f130680c;
                    koVar.copyOnWrite();
                    C7805kp kpVar2 = (C7805kp) koVar.instance;
                    kpVar2.f27286a |= 1;
                    kpVar2.f27287b = d;
                    double d2 = qdVar.f130681d;
                    koVar.copyOnWrite();
                    C7805kp kpVar3 = (C7805kp) koVar.instance;
                    kpVar3.f27286a |= 2;
                    kpVar3.f27288c = d2;
                    addressPreference3.mo65200j((C7805kp) koVar.build());
                }
            }
            TwoStatePreference twoStatePreference = dVar.f33590o;
            if (twoStatePreference != null) {
                int a2 = C49886cq.m85760a(c.f129666d);
                twoStatePreference.mo8391j(a2 != 0 && a2 == 2);
            }
            TwoStatePreference twoStatePreference2 = dVar.f33591p;
            if (twoStatePreference2 != null) {
                int a3 = C49888cs.m85761a(c.f129680s);
                twoStatePreference2.mo8391j(a3 != 0 && a3 == 2);
            }
            TwoStatePreference twoStatePreference3 = dVar.f33592q;
            if (twoStatePreference3 != null) {
                C49915ds dsVar = c.f129652C;
                if (dsVar == null) {
                    dsVar = C49915ds.f129741c;
                }
                twoStatePreference3.mo8391j(dsVar.f129744b);
                dVar.f33592q.mo8329n(dVar.mo17797h(R.string.common_device_crash_dump_permission_summary, c.f129665c));
            }
            Preference preference = dVar.f33593r;
            if (preference != null) {
                preference.mo8347N(dVar.mo17797h(R.string.assistant_settings_unlink_devices_title, c.f129665c));
                return;
            }
            return;
        }
        C59104x d3 = C9721d.f33584i.mo56226d();
        d3.mo56378ag(C58975e.f156826a, "DevIdLibSCntrl");
        ((C59052c) ((C59052c) d3).mo56372aa(447)).mo56389s("Invalid device ID: %s", dVar.f33586k);
        dVar.mo17798i();
    }
}
