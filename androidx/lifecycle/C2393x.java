package androidx.lifecycle;

import androidx.p054b.p055a.p056a.C0883b;
import androidx.p054b.p055a.p057b.C0887a;
import androidx.p054b.p055a.p057b.C0889c;
import androidx.p054b.p055a.p057b.C0890d;
import androidx.p054b.p055a.p057b.C0891e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: androidx.lifecycle.x */
/* compiled from: PG */
public class C2393x extends C2384o {

    /* renamed from: b */
    public C0887a f6611b = new C0887a();

    /* renamed from: c */
    public C2383n f6612c;

    /* renamed from: d */
    private final WeakReference f6613d;

    /* renamed from: e */
    private int f6614e = 0;

    /* renamed from: f */
    private boolean f6615f = false;

    /* renamed from: g */
    private boolean f6616g = false;

    /* renamed from: h */
    private final ArrayList f6617h = new ArrayList();

    public C2393x(C2391v vVar) {
        this.f6613d = new WeakReference(vVar);
        this.f6612c = C2383n.INITIALIZED;
    }

    /* renamed from: d */
    static C2383n m6406d(C2383n nVar, C2383n nVar2) {
        return (nVar2 == null || nVar2.compareTo(nVar) >= 0) ? nVar : nVar2;
    }

