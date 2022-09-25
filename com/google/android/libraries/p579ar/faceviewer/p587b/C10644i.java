package com.google.android.libraries.p579ar.faceviewer.p587b;

import com.google.research.xeno.effect.C66406i;
import com.google.research.xeno.effect.C66412o;
import com.google.research.xeno.effect.ProcessorBase;

/* renamed from: com.google.android.libraries.ar.faceviewer.b.i */
/* compiled from: PG */
public final class C10644i extends C66412o implements AutoCloseable {
    public C10644i(C66406i iVar) {
        super(iVar);
    }

    public final void close() {
        this.f180564d.writeLock().lock();
        try {
            long j = this.f180565e;
            if (j != 0) {
                ProcessorBase.nativeRelease(j);
                this.f180566f.mo58607c();
            }
            this.f180565e = 0;
        } finally {
            this.f180564d.writeLock().unlock();
        }
    }
}
