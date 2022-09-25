package com.google.ads.interactivemedia.p367v3.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.adt */
/* compiled from: PG */
public final class adt {

    /* renamed from: a */
    private final CopyOnWriteArraySet f20385a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private final ArrayDeque f20386b = new ArrayDeque();

    /* renamed from: c */
    private final ArrayDeque f20387c = new ArrayDeque();

    /* renamed from: d */
    private boolean f20388d;

    /* renamed from: a */
    public final void mo14511a(Object obj) {
        if (!this.f20388d) {
            ary.m19467t(obj);
            this.f20385a.add(new C6784ads(obj));
        }
    }

    /* renamed from: b */
    public final void mo14512b(Object obj) {
        Iterator it = this.f20385a.iterator();
        while (it.hasNext()) {
            C6784ads ads = (C6784ads) it.next();
            if (ads.f20383a.equals(obj)) {
                ads.mo14507a();
                this.f20385a.remove(ads);
            }
        }
    }

    /* renamed from: c */
    public final void mo14513c(adr adr) {
        this.f20387c.add(new adq(new CopyOnWriteArraySet(this.f20385a), adr));
    }

    /* renamed from: d */
    public final void mo14514d() {
        boolean isEmpty = this.f20386b.isEmpty();
        this.f20386b.addAll(this.f20387c);
        this.f20387c.clear();
        if (!(!isEmpty)) {
            while (!this.f20386b.isEmpty()) {
                ((Runnable) this.f20386b.peekFirst()).run();
                this.f20386b.removeFirst();
            }
        }
    }

    /* renamed from: e */
    public final void mo14515e(adr adr) {
        mo14513c(adr);
        mo14514d();
    }

    /* renamed from: f */
    public final void mo14516f() {
        Iterator it = this.f20385a.iterator();
        while (it.hasNext()) {
            ((C6784ads) it.next()).mo14507a();
        }
        this.f20385a.clear();
        this.f20388d = true;
    }
}
