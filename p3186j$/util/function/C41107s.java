package p3186j$.util.function;

import p3186j$.util.function.LongUnaryOperator;

/* renamed from: j$.util.function.s */
public final /* synthetic */ class C41107s implements LongUnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ int f107677a;

    /* renamed from: b */
    public final /* synthetic */ LongUnaryOperator f107678b;

    /* renamed from: c */
    public final /* synthetic */ LongUnaryOperator f107679c;

    public /* synthetic */ C41107s(LongUnaryOperator longUnaryOperator, LongUnaryOperator longUnaryOperator2, int i) {
        this.f107677a = i;
        this.f107678b = longUnaryOperator;
        this.f107679c = longUnaryOperator2;
    }

    public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
        switch (this.f107677a) {
            case 0:
                return LongUnaryOperator.CC.$default$andThen(this, longUnaryOperator);
            default:
                return LongUnaryOperator.CC.$default$andThen(this, longUnaryOperator);
        }
    }

    public final long applyAsLong(long j) {
        int i = this.f107677a;
        LongUnaryOperator longUnaryOperator = this.f107679c;
        LongUnaryOperator longUnaryOperator2 = this.f107678b;
        switch (i) {
            case 0:
                return longUnaryOperator.applyAsLong(longUnaryOperator2.applyAsLong(j));
            default:
                return longUnaryOperator2.applyAsLong(longUnaryOperator.applyAsLong(j));
        }
    }

    public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
        switch (this.f107677a) {
            case 0:
                return LongUnaryOperator.CC.$default$compose(this, longUnaryOperator);
            default:
                return LongUnaryOperator.CC.$default$compose(this, longUnaryOperator);
        }
    }
}
