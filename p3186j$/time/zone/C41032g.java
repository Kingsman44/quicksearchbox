package p3186j$.time.zone;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p3186j$.util.Objects;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.zone.g */
public abstract class C41032g {

    /* renamed from: a */
    private static final CopyOnWriteArrayList f107487a;

    /* renamed from: b */
    private static final ConcurrentHashMap f107488b = new ConcurrentHashMap(512, 0.75f, 2);

    /* renamed from: c */
    private static volatile Set f107489c;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f107487a = copyOnWriteArrayList;
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new C41030e(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    protected C41032g() {
    }

    /* renamed from: a */
    public static Set m71614a() {
        return f107489c;
    }

    /* renamed from: b */
    public static C41028c m71615b(String str, boolean z) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = f107488b;
        C41032g gVar = (C41032g) concurrentHashMap.get(str);
        if (gVar != null) {
            return gVar.mo43414c(str);
        }
        if (concurrentHashMap.isEmpty()) {
            throw new C41029d("No time-zone data files registered");
        }
        throw new C41029d("Unknown time-zone ID: " + str);
    }

    /* renamed from: e */
    public static void m71616e(C41032g gVar) {
        Objects.requireNonNull(gVar, "provider");
        synchronized (C41032g.class) {
            for (String str : gVar.mo43415d()) {
                Objects.requireNonNull(str, "zoneId");
                if (((C41032g) f107488b.putIfAbsent(str, gVar)) != null) {
                    String valueOf = String.valueOf(gVar);
                    throw new C41029d("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + valueOf);
                }
            }
            f107489c = Collections.unmodifiableSet(new HashSet(f107488b.keySet()));
        }
        f107487a.add(gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C41028c mo43414c(String str);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Set mo43415d();
}
