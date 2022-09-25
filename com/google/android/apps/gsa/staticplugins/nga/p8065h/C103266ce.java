package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.ce */
/* compiled from: PG */
public final class C103266ce {

    /* renamed from: a */
    public final C22871g f288049a;

    /* renamed from: b */
    private final C103208aa f288050b;

    public C103266ce(C22871g gVar, C103208aa aaVar) {
        this.f288049a = gVar;
        this.f288050b = aaVar;
    }

    /* renamed from: a */
    public final C60870cx mo93732a(C103245bk bkVar) {
        if (bkVar.mo93727b().size() >= 50 || !bkVar.mo93728c()) {
            return C60856cj.m92900i(bkVar);
        }
        return this.f288049a.mo28210j(this.f288049a.mo28209i(this.f288050b.mo93708a(bkVar.mo93726a() + 1, 100), "[NGA] Collecting Icing data", new C103263cb(bkVar)), "[NGA] Fetching more data from Icing", new C103264cc(this));
    }
}
