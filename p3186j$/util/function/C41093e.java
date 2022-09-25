package p3186j$.util.function;

import java.util.function.BinaryOperator;
import p3186j$.util.function.BiFunction;

/* renamed from: j$.util.function.e */
public final /* synthetic */ class C41093e implements BinaryOperator {

    /* renamed from: a */
    public final /* synthetic */ BinaryOperator f107653a;

    private /* synthetic */ C41093e(BinaryOperator binaryOperator) {
        this.f107653a = binaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ C41093e m71725a(BinaryOperator binaryOperator) {
        if (binaryOperator == null) {
            return null;
        }
        return new C41093e(binaryOperator);
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.VivifiedWrapper.convert(this.f107653a.andThen(C41099k.m71727a(function)));
    }

    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.f107653a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C41093e) {
            obj = ((C41093e) obj).f107653a;
        }
        return this.f107653a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f107653a.hashCode();
    }
}
