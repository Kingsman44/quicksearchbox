package p3186j$.util.stream;

import p3186j$.util.function.Function;

/* renamed from: j$.util.stream.z1 */
final class C41326z1 extends C41139D1 {

    /* renamed from: s */
    public final /* synthetic */ int f108050s;

    /* renamed from: t */
    final /* synthetic */ Function f108051t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41326z1(C41232c cVar, int i, Function function, int i2) {
        super(cVar, i);
        this.f108050s = i2;
        this.f108051t = function;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public final C41171L1 mo43658l0(int i, C41171L1 l1) {
        switch (this.f108050s) {
            case 0:
                return new C41288q(this, l1, 3);
            default:
                return new C41284p(this, l1);
        }
    }
}
