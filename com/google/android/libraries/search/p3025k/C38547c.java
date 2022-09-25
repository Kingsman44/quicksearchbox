package com.google.android.libraries.search.p3025k;

import android.content.Context;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45966ad;
import com.google.apps.tiktok.account.api.controller.C45977ao;
import com.google.apps.tiktok.account.api.controller.C45978ap;
import com.google.apps.tiktok.account.api.controller.C45981as;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.k.c */
/* compiled from: PG */
public final class C38547c implements C45977ao, C45978ap {

    /* renamed from: a */
    public final C38558m f101920a;

    /* renamed from: b */
    private final Context f101921b;

    /* renamed from: c */
    private final C45966ad f101922c;

    /* renamed from: d */
    private final Executor f101923d;

    /* renamed from: com.google.android.libraries.search.k.c$a */
    /* compiled from: PG */
    public interface C38548a {
        /* renamed from: fQ */
        C38553h mo41483fQ();
    }

    public C38547c(Context context, C45966ad adVar, C38558m mVar, Executor executor) {
        this.f101921b = context;
        this.f101922c = adVar;
        this.f101920a = mVar;
        this.f101923d = executor;
    }

    /* renamed from: a */
    public final C60870cx mo37983a(C45981as asVar) {
        C47558bi a = C47831fm.m85006a("Select the Incognito account if it's enabled");
        try {
            C60870cx b = this.f101920a.mo41486b();
            C38523a aVar = new C38523a(this);
            C60870cx h = C60922j.m93045h(b, C47810es.m84966f(aVar), this.f101923d);
            a.mo51417a(h);
            a.close();
            return h;
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
        ((C38548a) C47245e.m84045a(this.f101921b, C38548a.class, accountId)).mo41483fQ().f101930a = true;
        this.f101922c.mo50117a();
        return C60866ct.f164955a;
    }
}
