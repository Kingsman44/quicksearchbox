package p3186j$.util.stream;

import p3186j$.util.C41039G;
import p3186j$.util.C41333y;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.A2 */
final class C41128A2 extends C41140D2 implements C41039G {
    C41128A2(C41039G g, long j, long j2) {
        super(g, j, j2);
    }

    C41128A2(C41039G g, long j, long j2, long j3, long j4) {
        super(g, j, j2, j3, j4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Spliterator mo43659c(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C41128A2((C41039G) spliterator, j, j2, j3, j4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo43660d() {
        return new C41327z2(0);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C41333y.m72296d(this, consumer);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C41333y.m72299j(this, consumer);
    }
}
