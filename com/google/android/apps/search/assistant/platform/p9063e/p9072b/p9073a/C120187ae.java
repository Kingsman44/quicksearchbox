package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.p1363c.p1380c.p1381a.C17178n;
import com.google.common.base.C58831av;
import com.google.common.util.concurrent.C60815aw;
import com.google.common.util.concurrent.C60816ax;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C120187ae implements C60816ax {

    /* renamed from: a */
    public final /* synthetic */ C120259cq f334481a;

    /* renamed from: b */
    public final /* synthetic */ C2164c f334482b;

    public /* synthetic */ C120187ae(C120259cq cqVar, C2164c cVar) {
        this.f334481a = cqVar;
        this.f334482b = cVar;
    }

    /* renamed from: a */
    public final void mo38143a(C60815aw awVar) {
        C120259cq cqVar = this.f334481a;
        C2164c cVar = this.f334482b;
        Objects.requireNonNull(awVar);
        cqVar.mo104713a(new C120189ag(awVar), cqVar.f334623a);
        try {
            C17178n nVar = (C17178n) awVar.mo57270a();
            nVar.getClass();
            cVar.mo5437b(new C120192aj(nVar, awVar));
        } catch (ExecutionException e) {
            cVar.mo5439d((Throwable) C58831av.m90830c(e.getCause(), e));
        } catch (Throwable th) {
            cVar.mo5439d(th);
        }
    }
}
