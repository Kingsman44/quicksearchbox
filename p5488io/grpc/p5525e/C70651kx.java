package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p5488io.grpc.C70140ad;
import p5488io.grpc.C70141ae;
import p5488io.grpc.C70148al;
import p5488io.grpc.C70153aq;
import p5488io.grpc.C70243bn;
import p5488io.grpc.C70244bo;
import p5488io.grpc.C70252bw;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70713er;
import p5488io.grpc.C70714es;
import p5488io.grpc.C70762fb;
import p5488io.grpc.Status;
import p5488io.p5489a.C69792b;

/* renamed from: io.grpc.e.kx */
/* compiled from: PG */
final class C70651kx implements C70661lg {

    /* renamed from: a */
    public final C70660lf f188336a;

    /* renamed from: b */
    public Future f188337b;

    /* renamed from: c */
    final /* synthetic */ C70652ky f188338c;

    public C70651kx(C70652ky kyVar, C70660lf lfVar) {
        this.f188338c = kyVar;
        this.f188336a = lfVar;
    }

    /* renamed from: a */
    public final void mo62391a(C70658ld ldVar, String str, C70334de deVar) {
        Executor executor;
        C70141ae aeVar;
        C70658ld ldVar2 = ldVar;
        C70334de deVar2 = deVar;
        ldVar.mo61778l();
        int i = C69792b.f186180a;
        if (this.f188338c.f188341d != C60826bg.f164896a) {
            executor = new C70633kf(this.f188338c.f188341d);
        } else {
            executor = new C70629kb();
            ldVar.mo61760f();
        }
        Executor executor2 = executor;
        boolean z = false;
        if (deVar2.mo62035j(C70460dv.f187784c)) {
            String str2 = (String) deVar2.mo62027b(C70460dv.f187784c);
            if (this.f188338c.f188353p.mo61729a(str2) == null) {
                ldVar2.mo61775i(C70652ky.f188340c);
                ldVar2.mo61774e(Status.f186914l.withDescription(String.format("Can't find decompressor for %s", new Object[]{str2})), new C70334de());
                return;
            }
            ldVar.mo61777k();
        }
        C70670lp b = ldVar.mo61772b();
        C58838bb.m90866a(b, "statsTraceCtx not present from stream");
        Long l = (Long) deVar2.mo62027b(C70460dv.f187783b);
        C70148al alVar = this.f188338c.f188352o;
        C70762fb[] fbVarArr = b.f188401b;
        if (fbVarArr.length <= 0) {
            C70148al o = alVar.mo61717o(C70252bw.f187251a, this.f188338c);
            if (l == null) {
                aeVar = new C70141ae(o);
            } else {
                C70153aq c = C70153aq.m102154c(l.longValue(), TimeUnit.NANOSECONDS, this.f188338c.f188356s);
                ScheduledExecutorService p = this.f188336a.mo61995p();
                C70148al.m102136q(p, "scheduler");
                C70153aq b2 = o.mo61697b();
                if (b2 == null || b2.compareTo(c) > 0) {
                    z = true;
                } else {
                    c = b2;
                }
                C70141ae aeVar2 = new C70141ae(o, c);
                if (z) {
                    if (!c.mo61723e()) {
                        synchronized (aeVar2) {
                            C70140ad adVar = new C70140ad(aeVar2);
                            C70153aq.m102155f(p, "scheduler");
                            aeVar2.f186977b = p.schedule(adVar, c.f187002c - System.nanoTime(), TimeUnit.NANOSECONDS);
                        }
                    } else {
                        aeVar2.mo61706j(new TimeoutException("context timed out"));
                    }
                }
                aeVar = aeVar2;
            }
            C70642ko koVar = new C70642ko(executor2, this.f188338c.f188341d, ldVar2, aeVar);
            ldVar2.mo61775i(koVar);
            SettableFuture settableFuture = new SettableFuture();
            C70648ku kuVar = r1;
            C70648ku kuVar2 = new C70648ku(this, aeVar, str, ldVar, koVar, settableFuture, b, deVar);
            executor2.execute(kuVar);
            executor2.execute(new C70647kt(aeVar, settableFuture, str, deVar, ldVar, koVar));
            return;
        }
        C70713er erVar = (C70713er) fbVarArr[0];
        throw null;
    }

    /* renamed from: b */
    public final void mo62392b() {
        Future future = this.f188337b;
        if (future != null) {
            future.cancel(false);
            this.f188337b = null;
        }
        Iterator it = this.f188338c.f188344g.iterator();
        if (!it.hasNext()) {
            C70652ky kyVar = this.f188338c;
            C70660lf lfVar = this.f188336a;
            synchronized (kyVar.f188349l) {
                if (kyVar.f188351n.remove(lfVar)) {
                    C70244bo.m102393c((C70243bn) kyVar.f188354q.f187241g.get(Long.valueOf(C70244bo.m102391a(kyVar))), lfVar);
                    kyVar.mo62397e();
                } else {
                    throw new AssertionError("Transport already removed");
                }
            }
            return;
        }
        C70714es esVar = (C70714es) it.next();
        throw null;
    }

    /* renamed from: c */
    public final void mo62393c() {
        this.f188337b.cancel(false);
        this.f188337b = null;
        Iterator it = this.f188338c.f188344g.iterator();
        if (it.hasNext()) {
            C70714es esVar = (C70714es) it.next();
            throw null;
        }
    }
}
