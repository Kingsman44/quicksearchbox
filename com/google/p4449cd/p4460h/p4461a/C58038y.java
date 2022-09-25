package com.google.p4449cd.p4460h.p4461a;

import com.google.p4449cd.p4456g.C57996c;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Semaphore;

/* renamed from: com.google.cd.h.a.y */
/* compiled from: PG */
final class C58038y implements C57996c {

    /* renamed from: a */
    public final Object f155159a = new Object();

    /* renamed from: b */
    public final Deque f155160b = new ArrayDeque();

    /* renamed from: c */
    public final Semaphore f155161c = new Semaphore(0);

    /* renamed from: d */
    public boolean f155162d = false;

    /* renamed from: e */
    public C57996c f155163e;

    /* renamed from: b */
    public final void mo54611b() {
        synchronized (this.f155159a) {
            if (this.f155162d) {
                this.f155161c.release();
                throw new C58037x();
            }
        }
    }

    /* renamed from: c */
    public final void mo54612c() {
        synchronized (this.f155159a) {
            this.f155163e = null;
        }
    }

    /* renamed from: d */
    public final void mo54613d(Object obj) {
        synchronized (this.f155159a) {
            if (!this.f155162d) {
                this.f155160b.addLast(obj);
                this.f155161c.release();
            }
        }
    }

    /* renamed from: g */
    public final void mo21018g() {
        C57996c cVar;
        synchronized (this.f155159a) {
            cVar = null;
            if (!this.f155162d) {
                this.f155162d = true;
                C57996c cVar2 = this.f155163e;
                this.f155163e = null;
                this.f155160b.clear();
                this.f155161c.release();
                cVar = cVar2;
            }
        }
        if (cVar != null) {
            cVar.mo21018g();
        }
    }
}
