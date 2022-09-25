package com.google.android.apps.gsa.search.core.p6884y.p6887c;

import com.google.android.apps.gsa.search.core.p6884y.p6886b.C87288a;
import com.google.android.apps.gsa.search.core.p6884y.p6886b.C87289b;
import com.google.android.apps.gsa.shared.monet.p7069a.C90156h;
import com.google.android.libraries.gsa.monet.internal.service.C23015k;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23059j;
import com.google.android.libraries.gsa.monet.service.C23060k;

/* renamed from: com.google.android.apps.gsa.search.core.y.c.a */
/* compiled from: PG */
public final class C87291a implements C23060k {

    /* renamed from: a */
    private final C87289b f235753a;

    public C87291a(C87289b bVar) {
        this.f235753a = bVar;
    }

    /* renamed from: a */
    public final Object mo28502a(C23052c cVar, C23059j jVar) {
        C23059j jVar2 = C23059j.f63412a;
        if (jVar.ordinal() == 0) {
            C90156h hVar = new C90156h(this.f235753a.f235750a, ((C23015k) cVar).f63312g.f63391d.f63478c);
            cVar.mo28427o(new C87288a(hVar));
            return hVar;
        }
        throw new IllegalArgumentException("Unknown controller dependency: ".concat(String.valueOf(String.valueOf(jVar))));
    }
}
