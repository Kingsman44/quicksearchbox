package com.google.android.apps.search.googleapp.customtabs.features.googleoncontent;

import com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.p10162a.C133879g;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.v */
/* compiled from: PG */
public final /* synthetic */ class C133903v implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133907z f364694a;

    public /* synthetic */ C133903v(C133907z zVar) {
        this.f364694a = zVar;
    }

    public final C60870cx apply(Object obj) {
        C133907z zVar = this.f364694a;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C60866ct.f164955a;
        }
        C133879g gVar = (C133879g) optional.get();
        if (!zVar.f364708k || zVar.f364701d.isTouchExplorationEnabled()) {
            zVar.f364709l = null;
            return zVar.mo111445j(gVar);
        }
        zVar.f364709l = gVar;
        return C60866ct.f164955a;
    }
}
