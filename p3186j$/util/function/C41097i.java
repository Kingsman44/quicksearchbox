package p3186j$.util.function;

import p3186j$.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.function.i */
public final /* synthetic */ class C41097i implements DoubleUnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ int f107659a;

    /* renamed from: b */
    public final /* synthetic */ DoubleUnaryOperator f107660b;

    /* renamed from: c */
    public final /* synthetic */ DoubleUnaryOperator f107661c;

    public /* synthetic */ C41097i(DoubleUnaryOperator doubleUnaryOperator, DoubleUnaryOperator doubleUnaryOperator2, int i) {
        this.f107659a = i;
        this.f107660b = doubleUnaryOperator;
        this.f107661c = doubleUnaryOperator2;
    }

    public final /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.f107659a) {
            case 0:
                return DoubleUnaryOperator.CC.$default$andThen(this, doubleUnaryOperator);
            default:
                return DoubleUnaryOperator.CC.$default$andThen(this, doubleUnaryOperator);
        }
    }

    public final double applyAsDouble(double d) {
        int i = this.f107659a;
        DoubleUnaryOperator doubleUnaryOperator = this.f107660b;
        DoubleUnaryOperator doubleUnaryOperator2 = this.f107661c;
        switch (i) {
            case 0:
                return doubleUnaryOperator.applyAsDouble(doubleUnaryOperator2.applyAsDouble(d));
            default:
                return doubleUnaryOperator2.applyAsDouble(doubleUnaryOperator.applyAsDouble(d));
        }
    }

    public final /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
        switch (this.f107659a) {
            case 0:
                return DoubleUnaryOperator.CC.$default$compose(this, doubleUnaryOperator);
            default:
                return DoubleUnaryOperator.CC.$default$compose(this, doubleUnaryOperator);
        }
    }
}
