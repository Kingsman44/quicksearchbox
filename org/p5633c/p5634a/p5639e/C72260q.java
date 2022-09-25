package org.p5633c.p5634a.p5639e;

import java.util.ArrayList;
import org.p5633c.p5634a.C72283g;

/* renamed from: org.c.a.e.q */
/* compiled from: PG */
public final class C72260q {

    /* renamed from: a */
    private final ArrayList f192267a = new ArrayList();

    /* renamed from: b */
    private Object f192268b;

    /* renamed from: A */
    private final Object m106632A() {
        Object obj = this.f192268b;
        if (obj == null) {
            if (this.f192267a.size() == 2) {
                Object obj2 = this.f192267a.get(0);
                Object obj3 = this.f192267a.get(1);
                if (obj2 == null) {
                    obj = obj3;
                } else if (obj2 == obj3 || obj3 == null) {
                    obj = obj2;
                }
            }
            if (obj == null) {
                obj = new C72247d(this.f192267a);
            }
            this.f192268b = obj;
        }
        return obj;
    }

    /* renamed from: B */
    private static final boolean m106633B(Object obj) {
        if (!(obj instanceof C72261r)) {
            return false;
        }
        if (!(obj instanceof C72247d) || ((C72247d) obj).f192238b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    static void m106634c(StringBuffer stringBuffer, int i) {
        while (true) {
            i--;
            if (i >= 0) {
                stringBuffer.append(65533);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final C72245b mo63610a() {
        Object A = m106632A();
        C72261r rVar = null;
        C72265v vVar = (!(A instanceof C72265v) || ((A instanceof C72247d) && ((C72247d) A).f192237a == null)) ? null : (C72265v) A;
        if (m106633B(A)) {
            rVar = (C72261r) A;
        }
        if (vVar != null || rVar != null) {
            return new C72245b(vVar, rVar);
        }
        throw new UnsupportedOperationException("Both printing and parsing not supported");
    }

    /* renamed from: b */
    public final C72261r mo63611b() {
        Object A = m106632A();
        if (m106633B(A)) {
            return (C72261r) A;
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    /* renamed from: d */
    public final void mo63612d(Object obj) {
        this.f192268b = null;
        this.f192267a.add(obj);
        this.f192267a.add(obj);
    }

    /* renamed from: e */
    public final void mo63613e(C72265v vVar, C72261r rVar) {
        this.f192268b = null;
        this.f192267a.add(vVar);
        this.f192267a.add(rVar);
    }

    /* renamed from: f */
    public final void mo63614f(C72283g gVar) {
        mo63612d(new C72254k(gVar, true));
    }

    /* renamed from: g */
    public final void mo63615g(C72283g gVar) {
        mo63612d(new C72254k(gVar, false));
    }

    /* renamed from: h */
    public final void mo63616h(C72245b bVar) {
        if (bVar != null) {
            mo63613e(bVar.f192231a, bVar.f192232b);
            return;
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    /* renamed from: i */
    public final void mo63617i(C72261r[] rVarArr) {
        int length = rVarArr.length;
        C72261r[] rVarArr2 = new C72261r[length];
        int i = 0;
        while (i < length - 1) {
            C72261r rVar = rVarArr[i];
            rVarArr2[i] = rVar;
            if (rVar != null) {
                i++;
            } else {
                throw new IllegalArgumentException("Incomplete parser array");
            }
        }
        rVarArr2[i] = rVarArr[i];
        mo63613e((C72265v) null, new C72250g(rVarArr2));
    }

    /* renamed from: j */
    public final void mo63618j(C72283g gVar, int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        } else if (i <= 1) {
            mo63612d(new C72259p(gVar, i2, false));
        } else {
            mo63612d(new C72252i(gVar, i2, false, i));
        }
    }

    /* renamed from: k */
    public final void mo63619k(C72283g gVar, int i) {
        mo63612d(new C72248e(gVar, i));
    }

    /* renamed from: l */
    public final void mo63620l(C72283g gVar, int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        mo63612d(new C72249f(gVar, i, i2));
    }

    /* renamed from: m */
    public final void mo63621m(char c) {
        mo63612d(new C72246c(c));
    }

    /* renamed from: p */
    public final void mo63624p(C72283g gVar, int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        if (i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        } else if (i <= 1) {
            mo63612d(new C72259p(gVar, i2, true));
        } else {
            mo63612d(new C72252i(gVar, i2, true, i));
        }
    }

    /* renamed from: q */
    public final void mo63625q(String str, String str2, boolean z, int i, int i2) {
        mo63612d(new C72257n(str, str2, z, i, i2));
    }

    /* renamed from: r */
    public final void mo63626r(String str, boolean z, int i) {
        mo63612d(new C72257n(str, str, z, 2, i));
    }

    /* renamed from: s */
    public final void mo63627s(int i) {
        mo63618j(C72283g.f192394j, i, 2);
    }

    /* renamed from: t */
    public final void mo63628t(int i) {
        mo63618j(C72283g.f192398n, i, 1);
    }

    /* renamed from: u */
    public final void mo63629u(int i) {
        mo63618j(C72283g.f192392h, i, 3);
    }

    /* renamed from: v */
    public final void mo63630v(int i) {
        mo63618j(C72283g.f192403s, i, 2);
    }

    /* renamed from: w */
    public final void mo63631w(int i) {
        mo63618j(C72283g.f192405u, i, 2);
    }

    /* renamed from: x */
    public final void mo63632x(int i) {
        mo63618j(C72283g.f192393i, i, 2);
    }

    /* renamed from: y */
    public final void mo63633y(int i) {
        mo63618j(C72283g.f192407w, i, 2);
    }

    /* renamed from: z */
    public final void mo63634z(int i) {
        mo63618j(C72283g.f192397m, i, 2);
    }

    /* renamed from: n */
    public final void mo63622n(String str) {
        int length = str.length();
        if (length == 0) {
            return;
        }
        if (length != 1) {
            mo63612d(new C72253j(str));
        } else {
            mo63612d(new C72246c(str.charAt(0)));
        }
    }

    /* renamed from: o */
    public final void mo63623o(C72261r rVar) {
        if (rVar != null) {
            mo63613e((C72265v) null, new C72250g(new C72261r[]{rVar, null}));
            return;
        }
        throw new IllegalArgumentException("No parser supplied");
    }
}
