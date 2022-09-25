package com.google.android.apps.gsa.search.core.google;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.speech.p5208h.C66566aw;
import com.google.speech.p5208h.C66567ax;

/* renamed from: com.google.android.apps.gsa.search.core.google.bp */
/* compiled from: PG */
public final /* synthetic */ class C85893bp implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C85965dk f232228a;

    public /* synthetic */ C85893bp(C85965dk dkVar) {
        this.f232228a = dkVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C85965dk dkVar = this.f232228a;
        String str = (String) obj;
        if (str != null) {
            dkVar.f232475a.f232497e.put("Cookie", str);
        }
        C66566aw awVar = (C66566aw) C85895br.m138021a(dkVar.mo79626b((C85966dl) null)).toBuilder();
        awVar.copyOnWrite();
        C66567ax axVar = (C66567ax) awVar.instance;
        axVar.f181072a |= 4;
        axVar.f181076e = false;
        return (C66567ax) awVar.build();
    }
}
