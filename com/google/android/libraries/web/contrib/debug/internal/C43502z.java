package com.google.android.libraries.web.contrib.debug.internal;

import com.google.android.libraries.web.base.p3348b.p3350b.C43242a;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.web.contrib.debug.internal.z */
/* compiled from: PG */
public final class C43502z {

    /* renamed from: a */
    public final C43475a f113609a;

    /* renamed from: b */
    public boolean f113610b = true;

    /* renamed from: c */
    public int f113611c;

    /* renamed from: d */
    public C43242a f113612d = C43242a.NONE;

    /* renamed from: e */
    final /* synthetic */ C43476aa f113613e;

    /* renamed from: f */
    private final long f113614f;

    public C43502z(C43476aa aaVar, long j, C43475a aVar, int i) {
        this.f113613e = aaVar;
        this.f113614f = j;
        this.f113609a = aVar;
        this.f113611c = i;
    }

    /* renamed from: a */
    public final C58485gu mo46575a() {
        C58480gp e = C58485gu.m89837e();
        Iterator it = this.f113613e.f113572a.iterator();
        while (it.hasNext()) {
            C43501y yVar = (C43501y) it.next();
            if (yVar.mo46563b() == this.f113614f) {
                e.mo55395g(yVar);
            }
        }
        return e.mo55394f();
    }
}
