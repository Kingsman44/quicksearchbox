package com.google.p5238v.p5239a;

import com.google.p5238v.p5239a.p5250f.C67598e;
import com.google.p5238v.p5239a.p5250f.C67600g;
import com.google.p5238v.p5239a.p5250f.C67613t;
import com.google.p5238v.p5239a.p5255j.C67721cx;
import com.google.p5238v.p5239a.p5255j.C67725da;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.v.a.aj */
/* compiled from: PG */
public final class C67539aj {

    /* renamed from: a */
    public static final ConcurrentMap f183454a = new ConcurrentHashMap();

    /* renamed from: b */
    private static final Logger f183455b = Logger.getLogger(C67539aj.class.getName());

    /* renamed from: c */
    private static final AtomicReference f183456c = new AtomicReference(new C67900p());

    /* renamed from: d */
    private static final ConcurrentMap f183457d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final ConcurrentMap f183458e = new ConcurrentHashMap();

    /* renamed from: f */
    private static final ConcurrentMap f183459f = new ConcurrentHashMap();

    static {
        new ConcurrentHashMap();
    }

    private C67539aj() {
    }

    /* renamed from: a */
    public static C67642j m97626a(String str) {
        return ((C67900p) f183456c.get()).mo60036b(str).mo59986b();
    }

    /* renamed from: b */
    public static synchronized C67721cx m97627b(C67725da daVar) {
        C67721cx a;
        synchronized (C67539aj.class) {
            C67642j a2 = m97626a(daVar.f183751a);
            if (((Boolean) f183458e.get(daVar.f183751a)).booleanValue()) {
                a = a2.mo59970a(daVar.f183752b);
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(daVar.f183751a)));
            }
        }
        return a;
    }

    /* renamed from: c */
    public static synchronized MessageLite m97628c(C67725da daVar) {
        MessageLite b;
        synchronized (C67539aj.class) {
            C67642j a = m97626a(daVar.f183751a);
            if (((Boolean) f183458e.get(daVar.f183751a)).booleanValue()) {
                b = a.mo59971b(daVar.f183752b);
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(daVar.f183751a)));
            }
        }
        return b;
    }

    /* renamed from: d */
    public static Object m97629d(C67721cx cxVar, Class cls) {
        return m97630e(cxVar.f183742a, cxVar.f183743b, cls);
    }

    /* renamed from: e */
    public static Object m97630e(String str, C63088z zVar, Class cls) {
        return ((C67900p) f183456c.get()).mo60035a(str, cls).mo59972c(zVar);
    }

    /* renamed from: f */
    public static Object m97631f(String str, MessageLite messageLite, Class cls) {
        return ((C67900p) f183456c.get()).mo60035a(str, cls).mo59973d(messageLite);
    }

    /* renamed from: g */
    public static Object m97632g(String str, byte[] bArr, Class cls) {
        return m97630e(str, C63088z.m96139A(bArr), cls);
    }

    /* renamed from: h */
    static synchronized Map m97633h() {
        Map unmodifiableMap;
        synchronized (C67539aj.class) {
            unmodifiableMap = Collections.unmodifiableMap(f183459f);
        }
        return unmodifiableMap;
    }

    /* renamed from: i */
    public static synchronized void m97634i(C67534ae aeVar) {
        synchronized (C67539aj.class) {
            if (aeVar != null) {
                Class b = aeVar.mo59900b();
                ConcurrentMap concurrentMap = f183454a;
                if (concurrentMap.containsKey(b)) {
                    C67534ae aeVar2 = (C67534ae) concurrentMap.get(b);
                    if (!aeVar.getClass().getName().equals(aeVar2.getClass().getName())) {
                        f183455b.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(String.valueOf(String.valueOf(b))));
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{b.getName(), aeVar2.getClass().getName(), aeVar.getClass().getName()}));
                    }
                }
                concurrentMap.put(b, aeVar);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    /* renamed from: j */
    public static synchronized void m97635j(C67613t tVar, C67600g gVar) {
        synchronized (C67539aj.class) {
            AtomicReference atomicReference = f183456c;
            C67900p pVar = new C67900p((C67900p) atomicReference.get());
            pVar.mo60037c(tVar, gVar);
            String d = tVar.mo59894d();
            String d2 = gVar.mo59894d();
            m97637l(d, tVar.mo59891a().mo59897c(), true);
            m97637l(d2, Collections.emptyMap(), false);
            if (!((C67900p) atomicReference.get()).mo60039e(d)) {
                f183457d.put(d, new C67538ai());
                m97638m(tVar.mo59894d(), tVar.mo59891a().mo59897c());
            }
            ConcurrentMap concurrentMap = f183458e;
            concurrentMap.put(d, true);
            concurrentMap.put(d2, false);
            atomicReference.set(pVar);
        }
    }

    /* renamed from: k */
    public static synchronized void m97636k(C67600g gVar) {
        synchronized (C67539aj.class) {
            AtomicReference atomicReference = f183456c;
            C67900p pVar = new C67900p((C67900p) atomicReference.get());
            pVar.mo60038d(gVar);
            String d = gVar.mo59894d();
            m97637l(d, gVar.mo59891a().mo59897c(), true);
            if (!((C67900p) atomicReference.get()).mo60039e(d)) {
                f183457d.put(d, new C67538ai());
                m97638m(d, gVar.mo59891a().mo59897c());
            }
            f183458e.put(d, true);
            atomicReference.set(pVar);
        }
    }

    /* renamed from: l */
    private static synchronized void m97637l(String str, Map map, boolean z) {
        synchronized (C67539aj.class) {
            if (z) {
                ConcurrentMap concurrentMap = f183458e;
                if (concurrentMap.containsKey(str)) {
                    if (!((Boolean) concurrentMap.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(String.valueOf(str)));
                    }
                }
                if (((C67900p) f183456c.get()).mo60039e(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!f183459f.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (f183459f.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* renamed from: m */
    private static void m97638m(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f183459f.put((String) entry.getKey(), C67902r.m98165a(str, ((C67598e) entry.getValue()).f183532a.toByteArray(), ((C67598e) entry.getValue()).f183533b));
        }
    }
}
