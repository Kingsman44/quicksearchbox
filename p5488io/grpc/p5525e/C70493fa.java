package p5488io.grpc.p5525e;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import com.google.common.base.C58872ci;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import p5488io.grpc.C70137aa;
import p5488io.grpc.C70138ab;
import p5488io.grpc.C70158av;
import p5488io.grpc.C70239bj;
import p5488io.grpc.C70244bo;
import p5488io.grpc.C70247br;
import p5488io.grpc.C70248bs;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70765fe;
import p5488io.grpc.C70766ff;
import p5488io.grpc.C70896k;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.fa */
/* compiled from: PG */
final class C70493fa implements C70247br, C70677lw {

    /* renamed from: a */
    public final C70485et f187853a;

    /* renamed from: b */
    public final ScheduledExecutorService f187854b;

    /* renamed from: c */
    public final C70244bo f187855c;

    /* renamed from: d */
    public final C70896k f187856d;

    /* renamed from: e */
    public final C70766ff f187857e;

    /* renamed from: f */
    public final C70486eu f187858f;

    /* renamed from: g */
    public volatile List f187859g;

    /* renamed from: h */
    public final C58872ci f187860h;

    /* renamed from: i */
    public C70765fe f187861i;

    /* renamed from: j */
    public C70765fe f187862j;

    /* renamed from: k */
    public C70556hj f187863k;

    /* renamed from: l */
    public final Collection f187864l = new ArrayList();

    /* renamed from: m */
    public final C70468ec f187865m = new C70473eh(this);

    /* renamed from: n */
    public C70387bc f187866n;

    /* renamed from: o */
    public volatile C70556hj f187867o;

    /* renamed from: p */
    public volatile C70138ab f187868p = C70138ab.m102114a(C70137aa.IDLE);

    /* renamed from: q */
    public Status f187869q;

    /* renamed from: r */
    public C70443de f187870r;

    /* renamed from: s */
    private final C70248bs f187871s;

    /* renamed from: t */
    private final String f187872t;

    /* renamed from: u */
    private final String f187873u;

    /* renamed from: v */
    private final C70377at f187874v;

    /* renamed from: w */
    private final C70359ab f187875w;

    public C70493fa(List list, String str, String str2, C70377at atVar, ScheduledExecutorService scheduledExecutorService, C70766ff ffVar, C70485et etVar, C70244bo boVar, C70359ab abVar, C70248bs bsVar, C70896k kVar) {
        C58838bb.m90869d(!list.isEmpty(), "addressGroups is empty");
        m102928b(list, "addressGroups contains null entry");
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f187859g = unmodifiableList;
        this.f187858f = new C70486eu(unmodifiableList);
        this.f187872t = str;
        this.f187873u = str2;
        this.f187874v = atVar;
        this.f187854b = scheduledExecutorService;
        this.f187860h = new C58872ci();
        this.f187857e = ffVar;
        this.f187853a = etVar;
        this.f187855c = boVar;
        this.f187875w = abVar;
        this.f187871s = bsVar;
        this.f187856d = kVar;
    }

    /* renamed from: b */
    public static void m102928b(List list, String str) {
        for (Object a : list) {
            C58838bb.m90866a(a, str);
        }
    }

