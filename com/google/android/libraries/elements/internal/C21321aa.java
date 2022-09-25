package com.google.android.libraries.elements.internal;

import com.facebook.litho.C6281fx;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.p323b.C6118b;
import com.google.android.libraries.elements.interfaces.C21319z;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.elements.internal.aa */
/* compiled from: PG */
public final class C21321aa {

    /* renamed from: a */
    static final C21319z f59683a = C21319z.m40292B().mo26839p();

    /* renamed from: a */
    static C6407q m40327a(C6411u uVar, @C6118b C21342c cVar, @C6118b C21319z zVar, AtomicReference atomicReference, AtomicReference atomicReference2) {
        if (atomicReference2.get() == null || ((WeakReference) atomicReference2.get()).get() != cVar) {
            atomicReference2.set(new WeakReference(cVar));
            atomicReference.set((Object) null);
        }
        C6407q qVar = (C6407q) atomicReference.get();
        if (qVar != null) {
            return qVar;
        }
        C6407q a = cVar.mo26168a(uVar, zVar);
        atomicReference.set(a);
        return a;
    }

    /* renamed from: b */
    static void m40328b(C6281fx fxVar, C6281fx fxVar2) {
        fxVar.f18496a = new AtomicReference();
        fxVar2.f18496a = new AtomicReference();
    }
}
