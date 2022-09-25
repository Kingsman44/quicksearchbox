package com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a;

import com.google.android.libraries.assistant.p1533o.C18496n;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.libraries.j.b.a.h */
/* compiled from: PG */
public final /* synthetic */ class C119423h implements C119424i {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f332932a;

    /* renamed from: b */
    public final /* synthetic */ Executor f332933b;

    public /* synthetic */ C119423h(C58485gu guVar, Executor executor) {
        this.f332932a = guVar;
        this.f332933b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo104340a(C18496n nVar) {
        C58485gu guVar = this.f332932a;
        Executor executor = this.f332933b;
        C60870cx i = C60856cj.m92900i(nVar);
        int i2 = ((C58724pq) guVar).f156474d;
        for (int i3 = 0; i3 < i2; i3++) {
            i = C60922j.m93045h(i, C47810es.m84966f(new C119422g((C119424i) guVar.get(i3))), executor);
        }
        return i;
    }
}
