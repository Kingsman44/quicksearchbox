package com.google.android.apps.search.assistant.libraries.p8946b.p8950c;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65791bv;

/* renamed from: com.google.android.apps.search.assistant.libraries.b.c.b */
/* compiled from: PG */
public final /* synthetic */ class C119227b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C119228c f332502a;

    public /* synthetic */ C119227b(C119228c cVar) {
        this.f332502a = cVar;
    }

    public final C60870cx apply(Object obj) {
        C119228c cVar = this.f332502a;
        C58485gu guVar = (C58485gu) obj;
        if (guVar.isEmpty()) {
            ((C59052c) ((C59052c) C119228c.f332503a.mo56224b()).mo56372aa(34374)).mo56386p("Skip Usonia module downloading because no localNetworkSyncMetadataElements is present.");
            return C60866ct.f164955a;
        } else if (((C65791bv) guVar.get(0)).f178842a) {
            return cVar.f332505c.mo106379a();
        } else {
            ((C59052c) ((C59052c) C119228c.f332503a.mo56224b()).mo56372aa(34373)).mo56386p("Skip Usonia module downloading because there is no Usonia-capable device in the HomeGraph");
            return C60866ct.f164955a;
        }
    }
}
