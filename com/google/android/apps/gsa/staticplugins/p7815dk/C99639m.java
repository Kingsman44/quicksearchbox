package com.google.android.apps.gsa.staticplugins.p7815dk;

import com.google.android.apps.gsa.p6487s3.C84294l;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.dk.m */
/* compiled from: PG */
public final class C99639m {

    /* renamed from: a */
    private final AtomicReference f278812a;

    public C99639m(C84294l lVar) {
        this.f278812a = new AtomicReference(lVar);
    }

    /* renamed from: a */
    public final synchronized void mo91529a() {
        C84294l lVar = (C84294l) this.f278812a.getAndSet((Object) null);
        if (lVar != null) {
            lVar.mo77825b();
        }
    }
}
