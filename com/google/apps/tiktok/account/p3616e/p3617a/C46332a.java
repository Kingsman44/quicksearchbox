package com.google.apps.tiktok.account.p3616e.p3617a;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45977ao;
import com.google.apps.tiktok.account.api.controller.C45978ap;
import com.google.apps.tiktok.account.api.controller.C45981as;
import com.google.apps.tiktok.dataservice.C46788de;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.apps.tiktok.account.e.a.a */
/* compiled from: PG */
public final class C46332a implements C45977ao, C45978ap {

    /* renamed from: a */
    private final C46334c f121324a;

    public C46332a(C46334c cVar) {
        this.f121324a = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo37983a(C45981as asVar) {
        C46334c cVar = this.f121324a;
        C46788de deVar = C46788de.SAME_DAY;
        C47558bi a = C47831fm.m85006a("AutoSelect Account");
        try {
            C60870cx g = C60922j.m93044g(cVar.f121326a.mo50750c(cVar.f121328c.mo50245b(), deVar), C47810es.m84963c(C46333b.f121325a), C60826bg.f164896a);
            a.mo51417a(g);
            a.close();
            return g;
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
        return this.f121324a.f121327b.mo50282b(accountId);
    }
}
