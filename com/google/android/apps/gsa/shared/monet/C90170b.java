package com.google.android.apps.gsa.shared.monet;

import com.google.android.apps.gsa.shared.monet.p7069a.C90158j;
import com.google.android.apps.gsa.shared.monet.p7069a.C90159k;
import com.google.android.libraries.gsa.monet.p1886a.C22941f;
import com.google.android.libraries.gsa.monet.p1886a.C22942g;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;

/* renamed from: com.google.android.apps.gsa.shared.monet.b */
/* compiled from: PG */
public final class C90170b implements C22942g {

    /* renamed from: a */
    private final C90159k f251934a;

    public C90170b(C90159k kVar) {
        this.f251934a = kVar;
    }

    /* renamed from: a */
    public final Object mo28304a(C22945j jVar, C22941f fVar) {
        C22941f fVar2 = C22941f.f63127a;
        if (fVar.ordinal() == 0) {
            return new C90158j(this.f251934a.f251922a, jVar);
        }
        throw new IllegalArgumentException("Unknown renderer dependency: ".concat(String.valueOf(String.valueOf(fVar))));
    }
}
