package p3186j$.util.stream;

import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Spliterator;
import p3186j$.util.concurrent.C41076m;

/* renamed from: j$.util.stream.d */
abstract class C41236d extends C41244f {

    /* renamed from: h */
    protected final AtomicReference f107867h;

    /* renamed from: i */
    protected volatile boolean f107868i;

    protected C41236d(C41236d dVar, Spliterator spliterator) {
        super((C41244f) dVar, spliterator);
        this.f107867h = dVar.f107867h;
    }

    protected C41236d(C41241e0 e0Var, Spliterator spliterator) {
        super(e0Var, spliterator);
        this.f107867h = new AtomicReference((Object) null);
    }

    /* renamed from: c */
    public final Object mo43830c() {
        boolean z;
        if (mo43848d() == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return super.mo43830c();
        }
        Object obj = this.f107867h.get();
        if (obj == null) {
            return mo43699j();
        }
        return obj;
    }

    public final void compute() {
        Object obj;
        Spliterator trySplit;
        Spliterator spliterator = this.f107894b;
        long estimateSize = spliterator.estimateSize();
        long j = this.f107895c;
        if (j == 0) {
            j = C41244f.m72131g(estimateSize);
            this.f107895c = j;
        }
        AtomicReference atomicReference = this.f107867h;
        boolean z = false;
        C41236d dVar = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z2 = dVar.f107868i;
            if (!z2) {
                C41244f d = dVar.mo43848d();
                while (true) {
                    C41236d dVar2 = (C41236d) d;
                    if (z2 || dVar2 == null) {
                        break;
                    }
                    z2 = dVar2.f107868i;
                    d = dVar2.mo43848d();
                }
            }
            if (z2) {
                obj = dVar.mo43699j();
                break;
            } else if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                obj = dVar.mo43697a();
            } else {
                C41236d dVar3 = (C41236d) dVar.mo43698e(trySplit);
                dVar.f107896d = dVar3;
                C41236d dVar4 = (C41236d) dVar.mo43698e(spliterator);
                dVar.f107897e = dVar4;
                dVar.setPendingCount(1);
                if (z) {
                    spliterator = trySplit;
                    dVar = dVar3;
                    dVar3 = dVar4;
                } else {
                    dVar = dVar4;
                }
                z = !z;
                dVar3.fork();
                estimateSize = spliterator.estimateSize();
            }
        }
        dVar.mo43832f(obj);
        dVar.tryComplete();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo43832f(Object obj) {
        boolean z;
        if (mo43848d() == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            super.mo43832f(obj);
        } else if (obj != null) {
            C41076m.m71700a(this.f107867h, (Object) null, obj);
        }
    }

    public final Object getRawResult() {
        return mo43830c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo43790h() {
        this.f107868i = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo43834i() {
        C41236d dVar = this;
        for (C41236d dVar2 = (C41236d) mo43848d(); dVar2 != null; dVar2 = (C41236d) dVar2.mo43848d()) {
            if (dVar2.f107896d == dVar) {
                C41236d dVar3 = (C41236d) dVar2.f107897e;
                if (!dVar3.f107868i) {
                    dVar3.mo43790h();
                }
            }
            dVar = dVar2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract Object mo43699j();
}
