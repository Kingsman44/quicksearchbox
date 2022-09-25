package com.google.apps.tiktok.contrib.work.p3631b;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.C46059b;
import com.google.apps.tiktok.account.api.controller.C45966ad;
import com.google.apps.tiktok.contrib.work.C46513b;
import com.google.apps.tiktok.contrib.work.C46588v;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47561bl;
import com.google.apps.tiktok.tracing.C47562bm;
import com.google.apps.tiktok.tracing.C47563bn;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.contrib.work.b.k */
/* compiled from: PG */
public final class C46552k implements C46513b {

    /* renamed from: a */
    public final C45966ad f121720a;

    /* renamed from: b */
    public final Map f121721b;

    /* renamed from: c */
    public final Executor f121722c;

    /* renamed from: d */
    public final C58817ah f121723d;

    /* renamed from: e */
    public final String f121724e;

    /* renamed from: f */
    private final Context f121725f;

    /* renamed from: com.google.apps.tiktok.contrib.work.b.k$a */
    /* compiled from: PG */
    public interface C46553a {
        /* renamed from: gP */
        C46588v mo50544gP();
    }

    public C46552k(Context context, C45966ad adVar, Map map, Executor executor, C58817ah ahVar, String str) {
        this.f121725f = context;
        this.f121720a = adVar;
        this.f121721b = map;
        this.f121722c = executor;
        this.f121723d = ahVar;
        this.f121724e = str;
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        C47561bl b = C47562bm.f123426a.mo51423b();
        C46059b.m82278a(b, C46528an.m82961a(workerParameters.f13990c));
        C47558bi b2 = C47831fm.m85007b("AccountWorkerFactory startWork()", ((C47563bn) b).mo51424e());
        try {
            if (!workerParameters.f13990c.contains("tiktok_account_work")) {
                C60870cx h = C60856cj.m92899h(new C46514a());
                b2.close();
                return h;
            }
            AccountId a = C46528an.m82961a(workerParameters.f13990c);
            C60870cx c = ((C46553a) C47245e.m84045a(this.f121725f, C46553a.class, a)).mo50544gP().mo50537c(new C46549h(this, b2, workerParameters, a), workerParameters);
            b2.close();
            return c;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
