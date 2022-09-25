package com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8568a;

import android.os.Bundle;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C112002j;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import dagger.C68214a;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.o.a.c */
/* compiled from: PG */
public final /* synthetic */ class C112992c implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C112996g f313122a;

    /* renamed from: b */
    public final /* synthetic */ Optional f313123b;

    /* renamed from: c */
    public final /* synthetic */ C113405ep f313124c;

    public /* synthetic */ C112992c(C112996g gVar, Optional optional, C113405ep epVar) {
        this.f313122a = gVar;
        this.f313123b = optional;
        this.f313124c = epVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C112996g gVar = this.f313122a;
        Optional optional = this.f313123b;
        C113405ep epVar = this.f313124c;
        C121537f fVar = C112996g.f313136b;
        C68214a aVar = gVar.f313138d;
        Objects.requireNonNull(aVar);
        C112002j jVar = (C112002j) fVar.mo105235d("createEngine", new C112993d(aVar));
        if (optional.isPresent()) {
            return jVar.mo99258b(epVar, (Bundle) optional.get());
        }
        return jVar.mo99257a(epVar);
    }
}
