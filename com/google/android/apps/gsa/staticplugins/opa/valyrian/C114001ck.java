package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.support.p033v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108325en;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108451je;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114095a;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114096aa;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.C114156z;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.ValyrianRecyclerView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ck */
/* compiled from: PG */
final class C114001ck implements C22869e {

    /* renamed from: a */
    final /* synthetic */ C114071eg f315642a;

    public C114001ck(C114071eg egVar) {
        this.f315642a = egVar;
    }

    public final void run() {
        int i;
        int i2;
        C108451je jeVar;
        C114071eg egVar = this.f315642a;
        C108262cf cfVar = (C108262cf) egVar.f315859aq.mo101127j(C108230ba.f301015c);
        if (cfVar == null || !(cfVar.f301167H == ((int) egVar.f315982r.mo79743a(C90029ch.f248309x)) || cfVar.f301171L == 2)) {
            this.f315642a.f315898bh = ((FrameLayout) this.f315642a.f315986v.findViewById(R.id.valyrian_chat_ui_root)).getHeight();
            C114071eg egVar2 = this.f315642a;
            ValyrianRecyclerView valyrianRecyclerView = egVar2.f315866ax;
            valyrianRecyclerView.getClass();
            egVar2.f315896bf = valyrianRecyclerView.getMinimumHeight();
            C114071eg egVar3 = this.f315642a;
            ValyrianRecyclerView valyrianRecyclerView2 = egVar3.f315866ax;
            valyrianRecyclerView2.getClass();
            egVar3.f315897bg = valyrianRecyclerView2.f316112b;
            valyrianRecyclerView2.setMinimumHeight(egVar3.f315898bh);
            C114071eg egVar4 = this.f315642a;
            if (!egVar4.f315901bk || (egVar4.f315859aq.mo95351a() == 1 && (this.f315642a.f315859aq.mo95353c() instanceof C108451je))) {
                C114071eg egVar5 = this.f315642a;
                ValyrianRecyclerView valyrianRecyclerView3 = egVar5.f315866ax;
                valyrianRecyclerView3.getClass();
                valyrianRecyclerView3.f316112b = egVar5.f315981q.getResources().getDimensionPixelSize(R.dimen.chatui_loading_suggestion_chip_initial_height_cap);
            } else {
                C114071eg egVar6 = this.f315642a;
                ValyrianRecyclerView valyrianRecyclerView4 = egVar6.f315866ax;
                valyrianRecyclerView4.getClass();
                valyrianRecyclerView4.f316112b = egVar6.f315898bh;
            }
            this.f315642a.mo101010br();
        }
        if (!this.f315642a.mo100907df() && (jeVar = (C108451je) this.f315642a.f315859aq.mo101127j(C108230ba.f301013a)) != null) {
            int e = this.f315642a.f315859aq.mo101122e(C108230ba.f301014b);
            jeVar.f301664f = true;
            this.f315642a.mo101018cR();
            this.f315642a.f315859aq.mo95354d(e);
        }
        C114071eg egVar7 = this.f315642a;
        if (!egVar7.f315895be.isEmpty()) {
            if (egVar7.f315901bk && (i2 = egVar7.f315898bh) > 0) {
                egVar7.mo101040dt(i2, i2);
            }
            egVar7.mo101017cH(0);
            if (egVar7.f315982r.mo79746e(C90029ch.f248233aT) && egVar7.f315859aq.mo101122e(C108230ba.f301016d) < 0) {
                int a = egVar7.f315859aq.mo95351a() - 1;
                C108232bc c = egVar7.f315859aq.mo95353c();
                if (a >= 0 && (c instanceof C108262cf) && ((C108262cf) c).f301168I) {
                    while (true) {
                        a--;
                        if (a >= 0) {
                            C108232bc b = egVar7.f315859aq.mo95352b(a);
                            if (b instanceof C108262cf) {
                                C108262cf cfVar2 = (C108262cf) b;
                                if (cfVar2.f301167H == ((int) egVar7.f315982r.mo79743a(C90029ch.f248309x)) || cfVar2.f301171L == 2) {
                                    return;
                                }
                            }
                        } else {
                            int dimensionPixelSize = (egVar7.f315898bh - egVar7.f315981q.getResources().getDimensionPixelSize(R.dimen.chatui_loading_card_offset)) / egVar7.f315981q.getResources().getDimensionPixelSize(R.dimen.chatui_loading_card_height);
                            int dimensionPixelSize2 = (egVar7.f315898bh - (egVar7.f315981q.getResources().getDimensionPixelSize(R.dimen.chatui_loading_suggestion_chip_compute_card_height) * dimensionPixelSize)) - egVar7.f315981q.getResources().getDimensionPixelSize(R.dimen.chatui_suggestion_carousel_min_height);
                            if (egVar7.f315901bk) {
                                i = egVar7.f315981q.getResources().getDimensionPixelSize(R.dimen.chatui_loading_suggestion_chip_offset);
                            } else {
                                i = egVar7.f315981q.getResources().getDimensionPixelSize(R.dimen.chatui_loading_suggestion_chip_initial_offset);
                            }
                            int i3 = dimensionPixelSize2 - i;
                            ViewGroup viewGroup = egVar7.f315818aB;
                            int height = i3 - ((viewGroup == null || viewGroup.getVisibility() != 0) ? 0 : egVar7.f315818aB.getHeight());
                            for (int i4 = 0; i4 < dimensionPixelSize; i4++) {
                                egVar7.f315859aq.mo101133p(new C108325en());
                            }
                            RecyclerView recyclerView = egVar7.f315850ah.f301565l;
                            if (recyclerView == null || recyclerView.getVisibility() != 0) {
                                C108325en enVar = new C108325en();
                                enVar.f301332a = true;
                                enVar.f301333b = height;
                                egVar7.f315859aq.mo101133p(enVar);
                            }
                            C114095a aVar = egVar7.f315859aq;
                            aVar.getClass();
                            ValyrianRecyclerView valyrianRecyclerView5 = egVar7.f315866ax;
                            valyrianRecyclerView5.getClass();
                            egVar7.f315900bj = new C114096aa(aVar, valyrianRecyclerView5, egVar7.f315815Y);
                            C114096aa aaVar = egVar7.f315900bj;
                            if (aaVar != null) {
                                aaVar.f316185g = aaVar.f316186h.mo28208h("onShimmeringAnimationDelayedShow", 500, new C114156z(aaVar));
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }
}
