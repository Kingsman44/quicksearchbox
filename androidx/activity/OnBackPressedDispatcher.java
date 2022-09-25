package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.core.p094f.C1888a;
import androidx.core.p097i.C1967b;
import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2389t;
import androidx.lifecycle.C2391v;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: PG */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    final ArrayDeque f2719a;

    /* renamed from: b */
    public OnBackInvokedDispatcher f2720b;

    /* renamed from: c */
    private final Runnable f2721c;

    /* renamed from: d */
    private C1967b f2722d;

    /* renamed from: e */
    private OnBackInvokedCallback f2723e;

    /* renamed from: f */
    private boolean f2724f;

    /* compiled from: PG */
    class LifecycleOnBackPressedCancellable implements C2389t, C0786a {

        /* renamed from: b */
        private final C2384o f2726b;

        /* renamed from: c */
        private final C0800m f2727c;

        /* renamed from: d */
        private C0786a f2728d;

        public LifecycleOnBackPressedCancellable(C2384o oVar, C0800m mVar) {
            this.f2726b = oVar;
            this.f2727c = mVar;
            oVar.mo5790b(this);
        }

        /* renamed from: b */
        public final void mo3342b() {
            this.f2726b.mo5791c(this);
            this.f2727c.f2748c.remove(this);
            C0786a aVar = this.f2728d;
            if (aVar != null) {
                aVar.mo3342b();
                this.f2728d = null;
            }
        }

        /* renamed from: eN */
        public final void mo416eN(C2391v vVar, C2382m mVar) {
            if (mVar == C2382m.ON_START) {
                this.f2728d = OnBackPressedDispatcher.this.mo3338a(this.f2727c);
            } else if (mVar == C2382m.ON_STOP) {
                C0786a aVar = this.f2728d;
                if (aVar != null) {
                    aVar.mo3342b();
                }
            } else if (mVar == C2382m.ON_DESTROY) {
                mo3342b();
            }
        }
    }

    public OnBackPressedDispatcher() {
        this((Runnable) null);
    }

    /* renamed from: a */
    public final C0786a mo3338a(C0800m mVar) {
        this.f2719a.add(mVar);
        C0805r rVar = new C0805r(this, mVar);
        mVar.f2748c.add(rVar);
        if (C1888a.m5150d()) {
            mo3341d();
            mVar.f2749d = this.f2722d;
        }
        return rVar;
    }

    /* renamed from: b */
    public final void mo3339b(C2391v vVar, C0800m mVar) {
        C2384o lifecycle = vVar.getLifecycle();
        if (lifecycle.mo5789a() != C2383n.DESTROYED) {
            mVar.f2748c.add(new LifecycleOnBackPressedCancellable(lifecycle, mVar));
            if (C1888a.m5150d()) {
                mo3341d();
                mVar.f2749d = this.f2722d;
            }
        }
    }

    /* renamed from: c */
    public final void mo3340c() {
        Iterator descendingIterator = this.f2719a.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0800m mVar = (C0800m) descendingIterator.next();
            if (mVar.f2747b) {
                mVar.mo608a();
                return;
            }
        }
        Runnable runnable = this.f2721c;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo3341d() {
        boolean z;
        Iterator descendingIterator = this.f2719a.descendingIterator();
        while (true) {
            if (descendingIterator.hasNext()) {
                if (((C0800m) descendingIterator.next()).f2747b) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f2720b;
        if (onBackInvokedDispatcher == null) {
            return;
        }
        if (z) {
            if (!this.f2724f) {
                C0804q.m2646b(onBackInvokedDispatcher, 0, this.f2723e);
                this.f2724f = true;
            }
        } else if (this.f2724f) {
            C0804q.m2647c(onBackInvokedDispatcher, this.f2723e);
            this.f2724f = false;
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f2719a = new ArrayDeque();
        this.f2724f = false;
        this.f2721c = runnable;
        if (C1888a.m5150d()) {
            this.f2722d = new C0801n(this);
            this.f2723e = C0804q.m2645a(new C0802o(this));
        }
    }
}
