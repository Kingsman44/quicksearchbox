package com.google.android.libraries.material.p2205a;

import com.google.android.libraries.material.progress.C28579e;

/* renamed from: com.google.android.libraries.material.a.c */
/* compiled from: PG */
final class C28490c extends C28494g {

    /* renamed from: a */
    final /* synthetic */ C28491d f77319a;

    public C28490c(C28491d dVar) {
        this.f77319a = dVar;
    }

    /* renamed from: a */
    public final void mo33947a(long j) {
        C28491d dVar = this.f77319a;
        dVar.f77323d++;
        if (!dVar.mo33944a(dVar.f77320a) && !this.f77319a.f77320a.isStarted()) {
            C28491d dVar2 = this.f77319a;
            if (dVar2.f77322c == -1 || dVar2.f77323d < 0) {
                Runnable runnable = dVar2.f77321b;
                if (runnable != null) {
                    ((C28579e) runnable).f77716a.mo34198c();
                }
                this.f77319a.f77320a.start();
            }
        }
    }
}
