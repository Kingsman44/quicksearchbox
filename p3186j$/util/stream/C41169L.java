package p3186j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p3186j$.util.Spliterator;

/* renamed from: j$.util.stream.L */
final class C41169L extends CountedCompleter {

    /* renamed from: a */
    private Spliterator f107757a;

    /* renamed from: b */
    private final C41171L1 f107758b;

    /* renamed from: c */
    private final C41241e0 f107759c;

    /* renamed from: d */
    private long f107760d;

    C41169L(C41169L l, Spliterator spliterator) {
        super(l);
        this.f107757a = spliterator;
        this.f107758b = l.f107758b;
        this.f107760d = l.f107760d;
        this.f107759c = l.f107759c;
    }

    C41169L(C41241e0 e0Var, Spliterator spliterator, C41171L1 l1) {
        super((CountedCompleter) null);
        this.f107758b = l1;
        this.f107759c = e0Var;
        this.f107757a = spliterator;
        this.f107760d = 0;
    }

    public final void compute() {
        C41171L1 l1;
        Spliterator trySplit;
        Spliterator spliterator = this.f107757a;
        long estimateSize = spliterator.estimateSize();
        long j = this.f107760d;
        if (j == 0) {
            j = C41244f.m72131g(estimateSize);
            this.f107760d = j;
        }
        boolean g = C41259i2.SHORT_CIRCUIT.mo43855g(this.f107759c.mo43815P());
        boolean z = false;
        C41169L l = this;
        while (true) {
            l1 = this.f107758b;
            if (g && l1.mo43664e()) {
                break;
            } else if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                l.f107759c.mo43812G(spliterator, l1);
            } else {
                C41169L l2 = new C41169L(l, trySplit);
                l.addToPendingCount(1);
                if (z) {
                    spliterator = trySplit;
                } else {
                    C41169L l3 = l;
                    l = l2;
                    l2 = l3;
                }
                z = !z;
                l.fork();
                l = l2;
                estimateSize = spliterator.estimateSize();
            }
        }
        l.f107759c.mo43812G(spliterator, l1);
        l.f107757a = null;
        l.propagateCompletion();
    }
}
