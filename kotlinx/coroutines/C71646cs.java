package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.cs */
/* compiled from: PG */
public class C71646cs extends C71665da implements C71643cp {

    /* renamed from: a */
    private final boolean f191085a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71646cs(C71643cp cpVar) {
        super(true);
        C71665da e;
        boolean z = true;
        mo62904J(cpVar);
        C71813w H = mo62903H();
        C71814x xVar = H instanceof C71814x ? (C71814x) H : null;
        if (xVar != null && (e = xVar.mo62883e()) != null) {
            while (true) {
                if (!e.mo62881lQ()) {
                    C71813w H2 = e.mo62903H();
                    C71814x xVar2 = H2 instanceof C71814x ? (C71814x) H2 : null;
                    if (xVar2 != null) {
                        e = xVar2.mo62883e();
                        if (e == null) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        this.f191085a = z;
    }

    /* renamed from: lQ */
    public final boolean mo62881lQ() {
        return this.f191085a;
    }

    /* renamed from: lR */
    public final boolean mo62882lR() {
        return true;
    }
}
