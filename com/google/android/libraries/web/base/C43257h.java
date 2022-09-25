package com.google.android.libraries.web.base;

import com.google.android.libraries.web.p3353c.C43323b;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.libraries.web.base.h */
/* compiled from: PG */
public abstract class C43257h {
    /* renamed from: m */
    public static C43255f m76306m(String str) {
        C43255f n = m76307n();
        n.mo46349j(str);
        ((C43253d) n).f113028a = null;
        return n;
    }

    /* renamed from: n */
    public static C43255f m76307n() {
        C43253d dVar = new C43253d();
        dVar.mo46347h(false);
        dVar.mo46343d(C43323b.f113174a);
        dVar.mo46344e(false);
        dVar.mo46346g(false);
        dVar.mo46342c(false);
        dVar.f113028a = null;
        dVar.mo46345f(false);
        dVar.mo46348i(false);
        return dVar;
    }

    /* renamed from: a */
    public abstract C43255f mo46350a();

    /* renamed from: b */
    public abstract C43256g mo46351b();

    /* renamed from: c */
    public abstract C43323b mo46352c();

    /* renamed from: d */
    public abstract C58495hd mo46353d();

    /* renamed from: e */
    public abstract C58528ij mo46354e();

    /* renamed from: f */
    public abstract String mo46356f();

    /* renamed from: g */
    public abstract boolean mo46357g();

    /* renamed from: h */
    public abstract boolean mo46358h();

    /* renamed from: i */
    public abstract boolean mo46360i();

    /* renamed from: j */
    public abstract boolean mo46361j();

    /* renamed from: k */
    public abstract boolean mo46362k();

    /* renamed from: l */
    public abstract boolean mo46363l();

    /* renamed from: o */
    public final C43255f mo46367o() {
        C43255f a = mo46350a();
        a.f113051b.mo55433l(mo46353d());
        return a;
    }
}
