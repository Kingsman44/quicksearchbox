package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9350c.p9351a;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9350c.C124237a;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9350c.C124251b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32777d;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.c.a.k */
/* compiled from: PG */
public final class C124248k implements C124251b {

    /* renamed from: a */
    public static final C59071e f343057a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.wholehome.a.b.c.a.k");

    /* renamed from: b */
    public final Context f343058b;

    /* renamed from: c */
    public final Executor f343059c;

    /* renamed from: d */
    public final Executor f343060d;

    /* renamed from: e */
    public final ConcurrentHashMap f343061e = new ConcurrentHashMap();

    /* renamed from: f */
    public C124237a f343062f;

    /* renamed from: g */
    private final C47632e f343063g = new C47632e();

    /* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.c.a.k$a */
    /* compiled from: PG */
    interface C124249a {
        /* renamed from: eV */
        C32777d mo106350eV();
    }

    public C124248k(Context context, Executor executor) {
        this.f343059c = executor;
        this.f343060d = new C60904dr(executor);
        this.f343058b = context;
    }

    /* renamed from: a */
    public final C60870cx mo106346a(String str, AccountId accountId, C32849cq cqVar) {
        C124244g gVar = new C124244g(this, str, accountId, cqVar);
        return C60856cj.m92905n(C47810es.m84965e(gVar), this.f343060d);
    }

    /* renamed from: b */
    public final C60870cx mo106347b(String str) {
        C124240c cVar = new C124240c(this, str);
        return C60856cj.m92905n(C47810es.m84965e(cVar), this.f343060d);
    }

    /* renamed from: c */
    public final C60870cx mo106348c(String str, List list) {
        return this.f343063g.mo51512b(new C124242e(this, str, list), this.f343060d);
    }

    /* renamed from: d */
    public final void mo106349d(C124237a aVar) {
        C124243f fVar = new C124243f(this, aVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(fVar), this.f343060d), "ContextManager callbacks is already set", new Object[0]);
    }
}
