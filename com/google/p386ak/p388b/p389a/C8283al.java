package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8396l;
import com.google.p386ak.C8398n;
import com.google.p386ak.C8400p;
import com.google.p386ak.C8401q;
import com.google.p386ak.C8404t;
import com.google.p386ak.p388b.C8329ac;
import com.google.p386ak.p388b.C8331ae;
import com.google.p386ak.p388b.C8332af;
import com.google.p386ak.p388b.C8336aj;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8386b;
import com.google.p386ak.p394d.C8387c;
import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: com.google.ak.b.a.al */
/* compiled from: PG */
public final class C8283al extends C8266aa {
    /* renamed from: d */
    public static final C8398n m23009d(C8385a aVar) {
        int r = aVar.mo17127r();
        C8398n f = m23011f(aVar, r);
        if (f == null) {
            return m23010e(aVar, r);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.mo17125p()) {
                String f2 = f instanceof C8401q ? aVar.mo17115f() : null;
                int r2 = aVar.mo17127r();
                C8398n f3 = m23011f(aVar, r2);
                C8398n e = f3 == null ? m23010e(aVar, r2) : f3;
                if (f instanceof C8396l) {
                    ((C8396l) f).f29253a.add(e);
                } else {
                    ((C8401q) f).f29255a.put(f2, e);
                }
                if (f3 != null) {
                    arrayDeque.addLast(f);
                    f = e;
                }
            } else {
                if (f instanceof C8396l) {
                    aVar.mo17121l();
                } else {
                    aVar.mo17122m();
                }
                if (arrayDeque.isEmpty()) {
                    return f;
                }
                f = (C8398n) arrayDeque.removeLast();
            }
        }
    }

    /* renamed from: e */
    private static final C8398n m23010e(C8385a aVar, int i) {
        int i2 = i - 1;
        if (i2 == 5) {
            return new C8404t(aVar.mo17117h());
        }
        if (i2 == 6) {
            return new C8404t((Number) new C8329ac(aVar.mo17117h()));
        }
        if (i2 == 7) {
            return new C8404t(Boolean.valueOf(aVar.mo17126q()));
        }
        if (i2 == 8) {
            aVar.mo17123n();
            return C8400p.f29254a;
        }
        throw new IllegalStateException("Unexpected token: ".concat(C8386b.m23197a(i)));
    }

    /* renamed from: f */
    private static final C8398n m23011f(C8385a aVar, int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            aVar.mo17119j();
            return new C8396l();
        } else if (i2 != 2) {
            return null;
        } else {
            aVar.mo17120k();
            return new C8401q();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        return m23009d(aVar);
    }

    /* renamed from: c */
    public final void mo17030b(C8387c cVar, C8398n nVar) {
        if (nVar == null || (nVar instanceof C8400p)) {
            cVar.mo17138h();
        } else if (nVar instanceof C8404t) {
            C8404t h = nVar.mo17162h();
            Object obj = h.f29256a;
            if (obj instanceof Number) {
                cVar.mo17140j(h.mo17173a());
            } else if (obj instanceof Boolean) {
                cVar.mo17142l(h.mo17155e());
            } else {
                cVar.mo17141k(h.mo17154d());
            }
        } else if (nVar instanceof C8396l) {
            cVar.mo17131c();
            Iterator it = nVar.mo17160f().iterator();
            while (it.hasNext()) {
                mo17030b(cVar, (C8398n) it.next());
            }
            cVar.mo17134e();
        } else if (nVar instanceof C8401q) {
            cVar.mo17133d();
            C8331ae aeVar = new C8331ae((C8332af) nVar.mo17161g().f29255a.entrySet());
            while (aeVar.hasNext()) {
                C8336aj a = aeVar.mo17064a();
                cVar.mo17137g((String) a.f29157f);
                mo17030b(cVar, (C8398n) a.f29159h);
            }
            cVar.mo17135f();
        } else {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(String.valueOf(nVar.getClass()))));
        }
    }
}
