package com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8269e.p8270a;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8269e.C107058b;
import com.google.assistant.p4016z.C53686ak;
import java.util.ArrayDeque;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.h.e.a.a */
/* compiled from: PG */
public final class C107049a implements C107058b {

    /* renamed from: a */
    private final ArrayDeque f298091a = new ArrayDeque();

    /* renamed from: a */
    public final synchronized void mo95744a(C53686ak akVar) {
        if (this.f298091a.size() == 50) {
            this.f298091a.removeFirst();
        }
        this.f298091a.addLast(akVar);
    }
}
