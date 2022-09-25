package p3186j$.util.stream;

/* renamed from: j$.util.stream.q0 */
abstract class C41289q0 implements C41277n0 {

    /* renamed from: a */
    protected final C41277n0 f108004a;

    /* renamed from: b */
    protected final C41277n0 f108005b;

    /* renamed from: c */
    private final long f108006c;

    C41289q0(C41277n0 n0Var, C41277n0 n0Var2) {
        this.f108004a = n0Var;
        this.f108005b = n0Var2;
        this.f108006c = n0Var.count() + n0Var2.count();
    }

    /* renamed from: a */
    public final C41277n0 m72198a(int i) {
        if (i == 0) {
            return this.f108004a;
        }
        if (i == 1) {
            return this.f108005b;
        }
        throw new IndexOutOfBoundsException();
    }

    public final long count() {
        return this.f108006c;
    }

    /* renamed from: l */
    public final int mo43651l() {
        return 2;
    }
}
