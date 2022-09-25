package com.google.android.libraries.lens.view.filters;

import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.libraries.lens.common.p1998a.C24095c;
import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.android.libraries.lens.view.filters.p2100d.C25972a;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.gleam.C26504ci;
import com.google.android.libraries.lens.view.gleam.C26505cj;
import com.google.android.libraries.lens.view.gleam.C26526dd;
import com.google.android.libraries.lens.view.gleam.C26603l;
import com.google.android.libraries.lens.view.main.C27288ae;
import com.google.android.libraries.lens.view.main.C27327bq;
import com.google.android.libraries.lens.view.main.C27383ds;
import com.google.android.libraries.lens.view.main.C27384dt;
import com.google.android.libraries.lens.view.main.C27437q;
import com.google.android.libraries.lens.view.p2090ba.C25686g;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26774z;
import com.google.android.libraries.lens.view.p2113h.p2132j.C26888c;
import com.google.android.libraries.lens.view.p2113h.p2132j.C26892g;
import com.google.android.libraries.lens.view.p2152n.C27453f;
import com.google.android.libraries.lens.view.p2152n.C27456i;
import com.google.android.libraries.lens.view.session.C27768bd;
import com.google.android.libraries.lens.view.session.C27769be;
import com.google.android.libraries.lens.view.session.C27770bf;
import com.google.android.libraries.lens.view.session.C27772bh;
import com.google.android.libraries.lens.view.session.C27774bj;
import com.google.android.libraries.lens.view.session.C27777bm;
import com.google.android.libraries.lens.view.session.C27778bn;
import com.google.android.libraries.lens.view.session.C27783c;
import com.google.android.libraries.lens.view.utils.C28099aa;
import com.google.android.libraries.lens.view.utils.C28120i;
import com.google.android.libraries.lens.view.vision.C28180v;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4552o.acl;
import com.google.common.p4552o.acp;
import com.google.common.p4552o.p4563i.C59870af;
import com.google.common.p4552o.p4563i.C59898bg;
import com.google.common.p4552o.p4563i.C59899bh;
import com.google.common.p4552o.p4563i.C59900bi;
import com.google.common.p4552o.p4563i.C59918c;
import com.google.common.p4552o.p4563i.C59961k;
import com.google.lens.p4707j.C62441br;
import com.google.lens.p4707j.C62488dk;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import com.google.protobuf.C62940bt;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.libraries.lens.view.filters.as */
/* compiled from: PG */
public final /* synthetic */ class C25912as implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C25916aw f70406a;

    public /* synthetic */ C25912as(C25916aw awVar) {
        this.f70406a = awVar;
    }

    public final void onClick(View view) {
        C27774bj bjVar;
        C58836b bVar;
        C27770bf bfVar;
        C27772bh bhVar;
        C25908ao aoVar = this.f70406a.f70418j;
        if (aoVar != null) {
            C26892g gVar = aoVar.f70381a.f70383b;
            if (gVar.f73310c.mo17428b() != C26774z.NO_OP) {
                C27383ds dsVar = aoVar.f70381a.f70400s;
                if (dsVar != null) {
                    dsVar.f74876a.f75001u.mo19974a(C37194a.f98639r);
                    C27384dt dtVar = dsVar.f74876a;
                    C27456i iVar = dtVar.f74885G;
                    C58833ax axVar = dtVar.f74951au;
                    if (iVar.f75112e && axVar.mo56113h()) {
                        iVar.f75109b.execute(new C27453f(iVar, axVar));
                    }
                    C27327bq bqVar = dtVar.f74881C;
                    bqVar.f74791ak = C58836b.f156633a;
                    if (!bqVar.f74770P.mo30525b() && bqVar.f74765K) {
                        C37215b bVar2 = bqVar.f74809n;
                        C37258g gVar2 = C37194a.f98436Z;
                        C62940bt btVar = C59898bg.f161867w;
                        C59870af afVar = (C59870af) C59898bg.f161866v.createBuilder();
                        C59961k a = ((C25972a) bqVar.f74810o.mo27525b()).mo31166a();
                        afVar.copyOnWrite();
                        C59898bg bgVar = (C59898bg) afVar.instance;
                        a.getClass();
                        bgVar.f161871c = a;
                        bgVar.f161869a |= 2;
                        bVar2.mo19974a(gVar2.mo40812e(btVar, (C59898bg) afVar.build()));
                        C58833ax c = (!bqVar.f74777W.mo31203a().mo31195l() || bqVar.mo32870C() || !((C58833ax) bqVar.f74790aj.f72479f.mo3842a()).mo56113h()) ? C58836b.f156633a : bqVar.f74808m.mo30769c(((Integer) ((C58833ax) bqVar.f74790aj.f72479f.mo3842a()).mo56107c()).intValue());
                        if (c.mo56113h()) {
                            C26505cj cjVar = bqVar.f74767M;
                            C26504ci ciVar = (C26504ci) c.mo56107c();
                            C26526dd ddVar = (C26526dd) cjVar;
                            if (ddVar.f72279B && ciVar.mo31763g() && ddVar.mo31806z(ciVar)) {
                                C58833ax a2 = C28120i.m52397a(ciVar.f72216j);
                                if (a2.mo56113h()) {
                                    C26603l lVar = ddVar.f72301k;
                                    lVar.getClass();
                                    lVar.mo31872d((String) a2.mo56107c());
                                } else {
                                    ((C58970a) ((C58970a) C26526dd.f72277a.mo56225c()).mo56372aa(49443)).mo56386p("Barcode gleam is missing object ID");
                                }
                            }
                        }
                        if (bqVar.mo32870C()) {
                            C27774bj f = bqVar.mo32875f(C24231w.FILTER_SHUTTER, false);
                            if (bqVar.f74806k) {
                                bqVar.mo32888t(f, C58836b.f156633a);
                                bjVar = f;
                            } else {
                                C27288ae aeVar = bqVar.f74816u;
                                C19559g.m37304c();
                                aeVar.mo32829f(true);
                                aeVar.mo32842s(C28099aa.m52378a(f, true), "selectForEduRegionSearchShutter", new C27437q(aeVar, f));
                                bjVar = f;
                            }
                        } else {
                            if (c.mo56113h()) {
                                C26504ci ciVar2 = (C26504ci) c.mo56107c();
                                C58833ax f2 = C27778bn.m51734f(ciVar2, bqVar.f74770P.mo30525b(), bqVar.f74777W.f70642a.f70649b, bqVar.f74805j, false);
                                if (f2.mo56113h()) {
                                    bhVar = (C27777bm) f2.mo56107c();
                                } else {
                                    C62441br a3 = C28180v.m52673a(ciVar2.f72215i, ciVar2.f72218l);
                                    C62488dk dkVar = ciVar2.f72216j.f150142e;
                                    if (dkVar == null) {
                                        dkVar = C62488dk.f168699d;
                                    }
                                    bhVar = C27778bn.m51729a(C24095c.m44758c(C24095c.m44764i(dkVar, a3)), ciVar2, C24231w.RETICLE_SELECTION, bqVar.f74770P.mo30525b());
                                }
                                if (bhVar instanceof C27774bj) {
                                    bqVar.mo32888t((C27774bj) bhVar, C58836b.f156633a);
                                    bjVar = bhVar;
                                } else {
                                    bVar = C58836b.f156633a;
                                    bfVar = bhVar;
                                }
                            } else if (bqVar.f74777W.mo31203a().mo31196m()) {
                                RectF c2 = bqVar.f74790aj.mo31851c();
                                C27769be g = C27770bf.m51660g();
                                ((C27783c) g).f75789a = c2;
                                g.mo33249c();
                                g.mo33252f(false);
                                g.mo33251e(C24231w.RETICLE_SELECTION);
                                C27770bf g2 = g.mo33253g();
                                bqVar.f74792al = C58833ax.m90834k(g2.mo33255b());
                                bVar = C58836b.f156633a;
                                bfVar = g2;
                            } else {
                                bqVar.mo32889u(C27768bd.m51651a(false, C24231w.FILTER_SHUTTER), C58836b.f156633a);
                            }
                            bqVar.mo32889u(bfVar, bVar);
                            bjVar = bfVar;
                        }
                        bqVar.mo32893y(bjVar);
                    }
                    C25928bg bgVar2 = aoVar.f70381a.f70394m;
                    if (bgVar2.f70435f) {
                        if (bgVar2.f70430a.getVisibility() == 8) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bgVar2.f70430a.getLayoutParams();
                            int i = layoutParams.width;
                            int i2 = layoutParams.height;
                            layoutParams.width = 0;
                            layoutParams.height = 0;
                            bgVar2.f70430a.setVisibility(0);
                            C28443m mVar = bgVar2.f70439j;
                            C28442l a4 = C28442l.m53142h().mo33894a();
                            View view2 = bgVar2.f70430a;
                            view2.getClass();
                            mVar.mo33853c(a4, C28485y.m53234a(view2));
                            bgVar2.f70430a.setVisibility(8);
                            layoutParams.width = i;
                            layoutParams.height = i2;
                            bgVar2.f70430a.setLayoutParams(layoutParams);
                        } else {
                            C28443m mVar2 = bgVar2.f70439j;
                            C28442l a5 = C28442l.m53142h().mo33894a();
                            View view3 = bgVar2.f70430a;
                            view3.getClass();
                            mVar2.mo33853c(a5, C28485y.m53234a(view3));
                        }
                    }
                    bgVar2.f70431b.mo30355k(false);
                    aoVar.f70381a.f70395n.performHapticFeedback(1);
                    C25909ap apVar = aoVar.f70381a;
                    C25980d dVar = apVar.f70384c.f70642a.f70649b;
                    C59918c cVar = (C59918c) C59961k.f162053f.createBuilder();
                    C56306df b = dVar.mo31199b();
                    cVar.copyOnWrite();
                    C59961k kVar = (C59961k) cVar.instance;
                    kVar.f162058d = b.f150068m;
                    kVar.f162055a |= 1;
                    C59961k kVar2 = (C59961k) cVar.build();
                    acl acl = (acl) acp.f158315e.createBuilder();
                    acl.copyOnWrite();
                    acp acp = (acp) acl.instance;
                    acp.f158318b = 8;
                    acp.f158317a |= 1;
                    acl.copyOnWrite();
                    acp acp2 = (acp) acl.instance;
                    acp2.f158319c = 1;
                    acp2.f158317a |= 2;
                    acp acp3 = (acp) acl.build();
                    C28443m mVar3 = apVar.f70388g;
                    C28440j h = C28442l.m53142h();
                    C59899bh bhVar2 = (C59899bh) C59900bi.f161890j.createBuilder();
                    bhVar2.copyOnWrite();
                    C59900bi biVar = (C59900bi) bhVar2.instance;
                    kVar2.getClass();
                    biVar.f161894b = kVar2;
                    biVar.f161893a |= 2;
                    bhVar2.copyOnWrite();
                    C59900bi biVar2 = (C59900bi) bhVar2.instance;
                    acp3.getClass();
                    biVar2.f161895c = acp3;
                    biVar2.f161893a |= 4;
                    h.mo33895b(new C28441k(C25686g.f69826b, (C59900bi) bhVar2.build()));
                    mVar3.mo33853c(h.mo33894a(), C28485y.m53234a(view));
                    return;
                }
                return;
            }
            AccountId accountId = gVar.f73308a;
            C26888c cVar2 = new C26888c();
            C68324h.m98669f(cVar2);
            C47247a.m84047b(cVar2, accountId);
            cVar2.showNow(gVar.f73309b.getChildFragmentManager(), "NO_CAMERA_DIALOG");
        }
    }
}
