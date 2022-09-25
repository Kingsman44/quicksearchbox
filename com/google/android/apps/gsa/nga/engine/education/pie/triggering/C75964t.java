package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.apps.gsa.nga.engine.education.pie.C75762a;
import com.google.android.apps.gsa.nga.engine.education.pie.C75866e;
import com.google.android.apps.gsa.nga.engine.education.pie.C75909j;
import com.google.android.apps.gsa.nga.engine.education.pie.C75910k;
import com.google.android.apps.gsa.nga.engine.education.pie.C75911l;
import com.google.android.apps.gsa.nga.engine.education.pie.C75912m;
import com.google.android.apps.gsa.nga.engine.education.pie.C75913n;
import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75774c;
import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75778g;
import com.google.android.apps.gsa.nga.engine.education.pie.p6022d.C75864b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80197ar;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80203ax;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80219bm;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80236cc;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80268w;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80269x;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80270y;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80271z;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81344a;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81374h;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81376j;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81377k;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81380n;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81381o;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82483gw;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82713pj;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82714pk;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.t */
/* compiled from: PG */
public final class C75964t implements C75909j, C75864b {

    /* renamed from: a */
    public final Context f210755a;

    /* renamed from: b */
    private final C75910k f210756b;

    /* renamed from: c */
    private final C81376j f210757c;

    /* renamed from: d */
    private final C75911l f210758d;

    /* renamed from: e */
    private final C75866e f210759e;

    /* renamed from: f */
    private final C91142g f210760f;

    /* renamed from: g */
    private final C83305i f210761g;

    public C75964t(Context context, C75910k kVar, C81376j jVar, C75911l lVar, C75866e eVar, C91142g gVar, C83305i iVar) {
        this.f210755a = context;
        this.f210756b = kVar;
        this.f210757c = jVar;
        this.f210758d = lVar;
        this.f210759e = eVar;
        this.f210760f = gVar;
        this.f210761g = iVar;
    }

