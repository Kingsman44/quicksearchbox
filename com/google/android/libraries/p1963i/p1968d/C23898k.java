package com.google.android.libraries.p1963i.p1968d;

import android.os.Process;
import java.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.i.d.k */
/* compiled from: PG */
public final class C23898k {

    /* renamed from: a */
    private final Map f65376a = new ConcurrentHashMap();

    public C23898k() {
        mo29309a(new C23890c("Main", 1, true)).mo29308d((long) Process.myPid());
    }

    /* renamed from: a */
    public final C23896i mo29309a(C23894g gVar) {
        C23897j jVar = new C23897j(gVar);
        this.f65376a.put(gVar, jVar);
        return jVar;
    }
}
