package com.google.apps.tiktok.contrib.work.p3631b;

import androidx.work.WorkerParameters;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.apps.tiktok.contrib.work.C46588v;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60870cx;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.contrib.work.b.m */
/* compiled from: PG */
public final class C46555m implements C46575i {

    /* renamed from: a */
    public final C69464a f121729a;

    /* renamed from: b */
    private final C46588v f121730b;

    public C46555m(C69464a aVar, C46588v vVar) {
        this.f121729a = aVar;
        this.f121730b = vVar;
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        C47558bi a = C47831fm.m85006a("NoAccountWorkerFactory startWork()");
        try {
            C60870cx c = this.f121730b.mo50537c(new C46554l(this, a, workerParameters), workerParameters);
            a.close();
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
