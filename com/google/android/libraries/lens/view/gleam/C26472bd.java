package com.google.android.libraries.lens.view.gleam;

import com.google.android.libraries.lens.common.text.C24135k;
import com.google.android.libraries.lens.view.p2069am.C25332h;
import com.google.android.libraries.lens.view.p2069am.C25333i;
import com.google.android.libraries.lens.view.p2177w.C28185a;
import com.google.common.base.C58817ah;
import com.google.lens.p4707j.C62441br;

/* renamed from: com.google.android.libraries.lens.view.gleam.bd */
/* compiled from: PG */
public final /* synthetic */ class C26472bd implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C26491bw f72110a;

    public /* synthetic */ C26472bd(C26491bw bwVar) {
        this.f72110a = bwVar;
    }

    public final Object apply(Object obj) {
        C26491bw bwVar = this.f72110a;
        C62441br brVar = ((C24135k) obj).f65895b;
        if (brVar == null) {
            brVar = C62441br.f168608h;
        }
        C25332h hVar = (C25332h) C25333i.f68945c.createBuilder();
        int width = bwVar.f71966d.getWidth();
        hVar.copyOnWrite();
        ((C25333i) hVar.instance).f68947a = width;
        int height = bwVar.f71966d.getHeight();
        hVar.copyOnWrite();
        ((C25333i) hVar.instance).f68948b = height;
        return C28185a.m52688f(brVar, (C25333i) hVar.build());
    }
}
