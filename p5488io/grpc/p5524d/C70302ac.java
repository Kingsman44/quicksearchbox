package p5488io.grpc.p5524d;

import com.google.common.base.C58838bb;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5525e.C70670lp;

/* renamed from: io.grpc.d.ac */
/* compiled from: PG */
final class C70302ac {

    /* renamed from: a */
    public final C70323t f187388a;

    /* renamed from: b */
    public final C70301ab f187389b;

    /* renamed from: c */
    public final C70334de f187390c;

    /* renamed from: d */
    public final C70338di f187391d;

    /* renamed from: e */
    public volatile String f187392e;

    /* renamed from: f */
    final /* synthetic */ C70304ae f187393f;

    /* renamed from: g */
    private final C70851i f187394g;

    public C70302ac(C70304ae aeVar, C70338di diVar, C70334de deVar, C70851i iVar, String str, C70670lp lpVar) {
        this.f187393f = aeVar;
        C58838bb.m90866a(diVar, "method");
        this.f187391d = diVar;
        C58838bb.m90866a(deVar, "headers");
        this.f187390c = deVar;
        C58838bb.m90866a(iVar, "callOptions");
        this.f187394g = iVar;
        this.f187392e = str;
        this.f187388a = new C70323t(this, iVar, lpVar);
        this.f187389b = new C70301ab(this, diVar);
    }

    /* renamed from: a */
    public final void mo61992a() {
        synchronized (this.f187393f) {
            boolean remove = this.f187393f.f187404i.remove(this);
            if (C70460dv.m102883k(this.f187394g)) {
                this.f187393f.f187408m.mo62188c(this, false);
            }
            if (this.f187393f.f187404i.isEmpty() && remove) {
                C70304ae aeVar = this.f187393f;
                if (aeVar.f187403h) {
                    aeVar.mo61994g();
                }
            }
        }
    }
}
