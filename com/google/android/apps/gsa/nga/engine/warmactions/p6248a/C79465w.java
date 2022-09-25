package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9722a.C128459c;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9722a.C128460d;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9722a.C128461e;
import java.util.concurrent.TimeUnit;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.w */
/* compiled from: PG */
public final /* synthetic */ class C79465w implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C79418an f218144a;

    public /* synthetic */ C79465w(C79418an anVar) {
        this.f218144a = anVar;
    }

    public final void accept(Object obj) {
        C79418an anVar = this.f218144a;
        C128461e eVar = (C128461e) obj;
        if (!anVar.f218064e.isZero() && !anVar.f218064e.isNegative()) {
            C128459c c = eVar.mo108449c();
            c.mo108445c(C128460d.TIMEOUT);
            C128461e a = c.mo108443a();
            C80905at.m128764h("ContextManagerImpl", anVar.f218061b.mo29164d(new C79467y(anVar, a), anVar.f218064e.toMillis(), TimeUnit.MILLISECONDS), "Failed to handle %s", a);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
