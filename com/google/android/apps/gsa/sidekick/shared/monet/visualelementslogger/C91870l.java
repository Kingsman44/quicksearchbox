package com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger;

import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.l */
/* compiled from: PG */
public final class C91870l {

    /* renamed from: b */
    private static final AtomicInteger f256195b = new AtomicInteger();

    /* renamed from: a */
    public final String f256196a;

    /* renamed from: c */
    private final C23129y f256197c;

    public C91870l(C22945j jVar) {
        this.f256197c = jVar.mo28338g();
        if (jVar.mo28316z()) {
            this.f256196a = jVar.mo28342l();
            return;
        }
        int andIncrement = f256195b.getAndIncrement();
        this.f256196a = "unboundLockingId[" + andIncrement + "]";
    }

    public final String toString() {
        String str = this.f256196a;
        String str2 = this.f256197c.f63478c;
        return "Locking id: " + str + ", Locking type: " + str2;
    }
}
