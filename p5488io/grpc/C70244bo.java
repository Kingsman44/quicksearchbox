package p5488io.grpc;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.grpc.bo */
/* compiled from: PG */
public final class C70244bo {

    /* renamed from: a */
    public static final Logger f187235a = Logger.getLogger(C70244bo.class.getName());

    /* renamed from: b */
    public static final C70244bo f187236b = new C70244bo();

    /* renamed from: c */
    public final ConcurrentNavigableMap f187237c = new ConcurrentSkipListMap();

    /* renamed from: d */
    public final ConcurrentNavigableMap f187238d = new ConcurrentSkipListMap();

    /* renamed from: e */
    public final ConcurrentMap f187239e = new ConcurrentHashMap();

    /* renamed from: f */
    public final ConcurrentMap f187240f = new ConcurrentHashMap();

    /* renamed from: g */
    public final ConcurrentMap f187241g = new ConcurrentHashMap();

    /* renamed from: a */
    public static long m102391a(C70254by byVar) {
        return byVar.mo61901c().f187246a;
    }

    /* renamed from: b */
    public static void m102392b(Map map, C70247br brVar) {
        C70247br brVar2 = (C70247br) map.put(Long.valueOf(brVar.mo61901c().f187246a), brVar);
    }

    /* renamed from: c */
    public static void m102393c(Map map, C70247br brVar) {
        C70247br brVar2 = (C70247br) map.remove(Long.valueOf(m102391a(brVar)));
    }
}
