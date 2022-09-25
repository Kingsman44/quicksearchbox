package com.google.android.apps.search.assistant.verticals.ambient.trigger.location;

import com.google.android.apps.search.assistant.verticals.ambient.trigger.location.C131763ad;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.location.d */
/* compiled from: PG */
public final /* synthetic */ class C131792d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131763ad f359983a;

    public /* synthetic */ C131792d(C131763ad adVar) {
        this.f359983a = adVar;
    }

    public final C60870cx apply(Object obj) {
        C131763ad adVar = this.f359983a;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return C47633f.m84733g(adVar.f359935b.mo104411a(C131763ad.C131764a.class)).mo51515h(C131787b.f359971a, adVar.f359938e).mo51516i(new C131801m(optional), adVar.f359938e);
        }
        return C60866ct.f164955a;
    }
}
