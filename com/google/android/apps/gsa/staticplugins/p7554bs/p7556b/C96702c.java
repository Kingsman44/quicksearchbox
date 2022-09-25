package com.google.android.apps.gsa.staticplugins.p7554bs.p7556b;

import com.google.android.libraries.lens.view.p2067ak.C25194a;
import com.google.android.libraries.lens.view.p2067ak.C25256ch;
import com.google.android.libraries.lens.view.p2067ak.C25265d;
import com.google.android.libraries.lens.view.p2067ak.C25268g;
import com.google.android.libraries.lens.view.p2067ak.C25269h;
import com.google.android.libraries.lens.view.p2067ak.C25283v;
import com.google.android.libraries.lens.view.p2067ak.C25284w;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;

/* renamed from: com.google.android.apps.gsa.staticplugins.bs.b.c */
/* compiled from: PG */
public final /* synthetic */ class C96702c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C96703d f270525a;

    /* renamed from: b */
    public final /* synthetic */ C25284w f270526b;

    public /* synthetic */ C96702c(C96703d dVar, C25284w wVar) {
        this.f270525a = dVar;
        this.f270526b = wVar;
    }

    public final Object apply(Object obj) {
        C25268g gVar;
        C96703d dVar = this.f270525a;
        C25284w wVar = this.f270526b;
        C58833ax axVar = (C58833ax) obj;
        C25283v vVar = (C25283v) wVar.toBuilder();
        vVar.copyOnWrite();
        ((C25284w) vVar.instance).f68780a = true;
        String d = C25256ch.m46638d((String) axVar.mo56111f());
        if (dVar.f270527a.contains(d)) {
            boolean z = dVar.f270527a.getBoolean(d, false);
            C25269h hVar = ((C25284w) vVar.instance).f68782c;
            if (hVar == null) {
                hVar = C25269h.f68742d;
            }
            if (z == hVar.f68746c) {
                C25269h hVar2 = ((C25284w) vVar.instance).f68782c;
                if (hVar2 == null) {
                    hVar2 = C25269h.f68742d;
                }
                gVar = (C25268g) hVar2.toBuilder();
            } else {
                gVar = (C25268g) C25269h.f68742d.createBuilder();
            }
            gVar.copyOnWrite();
            ((C25269h) gVar.instance).f68746c = z;
            vVar.copyOnWrite();
            C25269h hVar3 = (C25269h) gVar.build();
            hVar3.getClass();
            ((C25284w) vVar.instance).f68782c = hVar3;
        }
        C58528ij a = C25256ch.m46635a(dVar.f270527a.getAll().keySet(), (String) axVar.mo56111f());
        if (!a.isEmpty()) {
            C25265d dVar2 = wVar.f68781b;
            if (dVar2 == null) {
                dVar2 = C25265d.f68732c;
            }
            C25194a aVar = (C25194a) dVar2.toBuilder();
            C58800sl lA = a.iterator();
            while (lA.hasNext()) {
                String str = (String) lA.next();
                aVar.mo30340a(str, dVar.f270527a.getLong(C25256ch.m46637c((String) axVar.mo56111f(), str), 0));
            }
            vVar.copyOnWrite();
            C25265d dVar3 = (C25265d) aVar.build();
            dVar3.getClass();
            ((C25284w) vVar.instance).f68781b = dVar3;
        }
        return (C25284w) vVar.build();
    }
}
