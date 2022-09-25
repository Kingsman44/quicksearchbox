package p5488io.grpc.binder.p5522a;

import android.os.IBinder;
import java.util.List;
import p5488io.grpc.C70172bg;
import p5488io.grpc.C70248bs;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;
import p5488io.grpc.p5525e.C70567hu;
import p5488io.grpc.p5525e.C70658ld;
import p5488io.grpc.p5525e.C70660lf;
import p5488io.grpc.p5525e.C70661lg;

/* renamed from: io.grpc.binder.a.j */
/* compiled from: PG */
public final class C70205j extends C70206k implements C70660lf {

    /* renamed from: a */
    public final List f187114a;

    /* renamed from: b */
    private C70661lg f187115b;

    public C70205j(C70567hu huVar, C70256c cVar, List list, IBinder iBinder) {
        super(huVar, cVar, C70248bs.m102395a(C70248bs.m102396b(C70205j.class), "from ".concat(String.valueOf(String.valueOf(cVar.f187256b.get(C70172bg.f187019a))))));
        this.f187114a = list;
        mo61849w(C70184ah.m102228b(iBinder, this.f187124i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized Status mo61834a(C70658ld ldVar, String str, C70334de deVar) {
        if (mo61848v()) {
            return Status.f186916n.withDescription("transport is shutdown");
        }
        this.f187115b.mo62391a(ldVar, str, deVar);
        return Status.f186902OK;
    }

    /* renamed from: e */
    public final synchronized void mo61835e(C70661lg lgVar) {
        this.f187115b = lgVar;
        if (!mo61848v()) {
            C70184ah ahVar = this.f187128m;
            ahVar.getClass();
            mo61843q(ahVar);
            if (!mo61848v()) {
                mo61850x(3);
                C70256c cVar = this.f187126k;
                lgVar.mo62393c();
                this.f187126k = cVar;
                return;
            }
            return;
        }
        mo61850x(5);
        mo61829j();
        mo61830k();
    }

    /* renamed from: i */
    public final void mo61828i(Status status) {
    }

    /* renamed from: j */
    public final void mo61829j() {
        C70661lg lgVar = this.f187115b;
        if (lgVar != null) {
            lgVar.mo62392b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: lI */
    public final C70219x mo61836lI(int i) {
        return new C70216u(this, this.f187126k, i);
    }

    /* renamed from: lJ */
    public final synchronized void mo61837lJ() {
        mo61845s(Status.f186902OK, false);
    }

    /* renamed from: m */
    public final synchronized void mo61838m(Status status) {
        mo61845s(status, true);
    }
}
