package com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9223c;

import com.google.assistant.p3781ad.p3787c.p3788a.C48482aa;

/* renamed from: com.google.android.apps.search.assistant.platform.i.c.b.c.b */
/* compiled from: PG */
public final class C121430b {

    /* renamed from: a */
    public final double f337082a;

    /* renamed from: b */
    public final double f337083b;

    /* renamed from: c */
    public final double f337084c;

    public C121430b(C48482aa aaVar, C48482aa aaVar2) {
        double d = aaVar.f125241b;
        double d2 = aaVar2.f125241b;
        if (d != d2) {
            double d3 = aaVar2.f125242c;
            double d4 = aaVar.f125242c;
            double d5 = (d3 - d4) / (d2 - d);
            this.f337083b = d5;
            this.f337084c = d4 - (d5 * d);
            this.f337082a = d2;
            return;
        }
        throw new IllegalArgumentException("'current' and 'next' points must have different 'x'");
    }
}
