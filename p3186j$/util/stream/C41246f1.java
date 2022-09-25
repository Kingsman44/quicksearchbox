package p3186j$.util.stream;

import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.C41094f;
import p3186j$.util.function.C41100l;
import p3186j$.util.function.C41105q;

/* renamed from: j$.util.stream.f1 */
final class C41246f1 extends C41241e0 {

    /* renamed from: h */
    public final /* synthetic */ int f107899h;

    /* renamed from: i */
    final /* synthetic */ Object f107900i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41246f1(C41263j2 j2Var, Object obj, int i) {
        super(j2Var);
        this.f107899h = i;
        this.f107900i = obj;
    }

    /* renamed from: W */
    public final C41310v1 mo43844W() {
        int i = this.f107899h;
        Object obj = this.f107900i;
        switch (i) {
            case 0:
                return new C41306u1((C41105q) obj);
            case 1:
                return new C41250g1((C41094f) obj);
            case 2:
                return new C41266k1((BinaryOperator) obj);
            default:
                return new C41294r1((C41100l) obj);
        }
    }
}
