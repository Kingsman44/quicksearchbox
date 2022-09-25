package com.google.android.libraries.web.lifecycle.internal;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.lifecycle.C43882c;
import com.google.android.libraries.web.lifecycle.C43889d;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71683ds;
import p5462h.p5463a.C69498ao;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5481k.C69706d;

/* renamed from: com.google.android.libraries.web.lifecycle.internal.d */
/* compiled from: PG */
public final class C43896d implements C43889d {

    /* renamed from: a */
    private final Set f114346a = new LinkedHashSet();

    /* renamed from: b */
    private final Set f114347b = new LinkedHashSet();

    /* renamed from: c */
    private final ReentrantLock f114348c = new ReentrantLock();

    /* renamed from: d */
    private final C69706d f114349d = new C43894b(this);

    /* renamed from: e */
    private final C69615a f114350e = C43895c.f114345a;

    /* renamed from: f */
    private C43889d f114351f;

    /* renamed from: g */
    private int f114352g = 2;

    /* renamed from: a */
    public final void mo46895a(C69626l lVar) {
        C69664n.m101061g(lVar, "listener");
        this.f114346a.add(lVar);
    }

    /* renamed from: b */
    public final void mo46896b(C69615a aVar) {
        boolean z;
        C69664n.m101061g(aVar, "listener");
        ReentrantLock reentrantLock = this.f114348c;
        reentrantLock.lock();
        try {
            if (C43882c.m77456a(this)) {
                z = true;
            } else {
                this.f114347b.add(aVar);
                z = false;
            }
            if (z) {
                aVar.mo5672a();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: c */
    public final void mo46897c(C69615a aVar) {
        C69664n.m101061g(aVar, "listener");
        this.f114347b.remove(aVar);
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo46898d() {
        return mo46900f() == 3;
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo46899e() {
        return C43882c.m77456a(this);
    }

    /* renamed from: f */
    public final int mo46900f() {
        ReentrantLock reentrantLock = this.f114348c;
        reentrantLock.lock();
        try {
            return this.f114352g;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: g */
    public final C71422aw mo46901g(C69585o oVar) {
        C69664n.m101061g(oVar, "context");
        C71422aw b = C71423ax.m104197b(oVar.plus(new C71683ds()));
        mo46896b(new C43893a(b));
        return b;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h */
    public final void mo46902h() {
        Iterable<C69615a> iterable;
        ReentrantLock reentrantLock = this.f114348c;
        reentrantLock.lock();
        try {
            if (!C43882c.m77456a(this)) {
                this.f114352g = 1;
                iterable = C69540x.m100846ab(this.f114347b);
                this.f114347b.clear();
                this.f114346a.clear();
            } else {
                iterable = C69498ao.f185920a;
            }
            reentrantLock.unlock();
            if (this.f114351f != null) {
                mo46904j();
            }
            for (C69615a a : iterable) {
                a.mo5672a();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: i */
    public final void mo46903i(boolean z) {
        ReentrantLock reentrantLock = this.f114348c;
        reentrantLock.lock();
        try {
            if (!C43882c.m77456a(this)) {
                int i = z ? 3 : 2;
                int i2 = this.f114352g;
                this.f114352g = i;
                if (i2 != i) {
                    for (C69626l a : C69540x.m100846ab(this.f114346a)) {
                        a.mo5761a(Boolean.valueOf(z));
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("Check failed.");
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: j */
    public final void mo46904j() {
        C43889d dVar = this.f114351f;
        if (dVar != null) {
            this.f114351f = null;
            C69706d dVar2 = this.f114349d;
            C69664n.m101061g(dVar2, "listener");
            ((C43896d) dVar).f114346a.remove(dVar2);
            dVar.mo46897c(this.f114350e);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [h.k.d, h.f.a.l] */
    /* renamed from: k */
    public final void mo46905k(C43889d dVar) {
        C19559g.m37304c();
        if (this.f114351f == null) {
            dVar.mo46896b(this.f114350e);
            this.f114351f = dVar;
            int f = mo46900f();
            int f2 = dVar.mo46900f();
            if (f != f2) {
                mo46903i(f2 == 3);
            }
            dVar.mo46895a(this.f114349d);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}
