package com.google.android.libraries.lens.view.p2081au;

import com.google.android.libraries.lens.p2014e.C24227s;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.lens.p4707j.C62496ds;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;

/* renamed from: com.google.android.libraries.lens.view.au.c */
/* compiled from: PG */
final class C25553c extends C25559i {

    /* renamed from: a */
    public C24227s f69558a;

    /* renamed from: b */
    private C56220aa f69559b;

    /* renamed from: c */
    private C58833ax f69560c = C58836b.f156633a;

    public C25553c() {
    }

    public C25553c(C25560j jVar) {
        C25554d dVar = (C25554d) jVar;
        this.f69558a = dVar.f69561a;
        this.f69559b = dVar.f69562b;
        this.f69560c = dVar.f69563c;
    }

    /* renamed from: a */
    public final C25560j mo30611a() {
        C56220aa aaVar;
        C24227s sVar = this.f69558a;
        if (sVar != null && (aaVar = this.f69559b) != null) {
            return new C25554d(sVar, aaVar, this.f69560c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f69558a == null) {
            sb.append(" image");
        }
        if (this.f69559b == null) {
            sb.append(" predictedObjects");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo30612b(C56220aa aaVar) {
        if (aaVar != null) {
            this.f69559b = aaVar;
            return;
        }
        throw new NullPointerException("Null predictedObjects");
    }

    /* renamed from: c */
    public final void mo30613c(C62496ds dsVar) {
        this.f69560c = C58833ax.m90833j(dsVar);
    }
}
