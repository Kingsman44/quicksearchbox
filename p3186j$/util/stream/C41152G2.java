package p3186j$.util.stream;

import p3186j$.util.C41039G;
import p3186j$.util.C41333y;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.G2 */
final class C41152G2 extends C41156H2 implements C41039G, IntConsumer {

    /* renamed from: f */
    int f107735f;

    C41152G2(C41039G g, long j, long j2) {
        super(g, j, j2);
    }

    C41152G2(C41039G g, C41152G2 g2) {
        super(g, g2);
    }

    public final void accept(int i) {
        this.f107735f = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C41333y.m72296d(this, consumer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final Spliterator mo43737n(Spliterator spliterator) {
        return new C41152G2((C41039G) spliterator, this);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C41333y.m72299j(this, consumer);
    }
}
