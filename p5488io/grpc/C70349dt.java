package p5488io.grpc;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.dt */
/* compiled from: PG */
public final class C70349dt {

    /* renamed from: c */
    private static final Logger f187516c = Logger.getLogger(C70349dt.class.getName());

    /* renamed from: d */
    private static C70349dt f187517d;

    /* renamed from: a */
    public final C70341dl f187518a = new C70347dr(this);

    /* renamed from: b */
    public String f187519b = "unknown";

    /* renamed from: e */
    private final LinkedHashSet f187520e = new LinkedHashSet();

    /* renamed from: f */
    private C58495hd f187521f = C58729pv.f156485a;

    /* renamed from: a */
    public static synchronized C70349dt m102620a() {
        C70349dt dtVar;
        synchronized (C70349dt.class) {
            if (f187517d == null) {
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(Class.forName("io.grpc.e.dd"));
                } catch (ClassNotFoundException e) {
                    f187516c.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", e);
                }
                List<C70346dq> a = C70719ex.m103401a(C70346dq.class, Collections.unmodifiableList(arrayList), C70346dq.class.getClassLoader(), new C70348ds());
                if (a.isEmpty()) {
                    f187516c.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                f187517d = new C70349dt();
                for (C70346dq dqVar : a) {
                    Logger logger = f187516c;
                    Level level = Level.FINE;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Service loader found ");
                    sb.append(dqVar);
                    logger.logp(level, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(dqVar)));
                    if (dqVar.mo57977e()) {
                        f187517d.m102621c(dqVar);
                    }
                }
                f187517d.m102622d();
            }
            dtVar = f187517d;
        }
        return dtVar;
    }

    /* renamed from: c */
    private final synchronized void m102621c(C70346dq dqVar) {
        C58838bb.m90869d(dqVar.mo57977e(), "isAvailable() returned false");
        this.f187520e.add(dqVar);
    }

    /* renamed from: d */
    private final synchronized void m102622d() {
        HashMap hashMap = new HashMap();
        Iterator it = this.f187520e.iterator();
        String str = "unknown";
        int i = LinearLayoutManager.INVALID_OFFSET;
        while (it.hasNext()) {
            C70346dq dqVar = (C70346dq) it.next();
            String d = dqVar.mo57976d();
            C70346dq dqVar2 = (C70346dq) hashMap.get(d);
            if (dqVar2 == null || dqVar2.mo57973a() < dqVar.mo57973a()) {
                hashMap.put(d, dqVar);
            }
            if (i < dqVar.mo57973a()) {
                int a = dqVar.mo57973a();
                i = a;
                str = dqVar.mo57976d();
            }
        }
        this.f187521f = C58495hd.m89898l(hashMap);
        this.f187519b = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized Map mo62056b() {
        return this.f187521f;
    }
}
