package p3186j$.util.stream;

import p3186j$.util.OptionalInt;
import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.A */
final class C41125A extends C41137D implements C41163J1 {

    /* renamed from: c */
    static final C41324z f107710c;

    static {
        C41263j2 j2Var = C41263j2.INT_VALUE;
        f107710c = new C41324z(true, j2Var, OptionalInt.empty(), new C41281o0(29), new C41228b(25));
        new C41324z(false, j2Var, OptionalInt.empty(), new C41281o0(29), new C41228b(25));
    }

    C41125A() {
    }

    public final void accept(int i) {
        mo43682d((Object) Integer.valueOf(i));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }

    public final Object get() {
        if (this.f107722a) {
            return OptionalInt.m71640of(((Integer) this.f107723b).intValue());
        }
        return null;
    }
}
