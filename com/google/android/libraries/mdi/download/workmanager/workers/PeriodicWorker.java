package com.google.android.libraries.mdi.download.workmanager.workers;

import android.content.Context;
import android.util.Log;
import androidx.work.C4378ab;
import androidx.work.C4632m;
import androidx.work.C4643x;
import androidx.work.WorkerParameters;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* compiled from: PG */
public final class PeriodicWorker extends C4378ab {

    /* renamed from: a */
    public final C29409fd f80387a;

    /* renamed from: b */
    private final Executor f80388b;

    public PeriodicWorker(Context context, WorkerParameters workerParameters, C29409fd fdVar, C60887da daVar) {
        super(context, workerParameters);
        this.f80387a = fdVar;
        this.f80388b = daVar;
    }

    /* renamed from: b */
    public final C60870cx mo9297b() {
        Log.d("MddPeriodicWorker", "PeriodicWorker: startWork");
        String b = this.f14000d.f13989b.mo9567b("MDD_TASK_TAG_KEY");
        if (b == null) {
            Log.e("MddPeriodicWorker", "can't find MDD task tag");
            return C60856cj.m92900i(new C4643x(C4632m.f14549a));
        }
        C29684a aVar = new C29684a(this, b);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(aVar), this.f80388b);
        C29685b bVar = C29685b.f80391a;
        return C60922j.m93044g(n, C47810es.m84963c(bVar), this.f80388b);
    }
}
