package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.view.View;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.common.p4552o.p4563i.C59870af;
import com.google.common.p4552o.p4563i.C59881aq;
import com.google.common.p4552o.p4563i.C59883as;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.s */
/* compiled from: PG */
public final /* synthetic */ class C26192s implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C26193t f71172a;

    /* renamed from: b */
    public final /* synthetic */ C26136ae f71173b;

    public /* synthetic */ C26192s(C26193t tVar, C26136ae aeVar) {
        this.f71172a = tVar;
        this.f71173b = aeVar;
    }

    public final void onClick(View view) {
        C26193t tVar = this.f71172a;
        C26136ae aeVar = this.f71173b;
        C26197x xVar = tVar.f71174a;
        xVar.f71188l = aeVar.mo31368h();
        xVar.mo31421d();
        if (xVar.f71189m.mo56113h()) {
            C59881aq aqVar = (C59881aq) C59883as.f161820b.createBuilder();
            if (C26197x.m48358a(aeVar.mo31366f(), xVar.f71189m) >= 0) {
                aqVar.mo57060a(2);
            }
            if (C26197x.m48358a(aeVar.mo31367g(), xVar.f71189m) >= 0) {
                aqVar.mo57060a(3);
            }
            C59870af afVar = (C59870af) C59898bg.f161866v.createBuilder();
            afVar.copyOnWrite();
            C59898bg bgVar = (C59898bg) afVar.instance;
            C59883as asVar = (C59883as) aqVar.build();
            asVar.getClass();
            bgVar.f161880l = asVar;
            bgVar.f161869a |= 1024;
            C37215b bVar = xVar.f71180d;
            C37252a i = C37194a.f98503bM.mo40815i(C62722b.OK);
            ((C37253b) i).mo40792p(C59898bg.f161867w, (C59898bg) afVar.build());
            bVar.mo19974a(i);
        }
        xVar.f71180d.mo19974a(C37194a.f98501bK.mo40815i(C62722b.OK));
        xVar.f71178b.mo31391a(aeVar.mo31368h());
    }
}
