package com.google.android.apps.search.googleapp.p10539y.p10540a;

import androidx.activity.result.C0815b;
import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.googleapp.saves.savefeature.C137281b;
import com.google.android.apps.search.googleapp.saves.savefeature.C137296d;
import com.google.android.apps.search.googleapp.saves.savefeature.C137298f;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4303h.C56701g;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4303h.C56702h;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4303h.C56709o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4303h.C56710p;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4412k.p4415c.p4416a.C57849g;
import com.google.p4283bv.p4412k.p4415c.p4416a.C57850h;
import com.google.p4283bv.p4412k.p4415c.p4416a.C57857o;
import com.google.p4283bv.p4412k.p4415c.p4416a.C57858p;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.y.a.c */
/* compiled from: PG */
public final /* synthetic */ class C139885c implements C0815b {

    /* renamed from: a */
    public final /* synthetic */ C139892j f380287a;

    public /* synthetic */ C139885c(C139892j jVar) {
        this.f380287a = jVar;
    }

    public final void onActivityResult(Object obj) {
        C137296d dVar;
        C137298f fVar;
        Optional optional = (Optional) obj;
        C139891i iVar = this.f380287a.f380305c;
        if (optional.isEmpty()) {
            iVar.mo115327a(C139892j.f380304b);
            return;
        }
        C137281b bVar = (C137281b) optional.get();
        int i = bVar.f373477a;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            if (i == 1) {
                dVar = (C137296d) bVar.f373478b;
            } else {
                dVar = C137296d.f373496c;
            }
            C56701g gVar = (C56701g) C56702h.f151348c.createBuilder();
            C57849g gVar2 = (C57849g) C57850h.f154557c.createBuilder();
            C57569am amVar = dVar.f373498a;
            if (amVar == null) {
                amVar = C57569am.f153797f;
            }
            gVar2.copyOnWrite();
            amVar.getClass();
            ((C57850h) gVar2.instance).f154560b = amVar;
            C57566aj ajVar = dVar.f373499b;
            if (ajVar == null) {
                ajVar = C57566aj.f153791e;
            }
            gVar2.copyOnWrite();
            C57850h hVar = (C57850h) gVar2.instance;
            ajVar.getClass();
            hVar.mo54532a();
            hVar.f154559a.add(ajVar);
            C57850h hVar2 = (C57850h) gVar2.build();
            gVar.copyOnWrite();
            C56702h hVar3 = (C56702h) gVar.instance;
            hVar2.getClass();
            hVar3.f151351b = hVar2;
            hVar3.f151350a |= 1;
            C56702h hVar4 = (C56702h) gVar.build();
            C2164c cVar = iVar.f380301a;
            if (cVar != null) {
                cVar.mo5437b(hVar4);
            } else {
                C2164c cVar2 = iVar.f380302b;
                if (cVar2 != null) {
                    cVar2.mo5439d(new C41742a(C139892j.f380304b));
                }
            }
            iVar.f380301a = null;
            iVar.f380302b = null;
        } else if (i3 != 1) {
            iVar.mo115327a(C139892j.f380304b);
        } else {
            if (i == 2) {
                fVar = (C137298f) bVar.f373478b;
            } else {
                fVar = C137298f.f373501b;
            }
            C56709o oVar = (C56709o) C56710p.f151367c.createBuilder();
            C57857o oVar2 = (C57857o) C57858p.f154570b.createBuilder();
            C57569am amVar2 = fVar.f373503a;
            if (amVar2 == null) {
                amVar2 = C57569am.f153797f;
            }
            oVar2.copyOnWrite();
            amVar2.getClass();
            ((C57858p) oVar2.instance).f154572a = amVar2;
            C57858p pVar = (C57858p) oVar2.build();
            oVar.copyOnWrite();
            C56710p pVar2 = (C56710p) oVar.instance;
            pVar.getClass();
            pVar2.f151370b = pVar;
            pVar2.f151369a |= 1;
            C56710p pVar3 = (C56710p) oVar.build();
            C2164c cVar3 = iVar.f380302b;
            if (cVar3 != null) {
                cVar3.mo5437b(pVar3);
            } else {
                C2164c cVar4 = iVar.f380301a;
                if (cVar4 != null) {
                    cVar4.mo5439d(new C41742a(C139892j.f380304b));
                }
            }
            iVar.f380301a = null;
            iVar.f380302b = null;
        }
    }
}
