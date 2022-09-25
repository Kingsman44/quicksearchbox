package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.view.View;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49883cn;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C50250qc;
import com.google.assistant.p3861at.C50251qd;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.a */
/* compiled from: PG */
public final /* synthetic */ class C108529a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108654e f301948a;

    public /* synthetic */ C108529a(C108654e eVar) {
        this.f301948a = eVar;
    }

    public final void onClick(View view) {
        C108654e eVar = this.f301948a;
        C50250qc qcVar = (C50250qc) C50251qd.f130676e.createBuilder();
        if (!C58837ba.m90859h(eVar.f302206h.f302446k)) {
            String str = eVar.f302206h.f302446k;
            str.getClass();
            qcVar.copyOnWrite();
            C50251qd qdVar = (C50251qd) qcVar.instance;
            qdVar.f130678a |= 1;
            qdVar.f130679b = str;
        }
        Double d = eVar.f302206h.f302442g;
        if (d != null) {
            double doubleValue = d.doubleValue();
            qcVar.copyOnWrite();
            C50251qd qdVar2 = (C50251qd) qcVar.instance;
            qdVar2.f130678a |= 2;
            qdVar2.f130680c = doubleValue;
        }
        Double d2 = eVar.f302206h.f302443h;
        if (d2 != null) {
            double doubleValue2 = d2.doubleValue();
            qcVar.copyOnWrite();
            C50251qd qdVar3 = (C50251qd) qcVar.instance;
            qdVar3.f130678a |= 4;
            qdVar3.f130681d = doubleValue2;
        }
        C50251qd qdVar4 = (C50251qd) qcVar.build();
        int i = qdVar4.f130678a;
        if ((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0) {
            eVar.f302206h.f302450o.setVisibility(0);
            return;
        }
        C108617cq cqVar = eVar.f302204f;
        String str2 = (String) eVar.f302203e.mo96984c().mo56107c();
        str2.getClass();
        C49875cf b = eVar.f302203e.mo96983b();
        C49883cn cnVar = (C49883cn) C49891cv.f129647N.createBuilder();
        cnVar.copyOnWrite();
        C49891cv cvVar = (C49891cv) cnVar.instance;
        qdVar4.getClass();
        cvVar.f129668f = qdVar4;
        cvVar.f129663a |= 128;
        eVar.f302201c.mo85147l(cqVar.mo97027b(str2, b, (C49891cv) cnVar.build()), new C108595c());
        eVar.mo77318iT().mo77312a();
    }
}
