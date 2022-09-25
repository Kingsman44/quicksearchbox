package com.google.common.android.concurrent;

import android.support.p031v4.app.FragmentManager;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import androidx.p060c.C0978h;
import androidx.p060c.C0979i;
import androidx.p060c.C0985o;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.util.concurrent.C60826bg;

/* compiled from: PG */
public final class FutureCallbackRegistry {

    /* renamed from: a */
    public final C58881cr f155809a;

    /* renamed from: b */
    public final C58277b f155810b;

    /* renamed from: c */
    public final C58881cr f155811c;

    /* compiled from: PG */
    final class FutureListenerLifecycleObserver implements C2376g {

        /* renamed from: b */
        private boolean f155813b = false;

        public FutureListenerLifecycleObserver() {
        }

        /* renamed from: gV */
        public final /* synthetic */ void mo3520gV(C2391v vVar) {
        }

        /* renamed from: gW */
        public final void mo3521gW(C2391v vVar) {
            C58295t tVar = (C58295t) FutureCallbackRegistry.this.f155811c.mo6453a();
            C58838bb.m90883r(tVar.f155849c == null);
            int d = tVar.f155847a.mo3725d();
            while (true) {
                d--;
                if (d >= 0) {
                    C0985o oVar = tVar.f155847a;
                    if (oVar.f3124b) {
                        oVar.mo3729h();
                    }
                    oVar.f3126d[d] = null;
                } else {
                    tVar.f155852f = false;
                    return;
                }
            }
        }

        /* renamed from: gX */
        public final /* synthetic */ void mo3522gX(C2391v vVar) {
        }

        /* renamed from: gY */
        public final void mo3523gY(C2391v vVar) {
            ((C58295t) FutureCallbackRegistry.this.f155811c.mo6453a()).mo54863e(((C58279d) FutureCallbackRegistry.this.f155809a).f155822a.getChildFragmentManager());
            if (!this.f155813b) {
                vVar.getLifecycle().mo5790b(new LaterFutureListenerLifecycleObserver());
                this.f155813b = true;
            }
        }

        /* renamed from: gZ */
        public final void mo3524gZ(C2391v vVar) {
            ((C58295t) FutureCallbackRegistry.this.f155811c.mo6453a()).mo54863e(((C58279d) FutureCallbackRegistry.this.f155809a).f155822a.getChildFragmentManager());
        }

        /* renamed from: ha */
        public final void mo3525ha(C2391v vVar) {
            C58295t tVar = (C58295t) FutureCallbackRegistry.this.f155811c.mo6453a();
            FragmentManager childFragmentManager = ((C58279d) FutureCallbackRegistry.this.f155809a).f155822a.getChildFragmentManager();
            boolean z = true;
            C58838bb.m90868c(childFragmentManager != null);
            FragmentManager fragmentManager = tVar.f155849c;
            if (fragmentManager != null) {
                if (childFragmentManager != fragmentManager) {
                    z = false;
                }
                C58838bb.m90883r(z);
                tVar.f155849c = null;
                C0978h hVar = new C0978h((C0979i) tVar.f155848b);
                while (hVar.hasNext()) {
                    ParcelableFuture parcelableFuture = (ParcelableFuture) hVar.next();
                    parcelableFuture.f155818d = null;
                    parcelableFuture.mo54848a();
                }
            }
        }
    }

    /* compiled from: PG */
    final class LaterFutureListenerLifecycleObserver implements C2376g {
        public LaterFutureListenerLifecycleObserver() {
        }

        /* renamed from: gV */
        public final /* synthetic */ void mo3520gV(C2391v vVar) {
        }

        /* renamed from: gW */
        public final /* synthetic */ void mo3521gW(C2391v vVar) {
        }

        /* renamed from: gX */
        public final /* synthetic */ void mo3522gX(C2391v vVar) {
        }

        /* renamed from: gY */
        public final void mo3523gY(C2391v vVar) {
            ((C58295t) FutureCallbackRegistry.this.f155811c.mo6453a()).f155853g = true;
        }

        /* renamed from: gZ */
        public final /* synthetic */ void mo3524gZ(C2391v vVar) {
        }

        /* renamed from: ha */
        public final /* synthetic */ void mo3525ha(C2391v vVar) {
        }
    }

    public FutureCallbackRegistry(C2384o oVar, C58881cr crVar, C58881cr crVar2, C58277b bVar) {
        C58838bb.m90884s(oVar.mo5789a() == C2383n.INITIALIZED, "FutureCallbackRegistry must be created in onCreate of the Activity/Fragment.");
        this.f155809a = crVar;
        this.f155810b = bVar;
        this.f155811c = C58886cw.m90973a(new C58278c(this, crVar2));
        oVar.mo5790b(new FutureListenerLifecycleObserver());
    }

    /* renamed from: a */
    public final void mo54846a(C58285j jVar, C58281f fVar, Object obj) {
        FragmentManager childFragmentManager = ((C58279d) this.f155809a).f155822a.getChildFragmentManager();
        boolean z = false;
        C58838bb.m90884s(!childFragmentManager.mo461ab() && !childFragmentManager.f659z, "Called when state-loss is possible.");
        C58295t tVar = (C58295t) this.f155811c.mo6453a();
        C58295t.m89272f();
        int b = tVar.f155847a.mo3722b(fVar);
        C58838bb.m90884s(b != -1, "Callback not registered.");
        int c = tVar.f155847a.mo3723c(b);
        ParcelableFuture parcelableFuture = new ParcelableFuture(c, obj, jVar.f155827a);
        int i = C58283h.f155825a;
        C58295t.m89272f();
        C58838bb.m90884s(tVar.f155847a.mo3726e(c) != null, "Callback not registered.");
        if (tVar.f155849c != null) {
            z = true;
        }
        C58838bb.m90884s(z, "Listening outside of callback window.");
        C58838bb.m90884s(tVar.f155853g, "Executing tasks from lifecycle methods is disallowed since it can result in unnecessary operations during configuration changes or other lifecycle transitions.");
        C58838bb.m90884s(!tVar.f155854h, "Calling listen() from FutureCallbackRegistry callbacks is disallowed because hopping through the UI thread adds extra latency. Chain the new Future to the original Future using Futures.transformAsync instead.");
        C58277b bVar = tVar.f155850d;
        parcelableFuture.f155817c.mo4106b(new C58296u(parcelableFuture), C60826bg.f164896a);
        tVar.f155848b.add(parcelableFuture);
        parcelableFuture.f155818d = tVar;
        parcelableFuture.mo54848a();
        if (!parcelableFuture.mo54849b()) {
            C58281f fVar2 = (C58281f) tVar.f155847a.mo3726e(c);
            tVar.mo54864g(parcelableFuture);
        }
    }

    /* renamed from: b */
    public final void mo54847b(int i, C58281f fVar) {
        C58295t tVar = (C58295t) this.f155811c.mo6453a();
        C58295t.m89272f();
        boolean z = true;
        C58838bb.m90884s(!tVar.f155852f, "Callbacks must be registered in onCreate().");
        if (tVar.f155847a.mo3726e(i) != null) {
            z = false;
        }
        C58838bb.m90884s(z, "Callback already registered.");
        C0985o oVar = tVar.f155847a;
        fVar.getClass();
        oVar.mo3730i(i, fVar);
    }
}
