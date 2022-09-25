package com.google.android.apps.gsa.assistant.settings.devices.libassistant;

import androidx.preference.TwoStatePreference;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.shared.AddressPreference;
import com.google.android.apps.gsa.assistant.settings.shared.DeviceNamePreference;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49883cn;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49897da;
import com.google.assistant.p3861at.C49898db;
import com.google.assistant.p3861at.C49902df;
import com.google.assistant.p3861at.C49903dg;
import com.google.assistant.p3861at.C49914dr;
import com.google.assistant.p3861at.C49915ds;
import com.google.assistant.p3861at.C50250qc;
import com.google.assistant.p3861at.C50251qd;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.p375ai.p378b.C7805kp;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.libassistant.a */
/* compiled from: PG */
public final /* synthetic */ class C9717a implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C9721d f33581a;

    public /* synthetic */ C9717a(C9721d dVar) {
        this.f33581a = dVar;
    }

    public final void run() {
        C9721d dVar = this.f33581a;
        if (dVar.f33586k != null) {
            C49883cn cnVar = (C49883cn) C49891cv.f129647N.createBuilder();
            DeviceNamePreference deviceNamePreference = dVar.f33588m;
            if (deviceNamePreference != null) {
                String str = deviceNamePreference.f12703g;
                cnVar.copyOnWrite();
                C49891cv cvVar = (C49891cv) cnVar.instance;
                str.getClass();
                cvVar.f129663a |= 1;
                cvVar.f129665c = str;
            }
            AddressPreference addressPreference = dVar.f33589n;
            if (addressPreference != null) {
                C7805kp kpVar = addressPreference.f194984a;
                if (kpVar != null) {
                    C50250qc qcVar = (C50250qc) C50251qd.f130676e.createBuilder();
                    String str2 = kpVar.f27290e;
                    qcVar.copyOnWrite();
                    C50251qd qdVar = (C50251qd) qcVar.instance;
                    str2.getClass();
                    qdVar.f130678a |= 1;
                    qdVar.f130679b = str2;
                    double d = kpVar.f27287b;
                    qcVar.copyOnWrite();
                    C50251qd qdVar2 = (C50251qd) qcVar.instance;
                    qdVar2.f130678a |= 2;
                    qdVar2.f130680c = d;
                    double d2 = kpVar.f27288c;
                    qcVar.copyOnWrite();
                    C50251qd qdVar3 = (C50251qd) qcVar.instance;
                    qdVar3.f130678a |= 4;
                    qdVar3.f130681d = d2;
                    C50251qd qdVar4 = (C50251qd) qcVar.build();
                    cnVar.copyOnWrite();
                    C49891cv cvVar2 = (C49891cv) cnVar.instance;
                    qdVar4.getClass();
                    cvVar2.f129668f = qdVar4;
                    cvVar2.f129663a |= 128;
                } else {
                    C50250qc qcVar2 = (C50250qc) C50251qd.f130676e.createBuilder();
                    qcVar2.copyOnWrite();
                    C50251qd qdVar5 = (C50251qd) qcVar2.instance;
                    qdVar5.f130678a |= 1;
                    qdVar5.f130679b = BuildConfig.FLAVOR;
                    C50251qd qdVar6 = (C50251qd) qcVar2.build();
                    cnVar.copyOnWrite();
                    C49891cv cvVar3 = (C49891cv) cnVar.instance;
                    qdVar6.getClass();
                    cvVar3.f129668f = qdVar6;
                    cvVar3.f129663a |= 128;
                }
            }
            TwoStatePreference twoStatePreference = dVar.f33590o;
            int i = 3;
            if (twoStatePreference != null) {
                int i2 = true != twoStatePreference.f12789a ? 3 : 2;
                cnVar.copyOnWrite();
                C49891cv cvVar4 = (C49891cv) cnVar.instance;
                cvVar4.f129666d = i2 - 1;
                cvVar4.f129663a |= 2;
            }
            TwoStatePreference twoStatePreference2 = dVar.f33591p;
            if (twoStatePreference2 != null) {
                if (true == twoStatePreference2.f12789a) {
                    i = 2;
                }
                cnVar.copyOnWrite();
                C49891cv cvVar5 = (C49891cv) cnVar.instance;
                cvVar5.f129680s = i - 1;
                cvVar5.f129663a |= C89885b.NOW_VALUE;
            }
            if (dVar.f33592q != null) {
                C49914dr drVar = (C49914dr) C49915ds.f129741c.createBuilder();
                boolean z = dVar.f33592q.f12789a;
                drVar.copyOnWrite();
                C49915ds dsVar = (C49915ds) drVar.instance;
                dsVar.f129743a |= 1;
                dsVar.f129744b = z;
                C49915ds dsVar2 = (C49915ds) drVar.build();
                cnVar.copyOnWrite();
                C49891cv cvVar6 = (C49891cv) cnVar.instance;
                dsVar2.getClass();
                cvVar6.f129652C = dsVar2;
                cvVar6.f129664b |= 512;
            }
            C49902df dfVar = (C49902df) C49903dg.f129712g.createBuilder();
            String str3 = dVar.f33586k;
            dfVar.copyOnWrite();
            C49903dg dgVar = (C49903dg) dfVar.instance;
            str3.getClass();
            dgVar.f129714a = 1 | dgVar.f129714a;
            dgVar.f129715b = str3;
            C49875cf cfVar = C49875cf.LIBASSISTANT;
            dfVar.copyOnWrite();
            C49903dg dgVar2 = (C49903dg) dfVar.instance;
            dgVar2.f129716c = cfVar.f129621v;
            dgVar2.f129714a |= 2;
            dfVar.copyOnWrite();
            C49903dg dgVar3 = (C49903dg) dfVar.instance;
            C49891cv cvVar7 = (C49891cv) cnVar.build();
            cvVar7.getClass();
            dgVar3.f129719f = cvVar7;
            dgVar3.f129714a |= 32;
            C9720c cVar = new C9720c(dVar);
            C49897da daVar = (C49897da) C49898db.f129704b.createBuilder();
            daVar.mo53372c((C49903dg) dfVar.build());
            C49898db dbVar = (C49898db) daVar.build();
            acw acw = (acw) acx.f128971H.createBuilder();
            acw.copyOnWrite();
            acx acx = (acx) acw.instance;
            dbVar.getClass();
            acx.f128991h = dbVar;
            acx.f128984a |= 32;
            dVar.mo17814y((acx) acw.build(), cVar);
        }
    }
}
