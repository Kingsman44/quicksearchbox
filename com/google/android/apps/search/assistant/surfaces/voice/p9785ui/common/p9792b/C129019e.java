package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9792b;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.b.e */
/* compiled from: PG */
public final class C129019e {

    /* renamed from: a */
    public final Map f354468a;

    /* renamed from: b */
    private final Executor f354469b;

    public C129019e(Map map, Executor executor) {
        this.f354468a = map;
        this.f354469b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo108806a(C58485gu guVar, int i) {
        if (i >= ((C58724pq) guVar).f156474d) {
            return C60856cj.m92900i(Optional.empty());
        }
        C60870cx a = ((C129023i) ((C69464a) ((Map.Entry) guVar.get(i)).getValue()).mo17428b()).mo108195a();
        C129017c cVar = new C129017c(this, guVar, i);
        return C60922j.m93045h(a, C47810es.m84966f(cVar), this.f354469b);
    }
}
