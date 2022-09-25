package p3186j$.util.stream;

import p3186j$.util.C41038F;
import p3186j$.util.C41041I;
import p3186j$.util.C41059a0;
import p3186j$.util.C41333y;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.X1 */
final class C41217X1 extends C41239d2 implements C41038F {

    /* renamed from: g */
    final /* synthetic */ C41220Y1 f107829g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C41217X1(C41220Y1 y1, int i, int i2, int i3, int i4) {
        super(y1, i, i2, i3, i4);
        this.f107829g = y1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo43800c(int i, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C41041I mo43801d(Object obj, int i, int i2) {
        return C41059a0.m71669j((double[]) obj, i, i2 + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C41041I mo43802e(int i, int i2, int i3, int i4) {
        return new C41217X1(this.f107829g, i, i2, i3, i4);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C41333y.m72295c(this, consumer);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C41333y.m72298h(this, consumer);
    }
}
