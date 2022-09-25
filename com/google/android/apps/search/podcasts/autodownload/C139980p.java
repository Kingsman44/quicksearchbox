package com.google.android.apps.search.podcasts.autodownload;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10576l.C140498j;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.autodownload.p */
/* compiled from: PG */
public final class C139980p implements C46575i {

    /* renamed from: a */
    public final Executor f380478a;

    /* renamed from: b */
    public final C139964a f380479b;

    /* renamed from: c */
    public final C46578l f380480c;

    /* renamed from: d */
    public final C140498j f380481d;

    /* renamed from: e */
    public final Context f380482e;

    /* renamed from: com.google.android.apps.search.podcasts.autodownload.p$a */
    /* compiled from: PG */
    public interface C139981a {
        /* renamed from: da */
        C140459au mo115374da();
    }

    public C139980p(Executor executor, C139964a aVar, C46578l lVar, C140498j jVar, Context context) {
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(aVar, "autoDownload");
        C69664n.m101061g(lVar, "tikTokWorkManager");
        C69664n.m101061g(jVar, "devicePreferencesManager");
        C69664n.m101061g(context, "context");
        this.f380478a = executor;
        this.f380479b = aVar;
        this.f380480c = lVar;
        this.f380481d = jVar;
        this.f380482e = context;
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        C69664n.m101061g(workerParameters, "workerParameters");
        C139984s sVar = new C139984s(this);
        return C60856cj.m92905n(C47810es.m84965e(sVar), this.f380478a);
    }
}
