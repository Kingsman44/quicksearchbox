package com.bumptech.glide.manager;

import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2390u;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.OnLifecycleEvent;
import com.bumptech.glide.p291h.C5632s;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
final class LifecycleLifecycle implements C5976h, C2390u {

    /* renamed from: a */
    private final Set f17625a = new HashSet();

    /* renamed from: b */
    private final C2384o f17626b;

    public LifecycleLifecycle(C2384o oVar) {
        this.f17626b = oVar;
        oVar.mo5790b(this);
    }

    /* renamed from: a */
    public final void mo12404a(C5977i iVar) {
        this.f17625a.add(iVar);
        if (this.f17626b.mo5789a() == C2383n.DESTROYED) {
            iVar.mo11881p();
        } else if (this.f17626b.mo5789a().mo5788a(C2383n.STARTED)) {
            iVar.mo11882q();
        } else {
            iVar.mo11883r();
        }
    }

    /* renamed from: e */
    public final void mo12405e(C5977i iVar) {
        this.f17625a.remove(iVar);
    }

    @OnLifecycleEvent(mo5713a = C2382m.ON_DESTROY)
    public void onDestroy(C2391v vVar) {
        for (C5977i p : C5632s.m14614g(this.f17625a)) {
            p.mo11881p();
        }
        vVar.getLifecycle().mo5791c(this);
    }

    @OnLifecycleEvent(mo5713a = C2382m.ON_START)
    public void onStart(C2391v vVar) {
        for (C5977i q : C5632s.m14614g(this.f17625a)) {
            q.mo11882q();
        }
    }

    @OnLifecycleEvent(mo5713a = C2382m.ON_STOP)
    public void onStop(C2391v vVar) {
        for (C5977i r : C5632s.m14614g(this.f17625a)) {
            r.mo11883r();
        }
    }
}
