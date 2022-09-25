package com.google.apps.tiktok.account.data.p3611a;

import com.google.apps.tiktok.account.data.C46326u;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.apps.tiktok.account.data.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C46122ac implements C46326u {

    /* renamed from: a */
    public final /* synthetic */ C46144v f121012a;

    public /* synthetic */ C46122ac(C46144v vVar) {
        this.f121012a = vVar;
    }

    /* renamed from: a */
    public final C60870cx mo50213a() {
        C46144v vVar = this.f121012a;
        C47558bi a = C47831fm.m85006a("GmsAccounts.getAccounts()");
        try {
            C60870cx h = C60922j.m93045h(C60856cj.m92905n(C47810es.m84965e(new C46135m(vVar)), vVar.f121050d), C47810es.m84966f(new C46142t(vVar)), vVar.f121049c);
            a.mo51417a(h);
            a.close();
            return h;
        } catch (Throwable th) {
            C46130h.m82367a(th, th);
        }
        throw th;
    }
}
