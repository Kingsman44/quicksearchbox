package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.p9180b;

import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121220ae;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.d.b.n */
/* compiled from: PG */
public final /* synthetic */ class C121235n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C121236o f336764a;

    public /* synthetic */ C121235n(C121236o oVar) {
        this.f336764a = oVar;
    }

    public final Object apply(Object obj) {
        C121236o oVar = this.f336764a;
        C121220ae aeVar = (C121220ae) obj;
        C59071e eVar = C121237p.f336771a;
        int i = oVar.f336766b.f126042j;
        synchronized (oVar) {
            oVar.f336767c = aeVar;
            oVar.f336768d = Optional.empty();
            oVar.f336769e = Instant.EPOCH;
        }
        return aeVar;
    }
}
