package com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.assistant.t.d.a.c */
/* compiled from: PG */
public final /* synthetic */ class C36621c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C36623e f95465a;

    public /* synthetic */ C36621c(C36623e eVar) {
        this.f95465a = eVar;
    }

    public final void run() {
        C36623e eVar = this.f95465a;
        C60870cx cxVar = eVar.f95470e;
        if (cxVar != null) {
            cxVar.cancel(false);
            C36623e.f95466a.getSeconds();
        } else {
            C36623e.f95466a.getSeconds();
        }
        C36620b bVar = new C36620b(eVar);
        eVar.f95470e = C60856cj.m92902k(C47810es.m84965e(bVar), C36623e.f95466a.getSeconds(), TimeUnit.SECONDS, eVar.f95468c);
    }
}
