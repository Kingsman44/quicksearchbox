package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.p10516t.p10518b.C139692b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.cu */
/* compiled from: PG */
public final class C138473cu {

    /* renamed from: a */
    public static final C59071e f376651a = C59071e.m91332i("com.google.android.apps.search.googleapp.search.suggest.sources.a.cu");

    /* renamed from: b */
    private final Executor f376652b;

    /* renamed from: c */
    private final C139692b f376653c;

    /* renamed from: d */
    private final boolean f376654d;

    public C138473cu(Executor executor, boolean z, C139692b bVar) {
        this.f376652b = executor;
        this.f376654d = z;
        this.f376653c = bVar;
    }

    /* renamed from: a */
    public final void mo114289a(String str) {
        if (this.f376654d) {
            C138472ct ctVar = new C138472ct(str);
            C60856cj.m92911t((C60870cx) this.f376653c.f379688a.mo6453a(), C47810es.m84974n(ctVar), this.f376652b);
        }
    }
}
