package com.google.android.libraries.elements;

import androidx.emoji.p108a.C2196f;
import androidx.emoji.p108a.C2200j;

/* renamed from: com.google.android.libraries.elements.i */
/* compiled from: PG */
final class C21229i extends C2196f {

    /* renamed from: a */
    final /* synthetic */ C2200j f59559a;

    public C21229i(C2200j jVar) {
        this.f59559a = jVar;
    }

    /* renamed from: a */
    public final void mo5510a() {
        C21366j.f59736a = true;
        C2200j jVar = this.f59559a;
        jVar.f6223c.writeLock().lock();
        try {
            jVar.f6224d.remove(this);
        } finally {
            jVar.f6223c.writeLock().unlock();
        }
    }
}