    /* renamed from: c */
    public final void mo71916c(C80203ax axVar) {
        int i;
        C80197ar arVar;
        C80219bm bmVar;
        if (axVar.f220049a == 8) {
            C80236cc ccVar = (C80236cc) axVar.f220050b;
            boolean z = false;
            if (this.f210760f.mo85405j(C90126fx.f251662mz)) {
                Bundle bundle = new Bundle();
                C81377k.m129445c(bundle, C80267v.GENERIC_TRY_SAYING);
                C81377k.m129446d(bundle, C80248co.MAPS_EDUCATION_USECASE);
                C75778g.m122142e(bundle, this.f210755a.getString(R.string.nga_pie_simple_maps_education_query), 1);
                try {
                    if (ccVar.f220126a != 2) {
                        C81344a j = C81374h.m129431j();
                        j.f222639a = bundle;
                        j.mo75017g(R.string.nga_pie_notification_simple_maps_education_title);
                        j.mo75013c(R.string.nga_pie_notification_simple_maps_education_description);
                        j.f222641c = 13;
                        j.mo75014d(this.f210760f.mo85405j(C90126fx.f251390hs));
                        this.f210757c.mo71958a(j.mo75011a(), 1);
                        return;
                    }
                    C81380n d = C81381o.m129461d();
                    d.mo75045d(13);
                    d.mo75044c(C80267v.GENERIC_TRY_SAYING);
                    d.mo75043b(C80265t.TRIGGER_INVALID_REQUEST);
                    throw d.mo75042a();
                } catch (C81381o e) {
                    this.f210758d.mo71913b(e, false);
                }
            } else {
                C58485gu guVar = (C58485gu) Collection.EL.stream(C58485gu.m89849q(Pair.create(Integer.valueOf(R.string.nga_pie_maps_education_query_0_title), Integer.valueOf(R.string.nga_pie_maps_education_query_0_query)), Pair.create(Integer.valueOf(R.string.nga_pie_maps_education_query_1_title), Integer.valueOf(R.string.nga_pie_maps_education_query_1_query)), Pair.create(Integer.valueOf(R.string.nga_pie_maps_education_query_2_title), Integer.valueOf(R.string.nga_pie_maps_education_query_2_query)), Pair.create(Integer.valueOf(R.string.nga_pie_maps_education_query_3_title), Integer.valueOf(R.string.nga_pie_maps_education_query_3_query)))).map(new C75961q(this)).map(C75962r.f210754a).collect(C58370cn.f155946a);
                if (ccVar.f220126a == 2) {
                    i = 0;
                    for (int i2 = 0; i2 < guVar.size(); i2++) {
                        int hashCode = ((C80271z) ((C80270y) guVar.get(i2)).instance).f220277c.hashCode();
                        if (ccVar.f220126a == 2) {
                            bmVar = (C80219bm) ccVar.f220127b;
                        } else {
                            bmVar = C80219bm.f220092c;
                        }
                        if (hashCode == bmVar.f220095b) {
                            i = i2;
                        }
                    }
                } else {
                    i = 0;
                }
                C80268w wVar = (C80268w) C80269x.f220270b.createBuilder();
                for (int i3 = 0; i3 < guVar.size(); i3++) {
                    if (i3 != i) {
                        wVar.mo74298a((C80270y) guVar.get(i3));
                    }
                }
                C75955n nVar = new C75955n(((C80271z) ((C80270y) guVar.get(i)).instance).f220277c, (C80269x) wVar.build());
                Bundle bundle2 = new Bundle();
                C81377k.m129445c(bundle2, C80267v.APP_EDUCATION);
                C81377k.m129446d(bundle2, C80248co.MAPS_EDUCATION_USECASE);
                C75774c.m122132e(bundle2, nVar.f210745a, nVar.f210746b, ccVar.f220126a == 2);
                boolean j2 = this.f210760f.mo85405j(C90126fx.f251390hs);
                try {
                    if (ccVar.f220126a == 2) {
                        if (this.f210760f.mo85405j(C90126fx.f251660mx)) {
                            bundle2 = new Bundle();
                            C81377k.m129445c(bundle2, C80267v.GENERIC_TRY_SAYING);
                            C81377k.m129446d(bundle2, C80248co.MAPS_EDUCATION_USECASE);
                            C75778g.m122142e(bundle2, nVar.f210745a, 2);
                        }
                        C75866e eVar = this.f210759e;
                        C75912m f = C75913n.m122414f(14);
                        f.mo71871b(C80248co.MAPS_EDUCATION_USECASE);
                        ((C75762a) f).f210252c = nVar.f210745a;
                        eVar.mo71904b(bundle2, f.mo71870a());
                        return;
                    }
                    C81344a j3 = C81374h.m129431j();
                    j3.f222639a = bundle2;
                    j3.mo75017g(R.string.nga_pie_notification_maps_education_title);
                    j3.mo75013c(R.string.nga_pie_notification_maps_education_description);
                    j3.f222641c = 13;
                    if (ccVar.f220126a == 1) {
                        arVar = (C80197ar) ccVar.f220127b;
                    } else {
                        arVar = C80197ar.f220024c;
                    }
                    j3.mo75015e(arVar.f220027b);
                    j3.mo75014d(j2);
                    this.f210757c.mo71958a(j3.mo75011a(), 1);
                    C83305i iVar = this.f210761g;
                    C82713pj f2 = C82714pk.m132222f();
                    ((C82483gw) f2).f225378b = "NOTIFICATION_SHOWN";
                    f2.mo76428b(j2);
                    iVar.mo75579d(f2.mo76427a());
                } catch (C81381o e2) {
                    C75911l lVar = this.f210758d;
                    if (ccVar.f220126a == 2) {
                        z = true;
                    }
                    lVar.mo71913b(e2, z);
                    if (ccVar.f220126a != 2) {
                        C83305i iVar2 = this.f210761g;
                        C82713pj f3 = C82714pk.m132222f();
                        ((C82483gw) f3).f225378b = "NOTIFICATION_FAILED_TO_SHOW_".concat(String.valueOf(e2.mo75046a().name()));
                        f3.mo76428b(j2);
                        iVar2.mo75579d(f3.mo76427a());
                    }
                }
            }
        }
    }

    /* renamed from: gH */
    public final C60870cx mo71906gH() {
        this.f210756b.mo71909a(this);
        return C118826c.f331423b;
    }

    /* renamed from: gI */
    public final void mo71907gI() {
        this.f210756b.mo71911c(this);
    }
}
