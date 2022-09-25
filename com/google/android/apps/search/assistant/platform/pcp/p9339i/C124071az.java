package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import java.util.Iterator;
import p3186j$.util.function.Supplier;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69252r;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.az */
/* compiled from: PG */
public final /* synthetic */ class C124071az implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C124081bi f342680a;

    /* renamed from: b */
    public final /* synthetic */ int f342681b;

    public /* synthetic */ C124071az(C124081bi biVar, int i) {
        this.f342680a = biVar;
        this.f342681b = i;
    }

    public final Object get() {
        long j;
        C124081bi biVar = this.f342680a;
        int i = this.f342681b;
        C124108cg cgVar = biVar.f342718j;
        Iterator it = cgVar.f342771a.f185373a.iterator();
        while (true) {
            if (!it.hasNext()) {
                j = cgVar.f342772b;
                break;
            }
            C69252r rVar = (C69252r) it.next();
            if (rVar.f185366a == i) {
                j = (long) rVar.f185367b;
                break;
            }
        }
        return Long.valueOf(j);
    }
}
