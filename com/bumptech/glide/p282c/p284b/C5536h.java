package com.bumptech.glide.p282c.p284b;

import com.bumptech.glide.load.p297b.C5750ab;
import java.util.ArrayDeque;

/* renamed from: com.bumptech.glide.c.b.h */
/* compiled from: PG */
final class C5536h {

    /* renamed from: a */
    public final ArrayDeque f16770a = new ArrayDeque();

    /* renamed from: b */
    final /* synthetic */ C5538j f16771b;

    public C5536h(C5538j jVar) {
        this.f16771b = jVar;
    }

    /* renamed from: a */
    public final synchronized C5535g mo11919a(C5750ab abVar) {
        C5535g gVar;
        gVar = (C5535g) this.f16770a.poll();
        if (gVar == null) {
            gVar = new C5535g(this.f16771b);
        }
        gVar.f16765d = System.currentTimeMillis();
        gVar.f16763b = abVar;
        return gVar;
    }
}
