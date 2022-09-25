package com.google.android.apps.search.assistant.surfaces.voice.p9663i;

import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9670e.C128030a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3917i.p3918a.C51347ei;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d */
/* compiled from: PG */
public final /* synthetic */ class C127948d implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C128029e f352188a;

    /* renamed from: b */
    public final /* synthetic */ boolean f352189b;

    public /* synthetic */ C127948d(C128029e eVar, boolean z) {
        this.f352188a = eVar;
        this.f352189b = z;
    }

    public final Object get() {
        C128029e eVar = this.f352188a;
        if (this.f352189b) {
            C128030a aVar = eVar.f352306c;
            if (aVar.f352310a.isInteractive() && !aVar.f352311b.isKeyguardLocked()) {
                C60870cx a = eVar.f352305b.mo108303a(C51347ei.ZERO_VELOCITY);
                C127938c cVar = C127938c.f352159a;
                return C60922j.m93044g(a, C47810es.m84963c(cVar), C60826bg.f164896a);
            }
        }
        return C60856cj.m92900i(false);
    }
}
