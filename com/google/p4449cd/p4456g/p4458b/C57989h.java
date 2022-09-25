package com.google.p4449cd.p4456g.p4458b;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.p4449cd.p4456g.C57981b;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: com.google.cd.g.b.h */
/* compiled from: PG */
public abstract class C57989h implements C57981b {

    /* renamed from: g */
    public final Object f155059g = new Object();

    /* renamed from: h */
    protected final Set f155060h = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: i */
    public boolean f155061i = true;

    /* renamed from: j */
    protected Throwable f155062j;

    /* renamed from: k */
    protected Boolean f155063k;

    /* renamed from: f */
    public final void mo54589f(boolean z) {
        synchronized (this.f155059g) {
            if (this.f155061i) {
                this.f155063k = Boolean.valueOf(z);
                this.f155061i = false;
                for (C57988g d : this.f155060h) {
                    d.mo54584d(z);
                }
                this.f155060h.clear();
            }
        }
    }

    /* renamed from: g */
    public final void mo54590g(Throwable th) {
        synchronized (this.f155059g) {
            if (this.f155061i) {
                this.f155061i = false;
                this.f155062j = th;
                for (C57988g e : this.f155060h) {
                    e.mo54585e(th);
                }
                this.f155060h.clear();
            }
        }
    }

    /* renamed from: h */
    public final boolean mo54591h(Object obj) {
        synchronized (this.f155059g) {
            if (!this.f155061i) {
                return false;
            }
            C58801sm G = C58485gu.m89842j(this.f155060h).listIterator(0);
            while (G.hasNext()) {
                ((C57988g) G.next()).mo54583c(obj);
            }
            return true;
        }
    }

    /* renamed from: jK */
    public void mo20388jK() {
        mo54589f(true);
    }
}
