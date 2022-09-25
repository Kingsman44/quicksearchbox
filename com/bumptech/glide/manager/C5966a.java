package com.bumptech.glide.manager;

import com.bumptech.glide.p291h.C5632s;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.manager.a */
/* compiled from: PG */
final class C5966a implements C5976h {

    /* renamed from: a */
    private final Set f17627a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private boolean f17628b;

    /* renamed from: c */
    private boolean f17629c;

    /* renamed from: a */
    public final void mo12404a(C5977i iVar) {
        this.f17627a.add(iVar);
        if (this.f17629c) {
            iVar.mo11881p();
        } else if (this.f17628b) {
            iVar.mo11882q();
        } else {
            iVar.mo11883r();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12409b() {
        this.f17629c = true;
        for (C5977i p : C5632s.m14614g(this.f17627a)) {
            p.mo11881p();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12410c() {
        this.f17628b = true;
        for (C5977i q : C5632s.m14614g(this.f17627a)) {
            q.mo11882q();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo12411d() {
        this.f17628b = false;
        for (C5977i r : C5632s.m14614g(this.f17627a)) {
            r.mo11883r();
        }
    }

    /* renamed from: e */
    public final void mo12405e(C5977i iVar) {
        this.f17627a.remove(iVar);
    }
}
