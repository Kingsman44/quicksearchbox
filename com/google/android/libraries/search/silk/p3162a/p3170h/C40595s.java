package com.google.android.libraries.search.silk.p3162a.p3170h;

import android.content.Context;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.location.C38683aa;
import com.google.android.libraries.search.location.p3029a.C38586af;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.silk.p3183b.C40652f;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.silk.a.h.s */
/* compiled from: PG */
final class C40595s {

    /* renamed from: a */
    public final Executor f106539a;

    /* renamed from: b */
    public final C21370a f106540b;

    /* renamed from: c */
    public final Context f106541c;

    /* renamed from: d */
    public final C40652f f106542d;

    /* renamed from: e */
    public final AccountId f106543e;

    /* renamed from: f */
    public final C38586af f106544f;

    /* renamed from: g */
    private final C38683aa f106545g;

    public C40595s(AccountId accountId, Executor executor, C21370a aVar, C38683aa aaVar, Context context, C40652f fVar, C38586af afVar) {
        this.f106543e = accountId;
        this.f106539a = executor;
        this.f106540b = aVar;
        this.f106545g = aaVar;
        this.f106541c = context;
        this.f106542d = fVar;
        this.f106544f = afVar;
    }

    /* renamed from: a */
    public final C60870cx mo42535a(C39226b bVar) {
        C60870cx d = this.f106545g.mo41550d(bVar, 2);
        C46459k.m82829b(d, "failed to get the GMSCore location", new Object[0]);
        return C60922j.m93044g(d, C47810es.m84963c(new C40593q(this)), this.f106539a);
    }
}
