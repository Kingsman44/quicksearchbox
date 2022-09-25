package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.util.concurrent.TimeUnit;
import p5488io.grpc.C70342dm;
import p5488io.grpc.C70343dn;
import p5488io.grpc.C70345dp;
import p5488io.grpc.C70764fd;
import p5488io.grpc.C70765fe;
import p5488io.grpc.C70766ff;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.gg */
/* compiled from: PG */
final class C70526gg extends C70342dm {

    /* renamed from: a */
    final C70523gd f187920a;

    /* renamed from: b */
    final C70345dp f187921b;

    /* renamed from: c */
    final /* synthetic */ C70542gw f187922c;

    public C70526gg(C70542gw gwVar, C70523gd gdVar, C70345dp dpVar) {
        this.f187922c = gwVar;
        this.f187920a = gdVar;
        C58838bb.m90866a(dpVar, "resolver");
        this.f187921b = dpVar;
    }

    /* renamed from: a */
    public final void mo62049a(Status status) {
        C58838bb.m90869d(!status.mo61679g(), "the error status must not be OK");
        C70766ff ffVar = this.f187922c.f188009n;
        ffVar.mo62446c(new C70524ge(this, status));
        ffVar.mo62445b();
    }

    /* renamed from: b */
    public final void mo62050b(C70343dn dnVar) {
        C70766ff ffVar = this.f187922c.f188009n;
        ffVar.mo62446c(new C70525gf(this, dnVar));
        ffVar.mo62445b();
    }

    /* renamed from: c */
    public final void mo62245c() {
        C70542gw gwVar = this.f187922c;
        C70765fe feVar = gwVar.f187988W;
        if (feVar != null) {
            C70764fd fdVar = feVar.f188580a;
            if (!fdVar.f188579c && !fdVar.f188578b) {
                return;
            }
        }
        if (gwVar.f187991Z == null) {
            gwVar.f187991Z = new C70443de();
        }
        long a = this.f187922c.f187991Z.mo62161a();
        this.f187922c.f187976K.mo62077b(1, "Scheduling DNS resolution backoff for {0} ns", Long.valueOf(a));
        C70542gw gwVar2 = this.f187922c;
        gwVar2.f187988W = gwVar2.f188009n.mo62444a(new C70515fw(gwVar2), a, TimeUnit.NANOSECONDS, this.f187922c.f188005j.mo57961b());
    }
}
