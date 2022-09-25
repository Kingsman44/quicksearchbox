package com.google.apps.tiktok.p3674l.p3676b;

import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.l.b.e */
/* compiled from: PG */
public final class C47374e {

    /* renamed from: a */
    private static final C58974d f123096a = C58974d.m91134h("ErrorRenderer");

    /* renamed from: b */
    private final Map f123097b;

    /* renamed from: c */
    private final Map f123098c;

    public C47374e(Map map, Map map2) {
        this.f123097b = map;
        this.f123098c = map2;
    }

    /* renamed from: a */
    public final C47372c mo51242a(Throwable th, Class cls) {
        Class cls2 = cls;
        while (!this.f123097b.containsKey(cls2) && cls2 != Throwable.class) {
            cls2 = cls2.getSuperclass();
        }
        C69464a aVar = (C69464a) this.f123097b.get(cls2);
        C58838bb.m90867b(aVar, "Missing handler for %s", cls);
        C47372c cVar = (C47372c) aVar.mo17428b();
        if (cVar.mo20459b(th)) {
            return cVar;
        }
        return mo51242a(th, cls.getSuperclass());
    }

    /* renamed from: b */
    public final C47380k mo51243b(Throwable th) {
        Class cls = th.getClass();
        while (!this.f123098c.containsKey(cls) && cls != Throwable.class) {
            cls = cls.getSuperclass();
        }
        C69464a aVar = (C69464a) this.f123098c.get(cls);
        C58838bb.m90867b(aVar, "Missing penalty for %s", th.getClass());
        C47384n nVar = (C47384n) aVar.mo17428b();
        if (!nVar.mo51241b(th)) {
            C47380k a = mo51242a(th, th.getClass()).mo20458a(th);
            ((C58970a) ((C58970a) f123096a.mo56223a(nVar.mo51240a(th)).mo56382g(th)).mo56372aa(54788)).mo56389s("Rendered user visible error: %s", a.f123104a);
            return a;
        }
        throw new C47373d(th);
    }
}
