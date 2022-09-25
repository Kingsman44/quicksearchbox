package p3186j$.util.stream;

import p3186j$.util.C41038F;
import p3186j$.util.C41333y;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.y2 */
final class C41323y2 extends C41140D2 implements C41038F {
    C41323y2(C41038F f, long j, long j2) {
        super(f, j, j2);
    }

    C41323y2(C41038F f, long j, long j2, long j3, long j4) {
        super(f, j, j2, j3, j4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Spliterator mo43659c(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C41323y2((C41038F) spliterator, j, j2, j3, j4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo43660d() {
        return new C41319x2(0);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C41333y.m72295c(this, consumer);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C41333y.m72298h(this, consumer);
    }
}
