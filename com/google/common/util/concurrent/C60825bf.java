package com.google.common.util.concurrent;

import com.google.common.p4522b.C58471gg;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.common.util.concurrent.bf */
/* compiled from: PG */
final class C60825bf extends C60925m {

    /* renamed from: c */
    public C60824be f164895c;

    public C60825bf(C58471gg ggVar, boolean z, Executor executor, C60930r rVar) {
        super(ggVar, z, false);
        this.f164895c = new C60822bc(this, rVar, executor);
        mo57425r();
    }

    /* renamed from: f */
    public final void mo57284f(int i, Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: gL */
    public final void mo57294gL() {
        C60824be beVar = this.f164895c;
        if (beVar != null) {
            beVar.mo57350h();
        }
    }

    /* renamed from: i */
    public final void mo57285i() {
        C60824be beVar = this.f164895c;
        if (beVar != null) {
            beVar.mo57292f();
        }
    }

    /* renamed from: s */
    public final void mo57286s(int i) {
        this.f165040a = null;
        if (i == 1) {
            this.f164895c = null;
        }
    }

    public C60825bf(C58471gg ggVar, boolean z, Executor executor, Callable callable) {
        super(ggVar, z, false);
        this.f164895c = new C60823bd(this, callable, executor);
        mo57425r();
    }
}
