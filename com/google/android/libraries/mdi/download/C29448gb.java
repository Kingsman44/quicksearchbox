package com.google.android.libraries.mdi.download;

import com.google.android.libraries.mdi.download.p2236d.C29178hl;
import com.google.android.libraries.mdi.download.p2236d.C29211ir;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.gb */
/* compiled from: PG */
public final /* synthetic */ class C29448gb implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29647hr f79837a;

    public /* synthetic */ C29448gb(C29647hr hrVar) {
        this.f79837a = hrVar;
    }

    public final C60870cx apply(Object obj) {
        C29647hr hrVar = this.f79837a;
        Void voidR = (Void) obj;
        C29211ir irVar = hrVar.f80297c;
        C60931s sVar = hrVar.f80304j;
        C29045l.m53930b("%s verifyAllPendingGroups", "MDDManager");
        C60870cx h = irVar.mo34632h();
        C29178hl hlVar = new C29178hl(irVar, sVar);
        return C60922j.m93045h(h, C47810es.m84966f(hlVar), irVar.f79204n);
    }
}
