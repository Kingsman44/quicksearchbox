package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70906u;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.df */
/* compiled from: PG */
public final class C70444df extends C70566ht {

    /* renamed from: a */
    private boolean f187754a;

    /* renamed from: b */
    private final Status f187755b;

    /* renamed from: d */
    private final C70373ap f187756d;

    /* renamed from: e */
    private final C70906u[] f187757e;

    public C70444df(Status status, C70373ap apVar, C70906u[] uVarArr) {
        C58838bb.m90869d(!status.mo61679g(), "error must not be OK");
        this.f187755b = status;
        this.f187756d = apVar;
        this.f187757e = uVarArr;
    }

    /* renamed from: b */
    public final void mo61756b(C70469ed edVar) {
        edVar.mo62190b("error", this.f187755b);
        edVar.mo62190b("progress", this.f187756d);
    }

    /* renamed from: m */
    public final void mo61767m(C70374aq aqVar) {
        C58838bb.m90884s(!this.f187754a, "already started");
        this.f187754a = true;
        for (C70906u e : this.f187757e) {
            e.mo58103e();
        }
        aqVar.mo62080a(this.f187755b, this.f187756d, new C70334de());
    }
}
