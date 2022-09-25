package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ug */
/* compiled from: PG */
public final class C7332ug {

    /* renamed from: a */
    public final int f23893a;

    /* renamed from: b */
    public final C7321tw f23894b;

    /* renamed from: c */
    private final CopyOnWriteArrayList f23895c;

    /* renamed from: d */
    private final long f23896d;

    public C7332ug() {
        this(new CopyOnWriteArrayList(), 0, (C7321tw) null, 0);
    }

    private C7332ug(CopyOnWriteArrayList copyOnWriteArrayList, int i, C7321tw twVar, long j) {
        this.f23895c = copyOnWriteArrayList;
        this.f23893a = i;
        this.f23894b = twVar;
        this.f23896d = j;
    }

    /* renamed from: t */
    private final long m21938t(long j) {
        long a = C6821bi.m19754a(j);
        if (a == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f23896d + a;
    }

    /* renamed from: a */
    public final C7332ug mo16552a(int i, C7321tw twVar, long j) {
        return new C7332ug(this.f23895c, i, twVar, j);
    }

    /* renamed from: b */
    public final void mo16553b(Handler handler, C7333uh uhVar) {
        ary.m19467t(handler);
        ary.m19467t(uhVar);
        this.f23895c.add(new C7331uf(handler, uhVar));
    }

    /* renamed from: c */
    public final void mo16554c(C7333uh uhVar) {
        Iterator it = this.f23895c.iterator();
        while (it.hasNext()) {
            C7331uf ufVar = (C7331uf) it.next();
            if (ufVar.f23892b == uhVar) {
                this.f23895c.remove(ufVar);
            }
        }
    }

    /* renamed from: d */
    public final void mo16555d(C7313to toVar, int i) {
        mo16556e(toVar, i, -1, (C6864cy) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    /* renamed from: e */
    public final void mo16556e(C7313to toVar, int i, int i2, C6864cy cyVar, int i3, Object obj, long j, long j2) {
        C7313to toVar2 = toVar;
        mo16557f(toVar, new C7318tt(i, i2, cyVar, i3, obj, m21938t(j), m21938t(j2)));
    }

    /* renamed from: f */
    public final void mo16557f(C7313to toVar, C7318tt ttVar) {
        Iterator it = this.f23895c.iterator();
        while (it.hasNext()) {
            C7331uf ufVar = (C7331uf) it.next();
            aeu.m18527ar(ufVar.f23891a, new C7324tz(this, ufVar.f23892b, toVar, ttVar));
        }
    }

    /* renamed from: g */
    public final void mo16558g(C7313to toVar, int i) {
        mo16559h(toVar, i, -1, (C6864cy) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    /* renamed from: h */
    public final void mo16559h(C7313to toVar, int i, int i2, C6864cy cyVar, int i3, Object obj, long j, long j2) {
        C7313to toVar2 = toVar;
        mo16560i(toVar, new C7318tt(i, i2, cyVar, i3, obj, m21938t(j), m21938t(j2)));
    }

    /* renamed from: i */
    public final void mo16560i(C7313to toVar, C7318tt ttVar) {
        Iterator it = this.f23895c.iterator();
        while (it.hasNext()) {
            C7331uf ufVar = (C7331uf) it.next();
            aeu.m18527ar(ufVar.f23891a, new C7326ua(this, ufVar.f23892b, toVar, ttVar));
        }
    }

    /* renamed from: j */
    public final void mo16561j(C7313to toVar, int i) {
        mo16562k(toVar, i, -1, (C6864cy) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    /* renamed from: k */
    public final void mo16562k(C7313to toVar, int i, int i2, C6864cy cyVar, int i3, Object obj, long j, long j2) {
        C7313to toVar2 = toVar;
        mo16563l(toVar, new C7318tt(i, i2, cyVar, i3, obj, m21938t(j), m21938t(j2)));
    }

    /* renamed from: l */
    public final void mo16563l(C7313to toVar, C7318tt ttVar) {
        Iterator it = this.f23895c.iterator();
        while (it.hasNext()) {
            C7331uf ufVar = (C7331uf) it.next();
            aeu.m18527ar(ufVar.f23891a, new C7327ub(this, ufVar.f23892b, toVar, ttVar));
        }
    }

    /* renamed from: m */
    public final void mo16564m(C7313to toVar, int i, IOException iOException, boolean z) {
        mo16565n(toVar, i, -1, (C6864cy) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    /* renamed from: n */
    public final void mo16565n(C7313to toVar, int i, int i2, C6864cy cyVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        C7313to toVar2 = toVar;
        mo16566o(toVar, new C7318tt(i, i2, cyVar, i3, obj, m21938t(j), m21938t(j2)), iOException, z);
    }

    /* renamed from: o */
    public final void mo16566o(C7313to toVar, C7318tt ttVar, IOException iOException, boolean z) {
        Iterator it = this.f23895c.iterator();
        while (it.hasNext()) {
            C7331uf ufVar = (C7331uf) it.next();
            aeu.m18527ar(ufVar.f23891a, new C7328uc(this, ufVar.f23892b, toVar, ttVar, iOException, z));
        }
    }

    /* renamed from: p */
    public final void mo16567p(int i, long j, long j2) {
        long j3 = j;
        mo16568q(new C7318tt(1, i, (C6864cy) null, 3, (Object) null, m21938t(j), m21938t(j2)));
    }

    /* renamed from: q */
    public final void mo16568q(C7318tt ttVar) {
        C7321tw twVar = this.f23894b;
        ary.m19467t(twVar);
        Iterator it = this.f23895c.iterator();
        while (it.hasNext()) {
            C7331uf ufVar = (C7331uf) it.next();
            aeu.m18527ar(ufVar.f23891a, new C7329ud(this, ufVar.f23892b, twVar, ttVar));
        }
    }

    /* renamed from: r */
    public final void mo16569r(int i, C6864cy cyVar, int i2, Object obj, long j) {
        mo16570s(new C7318tt(1, i, cyVar, i2, obj, m21938t(j), -9223372036854775807L));
    }

    /* renamed from: s */
    public final void mo16570s(C7318tt ttVar) {
        Iterator it = this.f23895c.iterator();
        while (it.hasNext()) {
            C7331uf ufVar = (C7331uf) it.next();
            aeu.m18527ar(ufVar.f23891a, new C7330ue(this, ufVar.f23892b, ttVar));
        }
    }
}
