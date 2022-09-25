package com.bumptech.glide.load.p293a.p294a;

import com.bumptech.glide.p291h.C5632s;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.a.a.c */
/* compiled from: PG */
abstract class C5641c {

    /* renamed from: a */
    private final Queue f17011a = C5632s.m14615h(20);

    /* renamed from: a */
    public abstract C5653o mo12110a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C5653o mo12111b() {
        C5653o oVar = (C5653o) this.f17011a.poll();
        return oVar == null ? mo12110a() : oVar;
    }

    /* renamed from: c */
    public final void mo12112c(C5653o oVar) {
        if (this.f17011a.size() < 20) {
            this.f17011a.offer(oVar);
        }
    }
}
