package p3186j$.util.stream;

import p3186j$.util.C41040H;
import p3186j$.util.C41041I;
import p3186j$.util.C41059a0;
import p3186j$.util.C41333y;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.LongConsumer;

/* renamed from: j$.util.stream.b2 */
final class C41231b2 extends C41239d2 implements C41040H {

    /* renamed from: g */
    final /* synthetic */ C41235c2 f107851g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C41231b2(C41235c2 c2Var, int i, int i2, int i3, int i4) {
        super(c2Var, i, i2, i3, i4);
        this.f107851g = c2Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo43800c(int i, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C41041I mo43801d(Object obj, int i, int i2) {
        return C41059a0.m71671l((long[]) obj, i, i2 + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C41041I mo43802e(int i, int i2, int i3, int i4) {
        return new C41231b2(this.f107851g, i, i2, i3, i4);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C41333y.m72297e(this, consumer);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C41333y.m72300k(this, consumer);
    }
}
