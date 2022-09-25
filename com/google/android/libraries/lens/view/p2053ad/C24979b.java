package com.google.android.libraries.lens.view.p2053ad;

import androidx.p060c.C0979i;
import java.util.Set;

/* renamed from: com.google.android.libraries.lens.view.ad.b */
/* compiled from: PG */
public final /* synthetic */ class C24979b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C24981d f68132a;

    /* renamed from: b */
    public final /* synthetic */ C24980c f68133b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f68134c;

    public /* synthetic */ C24979b(C24981d dVar, C24980c cVar, Runnable runnable) {
        this.f68132a = dVar;
        this.f68133b = cVar;
        this.f68134c = runnable;
    }

    public final void run() {
        C24981d dVar = this.f68132a;
        C24980c cVar = this.f68133b;
        Runnable runnable = this.f68134c;
        if (dVar.f68139a.contains(cVar)) {
            runnable.run();
            return;
        }
        if (!dVar.f68140b.containsKey(cVar)) {
            dVar.f68140b.put(cVar, new C0979i(0));
        }
        ((Set) dVar.f68140b.get(cVar)).add(runnable);
    }
}
