package com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a;

import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9856x;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9857y;
import com.google.android.apps.search.assistant.platform.p9141h.p9154e.p9155a.C121051b;
import com.google.android.apps.search.assistant.platform.p9141h.p9154e.p9155a.C121053d;
import com.google.android.apps.search.assistant.platform.p9141h.p9154e.p9155a.C121055f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.a.u */
/* compiled from: PG */
public final /* synthetic */ class C9825u implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f33811a;

    public /* synthetic */ C9825u(C60870cx cxVar) {
        this.f33811a = cxVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C9855w wVar;
        C121055f fVar = (C121055f) C60856cj.m92909r(this.f33811a);
        C9856x xVar = (C9856x) C9857y.f33883f.createBuilder();
        C121053d a = C121053d.m200347a(fVar.f336455b);
        if (a == null) {
            a = C121053d.STANDBY_UNSPECIFIED;
        }
        C9855w wVar2 = C9855w.STANDBY;
        int ordinal = a.ordinal();
        int i = 2;
        if (ordinal == 1) {
            wVar = C9855w.DISABLED;
        } else if (ordinal != 2) {
            wVar = C9855w.STANDBY;
        } else {
            wVar = C9855w.ENABLED;
        }
        xVar.copyOnWrite();
        C9857y yVar = (C9857y) xVar.instance;
        yVar.f33886b = wVar.f33882d;
        yVar.f33885a |= 1;
        boolean z = fVar.f336456c;
        xVar.copyOnWrite();
        C9857y yVar2 = (C9857y) xVar.instance;
        yVar2.f33885a |= 2;
        yVar2.f33887c = z;
        int i2 = fVar.f336458e;
        xVar.copyOnWrite();
        C9857y yVar3 = (C9857y) xVar.instance;
        yVar3.f33885a |= 8;
        yVar3.f33889e = i2;
        int a2 = C121051b.m200346a(fVar.f336457d);
        if (a2 == 0) {
            a2 = 1;
        }
        int i3 = a2 - 1;
        if (i3 != 1) {
            i = i3 != 2 ? 1 : 3;
        }
        xVar.copyOnWrite();
        C9857y yVar4 = (C9857y) xVar.instance;
        yVar4.f33888d = i - 1;
        yVar4.f33885a |= 4;
        return C60856cj.m92900i((C9857y) xVar.build());
    }
}
