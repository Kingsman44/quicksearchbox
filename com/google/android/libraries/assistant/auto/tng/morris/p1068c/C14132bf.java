package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import android.view.View;
import com.google.android.apps.gsa.p8839t.p8843d.C118350a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.logging.C28260b;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28376al;
import com.google.common.p4552o.p4566l.C60200dk;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.protos.p4816ai.p4818b.C63195a;
import com.google.protos.p4816ai.p4818b.C63196b;
import com.google.protos.p4816ai.p4818b.C63197c;
import com.google.protos.p4816ai.p4818b.C63198d;
import com.google.protos.p4816ai.p4818b.C63201g;
import com.google.protos.p4816ai.p4818b.C63202h;
import com.google.protos.p4816ai.p4818b.C63203i;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.bf */
/* compiled from: PG */
public final class C14132bf {

    /* renamed from: a */
    public final C28443m f42842a;

    /* renamed from: b */
    private final C28310af f42843b;

    /* renamed from: c */
    private final C86124t f42844c;

    public C14132bf(C28310af afVar, C28443m mVar, C86124t tVar) {
        this.f42843b = afVar;
        this.f42842a = mVar;
        this.f42844c = tVar;
    }

    /* renamed from: a */
    public final void mo21444a(View view, int i) {
        this.f42843b.f76997b.mo33800a(C28427h.m53115a(i)).mo33811d(view);
    }

    /* renamed from: b */
    public final void mo21445b(View view, int i, C28353e eVar) {
        C28313c a = this.f42843b.f76997b.mo33800a(C28427h.m53115a(i));
        a.mo33858f(eVar);
        a.mo33811d(view);
    }

    /* renamed from: c */
    public final void mo21446c(View view, int i, int i2) {
        if (this.f42844c.mo79746e(C90051dc.f248862bQ)) {
            mo21444a(view, i);
            return;
        }
        C63195a aVar = (C63195a) C63196b.f170734b.createBuilder();
        C63197c cVar = (C63197c) C63198d.f170738c.createBuilder();
        C63201g gVar = (C63201g) C63202h.f170745c.createBuilder();
        gVar.copyOnWrite();
        C63202h hVar = (C63202h) gVar.instance;
        hVar.f170747a |= 2;
        hVar.f170748b = i2;
        cVar.copyOnWrite();
        C63198d dVar = (C63198d) cVar.instance;
        C63202h hVar2 = (C63202h) gVar.build();
        hVar2.getClass();
        dVar.f170741b = hVar2;
        dVar.f170740a |= 4;
        aVar.copyOnWrite();
        C63196b bVar = (C63196b) aVar.instance;
        C63198d dVar2 = (C63198d) cVar.build();
        dVar2.getClass();
        bVar.mo59194a();
        bVar.f170736a.add(dVar2);
        C60218r a = C28260b.m52825a();
        C63203i iVar = (C63203i) C63204j.f170749e.createBuilder();
        iVar.copyOnWrite();
        C63204j jVar = (C63204j) iVar.instance;
        a.getClass();
        jVar.f170752b = a;
        jVar.f170751a = 2;
        C118350a.m196552a(i, (C63196b) aVar.build(), a);
        C28313c a2 = this.f42843b.f76997b.mo33800a(C28427h.m53115a(i));
        a2.mo33858f(new C28353e(C28376al.f77109a, (C63204j) iVar.build()));
        a2.mo33811d(view);
    }

    /* renamed from: d */
    public final void mo21447d(View view) {
        C28306ab abVar = this.f42843b.f76997b;
        C28306ab.m52929e(view);
    }

    /* renamed from: e */
    public final void mo21448e(View view, C60200dk dkVar) {
        this.f42842a.mo33853c(C28442l.m53146l(dkVar), C28485y.m53234a(view));
    }
}
