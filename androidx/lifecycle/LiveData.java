package androidx.lifecycle;

import android.os.Handler;
import android.os.Looper;
import androidx.p054b.p055a.p056a.C0883b;
import androidx.p054b.p055a.p056a.C0885d;
import androidx.p054b.p055a.p056a.C0886e;
import androidx.p054b.p055a.p057b.C0890d;
import androidx.p054b.p055a.p057b.C0891e;
import androidx.p054b.p055a.p057b.C0894h;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
public class LiveData {

    /* renamed from: a */
    static final Object f6492a = new Object();

    /* renamed from: b */
    final Object f6493b;

    /* renamed from: c */
    public final C0894h f6494c;

    /* renamed from: d */
    int f6495d;

    /* renamed from: e */
    public boolean f6496e;

    /* renamed from: f */
    volatile Object f6497f;

    /* renamed from: g */
    public int f6498g;

    /* renamed from: h */
    private volatile Object f6499h;

    /* renamed from: i */
    private boolean f6500i;

    /* renamed from: j */
    private boolean f6501j;

    /* renamed from: k */
    private final Runnable f6502k;

    /* compiled from: PG */
    class LifecycleBoundObserver extends C2329ad implements C2389t {

        /* renamed from: a */
        final C2391v f6503a;

        public LifecycleBoundObserver(C2391v vVar, C2333ah ahVar) {
            super(LiveData.this, ahVar);
            this.f6503a = vVar;
        }

        /* renamed from: a */
        public final boolean mo5710a() {
            return this.f6503a.getLifecycle().mo5789a().mo5788a(C2383n.STARTED);
        }

        /* renamed from: b */
        public final void mo5711b() {
            this.f6503a.getLifecycle().mo5791c(this);
        }

        /* renamed from: c */
        public final boolean mo5712c(C2391v vVar) {
            return this.f6503a == vVar;
        }

        /* renamed from: eN */
        public final void mo416eN(C2391v vVar, C2382m mVar) {
            C2383n a = this.f6503a.getLifecycle().mo5789a();
            if (a != C2383n.DESTROYED) {
                C2383n nVar = null;
                while (nVar != a) {
                    mo5726d(mo5710a());
                    nVar = a;
                    a = this.f6503a.getLifecycle().mo5789a();
                }
                return;
            }
            LiveData.this.mo5679j(this.f6523c);
        }
    }

    public LiveData() {
        this.f6493b = new Object();
        this.f6494c = new C0894h();
        this.f6495d = 0;
        Object obj = f6492a;
        this.f6497f = obj;
        this.f6502k = new C2327ab(this);
        this.f6499h = obj;
        this.f6498g = -1;
    }

    /* renamed from: b */
    private final void m6275b(C2329ad adVar) {
        if (adVar.f6524d) {
            if (!adVar.mo5710a()) {
                adVar.mo5726d(false);
                return;
            }
            int i = adVar.f6525e;
            int i2 = this.f6498g;
            if (i < i2) {
                adVar.f6525e = i2;
                adVar.f6523c.mo774hX(this.f6499h);
            }
        }
    }

    /* renamed from: c */
    static void m6276c(String str) {
        if (!C0883b.m2768a().f2958b.mo3495b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    /* renamed from: a */
    public Object mo3842a() {
        Object obj = this.f6499h;
        if (obj != f6492a) {
            return obj;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo5703d(C2329ad adVar) {
        if (this.f6500i) {
            this.f6501j = true;
            return;
        }
        this.f6500i = true;
        while (true) {
            this.f6501j = false;
            if (adVar == null) {
                C0891e d = this.f6494c.mo3514d();
                while (d.hasNext()) {
                    m6275b((C2329ad) ((C0890d) d.next()).f2966b);
                    if (this.f6501j) {
                        break;
                    }
                }
            } else {
                m6275b(adVar);
            }
            if (this.f6501j) {
                adVar = null;
            } else {
                this.f6500i = false;
                return;
            }
        }
    }

    /* renamed from: e */
    public void mo5704e(C2391v vVar, C2333ah ahVar) {
        m6276c("observe");
        if (vVar.getLifecycle().mo5789a() != C2383n.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(vVar, ahVar);
            C2329ad adVar = (C2329ad) this.f6494c.mo3515e(ahVar, lifecycleBoundObserver);
            if (adVar != null && !adVar.mo5712c(vVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (adVar == null) {
                vVar.getLifecycle().mo5790b(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: f */
    public final void mo5705f(C2333ah ahVar) {
        m6276c("observeForever");
        C2328ac acVar = new C2328ac(this, ahVar);
        C2329ad adVar = (C2329ad) this.f6494c.mo3515e(ahVar, acVar);
        if (adVar instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (adVar == null) {
            acVar.mo5726d(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo5677g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo5678h() {
    }

    /* renamed from: i */
    public void mo5706i(Object obj) {
        Object obj2;
        Object obj3;
        synchronized (this.f6493b) {
            obj2 = this.f6497f;
            obj3 = f6492a;
            this.f6497f = obj;
        }
        if (obj2 == obj3) {
            C0883b a = C0883b.m2768a();
            Runnable runnable = this.f6502k;
            C0886e eVar = a.f2958b;
            C0885d dVar = (C0885d) eVar;
            if (dVar.f2963c == null) {
                synchronized (dVar.f2961a) {
                    if (((C0885d) eVar).f2963c == null) {
                        ((C0885d) eVar).f2963c = Handler.createAsync(Looper.getMainLooper());
                    }
                }
            }
            dVar.f2963c.post(runnable);
        }
    }

    /* renamed from: j */
    public void mo5679j(C2333ah ahVar) {
        m6276c("removeObserver");
        C2329ad adVar = (C2329ad) this.f6494c.mo3498b(ahVar);
        if (adVar != null) {
            adVar.mo5711b();
            adVar.mo5726d(false);
        }
    }

    /* renamed from: k */
    public final void mo5707k(C2391v vVar) {
        m6276c("removeObservers");
        Iterator it = this.f6494c.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((C2329ad) entry.getValue()).mo5712c(vVar)) {
                mo5679j((C2333ah) entry.getKey());
            }
        }
    }

    /* renamed from: l */
    public void mo5708l(Object obj) {
        m6276c("setValue");
        this.f6498g++;
        this.f6499h = obj;
        mo5703d((C2329ad) null);
    }

    /* renamed from: m */
    public final boolean mo5709m() {
        return this.f6495d > 0;
    }

    public LiveData(Object obj) {
        this.f6493b = new Object();
        this.f6494c = new C0894h();
        this.f6495d = 0;
        this.f6497f = f6492a;
        this.f6502k = new C2327ab(this);
        this.f6499h = obj;
        this.f6498g = 0;
    }
}
