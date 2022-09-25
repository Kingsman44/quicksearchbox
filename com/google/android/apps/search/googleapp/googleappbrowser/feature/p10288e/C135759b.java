package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10288e;

import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.e.b */
/* compiled from: PG */
public final /* synthetic */ class C135759b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f369785a;

    public /* synthetic */ C135759b(C60870cx cxVar) {
        this.f369785a = cxVar;
    }

    public final Object call() {
        C58833ax axVar = (C58833ax) C60856cj.m92909r(this.f369785a);
        if (!axVar.mo56113h()) {
            return C46688af.m83206c(Optional.empty());
        }
        C46370ah ahVar = (C46370ah) axVar.mo56107c();
        return C46688af.m83205b(Optional.m71637of((C135776s) ahVar.f121384a), ahVar.f121385b);
    }
}
