package com.google.android.libraries.lens.view.main;

import android.support.p031v4.app.Fragment;
import com.google.android.libraries.lens.view.infopanel.C27073c;
import com.google.android.libraries.lens.view.infopanel.C27195m;
import com.google.android.libraries.lens.view.p2078at.p2079a.p2080a.C25483a;
import com.google.android.libraries.lens.view.p2078at.p2079a.p2080a.C25486d;
import com.google.android.libraries.lens.view.weblrp.C28188c;
import com.google.android.libraries.lens.view.weblrp.C28191f;
import com.google.android.libraries.lens.view.weblrp.C28195j;
import com.google.android.libraries.lens.view.weblrp.C28201o;
import com.google.android.libraries.lens.view.weblrp.C28202p;
import com.google.android.libraries.web.base.C43255f;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.p3353c.C43316a;
import com.google.android.libraries.web.p3353c.C43323b;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.libraries.lens.view.main.fb */
/* compiled from: PG */
final class C27421fb implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C27384dt f75060a;

    public C27421fb(C27384dt dtVar) {
        this.f75060a = dtVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C28188c cVar = (C28188c) bVar;
        C27384dt dtVar = this.f75060a;
        Fragment c = dtVar.f74987g.getChildFragmentManager().f634a.mo671c("info_panel_fragment");
        if (c != null) {
            C28201o d = ((C27073c) c).mo17754z().mo32625d();
            if (d != null) {
                C28191f a = d.mo17754z().mo33715a();
                if (a != null) {
                    C28195j f = a.mo17754z();
                    C58833ax b = f.mo33712b();
                    if (b.mo56113h()) {
                        C43262m mVar = f.f76738l;
                        C43255f m = C43257h.m76306m((String) b.mo56107c());
                        C43316a aVar = (C43316a) C43323b.f113174a.createBuilder();
                        C62940bt btVar = C25486d.f69438f;
                        C25483a aVar2 = (C25483a) C25486d.f69437e.createBuilder();
                        aVar2.copyOnWrite();
                        C25486d dVar = (C25486d) aVar2.instance;
                        dVar.f69443d = 4;
                        dVar.f69440a = 4 | dVar.f69440a;
                        aVar.mo58885m(btVar, (C25486d) aVar2.build());
                        m.mo46343d((C43323b) aVar.build());
                        mVar.mo46333b(m.mo46365k());
                        return C47392e.f123115a;
                    }
                } else {
                    ((C59052c) ((C59052c) C28202p.f76762a.mo56226d()).mo56372aa(50329)).mo56386p("Failed to trigger blessing, no WebLrpFragment found");
                }
            } else {
                ((C58970a) ((C58970a) C27195m.f74328a.mo56226d()).mo56372aa(49508)).mo56386p("Failed to trigger blessing, webLrpRootFragment not found");
            }
        }
        dtVar.mo32863m("HTML data is not present, trigger a query that generates HTML first");
        return C47392e.f123115a;
    }
}
