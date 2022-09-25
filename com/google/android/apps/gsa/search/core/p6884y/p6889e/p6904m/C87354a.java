package com.google.android.apps.gsa.search.core.p6884y.p6889e.p6904m;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6904m.p6905a.C87355a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6904m.p6905a.C87356b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7109z.C90301a;
import com.google.android.apps.gsa.shared.monet.p7116h.C90332a;
import com.google.android.apps.gsa.shared.monet.p7116h.C90334c;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;

/* renamed from: com.google.android.apps.gsa.search.core.y.e.m.a */
/* compiled from: PG */
public final class C87354a {
    /* renamed from: a */
    public static Intent m141348a(C87356b bVar) {
        C90332a aVar = C90332a.TRANSPARENT;
        Intent a = C90334c.m146886a(aVar.f252281i, C90301a.f252222a, C23245b.m43556a(bVar));
        a.addFlags(65536);
        return a;
    }

    /* renamed from: b */
    public static Intent m141349b(String str) {
        C87355a aVar = (C87355a) C87356b.f235914g.createBuilder();
        aVar.copyOnWrite();
        C87356b bVar = (C87356b) aVar.instance;
        str.getClass();
        bVar.f235916a |= 1;
        bVar.f235917b = str;
        return m141348a((C87356b) aVar.build());
    }

    /* renamed from: c */
    public static Intent m141350c(String str) {
        C87355a aVar = (C87355a) C87356b.f235914g.createBuilder();
        aVar.copyOnWrite();
        C87356b bVar = (C87356b) aVar.instance;
        str.getClass();
        bVar.f235916a |= 1;
        bVar.f235917b = str;
        aVar.copyOnWrite();
        C87356b bVar2 = (C87356b) aVar.instance;
        bVar2.f235916a |= 16;
        bVar2.f235921f = false;
        return m141348a((C87356b) aVar.build());
    }
}
