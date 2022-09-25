package p3186j$.util.stream;

import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.C41108t;
import p3186j$.util.function.ObjIntConsumer;
import p3186j$.util.function.Supplier;

/* renamed from: j$.util.stream.i1 */
final class C41258i1 extends C41241e0 {

    /* renamed from: h */
    public final /* synthetic */ int f107918h;

    /* renamed from: i */
    final /* synthetic */ Object f107919i;

    /* renamed from: j */
    final /* synthetic */ Object f107920j;

    /* renamed from: k */
    final /* synthetic */ Object f107921k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41258i1(C41263j2 j2Var, Object obj, Object obj2, Object obj3, int i) {
        super(j2Var);
        this.f107918h = i;
        this.f107919i = obj;
        this.f107920j = obj2;
        this.f107921k = obj3;
    }

    /* renamed from: W */
    public final C41310v1 mo43844W() {
        int i = this.f107918h;
        Object obj = this.f107919i;
        Object obj2 = this.f107920j;
        Object obj3 = this.f107921k;
        switch (i) {
            case 0:
                return new C41254h1((Supplier) obj3, (C41108t) obj2, (BinaryOperator) obj);
            case 1:
                return new C41262j1(obj3, (BiFunction) obj2, (BinaryOperator) obj);
            case 2:
                return new C41278n1((Supplier) obj3, (BiConsumer) obj2, (BiConsumer) obj);
            default:
                return new C41298s1((Supplier) obj3, (ObjIntConsumer) obj2, (BinaryOperator) obj);
        }
    }
}
