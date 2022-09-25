package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114758l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.cg */
/* compiled from: PG */
public final /* synthetic */ class C115030cg implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C115031ch f319292a;

    public /* synthetic */ C115030cg(C115031ch chVar) {
        this.f319292a = chVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C115031ch chVar = this.f319292a;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(chVar.f319294b).inflate(R.layout.horizontal_stacked_cards_section_view, (ViewGroup) null);
        if (chVar.f319295c.size() == 1) {
            linearLayout.findViewById(R.id.zero_state_horizontal_one_card).setVisibility(0);
            linearLayout.findViewById(R.id.zero_state_horizontal_left_card).setVisibility(8);
            linearLayout.findViewById(R.id.zero_state_horizontal_right_card).setVisibility(8);
            chVar.mo101820h((C114758l) chVar.f319295c.get(0), 3, linearLayout);
        } else if (chVar.f319295c.size() == 2) {
            linearLayout.findViewById(R.id.zero_state_horizontal_one_card).setVisibility(8);
            linearLayout.findViewById(R.id.zero_state_horizontal_left_card).setVisibility(0);
            linearLayout.findViewById(R.id.zero_state_horizontal_right_card).setVisibility(0);
            chVar.mo101820h((C114758l) chVar.f319295c.get(0), 1, linearLayout);
            chVar.mo101820h((C114758l) chVar.f319295c.get(1), 2, linearLayout);
        } else {
            C59104x d = C115031ch.f319293a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HorizontalStackCardsSC");
            ((C59052c) ((C59052c) d).mo56372aa(29505)).mo56387q("HorizontalStackedCardSection only support two ZeroStateSectionData, but the datalist has %d sectionData", chVar.f319295c.size());
        }
        C28292j jVar = new C28292j(61853);
        jVar.f76976d = true;
        chVar.f319297e = C28293k.m52907d(jVar, chVar.f319296d);
        linearLayout.getClass();
        C28295m.m52919e(linearLayout, jVar);
        return linearLayout;
    }
}
