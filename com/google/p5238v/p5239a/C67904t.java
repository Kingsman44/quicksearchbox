package com.google.p5238v.p5239a;

import com.google.p5238v.p5239a.p5253h.C67638a;
import com.google.p5238v.p5239a.p5255j.C67720cw;
import com.google.p5238v.p5239a.p5255j.C67721cx;
import com.google.p5238v.p5239a.p5255j.C67722cy;
import com.google.p5238v.p5239a.p5255j.C67728dd;
import com.google.p5238v.p5239a.p5255j.C67729de;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.v.a.t */
/* compiled from: PG */
public final class C67904t {

    /* renamed from: a */
    public final C67729de f184084a;

    /* renamed from: b */
    private final C67638a f184085b = C67638a.f183586a;

    public C67904t(C67729de deVar) {
        this.f184084a = deVar;
    }

    /* renamed from: a */
    public static final C67904t m98167a(C67729de deVar) {
        m98169d(deVar);
        return new C67904t(deVar);
    }

    /* renamed from: b */
    public static final C67904t m98168b(byte[] bArr) {
        try {
            C67729de deVar = (C67729de) C62942bv.parseFrom((C62942bv) C67729de.f183760c, bArr, C62921ba.f169869a);
            m98170e(deVar);
            return m98167a(deVar);
        } catch (C62974ct unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    /* renamed from: d */
    public static void m98169d(C67729de deVar) {
        if (deVar == null || deVar.f183763b.size() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* renamed from: e */
    public static void m98170e(C67729de deVar) {
        for (C67728dd ddVar : deVar.f183763b) {
            C67721cx cxVar = ddVar.f183756a;
            if (cxVar == null) {
                cxVar = C67721cx.f183740d;
            }
            C67720cw a = C67720cw.m97847a(cxVar.f183744c);
            if (a == null) {
                a = C67720cw.UNRECOGNIZED;
            }
            if (a != C67720cw.UNKNOWN_KEYMATERIAL) {
                C67721cx cxVar2 = ddVar.f183756a;
                C67720cw a2 = C67720cw.m97847a((cxVar2 == null ? C67721cx.f183740d : cxVar2).f183744c);
                if (a2 == null) {
                    a2 = C67720cw.UNRECOGNIZED;
                }
                if (a2 != C67720cw.SYMMETRIC) {
                    if (cxVar2 == null) {
                        cxVar2 = C67721cx.f183740d;
                    }
                    C67720cw a3 = C67720cw.m97847a(cxVar2.f183744c);
                    if (a3 == null) {
                        a3 = C67720cw.UNRECOGNIZED;
                    }
                    if (a3 == C67720cw.ASYMMETRIC_PRIVATE) {
                    }
                }
            }
            Object[] objArr = new Object[2];
            C67721cx cxVar3 = ddVar.f183756a;
            if (cxVar3 == null) {
                cxVar3 = C67721cx.f183740d;
            }
            C67720cw a4 = C67720cw.m97847a(cxVar3.f183744c);
            if (a4 == null) {
                a4 = C67720cw.UNRECOGNIZED;
            }
            objArr[0] = a4.name();
            C67721cx cxVar4 = ddVar.f183756a;
            if (cxVar4 == null) {
                cxVar4 = C67721cx.f183740d;
            }
            objArr[1] = cxVar4.f183742a;
            throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", objArr));
        }
    }

    /* renamed from: c */
    public final Object mo60041c(Class cls) {
        C67534ae aeVar = (C67534ae) C67539aj.f183454a.get(cls);
        Class a = aeVar == null ? null : aeVar.mo59899a();
        if (a != null) {
            C67541al.m97642b(this.f184084a);
            C67530aa aaVar = new C67530aa(a);
            C67638a aVar = this.f184085b;
            if (aaVar.f183440b != null) {
                aaVar.f183442d = aVar;
                for (C67728dd ddVar : this.f184084a.f183763b) {
                    int b = C67722cy.m97849b(ddVar.f183757b);
                    if (b != 0 && b == 3) {
                        C67721cx cxVar = ddVar.f183756a;
                        if (cxVar == null) {
                            cxVar = C67721cx.f183740d;
                        }
                        Object d = C67539aj.m97629d(cxVar, a);
                        if (ddVar.f183758c == this.f184084a.f183762a) {
                            aaVar.mo59903a(d, ddVar, true);
                        } else {
                            aaVar.mo59903a(d, ddVar, false);
                        }
                    }
                }
                ConcurrentMap concurrentMap = aaVar.f183440b;
                if (concurrentMap != null) {
                    C67533ad adVar = new C67533ad(concurrentMap, aaVar.f183441c, aaVar.f183442d, aaVar.f183439a);
                    aaVar.f183440b = null;
                    C67534ae aeVar2 = (C67534ae) C67539aj.f183454a.get(cls);
                    if (aeVar2 == null) {
                        throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(adVar.f183451b.getName())));
                    } else if (aeVar2.mo59899a().equals(adVar.f183451b)) {
                        return aeVar2.mo59901c(adVar);
                    } else {
                        String valueOf = String.valueOf(aeVar2.mo59899a());
                        String obj = adVar.f183451b.toString();
                        throw new GeneralSecurityException("Wrong input primitive class, expected " + valueOf + ", got " + obj);
                    }
                } else {
                    throw new IllegalStateException("build cannot be called twice");
                }
            } else {
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
        } else {
            throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls.getName())));
        }
    }

    public final String toString() {
        return C67541al.m97641a(this.f184084a).toString();
    }
}
