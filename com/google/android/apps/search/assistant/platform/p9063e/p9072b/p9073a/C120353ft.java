package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120511h;
import com.google.common.base.C58831av;
import com.google.common.util.concurrent.C60815aw;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.ft */
/* compiled from: PG */
public final class C120353ft {
    /* renamed from: a */
    static /* synthetic */ void m199352a(C120259cq cqVar, C2164c cVar, C60815aw awVar) {
        Objects.requireNonNull(awVar);
        cqVar.mo104713a(new C120344fk(awVar), cqVar.f334623a);
        try {
            C120511h hVar = (C120511h) awVar.mo57270a();
            hVar.getClass();
            cVar.mo5437b(hVar);
            cqVar.mo104713a(new C120345fl(hVar), cqVar.f334623a);
        } catch (ExecutionException e) {
            cVar.mo5439d((Throwable) C58831av.m90830c(e.getCause(), e));
        } catch (CancellationException e2) {
            cVar.mo5439d(e2);
        }
    }
}
