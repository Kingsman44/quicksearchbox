package com.google.p5238v.p5239a;

import com.google.p5238v.p5239a.p5243b.p5244a.C67543a;
import com.google.p5238v.p5239a.p5250f.C67600g;
import com.google.p5238v.p5239a.p5250f.C67613t;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.v.a.p */
/* compiled from: PG */
final class C67900p {

    /* renamed from: a */
    private static final Logger f184077a = Logger.getLogger(C67900p.class.getName());

    /* renamed from: b */
    private final ConcurrentMap f184078b;

    public C67900p() {
        this.f184078b = new ConcurrentHashMap();
    }

    /* renamed from: f */
    private final synchronized void m98159f(C67899o oVar, boolean z) {
        String e = oVar.mo59986b().mo59974e();
        C67899o oVar2 = (C67899o) this.f184078b.get(e);
        if (oVar2 != null) {
            if (!oVar2.mo59987c().equals(oVar.mo59987c())) {
                f184077a.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(String.valueOf(e)));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{e, oVar2.mo59987c().getName(), oVar.mo59987c().getName()}));
            }
        }
        if (!z) {
            this.f184078b.putIfAbsent(e, oVar);
        } else {
            this.f184078b.put(e, oVar);
        }
    }

    /* renamed from: a */
    public final C67642j mo60035a(String str, Class cls) {
        C67899o b = mo60036b(str);
        if (b.mo59989e().contains(cls)) {
            return b.mo59985a(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(b.mo59987c());
        Set<Class> e = b.mo59989e();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : e) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb2);
    }

    /* renamed from: b */
    public final synchronized C67899o mo60036b(String str) {
        if (this.f184078b.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (C67899o) this.f184078b.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo60037c(C67613t tVar, C67600g gVar) {
        Class d;
        int f = gVar.mo59902f();
        if (!C67543a.m97645a(tVar.mo59902f())) {
            String valueOf = String.valueOf(tVar.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        } else if (C67543a.m97645a(f)) {
            String d2 = tVar.mo59894d();
            String d3 = gVar.mo59894d();
            if (!(!this.f184078b.containsKey(d2) || ((C67899o) this.f184078b.get(d2)).mo59988d() == null || (d = ((C67899o) this.f184078b.get(d2)).mo59988d()) == null)) {
                if (!d.getName().equals(gVar.getClass().getName())) {
                    Logger logger = f184077a;
                    Level level = Level.WARNING;
                    logger.logp(level, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + d2 + " with inconsistent public key type " + d3);
                    throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{tVar.getClass().getName(), d.getName(), gVar.getClass().getName()}));
                }
            }
            m98159f(new C67897n(tVar, gVar), true);
            m98159f(new C67826m(gVar), false);
        } else {
            String valueOf2 = String.valueOf(gVar.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo60038d(C67600g gVar) {
        if (C67543a.m97645a(gVar.mo59902f())) {
            m98159f(new C67826m(gVar), false);
        } else {
            String valueOf = String.valueOf(gVar.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo60039e(String str) {
        return this.f184078b.containsKey(str);
    }

    public C67900p(C67900p pVar) {
        this.f184078b = new ConcurrentHashMap(pVar.f184078b);
    }
}
