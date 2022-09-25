package kotlinx.coroutines.p5573a;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.C71600ba;
import kotlinx.coroutines.p5579e.C71693aa;
import kotlinx.coroutines.p5579e.C71696ad;
import kotlinx.coroutines.p5579e.C71708ap;
import kotlinx.coroutines.p5579e.C71721c;
import kotlinx.coroutines.p5583i.C71783i;
import kotlinx.coroutines.p5583i.C71784j;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.a.ai */
/* compiled from: PG */
public final class C71355ai extends C71377j {

    /* renamed from: c */
    private final ReentrantLock f190546c = new ReentrantLock();

    /* renamed from: d */
    private Object f190547d = C71378k.f190568a;

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo62705E() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final boolean mo62706F() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo62707a() {
        ReentrantLock reentrantLock = this.f190546c;
        reentrantLock.lock();
        try {
            Object obj = this.f190547d;
            C71708ap apVar = C71378k.f190568a;
            if (obj == apVar) {
                Object z = mo62750z();
                if (z == null) {
                    z = C71378k.f190571d;
                }
                return z;
            }
            this.f190547d = apVar;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo62708b(C71783i iVar) {
        ReentrantLock reentrantLock = this.f190546c;
        reentrantLock.lock();
        try {
            if (this.f190547d == C71378k.f190568a) {
                Object z = mo62750z();
                if (z == null) {
                    z = C71378k.f190571d;
                }
                return z;
            } else if (!iVar.mo63015A()) {
                Object obj = C71784j.f191303b;
                reentrantLock.unlock();
                return obj;
            } else {
                Object obj2 = this.f190547d;
                this.f190547d = C71378k.f190568a;
                reentrantLock.unlock();
                return obj2;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo62709j(boolean z) {
        ReentrantLock reentrantLock = this.f190546c;
        reentrantLock.lock();
        try {
            this.f190547d = C71378k.f190568a;
            reentrantLock.unlock();
            super.mo62709j(z);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo62710m(C71362ap apVar) {
        ReentrantLock reentrantLock = this.f190546c;
        reentrantLock.lock();
        try {
            return super.mo62710m(apVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo62711n() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final boolean mo62712o() {
        ReentrantLock reentrantLock = this.f190546c;
        reentrantLock.lock();
        try {
            return this.f190547d == C71378k.f190568a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final Object mo62713s(Object obj) {
        C71364ar h;
        ReentrantLock reentrantLock = this.f190546c;
        reentrantLock.lock();
        try {
            C71352af z = mo62750z();
            if (z != null) {
                return z;
            }
            if (this.f190547d == C71378k.f190568a) {
                do {
                    h = mo62741h();
                    if (h != null) {
                        if (h instanceof C71352af) {
                            reentrantLock.unlock();
                            return h;
                        }
                    }
                } while (h.mo62696b(obj, (C71693aa) null) == null);
                boolean z2 = C71600ba.f191036a;
                reentrantLock.unlock();
                h.mo62697c(obj);
                return h.mo62699f();
            }
            this.f190547d = obj;
            C71708ap apVar = C71378k.f190569b;
            reentrantLock.unlock();
            return apVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo62714t(Object obj, C71783i iVar) {
        Object t;
        ReentrantLock reentrantLock = this.f190546c;
        reentrantLock.lock();
        try {
            C71352af z = mo62750z();
            if (z != null) {
                return z;
            }
            if (this.f190547d == C71378k.f190568a) {
                do {
                    C71382o y = mo62749y(obj);
                    t = iVar.mo63017t(y);
                    if (t == null) {
                        C71696ad h = y.mo62934h();
                        C69664n.m101058d(h);
                        reentrantLock.unlock();
                        C69664n.m101058d(h);
                        C71364ar arVar = (C71364ar) h;
                        arVar.mo62697c(obj);
                        return arVar.mo62699f();
                    } else if (t != C71378k.f190570c) {
                    }
                } while (t == C71721c.f191196b);
                if (t != C71784j.f191303b) {
                    if (!(t instanceof C71352af)) {
                        throw new IllegalStateException("performAtomicTrySelect(describeTryOffer) returned " + t);
                    }
                }
                reentrantLock.unlock();
                return t;
            }
            if (!iVar.mo63015A()) {
                Object obj2 = C71784j.f191303b;
                reentrantLock.unlock();
                return obj2;
            }
            this.f190547d = obj;
            C71708ap apVar = C71378k.f190569b;
            reentrantLock.unlock();
            return apVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final String mo62715x() {
        ReentrantLock reentrantLock = this.f190546c;
        reentrantLock.lock();
        try {
            Object obj = this.f190547d;
            return "(value=" + obj + ")";
        } finally {
            reentrantLock.unlock();
        }
    }
}
