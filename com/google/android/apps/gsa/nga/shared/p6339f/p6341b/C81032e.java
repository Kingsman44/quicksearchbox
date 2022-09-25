package com.google.android.apps.gsa.nga.shared.p6339f.p6341b;

import com.google.android.apps.gsa.nga.api.a.cf;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.b.e */
/* compiled from: PG */
public final /* synthetic */ class C81032e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C81041n f222097a;

    /* renamed from: b */
    public final /* synthetic */ cf f222098b;

    public /* synthetic */ C81032e(C81041n nVar, cf cfVar) {
        this.f222097a = nVar;
        this.f222098b = cfVar;
    }

    public final Object call() {
        C81041n nVar = this.f222097a;
        return (C81040m) nVar.f222108a.remove(this.f222098b);
    }
}
