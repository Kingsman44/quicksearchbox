package com.google.android.libraries.lens.view.p2093d;

import androidx.lifecycle.C2333ah;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.lens.view.d.d */
/* compiled from: PG */
public final /* synthetic */ class C25755d implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ AtomicBoolean f70017a;

    /* renamed from: b */
    public final /* synthetic */ C2333ah f70018b;

    public /* synthetic */ C25755d(AtomicBoolean atomicBoolean, C2333ah ahVar) {
        this.f70017a = atomicBoolean;
        this.f70018b = ahVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        AtomicBoolean atomicBoolean = this.f70017a;
        C2333ah ahVar = this.f70018b;
        if (atomicBoolean.compareAndSet(true, false)) {
            ahVar.mo774hX(obj);
        }
    }
}
