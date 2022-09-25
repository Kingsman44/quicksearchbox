package com.google.android.apps.search.assistant.platform.p9063e.p9064a.p9065a.p9066a;

import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.e.a.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C120159h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C120163l f334416a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f334417b;

    public /* synthetic */ C120159h(C120163l lVar, Consumer consumer) {
        this.f334416a = lVar;
        this.f334417b = consumer;
    }

    public final C60870cx apply(Object obj) {
        return (C60870cx) ((Optional) obj).map(new C120153b(this.f334416a, this.f334417b)).orElse(C60866ct.f164955a);
    }
}
