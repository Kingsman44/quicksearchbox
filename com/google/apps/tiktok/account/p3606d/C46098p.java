package com.google.apps.tiktok.account.p3606d;

import com.google.apps.tiktok.account.data.C46163ao;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.apps.tiktok.account.d.p */
/* compiled from: PG */
public final /* synthetic */ class C46098p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C46101s f120977a;

    public /* synthetic */ C46098p(C46101s sVar) {
        this.f120977a = sVar;
    }

    public final C60870cx apply(Object obj) {
        C46101s sVar = this.f120977a;
        C46163ao aoVar = (C46163ao) obj;
        if ((aoVar.f121084a & 1) == 0 || Math.abs(sVar.f120983c.mo26870b() - aoVar.f121085b) >= C46101s.f120982b) {
            return C60922j.m93044g(sVar.f120985e.mo50317a(), C47810es.m84963c(C46096n.f120975a), C60826bg.f164896a);
        }
        return C60856cj.m92900i(false);
    }
}
