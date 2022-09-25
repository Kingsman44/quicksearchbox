package com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a;

import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.android.apps.search.assistant.platform.p9141h.p9154e.C121059e;
import com.google.android.apps.search.assistant.platform.p9141h.p9154e.p9155a.C121053d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.a.w */
/* compiled from: PG */
public final /* synthetic */ class C9827w implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C9855w f33813a;

    public /* synthetic */ C9827w(C9855w wVar) {
        this.f33813a = wVar;
    }

    public final C60870cx apply(Object obj) {
        C121053d dVar;
        C9855w wVar = this.f33813a;
        C121059e eVar = (C121059e) obj;
        C9855w wVar2 = C9855w.STANDBY;
        C121053d dVar2 = C121053d.STANDBY_UNSPECIFIED;
        int ordinal = wVar.ordinal();
        if (ordinal != 1) {
            dVar = ordinal != 2 ? C121053d.STANDBY_UNSPECIFIED : C121053d.ENABLED;
        } else {
            dVar = C121053d.DISABLED;
        }
        return eVar.mo105038d(dVar);
    }
}
