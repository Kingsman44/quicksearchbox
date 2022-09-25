package p3186j$.util.stream;

import p3186j$.util.C41039G;
import p3186j$.util.C41041I;
import p3186j$.util.C41059a0;
import p3186j$.util.C41333y;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.Z1 */
final class C41223Z1 extends C41239d2 implements C41039G {

    /* renamed from: g */
    final /* synthetic */ C41227a2 f107842g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C41223Z1(C41227a2 a2Var, int i, int i2, int i3, int i4) {
        super(a2Var, i, i2, i3, i4);
        this.f107842g = a2Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo43800c(int i, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C41041I mo43801d(Object obj, int i, int i2) {
        return C41059a0.m71670k((int[]) obj, i, i2 + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C41041I mo43802e(int i, int i2, int i3, int i4) {
        return new C41223Z1(this.f107842g, i, i2, i3, i4);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C41333y.m72296d(this, consumer);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C41333y.m72299j(this, consumer);
    }
}
