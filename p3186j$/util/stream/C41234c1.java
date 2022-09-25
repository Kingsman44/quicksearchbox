package p3186j$.util.stream;

/* renamed from: j$.util.stream.c1 */
class C41234c1 extends C41238d1 {

    /* renamed from: c */
    public final /* synthetic */ int f107865c;

    /* renamed from: d */
    private final Object f107866d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41234c1(C41273m0 m0Var, Object obj) {
        this((C41277n0) m0Var, obj, 0);
        this.f107865c = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43826a() {
        int i = this.f107865c;
        int i2 = this.f107871b;
        Object obj = this.f107866d;
        C41277n0 n0Var = this.f107870a;
        switch (i) {
            case 0:
                ((C41273m0) n0Var).mo43647f(i2, obj);
                return;
            default:
                n0Var.mo43650i((Object[]) obj, i2);
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C41234c1 mo43827b(int i, int i2) {
        int i3 = this.f107865c;
        C41277n0 n0Var = this.f107870a;
        switch (i3) {
            case 0:
                return new C41234c1(this, ((C41273m0) n0Var).mo43644a(i), i2);
            default:
                return new C41234c1(this, n0Var.mo43644a(i), i2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41234c1(C41277n0 n0Var, Object obj, int i) {
        super(n0Var);
        this.f107865c = i;
        this.f107866d = obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41234c1(C41277n0 n0Var, Object[] objArr) {
        this(n0Var, (Object) objArr, 1);
        this.f107865c = 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41234c1(C41234c1 c1Var, C41273m0 m0Var, int i) {
        super(c1Var, m0Var, i);
        this.f107865c = 0;
        this.f107866d = c1Var.f107866d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41234c1(C41234c1 c1Var, C41277n0 n0Var, int i) {
        super(c1Var, n0Var, i);
        this.f107865c = 1;
        this.f107866d = (Object[]) c1Var.f107866d;
    }
}
