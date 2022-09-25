package com.google.android.apps.search.googleapp.incognito.p10329g;

import androidx.work.WorkerParameters;
import com.google.android.apps.search.googleapp.incognito.C136228b;
import com.google.android.apps.search.googleapp.incognito.p10320b.C136239i;
import com.google.android.apps.search.googleapp.incognito.p10320b.C136240j;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.incognito.g.ag */
/* compiled from: PG */
public final class C136299ag implements C46575i {

    /* renamed from: a */
    public final long f371115a;

    /* renamed from: b */
    private final C136240j f371116b;

    /* renamed from: c */
    private final C136228b f371117c;

    /* renamed from: d */
    private final Executor f371118d;

    public C136299ag(C136240j jVar, C136228b bVar, Executor executor, long j) {
        this.f371116b = jVar;
        this.f371117c = bVar;
        this.f371118d = executor;
        this.f371115a = j;
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        return C47636i.m84746e(this.f371116b.f371025a.mo46039a(C136239i.f371024a, C60826bg.f164896a), this.f371117c.mo112854a(9)).mo51518a(C136298af.f371114a, this.f371118d);
    }
}
