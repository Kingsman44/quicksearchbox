package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1226e;

import androidx.work.WorkerParameters;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.C16002a;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.e.b */
/* compiled from: PG */
public final class C16055b implements C46575i {

    /* renamed from: a */
    private final C68214a f47513a;

    /* renamed from: b */
    private final Executor f47514b;

    public C16055b(C68214a aVar, Executor executor) {
        this.f47513a = aVar;
        this.f47514b = executor;
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        C60870cx a = ((C16002a) this.f47513a.mo27525b()).mo22644a();
        C16054a aVar = C16054a.f47512a;
        return C60922j.m93044g(a, C47810es.m84963c(aVar), this.f47514b);
    }
}
