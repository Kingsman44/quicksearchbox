package com.google.apps.tiktok.contrib.work.p3631b;

import androidx.work.WorkerParameters;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.apps.tiktok.contrib.work.b.l */
/* compiled from: PG */
public final /* synthetic */ class C46554l implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C46555m f121726a;

    /* renamed from: b */
    public final /* synthetic */ C47558bi f121727b;

    /* renamed from: c */
    public final /* synthetic */ WorkerParameters f121728c;

    public /* synthetic */ C46554l(C46555m mVar, C47558bi biVar, WorkerParameters workerParameters) {
        this.f121726a = mVar;
        this.f121727b = biVar;
        this.f121728c = workerParameters;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C46555m mVar = this.f121726a;
        C47558bi biVar = this.f121727b;
        C60870cx b = ((C46575i) mVar.f121729a.mo17428b()).mo21393b(this.f121728c);
        biVar.mo51417a(b);
        return b;
    }
}
