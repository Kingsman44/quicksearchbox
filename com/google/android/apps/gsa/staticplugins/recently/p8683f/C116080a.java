package com.google.android.apps.gsa.staticplugins.recently.p8683f;

import com.google.android.apps.gsa.staticplugins.recently.p8682e.C116076d;
import com.google.android.apps.gsa.staticplugins.recently.timeline.C116201d;
import com.google.android.libraries.gsa.p1875j.C22832c;
import com.google.android.libraries.gsa.p1875j.C22845p;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.f.a */
/* compiled from: PG */
public final class C116080a extends C116076d {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo102461a() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo102462b(List list) {
        C22832c cVar = (C22832c) C22845p.f62890o.createBuilder();
        cVar.copyOnWrite();
        C22845p pVar = (C22845p) cVar.instance;
        pVar.f62894c = 8;
        pVar.f62892a |= 2;
        cVar.copyOnWrite();
        C22845p pVar2 = (C22845p) cVar.instance;
        pVar2.f62892a |= 1;
        pVar2.f62893b = 8;
        C116201d dVar = new C116201d();
        dVar.f322187f = false;
        dVar.mo102559c((C22845p) cVar.build());
        list.add(dVar);
    }
}
