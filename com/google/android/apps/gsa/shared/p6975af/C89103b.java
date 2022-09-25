package com.google.android.apps.gsa.shared.p6975af;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.apps.gsa.shared.af.b */
/* compiled from: PG */
public final class C89103b {

    /* renamed from: a */
    public int f241535a;

    /* renamed from: b */
    private final String f241536b;

    /* renamed from: c */
    private final Set f241537c = new CopyOnWriteArraySet();

    public C89103b(String str) {
        this.f241536b = str;
        this.f241535a = 0;
    }

    /* renamed from: a */
    public final void mo83073a(C89102a aVar) {
        this.f241537c.add(aVar);
        aVar.mo83072a(this.f241535a);
    }

    /* renamed from: b */
    public final void mo83074b(C89102a aVar) {
        this.f241537c.remove(aVar);
    }

    /* renamed from: c */
    public final void mo83075c(int i) {
        if (i != this.f241535a) {
            this.f241535a = i;
            for (C89102a a : this.f241537c) {
                a.mo83072a(i);
            }
        }
    }

    public final String toString() {
        String str = this.f241536b;
        int i = this.f241535a;
        return "ObservableInt[" + str + "]=" + i;
    }
}
