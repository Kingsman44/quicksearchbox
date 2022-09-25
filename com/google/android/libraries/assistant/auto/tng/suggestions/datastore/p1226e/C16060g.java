package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1226e;

import androidx.work.WorkerParameters;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.C16002a;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.e.g */
/* compiled from: PG */
public final class C16060g implements C46575i {

    /* renamed from: a */
    private final C68214a f47517a;

    /* renamed from: b */
    private final Executor f47518b;

    public C16060g(C68214a aVar, Executor executor) {
        this.f47517a = aVar;
        this.f47518b = executor;
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        C60870cx o = ((C16002a) this.f47517a.mo27525b()).mo22658o();
        C16059f fVar = C16059f.f47516a;
        return C60922j.m93044g(o, C47810es.m84963c(fVar), this.f47518b);
    }
}
