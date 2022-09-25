package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8055c.p8056a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80212bf;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80229bw;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80230bx;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.p6355b.C81362h;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.p6355b.C81363i;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.p6355b.C81364j;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.p6355b.C81368n;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82486gz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82489hb;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82716pm;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82717pn;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82718po;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82719pp;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.p8055c.C103097o;
import com.google.common.base.C58835az;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.c.a.e */
/* compiled from: PG */
public final /* synthetic */ class C103059e implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C103076v f287681a;

    public /* synthetic */ C103059e(C103076v vVar) {
        this.f287681a = vVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C103076v vVar = this.f287681a;
        Set set = (Set) Collection.EL.stream(vVar.f287707d).filter(new C103058d(vVar, (C58495hd) obj)).collect(Collectors.toSet());
        C83305i iVar = vVar.f287708e;
        C82716pm c = C82717pn.m132233c();
        ((C82486gz) c).f225387b = "COORDINATOR_TRACKING_ACTIVE_USECASES_COUNT_" + set.size();
        iVar.mo75579d(c.mo76438a());
        C58490gz gzVar = new C58490gz(4);
        C58800sl lA = ((C58495hd) Collection.EL.stream(set).collect(C58370cn.m89403c(C103070p.f287695a, C103071q.f287696a, C103072r.f287697a))).entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            C58835az d = vVar.mo93596d((C80229bw) entry.getValue(), C58729pv.f156485a);
            C80248co b = ((C103097o) entry.getKey()).mo93607b();
            b.name();
            ((C80230bx) d.f156631a).name();
            C83305i iVar2 = vVar.f287708e;
            C82718po f = C82719pp.m132240f();
            f.mo76447b(b.name());
            ((C82489hb) f).f225395b = "TRIGGER_CONDITION_EVAL_".concat(String.valueOf(((C80230bx) d.f156631a).name()));
            iVar2.mo75579d(f.mo76446a());
            C80212bf bfVar = C80212bf.APP_USAGE;
            int ordinal = ((C80230bx) d.f156631a).ordinal();
            if (ordinal == 0) {
                ((C58970a) ((C58970a) C103076v.f287703a.mo56225c()).mo56372aa(21427)).mo56386p("Unknown trigger condition evaluation.");
            } else if (ordinal == 2) {
                vVar.mo93597e(b, (C80229bw) entry.getValue());
            } else if (ordinal == 3) {
                ((C58970a) ((C58970a) C103076v.f287703a.mo56226d()).mo56372aa(21426)).mo56389s("Usecase %s requiring no event signals are not handled yet.", b.name());
            }
            gzVar.mo55429h((C103097o) entry.getKey(), new C103047a((C80229bw) entry.getValue()));
        }
        C58495hd f2 = gzVar.mo55427f(false);
        C58480gp e = C58485gu.m89837e();
        C58800sl lA2 = f2.entrySet().iterator();
        while (lA2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) lA2.next();
            C81364j jVar = (C81364j) C81368n.f222701e.createBuilder();
            C80248co b2 = ((C103097o) entry2.getKey()).mo93607b();
            jVar.copyOnWrite();
            C81368n nVar = (C81368n) jVar.instance;
            nVar.f222706d = b2.f220171g;
            nVar.f222703a |= 1;
            C81362h hVar = (C81362h) C81363i.f222692d.createBuilder();
            C80229bw a = ((C103075u) entry2.getValue()).mo93587a();
            hVar.copyOnWrite();
            C81363i iVar3 = (C81363i) hVar.instance;
            a.getClass();
            iVar3.f222695b = a;
            iVar3.f222694a |= 1;
            jVar.copyOnWrite();
            C81368n nVar2 = (C81368n) jVar.instance;
            C81363i iVar4 = (C81363i) hVar.build();
            iVar4.getClass();
            nVar2.f222705c = iVar4;
            nVar2.f222704b = 1;
            e.mo55395g((C81368n) jVar.build());
        }
        C58485gu f3 = e.mo55394f();
        if (!f3.isEmpty()) {
            C90875ai.m148465b(C103056b.f287677a, vVar.f287705b.mo93593b(f3), vVar.f287706c, "[NGA] usecaseStore.updateStateForUsecases call finished.").mo85223a(C103066l.f287691a);
        }
    }
}
