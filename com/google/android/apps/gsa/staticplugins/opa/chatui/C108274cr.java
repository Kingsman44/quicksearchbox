package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.view.View;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.shared.p6928f.C87545a;
import com.google.android.apps.gsa.search.shared.p6928f.C87546b;
import com.google.android.apps.gsa.search.shared.p6928f.C87552h;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105923ad;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105937ar;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105938as;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105952bf;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.cr */
/* compiled from: PG */
public final /* synthetic */ class C108274cr implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C108303dt f301224a;

    public /* synthetic */ C108274cr(C108303dt dtVar) {
        this.f301224a = dtVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C105930ak akVar;
        C105923ad adVar;
        C108303dt dtVar = this.f301224a;
        Integer num = (Integer) obj;
        synchronized (dtVar) {
            num.getClass();
            dtVar.f301287r = num.intValue();
            ((C105952bf) dtVar.f301271b.mo27525b()).f295819o = dtVar.f301293x;
            dtVar.f301289t = C108296dm.LOADING;
            dtVar.mo96752o(0, 11);
            C22872h.m42743c(C0826b.class);
            if (dtVar.f301282m == null && (akVar = ((C105952bf) dtVar.f301271b.mo27525b()).f295818n) != null) {
                C108267ck ckVar = dtVar.f301292w;
                if (ckVar != null) {
                    if (akVar.f295757b == 14) {
                        adVar = (C105923ad) akVar.f295758c;
                    } else {
                        adVar = C105923ad.f295736c;
                    }
                    C87546b bVar = ckVar.f301187b;
                    ArrayList arrayList = null;
                    if (bVar != null) {
                        C54201r rVar = adVar.f295739b;
                        if (rVar == null) {
                            rVar = C54201r.f142243f;
                        }
                        if ((rVar.f142245a & 1) != 0) {
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                C54201r rVar2 = adVar.f295739b;
                                if (rVar2 == null) {
                                    rVar2 = C54201r.f142243f;
                                }
                                C87545a a = bVar.mo77519a(rVar2.toByteArray());
                                if (a != null) {
                                    if (a.mo25098kH() != null) {
                                        View kH = a.mo25098kH();
                                        kH.getClass();
                                        C108212aj ajVar = new C108212aj(kH, 4);
                                        ajVar.f301034p = 2;
                                        arrayList2.add(ajVar);
                                        String string = ckVar.f301189d.getResources().getString(R.string.history_carousel_background_text);
                                        C91097g gVar = ckVar.f301188c;
                                        gVar.getClass();
                                        C108204ab abVar = new C108204ab(string, gVar);
                                        abVar.f301034p = 2;
                                        arrayList2.add(abVar);
                                    }
                                }
                                arrayList = arrayList2;
                            } catch (C87552h e) {
                                C59104x c = C108267ck.f301186a.mo56225c();
                                c.mo56378ag(C58975e.f156826a, "HistoryElementBuilder");
                                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(23953)).mo56386p("Invalid RenderedCard data.");
                            }
                        }
                    }
                    dtVar.f301282m = arrayList;
                }
            }
            if (!dtVar.f301276g.mo79746e(C90014bt.f247461hb) && !dtVar.f301276g.mo79746e(C90014bt.f247059X)) {
                C105952bf bfVar = (C105952bf) dtVar.f301271b.mo27525b();
                new C90873ag(bfVar.mo95189b(), bfVar.f295806b, "HistoryStore#syncClientAndServerDeletions", new C105937ar(bfVar)).mo85223a(C105938as.f295776a);
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        dtVar.f301286q.mo57356n(C118826c.f331422a);
    }
}
