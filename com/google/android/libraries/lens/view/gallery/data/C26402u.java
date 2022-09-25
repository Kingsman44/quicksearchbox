package com.google.android.libraries.lens.view.gallery.data;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.view.gallery.data.u */
/* compiled from: PG */
public final class C26402u {

    /* renamed from: a */
    public int f71830a = 0;

    /* renamed from: b */
    public final Map f71831b = new HashMap();

    /* renamed from: c */
    public final C58480gp f71832c = C58485gu.m89837e();

    /* renamed from: d */
    private final C26405x f71833d;

    public C26402u(C26405x xVar) {
        this.f71833d = xVar;
    }

    /* renamed from: a */
    public final C26406y mo31601a() {
        C58490gz gzVar = new C58490gz(4);
        for (Map.Entry entry : this.f71831b.entrySet()) {
            gzVar.mo55429h((C26403v) entry.getKey(), ((C58480gp) entry.getValue()).mo55394f());
        }
        return new C26382a(this.f71833d, this.f71830a, gzVar.mo55427f(false), this.f71832c.mo55394f());
    }
}
