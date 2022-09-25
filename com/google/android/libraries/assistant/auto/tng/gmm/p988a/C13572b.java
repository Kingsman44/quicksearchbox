package com.google.android.libraries.assistant.auto.tng.gmm.p988a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.common.p900c.C13221a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.a.b */
/* compiled from: PG */
final class C13572b implements C13221a {

    /* renamed from: a */
    public final C69464a f41564a;

    /* renamed from: b */
    public final C12991i f41565b;

    /* renamed from: c */
    private final Executor f41566c;

    public C13572b(C69464a aVar, C12991i iVar, Executor executor) {
        this.f41564a = aVar;
        this.f41565b = iVar;
        this.f41566c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo20001a() {
        C13570a aVar = new C13570a(this);
        return C60856cj.m92904m(C47810es.m84978r(aVar), this.f41566c);
    }
}
