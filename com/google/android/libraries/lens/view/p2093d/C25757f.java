package com.google.android.libraries.lens.view.p2093d;

import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.C2391v;
import androidx.p060c.C0977g;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.lens.view.d.f */
/* compiled from: PG */
public final class C25757f extends C2332ag {

    /* renamed from: h */
    private final Map f70020h = new C0977g();

    /* renamed from: e */
    public final void mo5704e(C2391v vVar, C2333ah ahVar) {
        super.mo5704e(vVar, new C25755d((AtomicBoolean) Map.EL.computeIfAbsent(this.f70020h, ahVar, C25756e.f70019a), ahVar));
    }

    /* renamed from: j */
    public final void mo5679j(C2333ah ahVar) {
        this.f70020h.remove(ahVar);
        super.mo5679j(ahVar);
    }

    /* renamed from: l */
    public final void mo5708l(Object obj) {
        for (AtomicBoolean atomicBoolean : this.f70020h.values()) {
            atomicBoolean.set(true);
        }
        super.mo5708l(obj);
    }
}
