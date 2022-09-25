package p3186j$.util.stream;

import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.n2 */
final class C41279n2 extends C41283o2 implements Consumer {

    /* renamed from: b */
    final Object[] f107986b;

    C41279n2(int i) {
        this.f107986b = new Object[i];
    }

    public final void accept(Object obj) {
        int i = this.f107990a;
        this.f107990a = i + 1;
        this.f107986b[i] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
