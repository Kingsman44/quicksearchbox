package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d;

import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9664a.C127935b;
import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a.C127951aa;
import com.google.assistant.p3897e.p3917i.p3918a.C51347ei;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.ah */
/* compiled from: PG */
final class C127997ah implements C127992ac {

    /* renamed from: a */
    final /* synthetic */ C127999aj f352256a;

    /* renamed from: b */
    private final C58495hd f352257b;

    public C127997ah(C127999aj ajVar) {
        this.f352256a = ajVar;
        this.f352257b = C58662ni.m90343b((Map) Collection.EL.stream(ajVar.f352262c.values()).collect(C58370cn.m89403c(C127993ad.f352252a, new C127994ae(this), C127995af.f352254a)));
    }

    /* renamed from: a */
    public final C60870cx mo108298a(C51347ei eiVar) {
        C58974d dVar = C127999aj.f352260a;
        int i = eiVar.f133743i;
        C127935b bVar = (C127935b) this.f352257b.get(eiVar);
        if (bVar != null) {
            return bVar.mo108283a();
        }
        ((C58970a) ((C58970a) C127999aj.f352260a.mo56225c()).mo56372aa(37734)).mo56386p("No signal");
        return C60856cj.m92899h(new IllegalStateException("Unsupported attribute type!"));
    }

    /* renamed from: b */
    public final void mo108299b(C51347ei eiVar) {
        C58974d dVar = C127999aj.f352260a;
        int i = eiVar.f133743i;
        C127935b bVar = (C127935b) this.f352257b.get(eiVar);
        C127951aa aaVar = (C127951aa) this.f352256a.f352262c.get(eiVar);
        if (bVar == null || aaVar == null) {
            ((C58970a) ((C58970a) C127999aj.f352260a.mo56225c()).mo56372aa(37736)).mo56386p("No signal");
            return;
        }
        Objects.requireNonNull(aaVar);
        bVar.mo108284b(new C127996ag(aaVar));
    }
}
