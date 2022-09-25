package com.google.android.apps.gsa.assistant.settings.devices.androidtv;

import androidx.preference.TwoStatePreference;
import com.google.android.apps.gsa.assistant.settings.base.C9506h;
import com.google.android.apps.gsa.assistant.settings.shared.AddressPreference;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49886cq;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49893cx;
import com.google.assistant.p3861at.C50251qd;
import com.google.assistant.p3861at.act;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7804ko;
import com.google.p375ai.p378b.C7805kp;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.androidtv.b */
/* compiled from: PG */
final class C9538b extends C9506h {

    /* renamed from: a */
    final /* synthetic */ C9540d f33058a;

    public C9538b(C9540d dVar) {
        this.f33058a = dVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17818b(Object obj) {
        int a;
        act act = (act) obj;
        if ((act.f128894a & 64) != 0) {
            C9540d dVar = this.f33058a;
            C49893cx cxVar = act.f128900g;
            if (cxVar == null) {
                cxVar = C49893cx.f129688b;
            }
            C49891cv c = dVar.f33061j.c(C49875cf.ANDROID_TV, dVar.f33062k, cxVar);
            if (c != null) {
                C50251qd qdVar = c.f129668f;
                if (qdVar == null) {
                    qdVar = C50251qd.f130676e;
                }
                boolean z = true;
                if ((c.f129663a & 128) == 0 || qdVar.f130679b.isEmpty()) {
                    AddressPreference addressPreference = dVar.f33063l;
                    if (addressPreference != null) {
                        addressPreference.mo8346M(R.string.google_home_add_device_address_title);
                        dVar.f33063l.mo8345L(R.string.device_id_add_device_address_summary);
                        dVar.f33063l.mo65200j((C7805kp) null);
                    }
                } else {
                    AddressPreference addressPreference2 = dVar.f33063l;
                    if (addressPreference2 != null) {
                        addressPreference2.mo8346M(R.string.google_home_device_address_title);
                        dVar.f33063l.mo8329n(qdVar.f130679b);
                        AddressPreference addressPreference3 = dVar.f33063l;
                        C7804ko koVar = (C7804ko) C7805kp.f27284h.createBuilder();
                        String str = qdVar.f130679b;
                        koVar.copyOnWrite();
                        C7805kp kpVar = (C7805kp) koVar.instance;
                        str.getClass();
                        kpVar.f27286a |= 8;
                        kpVar.f27290e = str;
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
                TwoStatePreference twoStatePreference = dVar.f33064m;
                if (twoStatePreference != null) {
                    int i = c.f129666d;
                    int a2 = C49886cq.m85760a(i);
                    if ((a2 == 0 || a2 != 2) && ((a = C49886cq.m85760a(i)) == 0 || a != 4)) {
                        z = false;
                    }
                    twoStatePreference.mo8391j(z);
                    return;
                }
                return;
            }
            C59104x d3 = C9540d.f33060i.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "DevIdAndroidTvSCntrl");
            ((C59052c) ((C59052c) d3).mo56372aa(333)).mo56389s("Invalid device ID: %s", dVar.f33062k);
            dVar.mo17798i();
        }
    }
}
