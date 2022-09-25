package com.google.android.apps.gsa.search.core.p6805i;

import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;

/* renamed from: com.google.android.apps.gsa.search.core.i.m */
/* compiled from: PG */
public final class C86117m {

    /* renamed from: a */
    public static final C86117m f232762a;

    /* renamed from: b */
    public final C58528ij f232763b;

    /* renamed from: c */
    public final C58528ij f232764c;

    static {
        C58733pz pzVar = C58733pz.f156496a;
        f232762a = new C86117m(pzVar, pzVar);
    }

    public C86117m(C58528ij ijVar, C58528ij ijVar2) {
        this.f232763b = ijVar;
        this.f232764c = ijVar2;
    }

    /* renamed from: a */
    public final boolean mo79735a(int i) {
        C58528ij ijVar = this.f232764c;
        Integer valueOf = Integer.valueOf(i);
        return ijVar.contains(valueOf) || this.f232763b.contains(valueOf);
    }
}
