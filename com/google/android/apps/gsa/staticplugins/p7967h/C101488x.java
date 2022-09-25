package com.google.android.apps.gsa.staticplugins.p7967h;

import com.google.android.apps.gsa.search.shared.service.p6935b.C87695ad;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p4008y.p4010b.C53620b;
import com.google.assistant.p4008y.p4010b.C53621c;
import com.google.assistant.p4008y.p4015e.C53668d;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.h.x */
/* compiled from: PG */
public final /* synthetic */ class C101488x implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C101451an f283220a;

    /* renamed from: b */
    public final /* synthetic */ C87695ad f283221b;

    public /* synthetic */ C101488x(C101451an anVar, C87695ad adVar) {
        this.f283220a = anVar;
        this.f283221b = adVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C101451an anVar = this.f283220a;
        C87695ad adVar = this.f283221b;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C53620b bVar = (C53620b) C53621c.f140738c.createBuilder();
            C53668d dVar = (C53668d) axVar.mo56107c();
            bVar.copyOnWrite();
            C53621c cVar = (C53621c) bVar.instance;
            dVar.getClass();
            cVar.f140741b = dVar;
            cVar.f140740a |= 1;
            adVar.copyOnWrite();
            C87696ae aeVar = (C87696ae) adVar.instance;
            C53621c cVar2 = (C53621c) bVar.build();
            C87696ae aeVar2 = C87696ae.f237132p;
            cVar2.getClass();
            aeVar.f237138e = cVar2;
            aeVar.f237134a |= 8;
        }
        return anVar.mo92301h((C87696ae) adVar.build());
    }
}
