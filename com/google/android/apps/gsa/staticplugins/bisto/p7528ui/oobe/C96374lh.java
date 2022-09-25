package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.lh */
/* compiled from: PG */
public final /* synthetic */ class C96374lh implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96381lo f269629a;

    public /* synthetic */ C96374lh(C96381lo loVar) {
        this.f269629a = loVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96381lo loVar = this.f269629a;
        Exception exc = (Exception) obj;
        if (loVar.getContext() != null) {
            C58976aa aaVar = C58975e.f156826a;
            ((C95299e) loVar.f269603D.mo27525b()).f266647b.mo57066b("TOS_Error");
            loVar.f269649m.setVisibility(8);
            if (loVar.mo90101j()) {
                ((C95299e) loVar.f269603D.mo27525b()).f266647b.mo57066b("TOS_Offline");
                ViewGroup viewGroup = (ViewGroup) loVar.f269648l.findViewById(R.id.tos_welcome_offline_container_inner);
                if (loVar.mo90101j()) {
                    loVar.mo90099h(viewGroup, R.string.tos_warm_hero_1, R.drawable.tos_welcome_offline_headphones_1);
                    loVar.mo90099h(viewGroup, R.string.tos_warm_hero_2, R.drawable.tos_welcome_offline_headphones_2);
                    loVar.mo90099h(viewGroup, R.string.tos_warm_hero_3, R.drawable.tos_welcome_offline_headphones_3);
                }
                loVar.f269650n.setVisibility(8);
                ((ViewGroup) loVar.f269648l.findViewById(R.id.tos_welcome_offline_container_outer)).setVisibility(0);
                loVar.f269651o = -1;
                loVar.mo90100i();
            }
        }
    }
}
