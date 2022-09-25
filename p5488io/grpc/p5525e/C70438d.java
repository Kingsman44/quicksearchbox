package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import p5488io.grpc.C70153aq;
import p5488io.grpc.C70156at;
import p5488io.grpc.C70172bg;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70851i;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.d */
/* compiled from: PG */
public abstract class C70438d extends C70600j implements C70372ao, C70563hq {

    /* renamed from: q */
    public static final Logger f187716q = Logger.getLogger(C70438d.class.getName());

    /* renamed from: a */
    private final C70451dm f187717a;

    /* renamed from: b */
    private C70334de f187718b;

    /* renamed from: c */
    private volatile boolean f187719c;

    /* renamed from: r */
    public final C70679ly f187720r;

    /* renamed from: s */
    public final boolean f187721s;

    protected C70438d(C70682ma maVar, C70670lp lpVar, C70679ly lyVar, C70334de deVar, C70851i iVar) {
        C58838bb.m90866a(deVar, "headers");
        C58838bb.m90866a(lyVar, "transportTracer");
        this.f187720r = lyVar;
        this.f187721s = C70460dv.m102883k(iVar);
        this.f187717a = new C70564hr(this, maVar, lpVar);
        this.f187718b = deVar;
    }

    /* renamed from: b */
    public final void mo61756b(C70469ed edVar) {
        C70256c a = mo61755a();
        edVar.mo62190b("remote_addr", a.f187256b.get(C70172bg.f187019a));
    }

    /* renamed from: c */
    public final void mo61757c(Status status) {
        C58838bb.m90869d(!status.mo61679g(), "Should not cancel with OK status");
        this.f187719c = true;
        mo61924q().mo61915a(status);
    }

    /* renamed from: e */
    public final void mo61759e() {
        if (!mo61925r().f187647m) {
            mo61925r().f187647m = true;
            mo62156v().mo62171a();
        }
    }

    /* renamed from: i */
    public final void mo61763i(C70153aq aqVar) {
        this.f187718b.mo62031f(C70460dv.f187783b);
        this.f187718b.mo62033h(C70460dv.f187783b, Long.valueOf(Math.max(0, aqVar.mo61720b(TimeUnit.NANOSECONDS))));
    }

    /* renamed from: j */
    public final void mo61764j(C70156at atVar) {
        C70411c r = mo61925r();
        C58838bb.m90884s(r.f187645k == null, "Already called start");
        C58838bb.m90866a(atVar, "decompressorRegistry");
        r.f187646l = atVar;
    }

    /* renamed from: k */
    public final void mo61765k(int i) {
        ((C70560hn) mo61925r().f188140o).f188088b = i;
    }

    /* renamed from: l */
    public final void mo61766l(int i) {
        C70564hr hrVar = (C70564hr) this.f187717a;
        C58838bb.m90884s(hrVar.f188107a == -1, "max size already set");
        hrVar.f188107a = i;
    }

    /* renamed from: m */
    public final void mo61767m(C70374aq aqVar) {
        C70411c r = mo61925r();
        C58838bb.m90884s(r.f187645k == null, "Already called setListener");
        r.f187645k = aqVar;
        mo61924q().mo61917c(this.f187718b);
        this.f187718b = null;
    }

    /* renamed from: o */
    public final boolean mo61769o() {
        return mo61926s().mo62326o() && !this.f187719c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract C70357a mo61924q();

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract C70411c mo61925r();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public /* bridge */ /* synthetic */ C70573i mo61926s() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final C70451dm mo62156v() {
        return this.f187717a;
    }

    /* renamed from: w */
    public final void mo62157w(C70680lz lzVar, boolean z, boolean z2, int i) {
        boolean z3 = true;
        if (lzVar == null && !z) {
            z3 = false;
        }
        C58838bb.m90869d(z3, "null frame before EOS");
        mo61924q().mo61916b(lzVar, z, z2, i);
    }
}
