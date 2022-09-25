package p3186j$.util.stream;

import p3186j$.util.Spliterator;
import p3186j$.util.function.LongConsumer;

/* renamed from: j$.util.stream.X0 */
final class C41216X0 extends C41222Z0 implements C41167K1 {

    /* renamed from: h */
    private final long[] f107828h;

    C41216X0(Spliterator spliterator, C41241e0 e0Var, long[] jArr) {
        super(jArr.length, spliterator, e0Var);
        this.f107828h = jArr;
    }

    C41216X0(C41216X0 x0, Spliterator spliterator, long j, long j2) {
        super(x0, spliterator, j, j2, x0.f107828h.length);
        this.f107828h = x0.f107828h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C41222Z0 mo43799a(Spliterator spliterator, long j, long j2) {
        return new C41216X0(this, spliterator, j, j2);
    }

    public final void accept(long j) {
        int i = this.f107840f;
        if (i < this.f107841g) {
            this.f107840f = i + 1;
            this.f107828h[i] = j;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f107840f));
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo43738j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer.CC.$default$andThen(this, longConsumer);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo43738j(Long l) {
        C41241e0.m72091i(this, l);
    }
}
