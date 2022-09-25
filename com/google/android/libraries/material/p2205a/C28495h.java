package com.google.android.libraries.material.p2205a;

import android.view.Choreographer;

/* renamed from: com.google.android.libraries.material.a.h */
/* compiled from: PG */
final class C28495h extends C28496i {

    /* renamed from: a */
    private final Choreographer f77327a = Choreographer.getInstance();

    /* renamed from: a */
    public final void mo33952a(C28494g gVar) {
        this.f77327a.postFrameCallback(gVar.mo33951b());
    }

    /* renamed from: b */
    public final void mo33953b(C28494g gVar) {
        this.f77327a.removeFrameCallback(gVar.mo33951b());
    }
}
