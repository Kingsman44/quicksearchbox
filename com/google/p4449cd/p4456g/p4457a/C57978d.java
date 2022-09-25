package com.google.p4449cd.p4456g.p4457a;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.C57996c;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.cd.g.a.d */
/* compiled from: PG */
public class C57978d implements C57981b, C57974a {

    /* renamed from: a */
    public final Object f155033a = new Object();

    /* renamed from: b */
    public final Map f155034b = new IdentityHashMap();

    /* renamed from: c */
    private final List f155035c = new ArrayList();

    /* renamed from: d */
    private C57996c f155036d = null;

    /* renamed from: e */
    private boolean f155037e = false;

    /* renamed from: f */
    private C58833ax f155038f = C58836b.f156633a;

    /* renamed from: g */
    private Throwable f155039g;

    /* renamed from: h */
    private final C57977c f155040h = new C57977c(this);

    /* renamed from: e */
    private final void m88695e(boolean z) {
        if (!m88697g()) {
            this.f155038f = C58833ax.m90834k(Boolean.valueOf(z));
            this.f155040h.mo57356n(new ArrayList(this.f155035c));
            if (!this.f155037e) {
                this.f155037e = true;
                m88696f();
            }
            for (C57976b d : this.f155034b.values()) {
                d.mo54584d(z);
            }
            this.f155034b.clear();
        }
    }

    /* renamed from: f */
    private final void m88696f() {
        ArrayList arrayList = null;
        for (Map.Entry entry : this.f155034b.entrySet()) {
            C57976b bVar = (C57976b) entry.getValue();
            bVar.mo54582b();
            if (!bVar.f155044c.get()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((C57974a) entry.getKey());
            }
        }
        if (arrayList != null) {
            this.f155034b.keySet().removeAll(arrayList);
        }
    }

    /* renamed from: g */
    private final boolean m88697g() {
        return this.f155038f.mo56113h() || this.f155039g != null;
    }

    /* renamed from: c */
    public void mo20337c(Object obj) {
        synchronized (this.f155033a) {
            if (!m88697g()) {
                this.f155035c.add(obj);
                C58801sm G = C58485gu.m89842j(this.f155034b.values()).listIterator(0);
                while (G.hasNext()) {
                    ((C57976b) G.next()).mo54583c(obj);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        synchronized (this.f155033a) {
            this.f155037e = true;
            if (m88697g()) {
                cVar.mo21018g();
            } else {
                this.f155036d = cVar;
                m88696f();
            }
        }
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        synchronized (this.f155033a) {
            m88695e(z);
        }
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        synchronized (this.f155033a) {
            if (!m88697g()) {
                this.f155039g = th;
                this.f155040h.mo57357o(th);
                C58801sm G = C58485gu.m89842j(this.f155034b.values()).listIterator(0);
                while (G.hasNext()) {
                    ((C57976b) G.next()).mo54585e(th);
                }
                this.f155034b.clear();
            }
        }
    }

    /* renamed from: jJ */
    public final C60870cx mo20440jJ(C57974a aVar) {
        C57976b bVar = new C57976b(this, aVar);
        synchronized (this.f155033a) {
            if (this.f155037e) {
                bVar.mo54582b();
                if (bVar.f155044c.get()) {
                    for (Object c : this.f155035c) {
                        bVar.mo54583c(c);
                        if (!bVar.f155044c.get()) {
                            break;
                        }
                    }
                    Throwable th = this.f155039g;
                    if (th != null) {
                        bVar.mo54585e(th);
                    } else if (this.f155038f.mo56113h()) {
                        bVar.mo54584d(((Boolean) this.f155038f.mo56107c()).booleanValue());
                    } else if (bVar.f155044c.get()) {
                        this.f155034b.put(aVar, bVar);
                    }
                }
            } else {
                this.f155034b.put(aVar, bVar);
            }
        }
        return bVar.f155043b;
    }

    /* renamed from: jK */
    public final void mo20388jK() {
        synchronized (this.f155033a) {
            if (!m88697g()) {
                C57996c cVar = this.f155036d;
                if (cVar != null) {
                    cVar.mo21018g();
                }
                m88695e(true);
            }
        }
    }
}
