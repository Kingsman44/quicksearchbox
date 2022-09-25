package com.google.apps.tiktok.contrib.work;

import androidx.work.C4412h;
import androidx.work.C4631l;
import androidx.work.C4632m;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58758qx;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.apps.tiktok.contrib.work.t */
/* compiled from: PG */
public abstract class C46586t {
    /* renamed from: j */
    public static C46582p m83063j(Class cls) {
        C46570d dVar = new C46570d();
        dVar.f121752a = cls;
        C4412h hVar = C4412h.f14080a;
        if (hVar != null) {
            dVar.f121753b = hVar;
            dVar.f121754c = new C46573g(0, TimeUnit.SECONDS);
            dVar.f121758g = C58528ij.m90006F(C58733pz.f156496a);
            dVar.f121755d = C4631l.m13030a(new HashMap());
            return dVar;
        }
        throw new NullPointerException("Null constraints");
    }

    /* renamed from: a */
    public abstract C4412h mo50564a();

    /* renamed from: b */
    public abstract C4632m mo50565b();

    /* renamed from: c */
    public abstract C46582p mo50566c();

    /* renamed from: d */
    public abstract C46584r mo50567d();

    /* renamed from: e */
    public abstract C58833ax mo50568e();

    /* renamed from: f */
    public abstract C58833ax mo50570f();

    /* renamed from: g */
    public abstract C58833ax mo50571g();

    /* renamed from: h */
    public abstract C58528ij mo50572h();

    /* renamed from: i */
    public abstract Class mo50574i();

    /* renamed from: k */
    public final C46586t mo50591k(Set set) {
        C46582p c = mo50566c();
        c.mo50562b(C58758qx.m90647e(mo50572h(), set));
        return c.mo50561a();
    }
}
