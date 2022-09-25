package com.google.p5238v.p5239a.p5250f;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.v.a.f.n */
/* compiled from: PG */
public final class C67607n {

    /* renamed from: a */
    public static final C67607n f183545a = new C67607n();

    /* renamed from: b */
    private final AtomicReference f183546b = new AtomicReference(new C67592aa(new C67617x()));

    /* renamed from: a */
    public final synchronized void mo59942a(C67595b bVar) {
        C67617x xVar = new C67617x((C67592aa) this.f183546b.get());
        C67618y yVar = new C67618y(bVar.f183529b, bVar.f183528a);
        if (xVar.f183559b.containsKey(yVar)) {
            C67595b bVar2 = (C67595b) xVar.f183559b.get(yVar);
            if (!bVar2.equals(bVar) || !bVar.equals(bVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(yVar.toString()));
            }
        } else {
            xVar.f183559b.put(yVar, bVar);
        }
        this.f183546b.set(new C67592aa(xVar));
    }

    /* renamed from: b */
    public final synchronized void mo59943b(C67597d dVar) {
        C67617x xVar = new C67617x((C67592aa) this.f183546b.get());
        C67619z zVar = new C67619z(dVar.f183530a, dVar.f183531b);
        if (xVar.f183558a.containsKey(zVar)) {
            C67597d dVar2 = (C67597d) xVar.f183558a.get(zVar);
            if (!dVar2.equals(dVar) || !dVar.equals(dVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zVar.toString()));
            }
        } else {
            xVar.f183558a.put(zVar, dVar);
        }
        this.f183546b.set(new C67592aa(xVar));
    }

    /* renamed from: c */
    public final synchronized void mo59944c(C67609p pVar) {
        C67617x xVar = new C67617x((C67592aa) this.f183546b.get());
        C67618y yVar = new C67618y(pVar.f183548b, pVar.f183547a);
        if (xVar.f183561d.containsKey(yVar)) {
            C67609p pVar2 = (C67609p) xVar.f183561d.get(yVar);
            if (!pVar2.equals(pVar) || !pVar.equals(pVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(yVar.toString()));
            }
        } else {
            xVar.f183561d.put(yVar, pVar);
        }
        this.f183546b.set(new C67592aa(xVar));
    }

    /* renamed from: d */
    public final synchronized void mo59945d(C67611r rVar) {
        C67617x xVar = new C67617x((C67592aa) this.f183546b.get());
        C67619z zVar = new C67619z(rVar.f183549a, rVar.f183550b);
        if (xVar.f183560c.containsKey(zVar)) {
            C67611r rVar2 = (C67611r) xVar.f183560c.get(zVar);
            if (!rVar2.equals(rVar) || !rVar.equals(rVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zVar.toString()));
            }
        } else {
            xVar.f183560c.put(zVar, rVar);
        }
        this.f183546b.set(new C67592aa(xVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004a, code lost:
        return new com.google.p5238v.p5239a.p5250f.C67603j(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        throw new com.google.p5238v.p5239a.p5250f.C67593ab((java.lang.Throwable) r6);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0045 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p5238v.p5239a.C67640i mo59946e(com.google.p5238v.p5239a.p5250f.C67614u r6) {
        /*
            r5 = this;
            java.lang.String r0 = "No Key Parser for requested key type "
            java.util.concurrent.atomic.AtomicReference r1 = r5.f183546b     // Catch:{ GeneralSecurityException -> 0x0045 }
            java.lang.Object r1 = r1.get()     // Catch:{ GeneralSecurityException -> 0x0045 }
            com.google.v.a.f.aa r1 = (com.google.p5238v.p5239a.p5250f.C67592aa) r1     // Catch:{ GeneralSecurityException -> 0x0045 }
            com.google.v.a.f.y r2 = new com.google.v.a.f.y     // Catch:{ GeneralSecurityException -> 0x0045 }
            java.lang.Class r3 = r6.getClass()     // Catch:{ GeneralSecurityException -> 0x0045 }
            com.google.v.a.n.a r4 = r6.f183553b     // Catch:{ GeneralSecurityException -> 0x0045 }
            r2.<init>(r3, r4)     // Catch:{ GeneralSecurityException -> 0x0045 }
            java.util.Map r3 = r1.f183525b     // Catch:{ GeneralSecurityException -> 0x0045 }
            boolean r3 = r3.containsKey(r2)     // Catch:{ GeneralSecurityException -> 0x0045 }
            if (r3 == 0) goto L_0x002a
            java.util.Map r0 = r1.f183525b     // Catch:{ GeneralSecurityException -> 0x0045 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ GeneralSecurityException -> 0x0045 }
            com.google.v.a.f.b r0 = (com.google.p5238v.p5239a.p5250f.C67595b) r0     // Catch:{ GeneralSecurityException -> 0x0045 }
            com.google.v.a.i r6 = r0.mo59936a(r6)     // Catch:{ GeneralSecurityException -> 0x0045 }
            return r6
        L_0x002a:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch:{ GeneralSecurityException -> 0x0045 }
            java.lang.String r2 = r2.toString()     // Catch:{ GeneralSecurityException -> 0x0045 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ GeneralSecurityException -> 0x0045 }
            r3.<init>(r0)     // Catch:{ GeneralSecurityException -> 0x0045 }
            r3.append(r2)     // Catch:{ GeneralSecurityException -> 0x0045 }
            java.lang.String r0 = " available"
            r3.append(r0)     // Catch:{ GeneralSecurityException -> 0x0045 }
            java.lang.String r0 = r3.toString()     // Catch:{ GeneralSecurityException -> 0x0045 }
            r1.<init>(r0)     // Catch:{ GeneralSecurityException -> 0x0045 }
            throw r1     // Catch:{ GeneralSecurityException -> 0x0045 }
        L_0x0045:
            com.google.v.a.f.j r0 = new com.google.v.a.f.j     // Catch:{ GeneralSecurityException -> 0x004b }
            r0.<init>(r6)     // Catch:{ GeneralSecurityException -> 0x004b }
            return r0
        L_0x004b:
            r6 = move-exception
            com.google.v.a.f.ab r0 = new com.google.v.a.f.ab
            r0.<init>((java.lang.Throwable) r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p5238v.p5239a.p5250f.C67607n.mo59946e(com.google.v.a.f.u):com.google.v.a.i");
    }
}
