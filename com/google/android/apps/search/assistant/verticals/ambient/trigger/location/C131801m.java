package com.google.android.apps.search.assistant.verticals.ambient.trigger.location;

import com.google.android.apps.search.assistant.verticals.ambient.p9944o.C131101a;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Random;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.location.m */
/* compiled from: PG */
public final /* synthetic */ class C131801m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ Optional f359993a;

    public /* synthetic */ C131801m(Optional optional) {
        this.f359993a = optional;
    }

    public final C60870cx apply(Object obj) {
        return ((C131101a) obj).mo110074b((C53715bm) this.f359993a.get(), new Random().nextLong());
    }
}
