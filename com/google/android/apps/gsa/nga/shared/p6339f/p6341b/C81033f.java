package com.google.android.apps.gsa.nga.shared.p6339f.p6341b;

import com.google.android.apps.gsa.nga.api.a.cf;
import com.google.android.libraries.assistant.soda.C19347o;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.b.f */
/* compiled from: PG */
public final /* synthetic */ class C81033f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C81041n f222099a;

    /* renamed from: b */
    public final /* synthetic */ cf f222100b;

    public /* synthetic */ C81033f(C81041n nVar, cf cfVar) {
        this.f222099a = nVar;
        this.f222100b = cfVar;
    }

    public final void run() {
        C81041n nVar = this.f222099a;
        C81040m mVar = (C81040m) nVar.f222108a.get(this.f222100b);
        if (mVar != null && mVar.mo74818b().mo56113h() && mVar.mo74817a().mo56113h()) {
            ArrayList arrayList = new ArrayList();
            if (((BlockingQueue) mVar.mo74818b().mo56107c()).drainTo(arrayList) > 0) {
                Stream stream = Collection.EL.stream(arrayList);
                C19347o oVar = (C19347o) mVar.mo74817a().mo56107c();
                Objects.requireNonNull(oVar);
                stream.forEach(new C81034g(oVar));
            }
        }
    }
}
