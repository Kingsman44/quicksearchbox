package com.google.android.apps.gsa.nga.engine.understanding;

import android.util.ArraySet;
import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Set;
import p3186j$.util.Comparator;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.ad */
/* compiled from: PG */
public final class C78977ad {

    /* renamed from: a */
    public final Object f217236a = new Object();

    /* renamed from: b */
    public final Set f217237b = new ArraySet();

    /* renamed from: c */
    public final Comparator f217238c;

    /* renamed from: d */
    public final BiConsumer f217239d;

    /* renamed from: e */
    public Object f217240e = null;

    /* renamed from: f */
    public final PriorityQueue f217241f;

    /* renamed from: g */
    public boolean f217242g = true;

    /* renamed from: h */
    private final C22871g f217243h;

    /* renamed from: i */
    private final int f217244i;

    public C78977ad(C22871g gVar, int i, Comparator comparator, BiConsumer biConsumer) {
        this.f217243h = gVar;
        this.f217244i = i;
        this.f217238c = comparator;
        this.f217241f = new PriorityQueue(Comparator.CC.comparing(C78975ab.f217233a, comparator));
        this.f217239d = biConsumer;
    }

    /* renamed from: a */
    public final void mo73728a() {
        Object obj;
        synchronized (this.f217236a) {
            while (this.f217237b.size() < this.f217244i && !this.f217241f.isEmpty()) {
                C78978ae aeVar = (C78978ae) this.f217241f.poll();
                aeVar.getClass();
                if (this.f217242g) {
                    Object obj2 = this.f217240e;
                    if (obj2 == null || !mo73730c(aeVar.mo73732b(), obj2)) {
                        this.f217237b.add(aeVar);
                        this.f217243h.mo28212l(aeVar.mo73734d(), new C79334z(aeVar));
                        this.f217243h.mo28211k(aeVar.mo73731a(), "[NGA] Priority runner cleanup.", new C78976ac(this, aeVar));
                    }
                }
                aeVar.mo73735e();
                if (this.f217242g && (obj = this.f217240e) != null) {
                    this.f217239d.accept(aeVar, obj);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo73729b(C78978ae aeVar) {
        synchronized (this.f217236a) {
            this.f217237b.remove(aeVar);
        }
        mo73728a();
    }

    /* renamed from: c */
    public final boolean mo73730c(Object obj, Object obj2) {
        return this.f217238c.compare(obj, obj2) > 0;
    }
}
