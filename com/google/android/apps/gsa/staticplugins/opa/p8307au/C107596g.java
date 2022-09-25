package com.google.android.apps.gsa.staticplugins.opa.p8307au;

import java.util.TimeZone;
import org.p5633c.p5634a.C72288l;
import org.p5633c.p5634a.C72300x;
import org.p5633c.p5634a.p5636b.C72156ab;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.au.g */
/* compiled from: PG */
enum C107596g {
    UNKNOWN,
    MORNING,
    AFTERNOON,
    EVENING,
    NIGHT;
    

    /* renamed from: f */
    private static final C72300x f299327f = null;

    /* renamed from: g */
    private static final C72300x f299328g = null;

    /* renamed from: h */
    private static final C72300x f299329h = null;

    /* renamed from: i */
    private static final C72300x f299330i = null;

    static {
        f299327f = new C72300x(4, 30, C72156ab.f192017E);
        f299328g = new C72300x(12, 0, C72156ab.f192017E);
        f299329h = new C72300x(17, 0, C72156ab.f192017E);
        f299330i = new C72300x(22, 0, C72156ab.f192017E);
    }

    /* renamed from: a */
    public static C107596g m178477a() {
        C72300x d = C72300x.m106856d(C72288l.m106788o(TimeZone.getDefault()));
        C72300x xVar = f299327f;
        if (d.equals(xVar) || (d.mo63400s(xVar) && d.mo63401t(f299328g))) {
            return MORNING;
        }
        C72300x xVar2 = f299328g;
        if (d.equals(xVar2) || (d.mo63400s(xVar2) && d.mo63401t(f299329h))) {
            return AFTERNOON;
        }
        C72300x xVar3 = f299329h;
        return (d.equals(xVar3) || (d.mo63400s(xVar3) && d.mo63401t(f299330i))) ? EVENING : NIGHT;
    }
}
