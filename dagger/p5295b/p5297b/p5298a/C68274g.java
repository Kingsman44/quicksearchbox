package dagger.p5295b.p5297b.p5298a;

import com.google.common.p4522b.C58557jl;
import dagger.p5294a.C68221g;
import dagger.p5295b.p5297b.C68276c;
import dagger.p5295b.p5297b.C68277d;
import dagger.p5295b.p5297b.C68280g;
import dagger.p5295b.p5297b.C68281h;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import p5460g.p5461a.C69464a;

/* renamed from: dagger.b.b.a.g */
/* compiled from: PG */
public final class C68274g {

    /* renamed from: a */
    private static final Logger f184636a = Logger.getLogger(C68274g.class.getName());

    private C68274g() {
    }

    /* renamed from: a */
    public static C68281h m98604a(C69464a aVar, C69464a aVar2) {
        C68280g gVar;
        C68280g gVar2;
        try {
            Collection collection = (Collection) aVar2.mo17428b();
            if (collection.isEmpty()) {
                gVar = C68280g.f184640d;
            } else {
                if (collection.size() == 1) {
                    gVar2 = new C68272e((C68280g) C58557jl.m90133n(collection));
                } else {
                    gVar2 = new C68269b(collection);
                }
                gVar = gVar2;
            }
            return gVar.mo51662a(((C68221g) aVar).f184583a);
        } catch (RuntimeException e) {
            f184636a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "createMonitorForComponent", "RuntimeException while constructing monitor factories.", e);
            return C68281h.f184641b;
        }
    }

    /* renamed from: b */
    public static void m98605b(RuntimeException runtimeException, C68280g gVar, Object obj) {
        Logger logger = f184636a;
        Level level = Level.SEVERE;
        logger.logp(level, "dagger.producers.monitoring.internal.Monitors", "logCreateException", "RuntimeException while calling ProductionComponentMonitor.Factory.create on factory " + gVar + " with component " + obj, runtimeException);
    }

    /* renamed from: c */
    public static void m98606c(RuntimeException runtimeException, C68276c cVar, String str, Object obj) {
        Logger logger = f184636a;
        Level level = Level.SEVERE;
        logger.logp(level, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorArgMethodException", "RuntimeException while calling ProducerMonitor." + str + " on monitor " + cVar + " with " + obj, runtimeException);
    }

    /* renamed from: d */
    public static void m98607d(RuntimeException runtimeException, C68281h hVar, C68277d dVar) {
        Logger logger = f184636a;
        Level level = Level.SEVERE;
        logger.logp(level, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorForException", "RuntimeException while calling ProductionComponentMonitor.producerMonitorFor on monitor " + hVar + " with token " + dVar, runtimeException);
    }

    /* renamed from: e */
    public static void m98608e(RuntimeException runtimeException, C68276c cVar, String str) {
        Logger logger = f184636a;
        Level level = Level.SEVERE;
        logger.logp(level, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorMethodException", "RuntimeException while calling ProducerMonitor." + str + " on monitor " + cVar, runtimeException);
    }
}
