package p3186j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;
import p3186j$.util.Spliterator;

/* renamed from: j$.util.stream.f */
abstract class C41244f extends CountedCompleter {

    /* renamed from: g */
    private static final int f107892g = (ForkJoinPool.getCommonPoolParallelism() << 2);

    /* renamed from: a */
    protected final C41241e0 f107893a;

    /* renamed from: b */
    protected Spliterator f107894b;

    /* renamed from: c */
    protected long f107895c;

    /* renamed from: d */
    protected C41244f f107896d;

    /* renamed from: e */
    protected C41244f f107897e;

    /* renamed from: f */
    private Object f107898f;

    protected C41244f(C41241e0 e0Var, Spliterator spliterator) {
        super((CountedCompleter) null);
        this.f107893a = e0Var;
        this.f107894b = spliterator;
        this.f107895c = 0;
    }

    protected C41244f(C41244f fVar, Spliterator spliterator) {
        super(fVar);
        this.f107894b = spliterator;
        this.f107893a = fVar.f107893a;
        this.f107895c = fVar.f107895c;
    }

    /* renamed from: b */
    public static int m72130b() {
        return f107892g;
    }

    /* renamed from: g */
    public static long m72131g(long j) {
        long j2 = j / ((long) f107892g);
        if (j2 > 0) {
            return j2;
        }
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo43697a();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Object mo43830c() {
        return this.f107898f;
    }

    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f107894b;
        long estimateSize = spliterator.estimateSize();
        long j = this.f107895c;
        if (j == 0) {
            j = m72131g(estimateSize);
            this.f107895c = j;
        }
        boolean z = false;
        C41244f fVar = this;
        while (estimateSize > j && (trySplit = spliterator.trySplit()) != null) {
            C41244f e = fVar.mo43698e(trySplit);
            fVar.f107896d = e;
            C41244f e2 = fVar.mo43698e(spliterator);
            fVar.f107897e = e2;
            fVar.setPendingCount(1);
            if (z) {
                spliterator = trySplit;
                fVar = e;
                e = e2;
            } else {
                fVar = e2;
            }
            z = !z;
            e.fork();
            estimateSize = spliterator.estimateSize();
        }
        fVar.mo43832f(fVar.mo43697a());
        fVar.tryComplete();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C41244f mo43848d() {
        return (C41244f) getCompleter();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C41244f mo43698e(Spliterator spliterator);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo43832f(Object obj) {
        this.f107898f = obj;
    }

    public Object getRawResult() {
        return this.f107898f;
    }

    public void onCompletion(CountedCompleter countedCompleter) {
        this.f107894b = null;
        this.f107897e = null;
        this.f107896d = null;
    }

    /* access modifiers changed from: protected */
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }
}
