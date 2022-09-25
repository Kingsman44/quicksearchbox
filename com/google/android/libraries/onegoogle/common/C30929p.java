package com.google.android.libraries.onegoogle.common;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58838bb;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.android.libraries.onegoogle.common.p */
/* compiled from: PG */
public final class C30929p {

    /* renamed from: a */
    private final Queue f83352a = new ArrayDeque();

    /* renamed from: b */
    private final C30928o f83353b;

    public C30929p(C30928o oVar) {
        this.f83353b = oVar;
    }

    /* renamed from: a */
    public final void mo36608a() {
        C19559g.m37304c();
        while (!this.f83352a.isEmpty()) {
            ((Runnable) this.f83352a.remove()).run();
        }
    }

    /* renamed from: b */
    public final void mo36609b() {
        C58838bb.m90884s(this.f83353b.mo36411e(), "Object was not initialized");
        C30914an.m57706a(new C30927n(this));
    }

    /* renamed from: c */
    public final void mo36610c(Runnable runnable) {
        C19559g.m37304c();
        this.f83352a.add(runnable);
        if (this.f83353b.mo36411e()) {
            mo36608a();
        }
    }
}
