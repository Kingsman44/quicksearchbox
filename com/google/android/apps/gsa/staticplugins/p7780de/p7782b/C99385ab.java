package com.google.android.apps.gsa.staticplugins.p7780de.p7782b;

import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90198d;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90199e;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90203i;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90206l;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.p8363f.C109029a;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.b.ab */
/* compiled from: PG */
public final /* synthetic */ class C99385ab implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C99403at f278052a;

    public /* synthetic */ C99385ab(C99403at atVar) {
        this.f278052a = atVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C99403at atVar = this.f278052a;
        Boolean bool = (Boolean) obj;
        if (!((C23186f) atVar.f278110e.mo91439e()).mo28631l() && atVar.mo91432t()) {
            atVar.f278084D = bool.booleanValue();
            C90199e eVar = atVar.f278120o;
            boolean booleanValue = bool.booleanValue();
            boolean M = ((C84474e) atVar.f278125t.mo27525b()).mo78068M();
            boolean ay = ((C84474e) atVar.f278125t.mo27525b()).mo78111ay();
            C90203i iVar = (C90203i) C90206l.f251980f.createBuilder();
            C58833ax axVar = (C58833ax) eVar.f251967b.mo27525b();
            boolean z = false;
            boolean z2 = axVar.mo56113h() && ((C109029a) axVar.mo56107c()).mo97399d();
            ArrayList<C90208n> arrayList = new ArrayList<>();
            C90021c cVar = (C90021c) eVar.f251966a.mo27525b();
            boolean z3 = !cVar.mo79746e(C90110fh.f250604aB);
            if (!cVar.mo79746e(C90110fh.f250605aC) && z2 && !ay) {
                z = true;
            }
            arrayList.add(C90208n.INTERESTS_TAB);
            if (M) {
                arrayList.add(C90208n.COLLECTIONS_TAB);
                if (z3) {
                    arrayList.add(C90208n.SEARCH_TAB);
                }
            } else {
                if (z) {
                    arrayList.add(C90208n.UPDATES_TAB);
                }
                if (z3) {
                    arrayList.add(C90208n.SEARCH_TAB);
                }
                arrayList.add(C90208n.COLLECTIONS_TAB);
            }
            if (booleanValue) {
                arrayList.add(C90208n.TABS_TAB);
            }
            if (M && z) {
                arrayList.add(C90208n.UPDATES_TAB);
            }
            iVar.copyOnWrite();
            C90206l lVar = (C90206l) iVar.instance;
            C62961ch chVar = lVar.f251984c;
            if (!chVar.mo58948c()) {
                lVar.f251984c = C62942bv.mutableCopy(chVar);
            }
            for (C90208n nVar : arrayList) {
                lVar.f251984c.mo58916g(nVar.f251999l);
            }
            iVar.copyOnWrite();
            C90206l lVar2 = (C90206l) iVar.instance;
            lVar2.f251983b = ((C90208n) ((C58833ax) ((C23251a) atVar.f278110e.mo91441g()).f63720e).mo56107c()).f251999l;
            lVar2.f251982a |= 1;
            ((C23186f) atVar.f278110e.mo91439e()).mo28623d(C90198d.f251965a, C23245b.m43556a((C90206l) iVar.build()));
            atVar.mo91428p();
        }
    }
}
