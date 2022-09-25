package p3186j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.Z0 */
abstract class C41222Z0 extends CountedCompleter implements C41171L1 {

    /* renamed from: a */
    protected final Spliterator f107835a;

    /* renamed from: b */
    protected final C41241e0 f107836b;

    /* renamed from: c */
    protected final long f107837c;

    /* renamed from: d */
    protected long f107838d;

    /* renamed from: e */
    protected long f107839e;

    /* renamed from: f */
    protected int f107840f;

    /* renamed from: g */
    protected int f107841g;

    C41222Z0(int i, Spliterator spliterator, C41241e0 e0Var) {
        this.f107835a = spliterator;
        this.f107836b = e0Var;
        this.f107837c = C41244f.m72131g(spliterator.estimateSize());
        this.f107838d = 0;
        this.f107839e = (long) i;
    }

    C41222Z0(C41222Z0 z0, Spliterator spliterator, long j, long j2, int i) {
        super(z0);
        this.f107835a = spliterator;
        this.f107836b = z0.f107836b;
        this.f107837c = z0.f107837c;
        this.f107838d = j;
        this.f107839e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= ((long) i)) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", new Object[]{Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)}));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C41222Z0 mo43799a(Spliterator spliterator, long j, long j2);

    public /* synthetic */ void accept(double d) {
        C41241e0.m72086c();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        C41241e0.m72093k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        C41241e0.m72094l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        long j2 = this.f107839e;
        if (j <= j2) {
            int i = (int) this.f107838d;
            this.f107840f = i;
            this.f107841g = i + ((int) j2);
            return;
        }
        throw new IllegalStateException("size passed to Sink.begin exceeds array length");
    }

    public final void compute() {
        Spliterator spliterator;
        Spliterator trySplit;
        C41222Z0 z0 = this;
        while (true) {
            spliterator = this.f107835a;
            if (spliterator.estimateSize() <= z0.f107837c || (trySplit = spliterator.trySplit()) == null) {
                z0.f107836b.mo43816X(spliterator, z0);
                z0.propagateCompletion();
            } else {
                z0.setPendingCount(1);
                long estimateSize = trySplit.estimateSize();
                z0.mo43799a(trySplit, z0.f107838d, estimateSize).fork();
                z0 = z0.mo43799a(spliterator, z0.f107838d + estimateSize, z0.f107839e - estimateSize);
            }
        }
        z0.f107836b.mo43816X(spliterator, z0);
        z0.propagateCompletion();
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final /* synthetic */ void end() {
    }
}
