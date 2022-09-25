package com.facebook.p313c;

import androidx.p060c.C0981k;
import com.facebook.litho.C6201du;
import com.facebook.p313c.p314a.C6021a;
import com.facebook.p313c.p314a.C6022b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.c.g */
/* compiled from: PG */
public final class C6048g {

    /* renamed from: a */
    public final List f17797a = new ArrayList();

    /* renamed from: b */
    public final C6050i f17798b;

    /* renamed from: c */
    public C6021a f17799c;

    /* renamed from: d */
    private final C0981k f17800d = new C0981k(10);

    /* renamed from: e */
    private final Map f17801e = new HashMap();

    /* renamed from: f */
    private boolean f17802f = false;

    public C6048g(C6050i iVar) {
        this.f17798b = iVar;
    }

    /* renamed from: l */
    private final boolean m15560l(long j) {
        Integer num = (Integer) this.f17800d.mo3678e(j);
        return num != null && num.intValue() > 0;
    }

    /* renamed from: a */
    public final C6021a mo12611a(C6022b bVar) {
        return (C6021a) this.f17801e.get(bVar);
    }

    /* renamed from: b */
    public final Object mo12612b(long j) {
        return this.f17798b.mo12633l(j);
    }

    /* renamed from: c */
    public final void mo12613c(C6022b bVar) {
        C6021a p = bVar.mo12582p(this);
        if (bVar instanceof C6065x) {
            this.f17798b.mo12640y((C6065x) bVar);
            this.f17799c = p;
        }
        boolean z = true;
        if (!this.f17802f && !bVar.mo12583q()) {
            z = false;
        }
        this.f17802f = z;
        this.f17801e.put(bVar, p);
        this.f17797a.add(bVar);
    }

    /* renamed from: d */
    public final void mo12614d(long j) {
        if (this.f17802f) {
            Integer num = (Integer) this.f17800d.mo3678e(j);
            if (num == null || num.intValue() == 0) {
                throw new IllegalStateException("Trying to decrement reference count for an item you don't own.");
            }
            this.f17800d.mo3682i(j, Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: e */
    public final void mo12615e(long j) {
        if (this.f17802f) {
            Integer num = (Integer) this.f17800d.mo3678e(j);
            if (num == null) {
                num = 0;
            }
            this.f17800d.mo3682i(j, Integer.valueOf(num.intValue() + 1));
        }
    }

    /* renamed from: f */
    public final void mo12616f() {
        if (this.f17802f) {
            for (C6022b a : this.f17797a) {
                mo12611a(a).mo12571c();
            }
            this.f17800d.mo3681h();
        }
    }

    /* renamed from: g */
    public final void mo12617g(C6022b bVar) {
        this.f17797a.remove(bVar);
        this.f17801e.remove(bVar);
        this.f17802f = false;
        int size = this.f17797a.size();
        for (int i = 0; i < size; i++) {
            boolean z = true;
            if (!this.f17802f && !((C6022b) this.f17797a.get(i)).mo12583q()) {
                z = false;
            }
            this.f17802f = z;
        }
    }

    /* renamed from: h */
    public final boolean mo12618h(long j) {
        if (!this.f17802f) {
            return true;
        }
        return m15560l(j);
    }

    /* renamed from: i */
    public final void mo12619i() {
        int size = this.f17797a.size();
        for (int i = 0; i < size; i++) {
            mo12611a((C6022b) this.f17797a.get(i));
        }
    }

    /* renamed from: j */
    public final boolean mo12620j(C6060s sVar) {
        if (!this.f17802f) {
            return true;
        }
        int size = this.f17797a.size();
        for (int i = 0; i < size; i++) {
            C6022b bVar = (C6022b) this.f17797a.get(i);
            bVar.mo12584r(mo12611a(bVar), sVar);
        }
        return m15560l(((C6201du) sVar.f17827b).f18345a.f18263m);
    }

    /* renamed from: k */
    public final void mo12621k(C6063v vVar, Object obj) {
        int size = this.f17797a.size();
        for (int i = 0; i < size; i++) {
            C6022b bVar = (C6022b) this.f17797a.get(i);
            bVar.mo12581n(mo12611a(bVar), vVar, obj);
        }
    }
}
