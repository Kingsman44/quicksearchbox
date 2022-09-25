package com.google.apps.tiktok.account.p3606d;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46167as;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.apps.tiktok.account.d.l */
/* compiled from: PG */
public final class C46094l {

    /* renamed from: a */
    private final C46325t f120972a;

    public C46094l(C46325t tVar) {
        this.f120972a = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo50203a(int i) {
        if (i == -1) {
            return C60856cj.m92899h(new C46167as());
        }
        AccountId b = AccountId.m82057b(i);
        return C60922j.m93044g(this.f120972a.mo50289i(b), C47810es.m84963c(new C46093k(b)), C60826bg.f164896a);
    }
}
