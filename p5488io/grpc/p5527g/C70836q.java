package p5488io.grpc.p5527g;

import com.google.common.base.C58838bb;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;
import p5488io.grpc.p5525e.C70357a;
import p5488io.grpc.p5525e.C70373ap;
import p5488io.grpc.p5525e.C70679ly;
import p5488io.grpc.p5525e.C70680lz;
import p5488io.p5489a.C69792b;
import p5589m.C71828e;

/* renamed from: io.grpc.g.q */
/* compiled from: PG */
final class C70836q implements C70357a {

    /* renamed from: a */
    final /* synthetic */ C70838s f188930a;

    public C70836q(C70838s sVar) {
        this.f188930a = sVar;
    }

    /* renamed from: a */
    public final void mo61915a(Status status) {
        int i = C69792b.f186180a;
        C70837r rVar = this.f188930a.f188954f;
        int i2 = C70837r.f188931y;
        synchronized (rVar.f188934a) {
            this.f188930a.f188954f.mo62546s(status, true, (C70334de) null);
        }
    }

    /* renamed from: b */
    public final void mo61916b(C70680lz lzVar, boolean z, boolean z2, int i) {
        C71828e eVar;
        int i2 = C69792b.f186180a;
        if (lzVar == null) {
            eVar = C70838s.f188949a;
        } else {
            eVar = ((C70813ag) lzVar).f188863a;
            int i3 = (int) eVar.f191356b;
            if (i3 > 0) {
                this.f188930a.f188954f.mo62323l(i3);
            }
        }
        C70837r rVar = this.f188930a.f188954f;
        int i4 = C70837r.f188931y;
        synchronized (rVar.f188934a) {
            C70837r rVar2 = this.f188930a.f188954f;
            if (!rVar2.f188939f) {
                if (rVar2.f188943t) {
                    rVar2.f188936c.mo62538mq(eVar, (long) ((int) eVar.f191356b));
                    rVar2.f188937d |= z;
                    rVar2.f188938e |= z2;
                } else {
                    C58838bb.m90884s(rVar2.f188946w != -1, "streamId should be set");
                    rVar2.f188941h.mo62530a(z, rVar2.f188945v, eVar, z2);
                }
            }
            C70679ly lyVar = this.f188930a.f187720r;
            if (i != 0) {
                lyVar.f188412f += (long) i;
                lyVar.f188408b.mo62424a();
            }
        }
    }

    /* renamed from: c */
    public final void mo61917c(C70334de deVar) {
        int i = C69792b.f186180a;
        C70838s sVar = this.f188930a;
        String concat = "/".concat(sVar.f188950b.f187497b);
        C70837r rVar = sVar.f188954f;
        int i2 = C70837r.f188931y;
        synchronized (rVar.f188934a) {
            C70837r rVar2 = this.f188930a.f188954f;
            C70838s sVar2 = rVar2.f188947x;
            rVar2.f188935b = C70829j.m103640a(deVar, concat, sVar2.f188953e, sVar2.f188951c, false, rVar2.f188942i.f188998t == null);
            C70844y yVar = rVar2.f188942i;
            C70838s sVar3 = rVar2.f188947x;
            Status status = yVar.f188994p;
            if (status != null) {
                sVar3.f188954f.mo62131j(status, C70373ap.MISCARRIED, true, new C70334de());
            } else if (yVar.f188989k.size() >= yVar.f189000v) {
                yVar.f189001w.add(sVar3);
                yVar.mo62555k(sVar3);
            } else {
                yVar.mo62557p(sVar3);
            }
        }
    }
}
