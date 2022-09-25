package p5488io.grpc;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.al */
/* compiled from: PG */
public class C70148al {

    /* renamed from: c */
    static final Logger f186991c = Logger.getLogger(C70148al.class.getName());

    /* renamed from: d */
    public static final C70148al f186992d = new C70148al();

    /* renamed from: e */
    final C70141ae f186993e;

    /* renamed from: f */
    final C70697eb f186994f;

    /* renamed from: g */
    final int f186995g;

    private C70148al() {
        this.f186993e = null;
        this.f186994f = null;
        this.f186995g = 0;
    }

    public C70148al(C70148al alVar, C70697eb ebVar) {
        C70141ae aeVar;
        if (alVar instanceof C70141ae) {
            aeVar = (C70141ae) alVar;
        } else {
            aeVar = alVar.f186993e;
        }
        this.f186993e = aeVar;
        this.f186994f = ebVar;
        int i = alVar.f186995g + 1;
        this.f186995g = i;
        m102132e(i);
    }

    /* renamed from: e */
    private static void m102132e(int i) {
        if (i == 1000) {
            f186991c.logp(Level.SEVERE, "io.grpc.Context", "validateGeneration", "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", new Exception());
        }
    }

    /* renamed from: k */
    public static C70145ai m102133k(String str) {
        return new C70145ai(str, (Object) null);
    }

    /* renamed from: l */
    public static C70145ai m102134l(String str, Object obj) {
        return new C70145ai(str, obj);
    }

    /* renamed from: m */
    public static C70148al m102135m() {
        C70148al a = C70146aj.f186990a.mo61713a();
        return a == null ? f186992d : a;
    }

    /* renamed from: q */
    public static void m102136q(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    /* renamed from: a */
    public C70148al mo61696a() {
        C70148al b = C70146aj.f186990a.mo61714b(this);
        return b == null ? f186992d : b;
    }

    /* renamed from: b */
    public C70153aq mo61697b() {
        C70141ae aeVar = this.f186993e;
        if (aeVar == null) {
            return null;
        }
        return aeVar.f186976a;
    }

    /* renamed from: c */
    public Throwable mo61698c() {
        C70141ae aeVar = this.f186993e;
        if (aeVar == null) {
            return null;
        }
        return aeVar.mo61698c();
    }

    /* renamed from: d */
    public void mo61700d(C70142af afVar, Executor executor) {
        m102136q(afVar, "cancellationListener");
        m102136q(executor, "executor");
        C70141ae aeVar = this.f186993e;
        if (aeVar != null) {
            aeVar.mo61701e(new C70144ah(executor, afVar, this));
        }
    }

    /* renamed from: f */
    public void mo61702f(C70148al alVar) {
        m102136q(alVar, "toAttach");
        C70146aj.f186990a.mo61715c(this, alVar);
    }

    /* renamed from: g */
    public void mo61703g(C70142af afVar) {
        C70141ae aeVar = this.f186993e;
        if (aeVar != null) {
            aeVar.mo61704h(afVar, this);
        }
    }

    /* renamed from: i */
    public boolean mo61705i() {
        C70141ae aeVar = this.f186993e;
        if (aeVar == null) {
            return false;
        }
        return aeVar.mo61705i();
    }

    /* renamed from: n */
    public final C70148al mo61716n() {
        return new C70148al(this.f186994f, this.f186995g + 1);
    }

    /* renamed from: p */
    public final void mo61718p(Runnable runnable) {
        C70148al a = mo61696a();
        try {
            runnable.run();
        } finally {
            mo61702f(a);
        }
    }

    /* renamed from: o */
    public final C70148al mo61717o(C70145ai aiVar, Object obj) {
        C70697eb ebVar;
        C70697eb ebVar2 = this.f186994f;
        if (ebVar2 == null) {
            ebVar = new C70696ea(aiVar, obj);
        } else {
            ebVar = ebVar2.mo62068b(aiVar, obj, aiVar.hashCode(), 0);
        }
        return new C70148al(this, ebVar);
    }

    private C70148al(C70697eb ebVar, int i) {
        this.f186993e = null;
        this.f186994f = ebVar;
        this.f186995g = i;
        m102132e(i);
    }
}
