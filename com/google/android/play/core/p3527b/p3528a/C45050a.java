package com.google.android.play.core.p3527b.p3528a;

import com.google.android.play.core.p3527b.C45052c;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.play.core.b.a.a */
/* compiled from: PG */
public final class C45050a {

    /* renamed from: a */
    protected final Set f117688a = new HashSet();

    /* renamed from: a */
    public final synchronized void mo48876a(C45052c cVar) {
        this.f117688a.add(cVar);
    }

    /* renamed from: b */
    public final synchronized void mo48877b(C45052c cVar) {
        this.f117688a.remove(cVar);
    }

    /* renamed from: c */
    public final synchronized void mo48878c(Object obj) {
        for (C45052c a : this.f117688a) {
            a.mo33446a(obj);
        }
    }
}
