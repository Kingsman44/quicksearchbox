package com.google.android.apps.gsa.shared.p7021be;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Map;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.shared.be.c */
/* compiled from: PG */
public final /* synthetic */ class C89415c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C91006f f242400a;

    public /* synthetic */ C89415c(C91006f fVar) {
        this.f242400a = fVar;
    }

    public final C60870cx apply(Object obj) {
        C91006f fVar = this.f242400a;
        Map map = (Map) obj;
        fVar.mo85291r("Global debug data");
        if (map.isEmpty()) {
            fVar.mo85292s(C90752i.m148229c("None."));
        } else {
            Collection.EL.stream(map.entrySet()).forEach(new C89420h(fVar));
        }
        return C60866ct.f164955a;
    }
}
