package com.google.android.libraries.search.p3090o;

import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63042fg;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.o.n */
/* compiled from: PG */
public final /* synthetic */ class C39836n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39837o f104738a;

    public /* synthetic */ C39836n(C39837o oVar) {
        this.f104738a = oVar;
    }

    public final C60870cx apply(Object obj) {
        C39837o oVar = this.f104738a;
        C39838p pVar = oVar.f104739a;
        C63042fg fgVar = ((C39824b) obj).f104724d;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        if (pVar.mo42023c(Duration.ofSeconds(fgVar.f170154a))) {
            return oVar.f104739a.mo42021a();
        }
        return C60866ct.f164955a;
    }
}
