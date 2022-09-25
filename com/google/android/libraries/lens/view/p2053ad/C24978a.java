package com.google.android.libraries.lens.view.p2053ad;

import java.util.Set;

/* renamed from: com.google.android.libraries.lens.view.ad.a */
/* compiled from: PG */
public final /* synthetic */ class C24978a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C24981d f68130a;

    /* renamed from: b */
    public final /* synthetic */ C24980c f68131b;

    public /* synthetic */ C24978a(C24981d dVar, C24980c cVar) {
        this.f68130a = dVar;
        this.f68131b = cVar;
    }

    public final void run() {
        C24981d dVar = this.f68130a;
        C24980c cVar = this.f68131b;
        if (!dVar.f68139a.contains(cVar)) {
            dVar.f68139a.add(cVar);
            Set<Runnable> set = (Set) dVar.f68140b.get(cVar);
            cVar.name();
            if (set != null) {
                set.size();
            }
            if (set != null) {
                for (Runnable run : set) {
                    run.run();
                }
                dVar.f68140b.remove(cVar);
            }
        }
    }
}
