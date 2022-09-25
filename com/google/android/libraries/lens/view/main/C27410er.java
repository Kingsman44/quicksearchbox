package com.google.android.libraries.lens.view.main;

import android.graphics.RectF;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.android.libraries.lens.view.frozenimage.C26275g;
import com.google.android.libraries.lens.view.gleam.region.C26616g;
import com.google.android.libraries.lens.view.p2078at.C25533p;
import com.google.android.libraries.lens.view.p2091bb.C25687a;
import com.google.android.libraries.lens.view.p2091bb.C25688b;
import com.google.android.libraries.lens.view.p2091bb.C25689c;
import com.google.android.libraries.lens.view.p2091bb.C25691e;
import com.google.android.libraries.lens.view.session.C27774bj;
import com.google.android.libraries.lens.view.session.C27778bn;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.lens.view.main.er */
/* compiled from: PG */
final class C27410er implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C27384dt f75047a;

    public C27410er(C27384dt dtVar) {
        this.f75047a = dtVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C27774bj bjVar;
        C58833ax axVar;
        C26616g gVar = (C26616g) bVar;
        C27384dt dtVar = this.f75047a;
        if (gVar.f72580a) {
            dtVar.f75001u.mo19974a(C37194a.f98414D);
        }
        dtVar.f74985e = !TextUtils.isEmpty((CharSequence) ((C58833ax) dtVar.f75005y.f73571e.mo3842a()).mo56106b(C27347cj.f74839a).mo56109e(BuildConfig.FLAVOR));
        C27327bq bqVar = dtVar.f74881C;
        C58833ax axVar2 = (C58833ax) dtVar.f75005y.f73571e.mo3842a();
        C24231w wVar = gVar.f72581b;
        if (!bqVar.f74767M.mo31769e().mo56113h()) {
            ((C59052c) ((C59052c) C27327bq.f74753a.mo56225c()).mo56372aa(49741)).mo56386p("region-search failed due to absent region");
        } else {
            if (wVar == C24231w.OBJECT) {
                bjVar = C27778bn.m51731c((RectF) bqVar.f74767M.mo31769e().mo56107c(), C58836b.f156633a, wVar, bqVar.f74769O.mo31474e());
            } else {
                if (bqVar.f74806k) {
                    axVar = (C58833ax) bqVar.f74816u.f74675h.mo3842a();
                } else {
                    C26275g gVar2 = (C26275g) bqVar.f74769O;
                    axVar = ((C58833ax) gVar2.f71411a.mo3842a()).mo56113h() ? ((C25533p) ((C58833ax) gVar2.f71411a.mo3842a()).mo56107c()).mo30571c() : C58836b.f156633a;
                }
                bjVar = C27778bn.m51733e(axVar, (RectF) bqVar.f74767M.mo31769e().mo56107c(), bqVar.f74769O.mo31474e());
            }
            bqVar.mo32887s(bjVar, axVar2);
            C25691e eVar = bqVar.f74786af;
            C25687a b = C25688b.m47362b();
            b.mo30792e((RectF) bqVar.f74767M.mo31769e().mo56107c());
            ((C25689c) b).f69830b = 4;
            eVar.mo30810l(b.mo30790c());
        }
        return C47392e.f123115a;
    }
}