    /* renamed from: j */
    public static final String m102929j(Status status) {
        StringBuilder sb = new StringBuilder();
        sb.append(status.getCode());
        if (status.getDescription() != null) {
            sb.append("(");
            sb.append(status.getDescription());
            sb.append(")");
        }
        if (status.f186920q != null) {
            sb.append("[");
            sb.append(status.f186920q);
            sb.append("]");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final C70375ar mo62210a() {
        C70556hj hjVar = this.f187867o;
        if (hjVar != null) {
            return hjVar;
        }
        C70766ff ffVar = this.f187857e;
        ffVar.mo62446c(new C70475ej(this));
        ffVar.mo62445b();
        return null;
    }

    /* renamed from: c */
    public final C70248bs mo61901c() {
        return this.f187871s;
    }

    /* renamed from: d */
    public final void mo62211d(C70137aa aaVar) {
        this.f187857e.mo62447d();
        mo62212e(C70138ab.m102114a(aaVar));
    }

    /* renamed from: e */
    public final void mo62212e(C70138ab abVar) {
        this.f187857e.mo62447d();
        if (this.f187868p.f186972a != abVar.f186972a) {
            boolean z = true;
            boolean z2 = this.f187868p.f186972a != C70137aa.SHUTDOWN;
            new StringBuilder("Cannot transition out of SHUTDOWN to ").append(abVar);
            C58838bb.m90884s(z2, "Cannot transition out of SHUTDOWN to ".concat(abVar.toString()));
            this.f187868p = abVar;
            C70538gs gsVar = (C70538gs) this.f187853a;
            if (gsVar.f187941a == null) {
                z = false;
            }
            C58838bb.m90884s(z, "listener is null");
            gsVar.f187941a.mo61958a(abVar);
        }
    }

    /* renamed from: f */
    public final void mo62213f() {
        C70766ff ffVar = this.f187857e;
        ffVar.mo62446c(new C70479en(this));
        ffVar.mo62445b();
    }

    /* renamed from: g */
    public final void mo62214g(C70387bc bcVar, boolean z) {
        C70766ff ffVar = this.f187857e;
        ffVar.mo62446c(new C70480eo(this, bcVar, z));
        ffVar.mo62445b();
    }

    /* renamed from: h */
    public final void mo62215h(Status status) {
        C70766ff ffVar = this.f187857e;
        ffVar.mo62446c(new C70478em(this, status));
        ffVar.mo62445b();
    }

    /* renamed from: i */
    public final void mo62216i() {
        C70239bj bjVar;
        this.f187857e.mo62447d();
        C58838bb.m90884s(this.f187861i == null, "Should have no reconnectTask scheduled");
        C70486eu euVar = this.f187858f;
        if (euVar.f187843b == 0 && euVar.f187844c == 0) {
            C58872ci ciVar = this.f187860h;
            ciVar.mo56160e();
            ciVar.mo56161f();
        }
        SocketAddress a = this.f187858f.mo62200a();
        if (a instanceof C70239bj) {
            C70239bj bjVar2 = (C70239bj) a;
            bjVar = bjVar2;
            a = bjVar2.f187222b;
        } else {
            bjVar = null;
        }
        C70486eu euVar2 = this.f187858f;
        C70256c cVar = ((C70158av) euVar2.f187842a.get(euVar2.f187843b)).f187012c;
        String str = (String) cVar.f187256b.get(C70158av.f187010a);
        C70376as asVar = new C70376as();
        if (str == null) {
            str = this.f187872t;
        }
        C58838bb.m90866a(str, "authority");
        asVar.f187579a = str;
        asVar.f187580b = cVar;
        asVar.f187581c = this.f187873u;
        asVar.f187582d = bjVar;
        C70491ez ezVar = new C70491ez();
        ezVar.f187852a = this.f187871s;
        C70484es esVar = new C70484es(this.f187874v.mo57960a(a, asVar, ezVar), this.f187875w);
        ezVar.f187852a = esVar.mo61901c();
        C70244bo.m102392b(this.f187855c.f187240f, esVar);
        this.f187866n = esVar;
        this.f187864l.add(esVar);
        Runnable f = esVar.mo61825f(new C70490ey(this, esVar));
        if (f != null) {
            this.f187857e.mo62446c(f);
        }
        this.f187856d.mo62077b(2, "Started transport {0}", ezVar.f187852a);
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56103c("logId", String.valueOf(this.f187871s.f187246a));
        b.mo56102b("addressGroups", this.f187859g);
        return b.toString();
    }
}