    /* renamed from: h */
    public static final void m6407h(String str) {
        if (!C0883b.m2768a().f2958b.mo3495b()) {
            throw new IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.lifecycle.n} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.lifecycle.C2383n m6408i(androidx.lifecycle.C2390u r4) {
        /*
            r3 = this;
            androidx.b.a.b.a r0 = r3.f6611b
            java.util.HashMap r1 = r0.f2964a
            boolean r1 = r1.containsKey(r4)
            r2 = 0
            if (r1 == 0) goto L_0x0016
            java.util.HashMap r0 = r0.f2964a
            java.lang.Object r4 = r0.get(r4)
            androidx.b.a.b.d r4 = (androidx.p054b.p055a.p057b.C0890d) r4
            androidx.b.a.b.d r4 = r4.f2968d
            goto L_0x0017
        L_0x0016:
            r4 = r2
        L_0x0017:
            if (r4 == 0) goto L_0x0020
            java.lang.Object r4 = r4.f2966b
            androidx.lifecycle.w r4 = (androidx.lifecycle.C2392w) r4
            androidx.lifecycle.n r4 = r4.f6609a
            goto L_0x0021
        L_0x0020:
            r4 = r2
        L_0x0021:
            java.util.ArrayList r0 = r3.f6617h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0038
            java.util.ArrayList r0 = r3.f6617h
            int r1 = r0.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            androidx.lifecycle.n r2 = (androidx.lifecycle.C2383n) r2
        L_0x0038:
            androidx.lifecycle.n r0 = r3.f6612c
            androidx.lifecycle.n r4 = m6406d(r0, r4)
            androidx.lifecycle.n r4 = m6406d(r4, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C2393x.m6408i(androidx.lifecycle.u):androidx.lifecycle.n");
    }

    /* renamed from: j */
    private final void m6409j(C2383n nVar) {
        C2383n nVar2 = this.f6612c;
        if (nVar2 != nVar) {
            if (nVar2 == C2383n.INITIALIZED && nVar == C2383n.DESTROYED) {
                StringBuilder sb = new StringBuilder("no event down from ");
                C2383n nVar3 = this.f6612c;
                sb.append(nVar3);
                throw new IllegalStateException("no event down from ".concat(String.valueOf(nVar3)));
            }
            this.f6612c = nVar;
            if (this.f6615f || this.f6614e != 0) {
                this.f6616g = true;
                return;
            }
            this.f6615f = true;
            m6411l();
            this.f6615f = false;
            if (this.f6612c == C2383n.DESTROYED) {
                this.f6611b = new C0887a();
            }
        }
    }

    /* renamed from: k */
    private final void m6410k() {
        ArrayList arrayList = this.f6617h;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: l */
    private final void m6411l() {
        C2383n nVar;
        C2383n nVar2;
        C2391v vVar = (C2391v) this.f6613d.get();
        if (vVar != null) {
            while (true) {
                C0887a aVar = this.f6611b;
                if (!(aVar.f2977e == 0 || ((nVar = ((C2392w) aVar.f2974b.f2966b).f6609a) == (nVar2 = ((C2392w) aVar.f2975c.f2966b).f6609a) && this.f6612c == nVar2))) {
                    this.f6616g = false;
                    if (this.f6612c.compareTo(nVar) < 0) {
                        C0887a aVar2 = this.f6611b;
                        C0889c cVar = new C0889c(aVar2.f2975c, aVar2.f2974b);
                        aVar2.f2976d.put(cVar, false);
                        while (cVar.hasNext() && !this.f6616g) {
                            Map.Entry entry = (Map.Entry) cVar.next();
                            C2392w wVar = (C2392w) entry.getValue();
                            while (wVar.f6609a.compareTo(this.f6612c) > 0 && !this.f6616g) {
                                if (!this.f6611b.f2964a.containsKey((C2390u) entry.getKey())) {
                                    continue;
                                    break;
                                }
                                C2382m a = C2382m.m6393a(wVar.f6609a);
                                if (a != null) {
                                    this.f6617h.add(a.mo5787d());
                                    wVar.mo5792a(vVar, a);
                                    m6410k();
                                } else {
                                    StringBuilder sb = new StringBuilder("no event down from ");
                                    C2383n nVar3 = wVar.f6609a;
                                    sb.append(nVar3);
                                    throw new IllegalStateException("no event down from ".concat(String.valueOf(nVar3)));
                                }
                            }
                        }
                    }
                    C0890d dVar = this.f6611b.f2975c;
                    if (!this.f6616g && dVar != null && this.f6612c.compareTo(((C2392w) dVar.f2966b).f6609a) > 0) {
                        C0891e d = this.f6611b.mo3514d();
                        while (d.hasNext() && !this.f6616g) {
                            C0890d dVar2 = (C0890d) d.next();
                            C2392w wVar2 = (C2392w) dVar2.f2966b;
                            while (wVar2.f6609a.compareTo(this.f6612c) < 0 && !this.f6616g) {
                                if (!this.f6611b.f2964a.containsKey((C2390u) dVar2.f2965a)) {
                                    continue;
                                    break;
                                }
                                this.f6617h.add(wVar2.f6609a);
                                C2382m b = C2382m.m6394b(wVar2.f6609a);
                                if (b != null) {
                                    wVar2.mo5792a(vVar, b);
                                    m6410k();
                                } else {
                                    StringBuilder sb2 = new StringBuilder("no event up from ");
                                    C2383n nVar4 = wVar2.f6609a;
                                    sb2.append(nVar4);
                                    throw new IllegalStateException("no event up from ".concat(String.valueOf(nVar4)));
                                }
                            }
                        }
                    }
                }
            }
            this.f6616g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    /* renamed from: a */
    public final C2383n mo5789a() {
        return this.f6612c;
    }

    /* renamed from: b */
    public final void mo5790b(C2390u uVar) {
        C2383n nVar;
        Object obj;
        C2391v vVar;
        m6407h("addObserver");
        if (this.f6612c == C2383n.DESTROYED) {
            nVar = C2383n.DESTROYED;
        } else {
            nVar = C2383n.INITIALIZED;
        }
        C2392w wVar = new C2392w(uVar, nVar);
        C0887a aVar = this.f6611b;
        C0890d a = aVar.mo3497a(uVar);
        if (a != null) {
            obj = a.f2966b;
        } else {
            aVar.f2964a.put(uVar, aVar.mo3513c(uVar, wVar));
            obj = null;
        }
        if (((C2392w) obj) == null && (vVar = (C2391v) this.f6613d.get()) != null) {
            boolean z = this.f6614e != 0 || this.f6615f;
            C2383n i = m6408i(uVar);
            this.f6614e++;
            while (wVar.f6609a.compareTo(i) < 0 && this.f6611b.f2964a.containsKey(uVar)) {
                this.f6617h.add(wVar.f6609a);
                C2382m b = C2382m.m6394b(wVar.f6609a);
                if (b != null) {
                    wVar.mo5792a(vVar, b);
                    m6410k();
                    i = m6408i(uVar);
                } else {
                    StringBuilder sb = new StringBuilder("no event up from ");
                    C2383n nVar2 = wVar.f6609a;
                    sb.append(nVar2);
                    throw new IllegalStateException("no event up from ".concat(String.valueOf(nVar2)));
                }
            }
            if (!z) {
                m6411l();
            }
            this.f6614e--;
        }
    }

    /* renamed from: c */
    public final void mo5791c(C2390u uVar) {
        m6407h("removeObserver");
        this.f6611b.mo3498b(uVar);
    }

    /* renamed from: e */
    public void mo5793e(C2382m mVar) {
        m6407h("handleLifecycleEvent");
        m6409j(mVar.mo5787d());
    }

    @Deprecated
    /* renamed from: f */
    public final void mo5794f(C2383n nVar) {
        m6407h("markState");
        mo5795g(nVar);
    }

    /* renamed from: g */
    public final void mo5795g(C2383n nVar) {
        m6407h("setCurrentState");
        m6409j(nVar);
    }
}
