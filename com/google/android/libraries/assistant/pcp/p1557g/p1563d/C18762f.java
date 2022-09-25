package com.google.android.libraries.assistant.pcp.p1557g.p1563d;

import com.google.android.libraries.assistant.pcp.p1554e.C18630a;
import com.google.android.libraries.assistant.pcp.p1554e.C18650at;
import com.google.android.libraries.assistant.pcp.p1554e.C18657h;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3803ag.p3809c.C49099gk;
import com.google.assistant.p3803ag.p3809c.C49103go;
import com.google.assistant.p3803ag.p3809c.C49121hf;
import com.google.assistant.p3803ag.p3809c.C49122hg;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.g.d.f */
/* compiled from: PG */
public final /* synthetic */ class C18762f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C18763g f52872a;

    public /* synthetic */ C18762f(C18763g gVar) {
        this.f52872a = gVar;
    }

    public final Object apply(Object obj) {
        C60870cx cxVar;
        C18763g gVar = this.f52872a;
        C49122hg hgVar = (C49122hg) obj;
        C49103go goVar = hgVar.f127048c;
        if (goVar == null) {
            goVar = C49103go.f126995c;
        }
        if ((goVar.f126997a & 1) == 0) {
            return Optional.m71637of(hgVar);
        }
        C49103go goVar2 = hgVar.f127048c;
        if (goVar2 == null) {
            goVar2 = C49103go.f126995c;
        }
        C49099gk gkVar = goVar2.f126998b;
        if (gkVar == null) {
            gkVar = C49099gk.f126983g;
        }
        C18630a aVar = gVar.f52873a;
        if (gkVar.equals(C49099gk.f126983g)) {
            cxVar = C60866ct.f164955a;
        } else {
            C18650at atVar = (C18650at) aVar;
            cxVar = C60922j.m93045h(atVar.mo24096e(), C47810es.m84966f(new C18657h(atVar, gkVar)), atVar.f52678b);
        }
        C46459k.m82829b(cxVar, "Failed to update the Proactive Config!", new Object[0]);
        C49121hf hfVar = (C49121hf) hgVar.toBuilder();
        hfVar.copyOnWrite();
        C49122hg hgVar2 = (C49122hg) hfVar.instance;
        hgVar2.f127048c = null;
        hgVar2.f127046a &= -3;
        return Optional.m71637of((C49122hg) hfVar.build());
    }
}
