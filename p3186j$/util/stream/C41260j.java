package p3186j$.util.stream;

import java.util.Set;
import p3186j$.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.StringJoiner;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;
import p3186j$.util.function.Supplier;

/* renamed from: j$.util.stream.j */
public final /* synthetic */ class C41260j implements BiConsumer, Supplier {

    /* renamed from: a */
    public final /* synthetic */ int f107944a;

    /* renamed from: b */
    public final /* synthetic */ Object f107945b;

    /* renamed from: c */
    public final /* synthetic */ Object f107946c;

    /* renamed from: d */
    public final /* synthetic */ Object f107947d;

    public /* synthetic */ C41260j(Object obj, Object obj2, Object obj3, int i) {
        this.f107944a = i;
        this.f107945b = obj;
        this.f107946c = obj2;
        this.f107947d = obj3;
    }

    public final void accept(Object obj, Object obj2) {
        int i = this.f107944a;
        Object obj3 = this.f107947d;
        Object obj4 = this.f107946c;
        Object obj5 = this.f107945b;
        switch (i) {
            case 0:
                Set set = Collectors.f107719a;
                Map.EL.merge((java.util.Map) obj, ((Function) obj5).apply(obj2), ((Function) obj4).apply(obj2), (BinaryOperator) obj3);
                return;
            default:
                Set set2 = Collectors.f107719a;
                ((BiConsumer) obj3).accept(Map.EL.computeIfAbsent((java.util.Map) obj, Objects.requireNonNull(((Function) obj5).apply(obj2), "element cannot be mapped to a null key"), new C41224a(2, (Supplier) obj4)), obj2);
                return;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f107944a) {
            case 0:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            default:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
        }
    }

    public final Object get() {
        Set set = Collectors.f107719a;
        return new StringJoiner((CharSequence) this.f107945b, (CharSequence) this.f107946c, (CharSequence) this.f107947d);
    }
}
