package p3186j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p3186j$.util.Spliterator;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.util.stream.K */
final class C41165K extends CountedCompleter {

    /* renamed from: h */
    public static final /* synthetic */ int f107744h = 0;

    /* renamed from: a */
    private final C41241e0 f107745a;

    /* renamed from: b */
    private Spliterator f107746b;

    /* renamed from: c */
    private final long f107747c;

    /* renamed from: d */
    private final ConcurrentHashMap f107748d;

    /* renamed from: e */
    private final C41171L1 f107749e;

    /* renamed from: f */
    private final C41165K f107750f;

    /* renamed from: g */
    private C41277n0 f107751g;

    C41165K(C41165K k, Spliterator spliterator, C41165K k2) {
        super(k);
        this.f107745a = k.f107745a;
        this.f107746b = spliterator;
        this.f107747c = k.f107747c;
        this.f107748d = k.f107748d;
        this.f107749e = k.f107749e;
        this.f107750f = k2;
    }

    protected C41165K(C41241e0 e0Var, Spliterator spliterator, C41171L1 l1) {
        super((CountedCompleter) null);
        this.f107745a = e0Var;
        this.f107746b = spliterator;
        this.f107747c = C41244f.m72131g(spliterator.estimateSize());
        this.f107748d = new ConcurrentHashMap(Math.max(16, C41244f.m72130b() << 1));
        this.f107749e = l1;
        this.f107750f = null;
    }

    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f107746b;
        boolean z = false;
        C41165K k = this;
        while (spliterator.estimateSize() > this.f107747c && (trySplit = spliterator.trySplit()) != null) {
            C41165K k2 = k.f107750f;
            C41165K k3 = new C41165K(k, trySplit, k2);
            C41165K k4 = new C41165K(k, spliterator, k3);
            k.addToPendingCount(1);
            k4.addToPendingCount(1);
            ConcurrentHashMap concurrentHashMap = k.f107748d;
            concurrentHashMap.put(k3, k4);
            if (k2 != null) {
                k3.addToPendingCount(1);
                if (concurrentHashMap.replace(k2, k, k3)) {
                    k.addToPendingCount(-1);
                } else {
                    k3.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = trySplit;
                k = k3;
                k3 = k4;
            } else {
                k = k4;
            }
            z = !z;
            k3.fork();
        }
        if (k.getPendingCount() > 0) {
            C41228b bVar = new C41228b(27);
            C41241e0 e0Var = k.f107745a;
            C41257i0 T = e0Var.mo43702T(e0Var.mo43814K(spliterator), bVar);
            e0Var.mo43816X(spliterator, T);
            k.f107751g = T.build();
            k.f107746b = null;
        }
        k.tryComplete();
    }

    public final void onCompletion(CountedCompleter countedCompleter) {
        C41277n0 n0Var = this.f107751g;
        C41171L1 l1 = this.f107749e;
        if (n0Var != null) {
            n0Var.forEach(l1);
            this.f107751g = null;
        } else {
            Spliterator spliterator = this.f107746b;
            if (spliterator != null) {
                this.f107745a.mo43816X(spliterator, l1);
                this.f107746b = null;
            }
        }
        C41165K k = (C41165K) this.f107748d.remove(this);
        if (k != null) {
            k.tryComplete();
        }
    }
}
