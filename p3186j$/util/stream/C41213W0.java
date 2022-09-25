package p3186j$.util.stream;

import p3186j$.util.Spliterator;
import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.W0 */
final class C41213W0 extends C41222Z0 implements C41163J1 {

    /* renamed from: h */
    private final int[] f107821h;

    C41213W0(Spliterator spliterator, C41241e0 e0Var, int[] iArr) {
        super(iArr.length, spliterator, e0Var);
        this.f107821h = iArr;
    }

    C41213W0(C41213W0 w0, Spliterator spliterator, long j, long j2) {
        super(w0, spliterator, j, j2, w0.f107821h.length);
        this.f107821h = w0.f107821h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C41222Z0 mo43799a(Spliterator spliterator, long j, long j2) {
        return new C41213W0(this, spliterator, j, j2);
    }

    public final void accept(int i) {
        int i2 = this.f107840f;
        if (i2 < this.f107841g) {
            this.f107840f = i2 + 1;
            this.f107821h[i2] = i;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f107840f));
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo43736d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo43736d(Integer num) {
        C41241e0.m72089g(this, num);
    }
}
