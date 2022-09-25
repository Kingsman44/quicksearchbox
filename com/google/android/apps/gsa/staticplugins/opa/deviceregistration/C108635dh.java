package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49883cn;
import com.google.assistant.p3861at.C49891cv;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.dh */
/* compiled from: PG */
public final class C108635dh {

    /* renamed from: a */
    public String f302170a;

    /* renamed from: b */
    private final C86124t f302171b;

    /* renamed from: c */
    private final C108617cq f302172c;

    public C108635dh(C86124t tVar, C108617cq cqVar) {
        this.f302171b = tVar;
        this.f302172c = cqVar;
    }

    /* renamed from: a */
    public final C58485gu mo97039a(C49875cf cfVar) {
        C58485gu guVar;
        if (cfVar == C49875cf.LIBASSISTANT) {
            guVar = this.f302171b.mo79745c(C90014bt.f247487iA);
        } else {
            guVar = this.f302171b.mo79745c(C90014bt.f247524il);
        }
        return C58485gu.m89842j(guVar);
    }

    /* renamed from: b */
    public final C60870cx mo97040b(String str, C49875cf cfVar, String str2) {
        this.f302170a = str2;
        C108617cq cqVar = this.f302172c;
        C49883cn cnVar = (C49883cn) C49891cv.f129647N.createBuilder();
        cnVar.copyOnWrite();
        C49891cv cvVar = (C49891cv) cnVar.instance;
        str2.getClass();
        cvVar.f129663a |= 256;
        cvVar.f129669g = str2;
        return cqVar.mo97027b(str, cfVar, (C49891cv) cnVar.build());
    }
}
