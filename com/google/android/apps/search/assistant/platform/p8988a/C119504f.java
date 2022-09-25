package com.google.android.apps.search.assistant.platform.p8988a;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45977ao;
import com.google.apps.tiktok.account.api.controller.C45978ap;
import com.google.apps.tiktok.account.api.controller.C45981as;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60870cx;

@Deprecated
/* renamed from: com.google.android.apps.search.assistant.platform.a.f */
/* compiled from: PG */
public final class C119504f implements C45977ao, C45978ap {

    /* renamed from: a */
    public final C46325t f333113a;

    /* renamed from: b */
    private final C119506h f333114b;

    public C119504f(C46325t tVar, C119506h hVar) {
        this.f333113a = tVar;
        this.f333114b = hVar;
    }

    /* renamed from: a */
    public final C60870cx mo37983a(C45981as asVar) {
        C47558bi a = C47831fm.m85006a("Get Assistant Preferred Account");
        try {
            C60870cx a2 = this.f333114b.mo104413a();
            a.mo51417a(a2);
            a.close();
            return a2;
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
        return this.f333113a.mo50282b(accountId);
    }
}
