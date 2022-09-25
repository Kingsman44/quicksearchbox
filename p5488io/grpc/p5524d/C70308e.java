package p5488io.grpc.p5524d;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ScheduledExecutorService;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5488io.grpc.p5525e.C70472eg;
import p5488io.grpc.p5525e.C70567hu;
import p5488io.grpc.p5525e.C70657lc;
import p5488io.grpc.p5525e.C70661lg;

/* renamed from: io.grpc.d.e */
/* compiled from: PG */
final class C70308e implements C70472eg {

    /* renamed from: c */
    private static final ConcurrentMap f187425c = new ConcurrentHashMap();

    /* renamed from: a */
    public final List f187426a;

    /* renamed from: b */
    public final C70567hu f187427b;

    /* renamed from: d */
    private final SocketAddress f187428d;

    /* renamed from: e */
    private C70657lc f187429e;

    /* renamed from: f */
    private boolean f187430f;

    /* renamed from: g */
    private ScheduledExecutorService f187431g;

    public C70308e(C70310g gVar, List list) {
        this.f187428d = gVar.f187434b;
        this.f187427b = gVar.f187435c;
        C58838bb.m90866a(list, "streamTracerFactories");
        this.f187426a = Collections.unmodifiableList(list);
    }

    /* renamed from: d */
    static C70308e m102541d(SocketAddress socketAddress) {
        if (socketAddress instanceof C70299a) {
            return ((C70299a) socketAddress).mo61986a();
        }
        if (!(socketAddress instanceof C70311h)) {
            return null;
        }
        ConcurrentMap concurrentMap = f187425c;
        String str = ((C70311h) socketAddress).f187436a;
        return (C70308e) concurrentMap.get((Object) null);
    }

    /* renamed from: a */
    public final List mo61815a() {
        return Collections.singletonList(this.f187428d);
    }

    /* renamed from: b */
    public final void mo61816b() {
        ((C70299a) this.f187428d).mo61987b(this);
        this.f187431g = (ScheduledExecutorService) this.f187427b.mo62163b(this.f187431g);
        synchronized (this) {
            this.f187430f = true;
            this.f187429e.mo62388b();
        }
    }

    /* renamed from: c */
    public final void mo61817c(C70657lc lcVar) {
        this.f187429e = lcVar;
        this.f187431g = (ScheduledExecutorService) this.f187427b.mo62162a();
        ((C70299a) this.f187428d).mo61988c(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized C70661lg mo61997e(C70304ae aeVar) {
        if (this.f187430f) {
            return null;
        }
        return this.f187429e.mo62387a(aeVar);
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("listenAddress", this.f187428d);
        return b.toString();
    }
}
