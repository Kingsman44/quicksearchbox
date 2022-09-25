package com.google.android.libraries.p3329t.p3331b;

import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.t.b.g */
/* compiled from: PG */
public final class C43184g implements C58881cr {

    /* renamed from: a */
    public final C43183f f112901a = new C43183f();

    /* renamed from: b */
    public final AtomicReference f112902b = new AtomicReference((Object) null);

    /* renamed from: a */
    public final Object mo6453a() {
        return this.f112902b.get();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final synchronized void mo46250b(Object obj) {
        Object andSet = this.f112902b.getAndSet(obj);
        if (!this.f112901a.mo46249c()) {
            this.f112901a.mo46248b(this);
        }
        if (!C58832aw.m90831a(andSet, obj)) {
            C43183f fVar = this.f112901a;
            synchronized (fVar) {
                C58838bb.m90883r(fVar.f112899e != null);
            }
            C58838bb.m90883r(!((Boolean) fVar.f112897d.get()).booleanValue());
            fVar.f112895b.readLock().lock();
            try {
                for (Map.Entry entry : fVar.f112896c.entrySet()) {
                    if (!(((C43186i) entry.getKey()) instanceof C43186i)) {
                        ((C43181d) fVar.f112894a.get()).f112898a.offer((C43185h) entry.getValue());
                    } else {
                        throw null;
                    }
                }
                fVar.f112895b.readLock().unlock();
                if (((C43185h) ((C43181d) fVar.f112894a.get()).f112898a.poll()) != null) {
                    throw null;
                }
            } catch (Throwable th) {
                fVar.f112895b.readLock().unlock();
                throw th;
            }
        }
    }
}
