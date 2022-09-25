package p3186j$.util.function;

import p3186j$.util.function.IntUnaryOperator;

/* renamed from: j$.util.function.p */
public final /* synthetic */ class C41104p implements IntUnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ int f107672a;

    /* renamed from: b */
    public final /* synthetic */ IntUnaryOperator f107673b;

    /* renamed from: c */
    public final /* synthetic */ IntUnaryOperator f107674c;

    public /* synthetic */ C41104p(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2, int i) {
        this.f107672a = i;
        this.f107673b = intUnaryOperator;
        this.f107674c = intUnaryOperator2;
    }

    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        switch (this.f107672a) {
            case 0:
                return IntUnaryOperator.CC.$default$andThen(this, intUnaryOperator);
            default:
                return IntUnaryOperator.CC.$default$andThen(this, intUnaryOperator);
        }
    }

    public final int applyAsInt(int i) {
        int i2 = this.f107672a;
        IntUnaryOperator intUnaryOperator = this.f107673b;
        IntUnaryOperator intUnaryOperator2 = this.f107674c;
        switch (i2) {
            case 0:
                return intUnaryOperator.applyAsInt(intUnaryOperator2.applyAsInt(i));
            default:
                return intUnaryOperator2.applyAsInt(intUnaryOperator.applyAsInt(i));
        }
    }

    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        switch (this.f107672a) {
            case 0:
                return IntUnaryOperator.CC.$default$compose(this, intUnaryOperator);
            default:
                return IntUnaryOperator.CC.$default$compose(this, intUnaryOperator);
        }
    }
}
