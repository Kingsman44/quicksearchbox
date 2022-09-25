package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.af */
/* compiled from: PG */
public final /* synthetic */ class C125948af implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C126038bc f347167a;

    public /* synthetic */ C125948af(C126038bc bcVar) {
        this.f347167a = bcVar;
    }

    public final C60870cx apply(Object obj) {
        C126038bc bcVar = this.f347167a;
        C125943aa aaVar = (C125943aa) obj;
        C60870cx i = C60856cj.m92900i(Optional.empty());
        if (aaVar.f347162c >= 3) {
            i = C126038bc.m206092d(bcVar.f347369o, new C125961as(bcVar));
        }
        return (!aaVar.f347161b || aaVar.f347162c <= 0) ? i : C126038bc.m206091c(i, bcVar.f347374t, new C125962at(bcVar));
    }
}
