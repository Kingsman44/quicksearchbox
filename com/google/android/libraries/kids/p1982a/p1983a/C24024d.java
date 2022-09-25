package com.google.android.libraries.kids.p1982a.p1983a;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.kids.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C24024d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C24030j f65652a;

    /* renamed from: b */
    public final /* synthetic */ boolean f65653b;

    /* renamed from: c */
    public final /* synthetic */ AccountId f65654c;

    /* renamed from: d */
    public final /* synthetic */ String f65655d;

    public /* synthetic */ C24024d(C24030j jVar, boolean z, AccountId accountId, String str) {
        this.f65652a = jVar;
        this.f65653b = z;
        this.f65654c = accountId;
        this.f65655d = str;
    }

    public final C60870cx apply(Object obj) {
        C24030j jVar = this.f65652a;
        boolean z = this.f65653b;
        AccountId accountId = this.f65654c;
        String str = this.f65655d;
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue()) {
            return C60856cj.m92900i(true);
        }
        if (!z) {
            return C60856cj.m92900i(false);
        }
        C60870cx a = jVar.f65669e.mo51024a(accountId);
        C24026f fVar = new C24026f(jVar, str);
        C60870cx h = C60922j.m93045h(a, C47810es.m84966f(fVar), C60826bg.f164896a);
        C24027g gVar = new C24027g(bool);
        return C60846c.m92878g(h, Exception.class, C47810es.m84963c(gVar), C60826bg.f164896a);
    }
}
