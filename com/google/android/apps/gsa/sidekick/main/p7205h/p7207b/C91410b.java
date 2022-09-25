package com.google.android.apps.gsa.sidekick.main.p7205h.p7207b;

import com.google.android.libraries.gsa.monet.service.C23052c;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.apps.gsa.sidekick.main.h.b.b */
/* compiled from: PG */
public final class C91410b {

    /* renamed from: a */
    public boolean f255016a;

    /* renamed from: b */
    private final Set f255017b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: e */
    private final void m149509e() {
        for (C91411c a : this.f255017b) {
            a.mo85758a(this.f255016a);
        }
    }

    /* renamed from: a */
    public final void mo85754a(C23052c cVar, C91411c cVar2) {
        this.f255017b.add(cVar2);
        cVar.mo28427o(new C91409a(this, cVar2));
    }

    /* renamed from: b */
    public final void mo85755b(C91411c cVar) {
        this.f255017b.remove(cVar);
    }

    /* renamed from: c */
    public final void mo85756c() {
        this.f255016a = true;
        m149509e();
    }

    /* renamed from: d */
    public final void mo85757d() {
        this.f255016a = false;
        m149509e();
    }
}
