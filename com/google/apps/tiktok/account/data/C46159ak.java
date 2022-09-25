package com.google.apps.tiktok.account.data;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.account.data.ak */
/* compiled from: PG */
public final class C46159ak {

    /* renamed from: a */
    public final boolean f121078a = false;

    /* renamed from: b */
    public final Executor f121079b;

    /* renamed from: c */
    private final C69464a f121080c;

    public C46159ak(C69464a aVar, Executor executor) {
        this.f121079b = executor;
        this.f121080c = aVar;
    }

    /* renamed from: a */
    public final C58495hd mo50228a() {
        C58490gz gzVar = new C58490gz(4);
        for (C46327v vVar : (Set) this.f121080c.mo17428b()) {
            C58838bb.m90869d(true ^ vVar.mo50240b().isEmpty(), "AccountProvider's account type cannot be an empty string.");
            gzVar.mo55429h(vVar.mo50240b(), vVar.mo50239a());
        }
        return gzVar.mo55427f(true);
    }

    /* renamed from: b */
    public final C60870cx mo50229b(List list) {
        return C60856cj.m92894c(list).mo57334a(C47810es.m84978r(new C46157ai(list)), this.f121079b);
    }

    /* renamed from: c */
    public final C60870cx mo50230c(String str, C46326u uVar) {
        return C60922j.m93044g(uVar.mo50213a(), C47810es.m84963c(new C46158aj(str, uVar)), this.f121079b);
    }
}
