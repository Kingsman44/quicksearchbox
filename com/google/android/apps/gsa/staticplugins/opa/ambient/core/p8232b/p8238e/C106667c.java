package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8238e;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.C106723c;
import com.google.common.p4580v.C60945d;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.e.c */
/* compiled from: PG */
public final /* synthetic */ class C106667c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C106672h f297334a;

    public /* synthetic */ C106667c(C106672h hVar) {
        this.f297334a = hVar;
    }

    public final void accept(Object obj) {
        C106672h hVar = this.f297334a;
        C106723c cVar = (C106723c) obj;
        hVar.f297341c.mo77192a(C118569b.SMARTSPACE_HABITS_MEDIA_PROFILE_AGE_SECONDS, hVar.f297343e.mo57444a().minusNanos(TimeUnit.MICROSECONDS.toNanos(cVar.mo95619a())).getEpochSecond());
        hVar.f297342d.mo109936i(Duration.between(C60945d.m93099d(cVar.mo95619a()), hVar.f297343e.mo57444a()));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
