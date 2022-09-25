package android.support.p031v4.app;

import android.util.Log;
import androidx.core.p094f.C1892e;
import androidx.core.p094f.C1893f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: android.support.v4.app.dc */
/* compiled from: PG */
class C0238dc {

    /* renamed from: a */
    public final Fragment f872a;

    /* renamed from: b */
    public final HashSet f873b = new HashSet();

    /* renamed from: c */
    public boolean f874c = false;

    /* renamed from: d */
    public boolean f875d = false;

    /* renamed from: e */
    public int f876e;

    /* renamed from: f */
    public int f877f;

    /* renamed from: g */
    private final List f878g = new ArrayList();

    public C0238dc(int i, int i2, Fragment fragment, C1893f fVar) {
        this.f876e = i;
        this.f877f = i2;
        this.f872a = fragment;
        fVar.mo5046a(new C0234cz(this));
    }

    /* renamed from: a */
    public void mo737a() {
        if (!this.f875d) {
            if (FragmentManager.m246Z(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f875d = true;
            for (Runnable run : this.f878g) {
                run.run();
            }
        }
    }

    /* renamed from: b */
    public void mo738b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo741c(Runnable runnable) {
        this.f878g.add(runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo742d() {
        if (!this.f874c) {
            this.f874c = true;
            if (this.f873b.isEmpty()) {
                mo737a();
                return;
            }
            ArrayList arrayList = new ArrayList(this.f873b);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C1893f fVar = (C1893f) arrayList.get(i);
                synchronized (fVar) {
                    if (!fVar.f5769a) {
                        fVar.f5769a = true;
                        fVar.f5771c = true;
                        C1892e eVar = fVar.f5770b;
                        if (eVar != null) {
                            try {
                                eVar.mo739a();
                            } catch (Throwable th) {
                                synchronized (fVar) {
                                    fVar.f5771c = false;
                                    fVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (fVar) {
                            fVar.f5771c = false;
                            fVar.notifyAll();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo743e(C1893f fVar) {
        mo738b();
        this.f873b.add(fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo744f(int i, int i2) {
        int i3 = i2 - 1;
        if (i3 != 1) {
            if (i3 == 2) {
                if (FragmentManager.m246Z(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f872a + " mFinalState = " + C0237db.m551a(this.f876e) + " -> REMOVED. mLifecycleImpact  = " + C0236da.m550a(this.f877f) + " to REMOVING.");
                }
                this.f876e = 1;
                this.f877f = 3;
            } else if (this.f876e != 1) {
                if (FragmentManager.m246Z(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f872a + " mFinalState = " + C0237db.m551a(this.f876e) + " -> " + C0237db.m551a(i) + ". ");
                }
                this.f876e = i;
            }
        } else if (this.f876e == 1) {
            if (FragmentManager.m246Z(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f872a + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + C0236da.m550a(this.f877f) + " to ADDING.");
            }
            this.f876e = 2;
            this.f877f = 2;
        }
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + C0237db.m551a(this.f876e) + "} {mLifecycleImpact = " + C0236da.m550a(this.f877f) + "} {mFragment = " + this.f872a + "}";
    }
}
