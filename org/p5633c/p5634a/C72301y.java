package org.p5633c.p5634a;

import android.support.p033v7.widget.LinearLayoutManager;
import org.p5633c.p5634a.p5635a.C72142j;
import org.p5633c.p5634a.p5639e.C72268y;

/* renamed from: org.c.a.y */
/* compiled from: PG */
public final class C72301y extends C72142j {

    /* renamed from: a */
    public static final C72301y f192460a = new C72301y(0);

    /* renamed from: b */
    public static final C72301y f192461b = new C72301y(1);

    /* renamed from: c */
    public static final C72301y f192462c = new C72301y(2);

    /* renamed from: d */
    public static final C72301y f192463d = new C72301y(3);

    /* renamed from: e */
    public static final C72301y f192464e = new C72301y(Integer.MAX_VALUE);

    /* renamed from: f */
    public static final C72301y f192465f = new C72301y(LinearLayoutManager.INVALID_OFFSET);
    private static final long serialVersionUID = 87525275727380863L;

    static {
        C72268y.m106711a().mo63644b(C72146ad.m105762d());
    }

    private C72301y(int i) {
        super(i);
    }

    /* renamed from: a */
    public static C72301y m106866a(int i) {
        if (i == Integer.MIN_VALUE) {
            return f192465f;
        }
        if (i == Integer.MAX_VALUE) {
            return f192464e;
        }
        if (i == 0) {
            return f192460a;
        }
        if (i == 1) {
            return f192461b;
        }
        if (i != 2) {
            return i != 3 ? new C72301y(i) : f192463d;
        }
        return f192462c;
    }

    /* renamed from: b */
    public static C72301y m106867b(C72149ag agVar, C72149ag agVar2) {
        return m106866a(C72142j.m105746k(agVar, agVar2, C72293q.f192445j));
    }

    private Object readResolve() {
        return m106866a(this.f191967k);
    }

    /* renamed from: d */
    public final C72293q mo63418d() {
        return C72293q.f192445j;
    }

    /* renamed from: e */
    public final C72146ad mo63413e() {
        return C72146ad.m105762d();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f191967k);
        return "PT" + valueOf + "M";
    }
}
