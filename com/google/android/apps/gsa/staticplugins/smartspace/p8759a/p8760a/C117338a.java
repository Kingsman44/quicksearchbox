package com.google.android.apps.gsa.staticplugins.smartspace.p8759a.p8760a;

import com.google.android.apps.gsa.staticplugins.smartspace.p8759a.C117337a;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50814dk;
import com.google.assistant.p3886c.C50817dn;
import com.google.assistant.p3886c.C50818do;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.a.a.a */
/* compiled from: PG */
public final class C117338a implements C117337a {
    /* renamed from: a */
    public final C50818do mo103265a(C50818do doVar) {
        C50817dn dnVar = doVar.f132295A;
        if (dnVar == null) {
            dnVar = C50817dn.f132287e;
        }
        C50814dk dkVar = (C50814dk) dnVar.toBuilder();
        dkVar.copyOnWrite();
        C50817dn dnVar2 = (C50817dn) dkVar.instance;
        dnVar2.f132289a |= 2;
        dnVar2.f132291c = 0.0f;
        dkVar.copyOnWrite();
        C50817dn dnVar3 = (C50817dn) dkVar.instance;
        dnVar3.f132289a |= 1;
        dnVar3.f132290b = 0.0f;
        C50790cn cnVar = (C50790cn) doVar.toBuilder();
        C50817dn dnVar4 = (C50817dn) dkVar.build();
        cnVar.copyOnWrite();
        C50818do doVar2 = (C50818do) cnVar.instance;
        dnVar4.getClass();
        doVar2.f132295A = dnVar4;
        doVar2.f132304a |= 67108864;
        return (C50818do) cnVar.build();
    }
}
