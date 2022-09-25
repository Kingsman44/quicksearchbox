package p3186j$.util.stream;

/* renamed from: j$.util.stream.O */
final class C41181O extends C41139D1 {

    /* renamed from: s */
    public final /* synthetic */ int f107774s;

    /* renamed from: t */
    final /* synthetic */ Object f107775t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41181O(C41232c cVar, int i, Object obj, int i2) {
        super(cVar, i);
        this.f107774s = i2;
        this.f107775t = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public final C41171L1 mo43658l0(int i, C41171L1 l1) {
        switch (this.f107774s) {
            case 0:
                return new C41177N(this, l1, 0);
            case 1:
                return new C41288q(this, l1, 1);
            default:
                return new C41288q(this, l1, 2);
        }
    }
}
