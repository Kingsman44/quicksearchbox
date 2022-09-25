package com.google.android.libraries.search.p2476a.p2479c.p2480a;

import com.google.android.libraries.search.p2476a.C32160b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45977ao;
import com.google.apps.tiktok.account.api.controller.C45978ap;
import com.google.apps.tiktok.account.api.controller.C45981as;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.search.a.c.a.d */
/* compiled from: PG */
public final class C32169d implements C45977ao, C45978ap {

    /* renamed from: a */
    public final C46325t f86361a;

    /* renamed from: b */
    public final C46128f f86362b;

    /* renamed from: c */
    private final C32160b f86363c;

    /* renamed from: d */
    private final C60887da f86364d;

    public C32169d(C46325t tVar, C32160b bVar, C60887da daVar, C46128f fVar) {
        this.f86361a = tVar;
        this.f86363c = bVar;
        this.f86364d = daVar;
        this.f86362b = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo37983a(C45981as asVar) {
        C47558bi a = C47831fm.m85006a("Get primary search account");
        try {
            C60870cx b = this.f86363c.mo37974b();
            C32168c cVar = new C32168c(this);
            C60870cx h = C60922j.m93045h(b, C47810es.m84966f(cVar), this.f86364d);
            a.mo51417a(h);
            a.close();
            return h;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* renamed from: b */
    public final C60870cx mo37984b(AccountId accountId) {
        return this.f86361a.mo50282b(accountId);
    }
}
