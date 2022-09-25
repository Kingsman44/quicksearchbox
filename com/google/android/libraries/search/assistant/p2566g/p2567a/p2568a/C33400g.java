package com.google.android.libraries.search.assistant.p2566g.p2567a.p2568a;

import com.google.android.libraries.search.assistant.p2566g.C33421p;
import com.google.android.libraries.search.assistant.p2566g.C33423r;
import com.google.android.libraries.search.assistant.p2566g.C33430y;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50544l;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.g.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C33400g implements Function {

    /* renamed from: a */
    public final /* synthetic */ C33403j f89459a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f89460b;

    /* renamed from: c */
    public final /* synthetic */ C33430y f89461c;

    public /* synthetic */ C33400g(C33403j jVar, AccountId accountId, C33430y yVar) {
        this.f89459a = jVar;
        this.f89460b = accountId;
        this.f89461c = yVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C33403j jVar = this.f89459a;
        AccountId accountId = this.f89460b;
        C33421p pVar = (C33421p) obj;
        C50544l lVar = this.f89461c.f89533c;
        if (lVar == null) {
            lVar = C50544l.f131546d;
        }
        C33423r rVar = lVar.f131549c;
        if (rVar == null) {
            rVar = C33423r.f89502a;
        }
        try {
            C33396c cVar = C33396c.f89455a;
            return C60846c.m92878g(pVar.mo38837a(accountId, rVar), RuntimeException.class, C47810es.m84963c(cVar), jVar.f89465b);
        } catch (RuntimeException unused) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
