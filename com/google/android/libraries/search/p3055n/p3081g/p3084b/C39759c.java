package com.google.android.libraries.search.p3055n.p3081g.p3084b;

import com.google.android.libraries.assistant.soda.p1606e.C19303c;
import com.google.android.libraries.search.p3055n.p3081g.C39714a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60888db;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.n.g.b.c */
/* compiled from: PG */
public final /* synthetic */ class C39759c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C60888db f104589a;

    /* renamed from: b */
    public final /* synthetic */ C19303c f104590b;

    public /* synthetic */ C39759c(C60888db dbVar, C19303c cVar) {
        this.f104589a = dbVar;
        this.f104590b = cVar;
    }

    public final void accept(Object obj) {
        C60888db dbVar = this.f104589a;
        C19303c cVar = this.f104590b;
        C58974d dVar = C39762f.f104591a;
        C47633f h = C47633f.m84733g(((C39714a) obj).mo41998a()).mo51515h(C39757a.f104587a, dbVar);
        Objects.requireNonNull(cVar);
        C60856cj.m92911t(h.mo51516i(new C39758b(cVar), dbVar), C47810es.m84974n(new C39761e()), dbVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
