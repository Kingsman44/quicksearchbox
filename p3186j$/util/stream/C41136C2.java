package p3186j$.util.stream;

import p3186j$.util.C41040H;
import p3186j$.util.C41333y;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.C2 */
final class C41136C2 extends C41140D2 implements C41040H {
    C41136C2(C41040H h, long j, long j2) {
        super(h, j, j2);
    }

    C41136C2(C41040H h, long j, long j2, long j3, long j4) {
        super(h, j, j2, j3, j4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Spliterator mo43659c(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C41136C2((C41040H) spliterator, j, j2, j3, j4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Object mo43660d() {
        return new C41132B2(0);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C41333y.m72297e(this, consumer);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C41333y.m72300k(this, consumer);
    }
}
