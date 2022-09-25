package p5488io.grpc.p5533i;

import com.google.common.base.C58838bb;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70703eh;
import p5488io.grpc.C70704ei;
import p5488io.grpc.C70705ej;

/* renamed from: io.grpc.i.ah */
/* compiled from: PG */
final class C70860ah implements C70705ej {

    /* renamed from: a */
    public final C70858af f189037a;

    /* renamed from: b */
    private final boolean f189038b;

    public C70860ah(C70858af afVar, boolean z) {
        this.f189037a = afVar;
        this.f189038b = z;
    }

    /* renamed from: a */
    public final C70703eh mo39514a(C70704ei eiVar, C70334de deVar) {
        C58838bb.m90869d(eiVar.mo61741c().f187496a.mo62041a(), "asyncUnaryRequestCall is only for clientSendsOneMessage methods");
        C70887z zVar = new C70887z(eiVar, this.f189038b);
        eiVar.mo62062g(2);
        return new C70859ag(this, zVar, eiVar);
    }
}
