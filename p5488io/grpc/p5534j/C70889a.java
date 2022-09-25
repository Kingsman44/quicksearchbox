package p5488io.grpc.p5534j;

import com.google.common.base.C58838bb;
import java.util.List;
import java.util.Map;
import p5488io.grpc.C70137aa;
import p5488io.grpc.C70138ab;
import p5488io.grpc.C70158av;
import p5488io.grpc.C70279ch;
import p5488io.grpc.C70281cj;

/* renamed from: io.grpc.j.a */
/* compiled from: PG */
final class C70889a implements C70281cj {

    /* renamed from: a */
    final /* synthetic */ C70279ch f189078a;

    /* renamed from: b */
    final /* synthetic */ C70894f f189079b;

    public C70889a(C70894f fVar, C70279ch chVar) {
        this.f189079b = fVar;
        this.f189078a = chVar;
    }

    /* renamed from: a */
    public final void mo61958a(C70138ab abVar) {
        C70894f fVar = this.f189079b;
        C70279ch chVar = this.f189078a;
        Map map = fVar.f189088d;
        List c = chVar.mo61952c();
        boolean z = true;
        if (c.size() != 1) {
            z = false;
        }
        C58838bb.m90887v(z, "%s does not have exactly one group", c);
        if (map.get(C70894f.m103790e((C70158av) c.get(0))) == chVar) {
            C70137aa aaVar = abVar.f186972a;
            if (aaVar == C70137aa.TRANSIENT_FAILURE || aaVar == C70137aa.IDLE) {
                fVar.f189087c.mo61942b();
            }
            if (abVar.f186972a == C70137aa.IDLE) {
                chVar.mo61953d();
            }
            C70892d f = C70894f.m103791f(chVar);
            if (!((C70138ab) f.f189084a).f186972a.equals(C70137aa.TRANSIENT_FAILURE) || (!abVar.f186972a.equals(C70137aa.CONNECTING) && !abVar.f186972a.equals(C70137aa.IDLE))) {
                f.f189084a = abVar;
                fVar.mo62588h();
            }
        }
    }
}
