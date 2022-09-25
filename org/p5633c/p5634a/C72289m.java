package org.p5633c.p5634a;

import android.support.p033v7.widget.LinearLayoutManager;
import org.p5633c.p5634a.p5635a.C72142j;
import org.p5633c.p5634a.p5639e.C72268y;

/* renamed from: org.c.a.m */
/* compiled from: PG */
public final class C72289m extends C72142j {

    /* renamed from: a */
    public static final C72289m f192424a = new C72289m(0);

    /* renamed from: b */
    public static final C72289m f192425b = new C72289m(1);

    /* renamed from: c */
    public static final C72289m f192426c = new C72289m(2);

    /* renamed from: d */
    public static final C72289m f192427d = new C72289m(3);

    /* renamed from: e */
    public static final C72289m f192428e = new C72289m(4);

    /* renamed from: f */
    public static final C72289m f192429f = new C72289m(5);

    /* renamed from: g */
    public static final C72289m f192430g = new C72289m(6);

    /* renamed from: h */
    public static final C72289m f192431h = new C72289m(7);

    /* renamed from: i */
    public static final C72289m f192432i = new C72289m(Integer.MAX_VALUE);

    /* renamed from: j */
    public static final C72289m f192433j = new C72289m(LinearLayoutManager.INVALID_OFFSET);
    private static final long serialVersionUID = 87525275727380865L;

    static {
        C72268y.m106711a().mo63644b(C72146ad.m105761c());
    }

    private C72289m(int i) {
        super(i);
    }

    /* renamed from: a */
    public static C72289m m106805a(int i) {
        if (i == Integer.MIN_VALUE) {
            return f192433j;
        }
        if (i == Integer.MAX_VALUE) {
            return f192432i;
        }
        switch (i) {
            case 0:
                return f192424a;
            case 1:
                return f192425b;
            case 2:
                return f192426c;
            case 3:
                return f192427d;
            case 4:
                return f192428e;
            case 5:
                return f192429f;
            case 6:
                return f192430g;
            case 7:
                return f192431h;
            default:
                return new C72289m(i);
        }
    }

    /* renamed from: b */
    public static C72289m m106806b(C72149ag agVar, C72149ag agVar2) {
        return m106805a(C72142j.m105746k(agVar, agVar2, C72293q.f192442g));
    }

    /* renamed from: c */
    public static C72289m m106807c(C72151ai aiVar, C72151ai aiVar2) {
        C72298v vVar = (C72298v) aiVar;
        return m106805a(C72285i.m106775c(vVar.f192453b).mo63327E().mo63473a(((C72298v) aiVar2).f192452a, vVar.f192452a));
    }

    private Object readResolve() {
        return m106805a(this.f191967k);
    }

    /* renamed from: d */
    public final C72293q mo63418d() {
        return C72293q.f192442g;
    }

    /* renamed from: e */
    public final C72146ad mo63413e() {
        return C72146ad.m105761c();
    }

    /* renamed from: f */
    public final boolean mo63670f(C72289m mVar) {
        return this.f191967k < mVar.f191967k;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f191967k);
        return "P" + valueOf + "D";
    }
}
