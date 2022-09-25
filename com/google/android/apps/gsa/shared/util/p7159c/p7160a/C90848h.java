package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import com.google.android.apps.gsa.shared.util.debug.C91030n;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.h */
/* compiled from: PG */
public final /* synthetic */ class C90848h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C90850j f254026a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f254027b;

    public /* synthetic */ C90848h(C90850j jVar, Runnable runnable) {
        this.f254026a = jVar;
        this.f254027b = runnable;
    }

    public final void run() {
        C90850j jVar = this.f254026a;
        Runnable runnable = this.f254027b;
        C91030n.m148695a(jVar.f254030a, jVar.f254031b);
        try {
            runnable.run();
        } finally {
            C91030n.m148696b(jVar.f254031b);
        }
    }
}
