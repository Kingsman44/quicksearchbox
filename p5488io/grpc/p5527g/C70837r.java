package p5488io.grpc.p5527g;

import java.util.List;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;
import p5488io.grpc.p5525e.C70373ap;
import p5488io.grpc.p5525e.C70463dy;
import p5488io.grpc.p5525e.C70670lp;
import p5488io.grpc.p5525e.C70679ly;
import p5488io.grpc.p5527g.p5528a.p5529a.C70772a;
import p5488io.p5489a.C69791a;
import p5488io.p5489a.C69793c;
import p5589m.C71828e;

/* renamed from: io.grpc.g.r */
/* compiled from: PG */
public final class C70837r extends C70463dy implements C70815ai {

    /* renamed from: y */
    public static final /* synthetic */ int f188931y = 0;

    /* renamed from: A */
    private int f188932A;

    /* renamed from: B */
    private int f188933B;

    /* renamed from: a */
    public final Object f188934a;

    /* renamed from: b */
    public List f188935b;

    /* renamed from: c */
    public final C71828e f188936c = new C71828e();

    /* renamed from: d */
    public boolean f188937d = false;

    /* renamed from: e */
    public boolean f188938e = false;

    /* renamed from: f */
    public boolean f188939f = false;

    /* renamed from: g */
    public final C70827h f188940g;

    /* renamed from: h */
    public final C70819am f188941h;

    /* renamed from: i */
    public final C70844y f188942i;

    /* renamed from: t */
    public boolean f188943t = true;

    /* renamed from: u */
    public final C69793c f188944u;

    /* renamed from: v */
    public C70816aj f188945v;

    /* renamed from: w */
    public int f188946w = -1;

    /* renamed from: x */
    final /* synthetic */ C70838s f188947x;

    /* renamed from: z */
    private final int f188948z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70837r(C70838s sVar, int i, C70670lp lpVar, Object obj, C70827h hVar, C70819am amVar, C70844y yVar, int i2) {
        super(i, lpVar, sVar.f187720r);
        this.f188947x = sVar;
        this.f188934a = obj;
        this.f188940g = hVar;
        this.f188941h = amVar;
        this.f188942i = yVar;
        this.f188932A = i2;
        this.f188933B = i2;
        this.f188948z = i2;
        this.f188944u = C69791a.f186179a;
    }

    /* renamed from: a */
    public final void mo61918a(int i) {
        int i2 = this.f188933B - i;
        this.f188933B = i2;
        int i3 = this.f188948z;
        if (((float) i2) <= ((float) i3) * 0.5f) {
            int i4 = i3 - i2;
            this.f188932A += i4;
            this.f188933B = i2 + i4;
            this.f188940g.mo62457h(this.f188946w, (long) i4);
        }
    }

    /* renamed from: b */
    public final void mo61919b(Throwable th) {
        mo62546s(Status.m102100d(th), true, new C70334de());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo61920c(Status status, boolean z, C70334de deVar) {
        mo62546s(status, false, deVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo61921d() {
        super.mo61921d();
        C70679ly lyVar = this.f188142q;
        lyVar.f188409c++;
        lyVar.f188408b.mo62424a();
    }

    /* renamed from: e */
    public final void mo61922e(Runnable runnable) {
        synchronized (this.f188934a) {
            runnable.run();
        }
    }

    /* renamed from: f */
    public final C70816aj mo62545f() {
        C70816aj ajVar;
        synchronized (this.f188934a) {
            ajVar = this.f188945v;
        }
        return ajVar;
    }

    /* renamed from: i */
    public final void mo62130i(boolean z) {
        if (!this.f187647m) {
            this.f188942i.mo62552h(this.f188946w, (Status) null, C70373ap.PROCESSED, false, C70772a.CANCEL, (C70334de) null);
        } else {
            this.f188942i.mo62552h(this.f188946w, (Status) null, C70373ap.PROCESSED, false, (C70772a) null, (C70334de) null);
        }
        super.mo62130i(z);
    }

    /* renamed from: s */
    public final void mo62546s(Status status, boolean z, C70334de deVar) {
        if (!this.f188939f) {
            this.f188939f = true;
            if (this.f188943t) {
                C70844y yVar = this.f188942i;
                C70838s sVar = this.f188947x;
                yVar.f189001w.remove(sVar);
                yVar.mo62553i(sVar);
                this.f188935b = null;
                C71828e eVar = this.f188936c;
                eVar.mo63078o(eVar.f191356b);
                this.f188943t = false;
                if (deVar == null) {
                    deVar = new C70334de();
                }
                mo62131j(status, C70373ap.PROCESSED, true, deVar);
                return;
            }
            this.f188942i.mo62552h(this.f188946w, status, C70373ap.PROCESSED, z, C70772a.CANCEL, deVar);
        }
    }

    /* renamed from: t */
    public final void mo62547t(C71828e eVar, boolean z) {
        int i = this.f188932A - ((int) eVar.f191356b);
        this.f188932A = i;
        if (i < 0) {
            this.f188940g.mo62455f(this.f188946w, C70772a.FLOW_CONTROL_ERROR);
            this.f188942i.mo62552h(this.f188946w, Status.f186915m.withDescription("Received data size exceeded our receiving window size"), C70373ap.PROCESSED, false, (C70772a) null, (C70334de) null);
            return;
        }
        super.mo62182p(new C70811ae(eVar), z);
    }
}
