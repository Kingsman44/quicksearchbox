package com.google.android.libraries.kids.p1982a.p1983a;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.kids.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C24028h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C24030j f65661a;

    /* renamed from: b */
    public final /* synthetic */ boolean f65662b;

    /* renamed from: c */
    public final /* synthetic */ AccountId f65663c;

    public /* synthetic */ C24028h(C24030j jVar, boolean z, AccountId accountId) {
        this.f65661a = jVar;
        this.f65662b = z;
        this.f65663c = accountId;
    }

    public final C60870cx apply(Object obj) {
        C24030j jVar = this.f65661a;
        boolean z = this.f65662b;
        AccountId accountId = this.f65663c;
        String str = (String) obj;
        if (str == null) {
            return C60856cj.m92900i(C24031k.f65674a);
        }
        C60870cx b = jVar.mo29427b(str, C24030j.f65666b);
        C24024d dVar = new C24024d(jVar, z, accountId, str);
        C60870cx h = C60922j.m93045h(b, C47810es.m84966f(dVar), C60826bg.f164896a);
        C24025e eVar = new C24025e(jVar, str);
        return C60922j.m93045h(h, C47810es.m84966f(eVar), C60826bg.f164896a);
    }
}
