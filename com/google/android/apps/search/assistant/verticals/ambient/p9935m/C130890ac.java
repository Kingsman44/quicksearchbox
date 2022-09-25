package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import android.content.Context;
import androidx.work.C4632m;
import androidx.work.C4645z;
import androidx.work.WorkerParameters;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131251t;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.ac */
/* compiled from: PG */
public final class C130890ac implements C46575i {

    /* renamed from: a */
    public final Context f358182a;

    /* renamed from: b */
    public final Executor f358183b;

    /* renamed from: c */
    public final C58974d f358184c;

    /* renamed from: d */
    private final C46175b f358185d;

    /* renamed from: e */
    private final C131251t f358186e;

    /* renamed from: f */
    private final boolean f358187f;

    /* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.ac$a */
    /* compiled from: PG */
    public interface C130891a {
        /* renamed from: aH */
        C130886a mo109864aH();
    }

    public C130890ac(Context context, C46175b bVar, C131251t tVar, Executor executor, C130603a aVar, boolean z) {
        this.f358182a = context;
        this.f358185d = bVar;
        this.f358186e = tVar;
        this.f358183b = executor;
        this.f358184c = aVar.mo109740b(this);
        this.f358187f = z;
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        if (!this.f358186e.mo110135j() || !this.f358187f) {
            return C60856cj.m92900i(new C4645z(C4632m.f14549a));
        }
        return C47633f.m84733g(C47633f.m84733g(C47633f.m84733g(this.f358185d.mo50247d()).mo51515h(new C130967w(this), this.f358183b)).mo51516i(new C130968x(this), this.f358183b)).mo51515h(C130888aa.f358180a, C60826bg.f164896a).mo51513e(Throwable.class, new C130889ab(this), C60826bg.f164896a);
    }
}
