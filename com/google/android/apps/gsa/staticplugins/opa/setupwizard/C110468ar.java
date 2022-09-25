package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.C50207on;
import com.google.assistant.p3861at.C50208oo;
import com.google.assistant.p3861at.act;
import com.google.assistant.p3861at.ahz;
import com.google.assistant.p3861at.aih;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.ar */
/* compiled from: PG */
public final /* synthetic */ class C110468ar implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110473aw f307967a;

    public /* synthetic */ C110468ar(C110473aw awVar) {
        this.f307967a = awVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110473aw awVar = this.f307967a;
        act act = (act) obj;
        if ((act.f128895b & 1) != 0) {
            aih aih = act.f128874A;
            if (aih == null) {
                aih = aih.f129393g;
            }
            if (aih.f129396b.isEmpty()) {
                ((C59052c) ((C59052c) C110473aw.f307972a.mo56226d()).mo56372aa(26419)).mo56386p("fetchPeopleSettingUiFuture: MemberList empty");
                return false;
            }
            ahz ahz = (ahz) aih.f129396b.get(0);
            C110501y yVar = awVar.f307983l;
            String str = ahz.f129359c;
            if (str != null) {
                ((C110439a) yVar).f307888c = str;
                C50208oo ooVar = ahz.f129365i;
                if (ooVar == null) {
                    ooVar = C50208oo.f130513b;
                }
                int a = C50207on.m85790a(ooVar.f130515a);
                if (a == 0) {
                    a = 1;
                }
                yVar.mo98675a(a - 1);
                return true;
            }
            throw new NullPointerException("Null accountGivenName");
        }
        ((C59052c) ((C59052c) C110473aw.f307972a.mo56226d()).mo56372aa(26420)).mo56386p("fetchPeopleSettingUiFuture: no YourPeopleV2Settings returned");
        return false;
    }
}
