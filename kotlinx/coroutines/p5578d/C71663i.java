package kotlinx.coroutines.p5578d;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60917ed;
import com.google.common.util.concurrent.p4579a.C60792a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.C71394aa;
import kotlinx.coroutines.C71405al;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71808r;
import kotlinx.coroutines.C71816z;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.C69586p;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.d.i */
/* compiled from: PG */
public final class C71663i {
    /* renamed from: a */
    public static final C60870cx m104688a(C71604be beVar) {
        C69664n.m101061g(beVar, "<this>");
        C71656b bVar = new C71656b(beVar);
        beVar.mo62873s(new C71661g(bVar, beVar));
        return bVar;
    }

    /* renamed from: b */
    public static final C60870cx m104689b(C71422aw awVar, C69585o oVar, C71424ay ayVar, C69630p pVar) {
        C69664n.m101061g(awVar, "<this>");
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(ayVar, "start");
        if (!ayVar.mo62780a()) {
            C71657c cVar = new C71657c(C71405al.m104171b(awVar, oVar));
            cVar.mo62684m(ayVar, cVar, pVar);
            return cVar.f191108b;
        }
        new StringBuilder().append(ayVar);
        throw new IllegalArgumentException(String.valueOf(ayVar).concat(" start is not supported"));
    }

    /* renamed from: c */
    public static final Object m104690c(C60870cx cxVar, C69577g gVar) {
        try {
            if (cxVar.isDone()) {
                return C60917ed.m93034a(cxVar);
            }
            C71808r rVar = new C71808r(C69555b.m100961b(gVar), 1);
            rVar.mo63041A();
            cxVar.mo4106b(new C71664j(cxVar, rVar), C60826bg.f164896a);
            rVar.mo63035f(new C71662h(cxVar));
            Object n = rVar.mo63043n();
            if (n == C69554a.COROUTINE_SUSPENDED) {
                C69664n.m101061g(gVar, "frame");
            }
            return n;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            C69664n.m101058d(cause);
            throw cause;
        }
    }

    /* renamed from: d */
    public static final C71604be m104691d(C60870cx cxVar) {
        C71816z zVar;
        Throwable k;
        C69664n.m101061g(cxVar, "<this>");
        if ((cxVar instanceof C60792a) && (k = ((C60792a) cxVar).mo57252k()) != null) {
            C71816z zVar2 = new C71816z();
            zVar2.mo63050j(k);
            return zVar2;
        } else if (cxVar.isDone()) {
            try {
                return C71394aa.m104159a(C60917ed.m93034a(cxVar));
            } catch (CancellationException e) {
                zVar = new C71816z();
                zVar.mo62723u(e);
                return zVar;
            } catch (ExecutionException e2) {
                zVar = new C71816z();
                Throwable cause = e2.getCause();
                C69664n.m101058d(cause);
                zVar.mo63050j(cause);
                return zVar;
            }
        } else {
            C71816z zVar3 = new C71816z();
            C60856cj.m92911t(cxVar, new C71658d(zVar3), C60826bg.f164896a);
            zVar3.mo62873s(new C71659e(cxVar));
            return new C71660f(zVar3);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ C60870cx m104692e(C71422aw awVar, C71424ay ayVar, C69630p pVar, int i) {
        C69586p pVar2 = (i & 1) != 0 ? C69586p.f185991a : null;
        if ((i & 2) != 0) {
            ayVar = C71424ay.DEFAULT;
        }
        return m104689b(awVar, pVar2, ayVar, pVar);
    }
}
