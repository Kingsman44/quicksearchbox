package com.google.android.apps.gsa.staticplugins.p8793w;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.p395al.p408c.p414c.p416b.C8476as;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.o */
/* compiled from: PG */
public final /* synthetic */ class C118096o implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C117724al f327730a;

    public /* synthetic */ C118096o(C117724al alVar) {
        this.f327730a = alVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C117724al alVar = this.f327730a;
        C118826c cVar = (C118826c) obj;
        String a = alVar.f326762o.mo79343a();
        C59687cb b = alVar.mo79300b();
        if (alVar.f326763p.j().containsKey(a)) {
            int i = ((C8476as) alVar.f326763p.j().get(a)).f29419d;
            if (b == null) {
                b = C59687cb.f160034bf;
            }
            C59582aj ajVar = (C59582aj) b.toBuilder();
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            cbVar.f160123d |= 4194304;
            cbVar.f160117bb = i;
            C59687cb cbVar2 = (C59687cb) ajVar.build();
            C58976aa aaVar = C58975e.f156826a;
            return cbVar2;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return b;
    }
}
