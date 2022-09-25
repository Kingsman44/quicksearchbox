package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8267ab;
import com.google.p386ak.C8393i;
import com.google.p386ak.C8408x;
import com.google.p386ak.C8409y;
import com.google.p386ak.p388b.C8337ak;
import com.google.p386ak.p393c.C8383a;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8386b;
import com.google.p386ak.p394d.C8387c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ak.b.a.m */
/* compiled from: PG */
public final class C8313m extends C8266aa {

    /* renamed from: a */
    private static final C8267ab f29105a = new C8312l(C8408x.DOUBLE);

    /* renamed from: b */
    private final C8393i f29106b;

    /* renamed from: c */
    private final C8409y f29107c;

    public C8313m(C8393i iVar, C8409y yVar) {
        this.f29106b = iVar;
        this.f29107c = yVar;
    }

    /* renamed from: c */
    public static C8267ab m23061c(C8409y yVar) {
        return yVar == C8408x.DOUBLE ? f29105a : new C8312l(yVar);
    }

    /* renamed from: d */
    private final Object m23062d(C8385a aVar, int i) {
        int i2 = i - 1;
        if (i2 == 5) {
            return aVar.mo17117h();
        }
        if (i2 == 6) {
            return this.f29107c.mo17178a(aVar);
        }
        if (i2 == 7) {
            return Boolean.valueOf(aVar.mo17126q());
        }
        if (i2 == 8) {
            aVar.mo17123n();
            return null;
        }
        throw new IllegalStateException("Unexpected token: ".concat(C8386b.m23197a(i)));
    }

    /* renamed from: e */
    private static final Object m23063e(C8385a aVar, int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            aVar.mo17119j();
            return new ArrayList();
        } else if (i2 != 2) {
            return null;
        } else {
            aVar.mo17120k();
            return new C8337ak();
        }
    }

    /* renamed from: a */
    public final Object mo17029a(C8385a aVar) {
        int r = aVar.mo17127r();
        Object e = m23063e(aVar, r);
        if (e == null) {
            return m23062d(aVar, r);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.mo17125p()) {
                String f = e instanceof Map ? aVar.mo17115f() : null;
                int r2 = aVar.mo17127r();
                Object e2 = m23063e(aVar, r2);
                Object d = e2 == null ? m23062d(aVar, r2) : e2;
                if (e instanceof List) {
                    ((List) e).add(d);
                } else {
                    ((Map) e).put(f, d);
                }
                if (e2 != null) {
                    arrayDeque.addLast(e);
                    e = d;
                }
            } else {
                if (e instanceof List) {
                    aVar.mo17121l();
                } else {
                    aVar.mo17122m();
                }
                if (arrayDeque.isEmpty()) {
                    return e;
                }
                e = arrayDeque.removeLast();
            }
        }
    }

    /* renamed from: b */
    public final void mo17030b(C8387c cVar, Object obj) {
        if (obj == null) {
            cVar.mo17138h();
            return;
        }
        C8266aa a = this.f29106b.mo17143a(new C8383a(obj.getClass()));
        if (a instanceof C8313m) {
            cVar.mo17133d();
            cVar.mo17135f();
            return;
        }
        a.mo17030b(cVar, obj);
    }
}
