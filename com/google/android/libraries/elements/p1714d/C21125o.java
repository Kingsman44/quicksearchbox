package com.google.android.libraries.elements.p1714d;

import com.google.android.libraries.elements.interfaces.C21309p;
import com.google.android.libraries.elements.interfaces.C21310q;
import com.google.common.p4522b.C58485gu;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.DesugarCollections;

/* renamed from: com.google.android.libraries.elements.d.o */
/* compiled from: PG */
public final class C21125o implements C21310q {

    /* renamed from: a */
    public final Map f59234a = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private final C58485gu f59235b;

    public C21125o(C58485gu guVar) {
        this.f59235b = guVar;
    }

    /* renamed from: a */
    public final C21309p mo25826a(C21309p pVar) {
        C58485gu guVar = this.f59235b;
        int size = guVar.size();
        C21309p pVar2 = pVar;
        for (int i = 0; i < size; i++) {
            pVar2 = ((C21310q) guVar.get(i)).mo25826a(pVar);
        }
        synchronized (this.f59234a) {
            for (C21310q a : this.f59234a.values()) {
                pVar2 = a.mo25826a(pVar);
            }
        }
        return pVar2;
    }

    /* renamed from: b */
    public final void mo26160b(Object obj, C21310q qVar) {
        this.f59234a.put(obj, qVar);
    }
}
