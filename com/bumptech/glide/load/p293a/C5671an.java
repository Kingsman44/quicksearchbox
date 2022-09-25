package com.bumptech.glide.load.p293a;

import com.bumptech.glide.load.C5955n;
import com.bumptech.glide.p291h.C5630q;

/* renamed from: com.bumptech.glide.load.a.an */
/* compiled from: PG */
public final class C5671an implements C5679av {

    /* renamed from: a */
    public final boolean f17105a;

    /* renamed from: b */
    private final C5679av f17106b;

    /* renamed from: c */
    private final C5670am f17107c;

    /* renamed from: d */
    private final C5955n f17108d;

    /* renamed from: e */
    private int f17109e;

    /* renamed from: f */
    private boolean f17110f;

    public C5671an(C5679av avVar, boolean z, C5955n nVar, C5670am amVar) {
        C5630q.m14607d(avVar, "Argument must not be null");
        this.f17106b = avVar;
        this.f17105a = z;
        this.f17108d = nVar;
        C5630q.m14607d(amVar, "Argument must not be null");
        this.f17107c = amVar;
    }

    /* renamed from: a */
    public final int mo12158a() {
        return this.f17106b.mo12158a();
    }

    /* renamed from: b */
    public final Class mo12159b() {
        return this.f17106b.mo12159b();
    }

    /* renamed from: c */
    public final Object mo12160c() {
        return this.f17106b.mo12160c();
    }

    /* renamed from: d */
    public final synchronized void mo12161d() {
        if (!this.f17110f) {
            this.f17109e++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* renamed from: e */
    public final synchronized void mo12162e() {
        if (this.f17109e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f17110f) {
            this.f17110f = true;
            this.f17106b.mo12162e();
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    /* renamed from: f */
    public final void mo12163f() {
        int i;
        synchronized (this) {
            int i2 = this.f17109e;
            if (i2 > 0) {
                i = i2 - 1;
                this.f17109e = i;
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (i == 0) {
            C5670am amVar = this.f17107c;
            C5955n nVar = this.f17108d;
            C5662ae aeVar = (C5662ae) amVar;
            aeVar.f17066g.mo12224d(nVar);
            if (this.f17105a) {
                aeVar.f17067h.mo12197d(nVar, this);
            } else {
                aeVar.f17063d.mo12187a(this, false);
            }
        }
    }

    public final synchronized String toString() {
        boolean z;
        String obj;
        String valueOf;
        int i;
        boolean z2;
        String obj2;
        z = this.f17105a;
        obj = this.f17107c.toString();
        valueOf = String.valueOf(this.f17108d);
        i = this.f17109e;
        z2 = this.f17110f;
        obj2 = this.f17106b.toString();
        return "EngineResource{isMemoryCacheable=" + z + ", listener=" + obj + ", key=" + valueOf + ", acquired=" + i + ", isRecycled=" + z2 + ", resource=" + obj2 + "}";
    }
}
