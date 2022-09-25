package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1208b.p1209a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1202g.p1203a.C15933d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.g.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C15941b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15942c f47308a;

    /* renamed from: b */
    public final /* synthetic */ C15933d f47309b;

    /* renamed from: c */
    public final /* synthetic */ C16090ap f47310c;

    public /* synthetic */ C15941b(C15942c cVar, C15933d dVar, C16090ap apVar) {
        this.f47308a = cVar;
        this.f47309b = dVar;
        this.f47310c = apVar;
    }

    public final void run() {
        C15942c cVar = this.f47308a;
        C15933d dVar = this.f47309b;
        C16090ap apVar = this.f47310c;
        C60870cx cxVar = cVar.f47313c;
        if (cxVar != null) {
            cxVar.cancel(false);
            cVar.f47313c = null;
        }
        long longValue = ((Long) cVar.f47312b.mo17428b()).longValue();
        C58976aa aaVar = C58975e.f156826a;
        C15940a aVar = new C15940a(apVar, dVar);
        cVar.f47313c = C60856cj.m92902k(C47810es.m84965e(aVar), longValue, TimeUnit.MILLISECONDS, cVar.f47311a);
    }
}
