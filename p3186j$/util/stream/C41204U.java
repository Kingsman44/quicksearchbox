package p3186j$.util.stream;

import p3186j$.util.C41047O;
import p3186j$.util.Objects;
import p3186j$.util.function.IntConsumer;
import p3186j$.util.function.IntUnaryOperator;

/* renamed from: j$.util.stream.U */
final class C41204U extends C41047O {

    /* renamed from: d */
    int f107811d;

    /* renamed from: e */
    boolean f107812e;

    /* renamed from: f */
    final /* synthetic */ IntUnaryOperator f107813f;

    /* renamed from: g */
    final /* synthetic */ int f107814g;

    C41204U(IntUnaryOperator intUnaryOperator, int i) {
        this.f107813f = intUnaryOperator;
        this.f107814g = i;
    }

    /* renamed from: f */
    public final boolean mo43449f(IntConsumer intConsumer) {
        int i;
        Objects.requireNonNull(intConsumer);
        if (this.f107812e) {
            i = this.f107813f.applyAsInt(this.f107811d);
        } else {
            this.f107812e = true;
            i = this.f107814g;
        }
        this.f107811d = i;
        intConsumer.accept(i);
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        mo43449f((IntConsumer) obj);
        return true;
    }
}
