package com.facebook.p313c.p314a;

import com.facebook.p313c.C6040e;
import com.facebook.p313c.C6048g;
import com.facebook.p313c.C6051j;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.c.a.a */
/* compiled from: PG */
public final class C6021a {

    /* renamed from: a */
    public final C6048g f17740a;

    /* renamed from: b */
    public final Object f17741b;

    /* renamed from: c */
    private final Set f17742c = new HashSet();

    public C6021a(C6048g gVar, Object obj) {
        this.f17740a = gVar;
        this.f17741b = obj;
    }

    /* renamed from: a */
    public final C6040e mo12569a() {
        C6051j i = this.f17740a.f17798b.mo12630i();
        if (i != null) {
            return (C6040e) i.f17803a;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo12570b(long j, boolean z) {
        if (!mo12573e(j)) {
            this.f17742c.add(Long.valueOf(j));
            if (z) {
                C6048g gVar = this.f17740a;
                gVar.mo12615e(j);
                gVar.f17798b.mo12637t(j);
                return;
            }
            this.f17740a.mo12615e(j);
            return;
        }
        throw new IllegalStateException("Cannot acquire the same reference more than once.");
    }

    /* renamed from: c */
    public final void mo12571c() {
        for (Long longValue : this.f17742c) {
            this.f17740a.mo12614d(longValue.longValue());
        }
        this.f17742c.clear();
    }

    /* renamed from: d */
    public final void mo12572d(long j, boolean z) {
        if (mo12573e(j)) {
            this.f17742c.remove(Long.valueOf(j));
            if (z) {
                C6048g gVar = this.f17740a;
                boolean h = gVar.mo12618h(j);
                gVar.mo12614d(j);
                if (h && !gVar.mo12618h(j)) {
                    gVar.f17798b.mo12638u(j);
                    return;
                }
                return;
            }
            this.f17740a.mo12614d(j);
            return;
        }
        throw new IllegalStateException("Trying to release a reference that wasn't acquired.");
    }

    /* renamed from: e */
    public final boolean mo12573e(long j) {
        return this.f17742c.contains(Long.valueOf(j));
    }
}
