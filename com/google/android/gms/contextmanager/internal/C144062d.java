package com.google.android.gms.contextmanager.internal;

import com.google.android.gms.contextmanager.C144030d;
import com.google.android.gms.contextmanager.ContextData;

/* renamed from: com.google.android.gms.contextmanager.internal.d */
/* compiled from: PG */
final class C144062d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ContextData f390335a;

    /* renamed from: b */
    final /* synthetic */ C144063e f390336b;

    public C144062d(C144063e eVar, ContextData contextData) {
        this.f390336b = eVar;
        this.f390335a = contextData;
    }

    public final void run() {
        C144063e eVar = this.f390336b;
        ContextData contextData = this.f390335a;
        synchronized (eVar.f390340d) {
            C144030d dVar = eVar.f390338b;
            if (dVar != null) {
                dVar.mo22588a(contextData);
            }
        }
    }
}
