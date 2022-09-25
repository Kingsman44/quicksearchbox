package com.google.frameworks.client.data.android.p4635c;

import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60871cy;
import com.google.frameworks.client.data.C61330a;
import com.google.frameworks.client.data.C61626b;
import com.google.frameworks.client.data.C61628d;
import com.google.frameworks.client.data.C61633i;
import com.google.frameworks.client.data.android.p4641h.C61467a;
import com.google.frameworks.client.data.android.p4641h.C61479al;
import com.google.frameworks.client.data.android.p4641h.C61480am;
import com.google.frameworks.client.data.android.p4641h.C61481b;
import com.google.frameworks.client.data.android.p4641h.C61483d;
import com.google.frameworks.client.data.android.p4641h.C61485f;
import com.google.frameworks.client.data.android.p4643j.C61516d;
import com.google.frameworks.client.data.android.p4644k.C61523a;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70846h;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.c.d */
/* compiled from: PG */
public final class C61398d implements C61485f {

    /* renamed from: a */
    public static final C58974d f166027a = C58974d.m91134h("xRPC");

    /* renamed from: b */
    static final C70297cz f166028b = C61523a.m94248a(C61628d.f166511b);

    /* renamed from: c */
    static final byte[] f166029c = C61628d.f166510a.toByteArray();

    /* renamed from: d */
    public static final C70846h f166030d = new C70846h("ClientInterceptorCacheDirective", C61633i.DEFAULT_CACHE_OK_IF_VALID);

    /* renamed from: l */
    private static final C70297cz f166031l = C61523a.m94248a(C61626b.f166505e);

    /* renamed from: e */
    public final C61400f f166032e;

    /* renamed from: f */
    public C70334de f166033f;

    /* renamed from: g */
    public C70334de f166034g;

    /* renamed from: h */
    public C61516d f166035h;

    /* renamed from: i */
    public C61633i f166036i;

    /* renamed from: j */
    public long f166037j = -1;

    /* renamed from: k */
    public List f166038k = C58485gu.m89845m();

    /* renamed from: m */
    private final Executor f166039m;

    /* renamed from: n */
    private C60871cy f166040n;

    public C61398d(C61397c cVar) {
        this.f166032e = cVar.f166025a;
        this.f166039m = cVar.f166026b;
    }

    /* renamed from: h */
    public static C61397c m93953h() {
        return new C61397c();
    }

    /* renamed from: a */
    public final /* synthetic */ C61479al mo39483a(C61481b bVar) {
        return C61479al.f166225a;
    }

    /* renamed from: b */
    public final C61479al mo39484b(C61481b bVar) {
        C58838bb.m90884s(bVar.f166237c.f187496a.equals(C70337dh.UNARY), "Caching interceptor only supports unary RPCs");
        C61516d dVar = (C61516d) bVar.f166236b.mo62571g(C61516d.f166297b);
        C58838bb.m90866a(dVar, "Using CachingClientInterceptor without MutableMetricsContext");
        this.f166035h = dVar;
        C61633i iVar = (C61633i) bVar.f166236b.mo62571g(f166030d);
        C58838bb.m90866a(iVar, "Using CachingClientInterceptor without CacheDirective");
        this.f166036i = iVar;
        C70334de deVar = new C70334de();
        this.f166033f = deVar;
        deVar.mo62032g(bVar.f166235a);
        return C61479al.f166226b;
    }

    /* renamed from: c */
    public final /* synthetic */ C61480am mo39485c(C61467a aVar) {
        return C61480am.f166232a;
    }

    /* renamed from: d */
    public final C61480am mo39486d(C61483d dVar) {
        Iterable a;
        C70334de deVar = new C70334de();
        this.f166034g = deVar;
        deVar.mo62032g(dVar.f166239a);
        C70334de deVar2 = this.f166034g;
        C70297cz czVar = f166031l;
        if (deVar2.mo62035j(czVar) && (a = this.f166034g.mo62026a(czVar)) != null) {
            C58485gu i = C58485gu.m89841i(a);
            if (i.size() == 1) {
                try {
                    C61626b bVar = (C61626b) ((C61330a) ((C61330a) C61626b.f166504d.createBuilder()).mergeFrom((byte[]) i.get(0), C62921ba.m95368a())).build();
                    if ((bVar.f166507a & 1) != 0) {
                        long j = bVar.f166508b;
                        if (j > 0) {
                            this.f166037j = TimeUnit.SECONDS.toMillis(j);
                            C62971cq<String> cqVar = bVar.f166509c;
                            C58480gp e = C58485gu.m89837e();
                            for (String lowerCase : cqVar) {
                                e.mo55395g(lowerCase.toLowerCase(Locale.ROOT));
                            }
                            this.f166038k = e.mo55394f();
                            return C61480am.f166232a;
                        }
                    }
                } catch (C62974ct e2) {
                    ((C58970a) ((C58970a) ((C58970a) f166027a.mo56225c()).mo56382g(e2)).mo56372aa(54883)).mo56386p("Could not parse server ttl");
                }
            } else {
                ((C58970a) ((C58970a) f166027a.mo56225c()).mo56372aa(54882)).mo56387q("Expected a single value for extension, got: %d", i.size());
            }
        }
        return C61480am.f166232a;
    }

    /* renamed from: e */
    public final C61479al mo39487e() {
        try {
            C58833ax axVar = (C58833ax) C60856cj.m92909r(this.f166040n);
            if (axVar == null) {
                ((C58970a) ((C58970a) f166027a.mo56225c()).mo56372aa(54881)).mo56386p("RpcCache returned null instead of Optional#absent()");
                return C61479al.f166225a;
            } else if (!axVar.mo56113h()) {
                if (!this.f166036i.equals(C61633i.CACHE_ONLY)) {
                    if (!this.f166036i.equals(C61633i.VALID_CACHE_ONLY)) {
                        return C61479al.f166225a;
                    }
                }
                Status withDescription = Status.m102099c(Status.Code.FAILED_PRECONDITION).withDescription("Required value come from cache, but no cached value was found");
                C70334de deVar = new C70334de();
                deVar.mo62033h(f166028b, f166029c);
                return C61479al.m94189b(withDescription, deVar);
            } else {
                C61399e eVar = (C61399e) axVar.mo56107c();
                throw null;
            }
        } catch (ExecutionException e) {
            ((C58970a) ((C58970a) ((C58970a) f166027a.mo56225c()).mo56382g(e.getCause())).mo56372aa(54880)).mo56386p("Failed to read from cache");
            return e.getCause() instanceof ClassCastException ? C61479al.m94189b(Status.f186915m, new C70334de()) : C61479al.f166225a;
        }
    }

    /* renamed from: f */
    public final C61479al mo39488f() {
        C60871cy cyVar = new C60871cy((Callable) new C61395a(this));
        this.f166040n = cyVar;
        this.f166039m.execute(cyVar);
        return C61479al.m94190c(this.f166040n);
    }

    /* renamed from: g */
    public final C61480am mo39489g() {
        if (this.f166037j == -1) {
            return C61480am.f166232a;
        }
        this.f166039m.execute(new C61396b(this));
        return C61480am.f166232a;
    }
}
