package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import com.google.android.apps.search.googleapp.searchwidget.C139031i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.av */
/* compiled from: PG */
public final /* synthetic */ class C138952av implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f377906a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f377907b;

    public /* synthetic */ C138952av(C60870cx cxVar, C60870cx cxVar2) {
        this.f377906a = cxVar;
        this.f377907b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f377906a;
        C60870cx cxVar2 = this.f377907b;
        Optional optional = (Optional) C60856cj.m92909r(cxVar);
        C139031i iVar = (C139031i) C60856cj.m92909r(cxVar2);
        if (optional.isEmpty() || iVar.f378101b.isEmpty()) {
            return Optional.empty();
        }
        return Collection.EL.stream(iVar.f378101b).filter(new C138958ba(optional)).min(Comparator.CC.comparingLong(C138959bb.f377915a));
    }
}
