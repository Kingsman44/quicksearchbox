package com.google.android.libraries.search.p2992d;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4522b.C58541iw;
import com.google.common.p4522b.C58701ou;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.data.android.p4632a.C61343d;
import java.util.Set;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.search.d.g */
/* compiled from: PG */
public final class C38296g implements C69464a {

    /* renamed from: a */
    public static final C59071e f101458a = C59071e.m91332i("com.google.android.libraries.search.d.g");

    /* renamed from: b */
    public final AccountId f101459b;

    /* renamed from: c */
    public final C61343d f101460c;

    /* renamed from: d */
    public final C46128f f101461d;

    /* renamed from: e */
    public final Executor f101462e;

    /* renamed from: f */
    public final C60887da f101463f;

    /* renamed from: g */
    private final C46325t f101464g;

    /* renamed from: h */
    private final Set f101465h;

    public C38296g(AccountId accountId, C46325t tVar, C61343d dVar, C46128f fVar, Set set, Executor executor, C60887da daVar) {
        this.f101459b = accountId;
        this.f101464g = tVar;
        this.f101460c = dVar;
        this.f101461d = fVar;
        this.f101465h = C58541iw.m90068S(C58701ou.f156429a, set);
        this.f101462e = executor;
        this.f101463f = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo41362a(Set set, boolean z) {
        C47558bi a = C47831fm.m85006a("Add authorization token");
        try {
            C60870cx h = C60922j.m93045h(this.f101464g.mo50284d(this.f101459b), C47810es.m84966f(new C38294e(this, set, z)), this.f101462e);
            a.mo51417a(h);
            a.close();
            return h;
        } catch (Throwable th) {
            C38290a.m67610a(th, th);
        }
        throw th;
    }

    @Deprecated
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        return mo41362a(this.f101465h, false);
    }
}
