package com.google.android.libraries.lens.view.main;

import androidx.lifecycle.C2333ah;
import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26971g;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26973i;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26980p;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26982r;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.lens.view.main.cs */
/* compiled from: PG */
public final /* synthetic */ class C27356cs implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C27384dt f74848a;

    public /* synthetic */ C27356cs(C27384dt dtVar) {
        this.f74848a = dtVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        boolean z;
        C27384dt dtVar = this.f74848a;
        C58833ax axVar = (C58833ax) obj;
        if (dtVar.f74946ap && axVar.mo56113h()) {
            C27327bq bqVar = dtVar.f74881C;
            boolean z2 = false;
            if (bqVar.f74807l) {
                z = ((Boolean) ((C58833ax) bqVar.f74816u.f74675h.mo3842a()).mo56106b(C27300aq.f74710a).mo56109e(false)).booleanValue();
            } else {
                z = bqVar.f74791ak.mo56113h();
            }
            if (z && dtVar.f74985e) {
                z2 = true;
            }
            if (!((C26982r) axVar.mo56107c()).mo32428b().isEmpty()) {
                dtVar.f75005y.mo32445l();
                axVar.mo56107c();
                dtVar.f74881C.mo32891w(C58833ax.m90834k((C26982r) axVar.mo56107c()), C24231w.MULTIMODAL);
            } else if (z2) {
                dtVar.f75005y.mo32445l();
                dtVar.f74881C.mo32891w(C58836b.f156633a, C24231w.MULTIMODAL_SELECTION_CLEAR);
            } else {
                C26980p pVar = dtVar.f75005y;
                C26973i iVar = pVar.f73574h;
                if (iVar != null) {
                    C26971g a = iVar.mo32411a();
                    a.mo32397e(C58833ax.m90834k(true));
                    C26973i a2 = a.mo32393a();
                    if (!a2.equals(pVar.f73573g)) {
                        pVar.f73573g = a2;
                        pVar.mo32439f();
                    }
                }
            }
        }
    }
}
