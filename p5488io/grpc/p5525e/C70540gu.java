package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p5488io.grpc.C70240bk;
import p5488io.grpc.C70241bl;
import p5488io.grpc.C70244bo;
import p5488io.grpc.C70248bs;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70273cb;
import p5488io.grpc.C70281cj;
import p5488io.grpc.C70765fe;
import p5488io.grpc.C70766ff;

/* renamed from: io.grpc.e.gu */
/* compiled from: PG */
final class C70540gu extends C70627k {

    /* renamed from: a */
    final C70273cb f187944a;

    /* renamed from: b */
    final C70248bs f187945b;

    /* renamed from: c */
    final C70360ac f187946c;

    /* renamed from: d */
    final C70361ad f187947d;

    /* renamed from: e */
    List f187948e;

    /* renamed from: f */
    C70493fa f187949f;

    /* renamed from: g */
    boolean f187950g;

    /* renamed from: h */
    boolean f187951h;

    /* renamed from: i */
    C70765fe f187952i;

    /* renamed from: j */
    final /* synthetic */ C70542gw f187953j;

    public C70540gu(C70542gw gwVar, C70273cb cbVar) {
        this.f187953j = gwVar;
        this.f187948e = cbVar.f187343a;
        this.f187944a = cbVar;
        C70248bs a = C70248bs.m102395a("Subchannel", gwVar.f188013r.mo39511b());
        this.f187945b = a;
        long a2 = gwVar.f188008m.mo62424a();
        StringBuilder sb = new StringBuilder("Subchannel for ");
        List list = cbVar.f187343a;
        sb.append(list);
        C70361ad adVar = new C70361ad(a, a2, "Subchannel for ".concat(list.toString()));
        this.f187947d = adVar;
        this.f187946c = new C70360ac(adVar, gwVar.f188008m);
    }

    /* renamed from: a */
    public final C70256c mo61950a() {
        return this.f187944a.f187344b;
    }

    /* renamed from: b */
    public final Object mo61951b() {
        C58838bb.m90884s(this.f187950g, "Subchannel is not started");
        return this.f187949f;
    }

    /* renamed from: c */
    public final List mo61952c() {
        this.f187953j.f188009n.mo62447d();
        C58838bb.m90884s(this.f187950g, "not started");
        return this.f187948e;
    }

    /* renamed from: d */
    public final void mo61953d() {
        this.f187953j.f188009n.mo62447d();
        C58838bb.m90884s(this.f187950g, "not started");
        this.f187949f.mo62210a();
    }

    /* renamed from: e */
    public final void mo61954e() {
        C70765fe feVar;
        this.f187953j.f188009n.mo62447d();
        if (this.f187949f == null) {
            this.f187951h = true;
            return;
        }
        if (!this.f187951h) {
            this.f187951h = true;
        } else if (this.f187953j.f187970E && (feVar = this.f187952i) != null) {
            feVar.mo62443a();
            this.f187952i = null;
        } else {
            return;
        }
        C70542gw gwVar = this.f187953j;
        if (!gwVar.f187970E) {
            this.f187952i = gwVar.f188009n.mo62444a(new C70499fg(new C70539gt(this)), 5, TimeUnit.SECONDS, this.f187953j.f188005j.mo57961b());
        } else {
            this.f187949f.mo62215h(C70542gw.f187961d);
        }
    }

    /* renamed from: f */
    public final void mo61955f(C70281cj cjVar) {
        this.f187953j.f188009n.mo62447d();
        C58838bb.m90884s(!this.f187950g, "already started");
        C58838bb.m90884s(!this.f187951h, "already shutdown");
        C58838bb.m90884s(!this.f187953j.f187970E, "Channel is being terminated");
        this.f187950g = true;
        List list = this.f187944a.f187343a;
        String b = this.f187953j.f188013r.mo39511b();
        C70542gw gwVar = this.f187953j;
        String str = gwVar.f188014s;
        C70377at atVar = gwVar.f188005j;
        ScheduledExecutorService b2 = atVar.mo57961b();
        C70766ff ffVar = this.f187953j.f188009n;
        C70538gs gsVar = new C70538gs(this, cjVar);
        C70542gw gwVar2 = this.f187953j;
        C70493fa faVar = new C70493fa(list, b, str, atVar, b2, ffVar, gsVar, gwVar2.f187977L, gwVar2.f187973H.mo62073a(), this.f187945b, this.f187946c);
        this.f187953j.f187975J.mo62078b(C70240bk.m102390a("Child Subchannel started", C70241bl.CT_INFO, Long.valueOf(this.f187953j.f188008m.mo62424a()), faVar));
        this.f187949f = faVar;
        C70244bo.m102392b(this.f187953j.f187977L.f187239e, faVar);
        this.f187953j.f188019x.add(faVar);
    }

    /* renamed from: g */
    public final void mo61956g(List list) {
        this.f187953j.f188009n.mo62447d();
        this.f187948e = list;
        C70493fa faVar = this.f187949f;
        C58838bb.m90866a(list, "newAddressGroups");
        C70493fa.m102928b(list, "newAddressGroups contains null entry");
        C58838bb.m90869d(!list.isEmpty(), "newAddressGroups is empty");
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        C70766ff ffVar = faVar.f187857e;
        ffVar.mo62446c(new C70477el(faVar, unmodifiableList));
        ffVar.mo62445b();
    }

    public final String toString() {
        return this.f187945b.toString();
    }
}
