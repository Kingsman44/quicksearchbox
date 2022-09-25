package p5488io.grpc;

import com.google.common.base.C58838bb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.cn */
/* compiled from: PG */
public final class C70285cn {

    /* renamed from: a */
    private static final Logger f187356a = Logger.getLogger(C70285cn.class.getName());

    /* renamed from: b */
    private static C70285cn f187357b;

    /* renamed from: c */
    private static final Iterable f187358c;

    /* renamed from: d */
    private final LinkedHashSet f187359d = new LinkedHashSet();

    /* renamed from: e */
    private final LinkedHashMap f187360e = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("io.grpc.e.ib"));
        } catch (ClassNotFoundException e) {
            f187356a.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.j.g"));
        } catch (ClassNotFoundException e2) {
            f187356a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", e2);
        }
        f187358c = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: b */
    public static synchronized C70285cn m102471b() {
        C70285cn cnVar;
        synchronized (C70285cn.class) {
            if (f187357b == null) {
                List<C70283cl> a = C70719ex.m103401a(C70283cl.class, f187358c, C70283cl.class.getClassLoader(), new C70284cm());
                f187357b = new C70285cn();
                for (C70283cl clVar : a) {
                    Logger logger = f187356a;
                    Level level = Level.FINE;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Service loader found ");
                    sb.append(clVar);
                    logger.logp(level, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(clVar)));
                    if (clVar.mo61965d()) {
                        f187357b.m102472c(clVar);
                    }
                }
                f187357b.m102473d();
            }
            cnVar = f187357b;
        }
        return cnVar;
    }

    /* renamed from: c */
    private final synchronized void m102472c(C70283cl clVar) {
        C58838bb.m90869d(clVar.mo61965d(), "isAvailable() returned false");
        this.f187359d.add(clVar);
    }

    /* renamed from: d */
    private final synchronized void m102473d() {
        this.f187360e.clear();
        Iterator it = this.f187359d.iterator();
        while (it.hasNext()) {
            C70283cl clVar = (C70283cl) it.next();
            String c = clVar.mo61964c();
            C70283cl clVar2 = (C70283cl) this.f187360e.get(c);
            if (clVar2 == null || clVar2.mo61963b() < clVar.mo61963b()) {
                this.f187360e.put(c, clVar);
            }
        }
    }

    /* renamed from: a */
    public final synchronized C70283cl mo61971a(String str) {
        return (C70283cl) this.f187360e.get(str);
    }
}
