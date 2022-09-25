package p5488io.grpc.p5526f;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5573a.C71389v;
import kotlinx.coroutines.p5573a.C71392y;
import kotlinx.coroutines.p5574b.C71552db;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70148al;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70703eh;
import p5488io.grpc.C70704ei;
import p5488io.grpc.C70705ej;

/* renamed from: io.grpc.f.w */
/* compiled from: PG */
final class C70757w implements C70705ej {

    /* renamed from: a */
    final /* synthetic */ C69585o f188557a;

    /* renamed from: b */
    final /* synthetic */ C69626l f188558b;

    public C70757w(C69585o oVar, C69626l lVar) {
        this.f188557a = oVar;
        this.f188558b = lVar;
    }

    /* renamed from: a */
    public final C70703eh mo39514a(C70704ei eiVar, C70334de deVar) {
        C69585o oVar = this.f188557a;
        Object a = C70749o.f188539a.mo61711a(C70148al.m102135m());
        C69664n.m101060f(a, "CoroutineContextServerIn…ROUTINE_CONTEXT_KEY.get()");
        C69585o plus = oVar.plus((C69585o) a);
        C70148al m = C70148al.m102135m();
        C69664n.m101060f(m, "current()");
        C69585o plus2 = plus.plus(new C70751q(m));
        C69626l lVar = this.f188558b;
        C70756v vVar = new C70756v(new C70759y(eiVar));
        C71389v a2 = C71392y.m104158a(1, (C71387t) null, 6);
        return new C70758x(C71803m.m105043d(C71423ax.m104197b(plus2), (C69585o) null, (C71424ay) null, new C70726ac(lVar, new C71552db(new C70760z(new AtomicBoolean(false), eiVar, a2, (C69577g) null)), vVar, eiVar, (C69577g) null), 3), a2, eiVar, vVar);
    }
}
