package com.google.android.libraries.search.assistant.p2700k.p2701a;

import com.google.android.libraries.search.assistant.p2700k.C34779q;
import com.google.android.libraries.search.assistant.p2700k.C34786x;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.data.android.p4632a.C61346g;
import com.google.frameworks.client.data.android.p4641h.C61467a;
import com.google.frameworks.client.data.android.p4641h.C61479al;
import com.google.frameworks.client.data.android.p4641h.C61480am;
import com.google.frameworks.client.data.android.p4641h.C61481b;
import com.google.frameworks.client.data.android.p4641h.C61483d;
import com.google.frameworks.client.data.android.p4641h.C61485f;
import com.google.frameworks.client.data.p4631a.C61331a;
import com.google.protos.p4985f.p5006h.C64856a;
import com.google.protos.p4985f.p5006h.C64857b;
import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.k.a.b */
/* compiled from: PG */
public final class C34759b implements C61485f {

    /* renamed from: c */
    private static final C59071e f92238c = C59071e.m91331h();

    /* renamed from: d */
    private static final C70297cz f92239d;

    /* renamed from: a */
    public final C34786x f92240a;

    /* renamed from: b */
    public final C34779q f92241b;

    /* renamed from: e */
    private final C71422aw f92242e;

    /* renamed from: f */
    private C60870cx f92243f;

    static {
        String a = C61331a.m93818a(389277393);
        C64856a aVar = (C64856a) C64857b.f175755c.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        f92239d = C70297cz.m102495c(a, C70850d.m103696b(C69664n.m101061g(aVar, "builder").mo59317a()));
    }

    public C34759b(C34786x xVar, C34779q qVar, C71422aw awVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        this.f92240a = xVar;
        this.f92241b = qVar;
        this.f92242e = awVar;
    }

    /* renamed from: a */
    public final C61479al mo39483a(C61481b bVar) {
        Status status;
        try {
            C60870cx cxVar = this.f92243f;
            if (cxVar == null) {
                C69664n.m101065k("future");
                cxVar = null;
            }
            Object r = C60856cj.m92909r(cxVar);
            C69664n.m101060f(r, "getDone(future)");
            C59052c cVar = (C59052c) f92238c.mo56224b();
            cVar.mo56379ah(new C59094n(50642));
            cVar.mo56386p("Adding ASID authentication container into headers.");
            bVar.f166235a.mo62033h(f92239d, (C64857b) r);
            return C61479al.f166225a;
        } catch (ExecutionException e) {
            C59052c cVar2 = (C59052c) ((C59052c) f92238c.mo56226d()).mo56382g(e);
            cVar2.mo56379ah(new C59094n(50643));
            cVar2.mo56386p("ASID authentication container build failed.");
            Throwable cause = e.getCause();
            if (cause instanceof C61346g) {
                status = Status.m102099c(Status.Code.UNAUTHENTICATED).mo61678e(cause);
            } else {
                status = Status.m102100d(cause);
            }
            return C61479al.m94189b(status, new C70334de());
        }
    }

    /* renamed from: b */
    public final C61479al mo39484b(C61481b bVar) {
        C60870cx a = C71663i.m104688a(C71803m.m105042c(this.f92242e, (C69585o) null, (C71424ay) null, new C34758a(this, bVar, (C69577g) null), 3));
        this.f92243f = a;
        return C61479al.m94190c(a);
    }

    /* renamed from: c */
    public final /* synthetic */ C61480am mo39485c(C61467a aVar) {
        return C61480am.f166232a;
    }

    /* renamed from: d */
    public final /* synthetic */ C61480am mo39486d(C61483d dVar) {
        return C61480am.f166232a;
    }

    /* renamed from: e */
    public final /* synthetic */ C61479al mo39487e() {
        return C61479al.f166225a;
    }

    /* renamed from: f */
    public final /* synthetic */ C61479al mo39488f() {
        return C61479al.f166225a;
    }

    /* renamed from: g */
    public final /* synthetic */ C61480am mo39489g() {
        return C61480am.f166232a;
    }
}
