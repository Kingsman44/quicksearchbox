package com.google.android.libraries.gsa.p1876k.p1877a;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22872h;

/* renamed from: com.google.android.libraries.gsa.k.a.h */
/* compiled from: PG */
public final /* synthetic */ class C22854h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Class f62918a;

    /* renamed from: b */
    public final /* synthetic */ C22869e f62919b;

    public /* synthetic */ C22854h(Class cls, C22869e eVar) {
        this.f62918a = cls;
        this.f62919b = eVar;
    }

    public final void run() {
        Class cls = this.f62918a;
        C22869e eVar = this.f62919b;
        Class a = C22872h.m42741a(cls);
        try {
            eVar.run();
        } finally {
            C22872h.m42741a(a);
        }
    }
}
