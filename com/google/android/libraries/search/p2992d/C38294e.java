package com.google.android.libraries.search.p2992d;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.p4632a.C61346g;
import java.util.Set;

/* renamed from: com.google.android.libraries.search.d.e */
/* compiled from: PG */
public final /* synthetic */ class C38294e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C38296g f101451a;

    /* renamed from: b */
    public final /* synthetic */ Set f101452b;

    /* renamed from: c */
    public final /* synthetic */ boolean f101453c;

    public /* synthetic */ C38294e(C38296g gVar, Set set, boolean z) {
        this.f101451a = gVar;
        this.f101452b = set;
        this.f101453c = z;
    }

    public final C60870cx apply(Object obj) {
        C38296g gVar = this.f101451a;
        Set set = this.f101452b;
        boolean z = this.f101453c;
        if (!"google".equals(((C46108a) obj).mo50210b().f121165j)) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        AccountId accountId = gVar.f101459b;
        C47558bi a = C47831fm.m85006a("Fetching authorization token");
        try {
            C60870cx h = C60922j.m93045h(gVar.f101461d.mo50215b(accountId), C47810es.m84966f(new C38295f(gVar, set, z, accountId)), gVar.f101462e);
            a.mo51417a(h);
            C60870cx h2 = C60846c.m92879h(C60922j.m93044g(h, C47810es.m84963c(C38291b.f101445a), C60826bg.f164896a), C61346g.class, C47810es.m84966f(C38292c.f101446a), C60826bg.f164896a);
            a.close();
            return h2;
        } catch (Throwable th) {
            C38290a.m67610a(th, th);
        }
        throw th;
    }
}
