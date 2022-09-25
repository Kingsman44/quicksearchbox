package com.bumptech.glide.p280a;

import java.io.IOException;

/* renamed from: com.bumptech.glide.a.c */
/* compiled from: PG */
public final class C5504c {

    /* renamed from: a */
    public final C5505d f16651a;

    /* renamed from: b */
    public final boolean[] f16652b;

    /* renamed from: c */
    public boolean f16653c;

    /* renamed from: d */
    public final /* synthetic */ C5507f f16654d;

    public C5504c(C5507f fVar, C5505d dVar) {
        this.f16654d = fVar;
        this.f16651a = dVar;
        this.f16652b = dVar.f16659e ? null : new boolean[fVar.f16666d];
    }

    /* renamed from: a */
    public final void mo11842a() {
        this.f16654d.mo11846b(this, false);
    }

    /* renamed from: b */
    public final void mo11843b() {
        if (!this.f16653c) {
            try {
                mo11842a();
            } catch (IOException unused) {
            }
        }
    }
}
