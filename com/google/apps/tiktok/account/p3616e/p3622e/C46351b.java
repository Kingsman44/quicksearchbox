package com.google.apps.tiktok.account.p3616e.p3622e;

import android.content.Intent;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.apps.tiktok.account.api.controller.C45977ao;
import com.google.apps.tiktok.account.api.controller.C45978ap;
import com.google.apps.tiktok.account.api.controller.C45981as;
import com.google.apps.tiktok.account.api.controller.C46009bt;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.apps.tiktok.account.e.e.b */
/* compiled from: PG */
public final class C46351b implements C45977ao, C45978ap {

    /* renamed from: a */
    private final C46325t f121348a;

    public C46351b(C46325t tVar) {
        this.f121348a = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo37983a(C45981as asVar) {
        C47558bi a = C47831fm.m85006a("Get Intent Account");
        try {
            Intent intent = ((C46009bt) asVar).f120852a;
            if (intent.hasExtra("account_id")) {
                C60870cx i = C60856cj.m92900i(C45963aa.m82132b(intent));
                a.close();
                return i;
            } else if (intent.hasExtra("viewerid")) {
                C58838bb.m90883r(intent.hasExtra("viewerid"));
                String stringExtra = intent.getStringExtra("viewerid");
                stringExtra.getClass();
                if (intent.hasExtra("effectiveid")) {
                    stringExtra = intent.getStringExtra("effectiveid");
                    stringExtra.getClass();
                }
                C60870cx g = C60846c.m92878g(this.f121348a.mo50283c("google", stringExtra), IllegalArgumentException.class, C46350a.f121347a, C60826bg.f164896a);
                a.mo51417a(g);
                a.close();
                return g;
            } else {
                C60870cx cxVar = C60866ct.f164955a;
                a.close();
                return cxVar;
            }
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
        return C60866ct.f164955a;
    }
}
