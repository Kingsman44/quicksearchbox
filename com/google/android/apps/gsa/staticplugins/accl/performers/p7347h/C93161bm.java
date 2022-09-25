package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90882ap;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107505a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107555d;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107556e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107515ai;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107516aj;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107517ak;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107532k;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107535n;
import com.google.android.libraries.gsa.conversation.clientop.C22407c;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1852f.C22585l;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.assistant.p3897e.p3921j.afd;
import com.google.assistant.p3897e.p3921j.afh;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.bm */
/* compiled from: PG */
final class C93161bm extends C90882ap {

    /* renamed from: a */
    final /* synthetic */ afd f259832a;

    /* renamed from: b */
    final /* synthetic */ C22434e f259833b;

    /* renamed from: c */
    final /* synthetic */ C93162bn f259834c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93161bm(C93162bn bnVar, afd afd, C22434e eVar) {
        super("Send SHOW_MESSAGE_CAROUSEL service event", 0);
        this.f259834c = bnVar;
        this.f259832a = afd;
        this.f259833b = eVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        afh afh;
        int i;
        Boolean bool;
        boolean z;
        afh afh2;
        List list = (List) obj;
        C93162bn bnVar = this.f259834c;
        afd afd = this.f259832a;
        if (afd.f134992a == 3) {
            afh = (afh) afd.f134993b;
        } else {
            afh = afh.f134999c;
        }
        if ((afh.f135001a & 1) != 0) {
            afd afd2 = this.f259832a;
            if (afd2.f134992a == 3) {
                afh2 = (afh) afd2.f134993b;
            } else {
                afh2 = afh.f134999c;
            }
            i = afh2.f135002b;
        } else {
            i = Integer.MAX_VALUE;
        }
        HashSet hashSet = new HashSet(this.f259832a.f134994c);
        C22434e eVar = this.f259833b;
        ArrayList arrayList = new ArrayList();
        for (aco aco : bnVar.f259839e.mo77883a(list, false)) {
            int i2 = aco.f134824b;
            C107532k kVar = (C107532k) C107535n.f299173f.createBuilder();
            kVar.copyOnWrite();
            C107535n nVar = (C107535n) kVar.instance;
            aco.getClass();
            nVar.f299176b = aco;
            nVar.f299175a |= 1;
            String j = ((BundledMessageNotification) list.get(i2)).mo84120j();
            kVar.copyOnWrite();
            C107535n nVar2 = (C107535n) kVar.instance;
            nVar2.f299175a |= 4;
            nVar2.f299178d = j;
            String h = ((BundledMessageNotification) list.get(i2)).mo84118h();
            kVar.copyOnWrite();
            C107535n nVar3 = (C107535n) kVar.instance;
            nVar3.f299175a |= 2;
            nVar3.f299177c = h;
            C58485gu i3 = C58485gu.m89841i(C58431eu.m89654f(((BundledMessageNotification) list.get(i2)).mo84113d()).mo55247g(new C93158bj(bnVar)).mo55248h());
            kVar.copyOnWrite();
            C107535n nVar4 = (C107535n) kVar.instance;
            C62971cq cqVar = nVar4.f299179e;
            if (!cqVar.mo58948c()) {
                nVar4.f299179e = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) i3, (List) nVar4.f299179e);
            arrayList.add((C107535n) kVar.build());
        }
        C86124t tVar = bnVar.f259837c;
        Bundle bundle = new Bundle();
        for (int i4 = 0; i4 < list.size(); i4++) {
            BundledMessageNotification bundledMessageNotification = (BundledMessageNotification) list.get(i4);
            if (tVar.mo79746e(C90025cd.f248140D)) {
                if (bundledMessageNotification.mo84112c() != null) {
                    MessageNotification c = bundledMessageNotification.mo84112c();
                    c.getClass();
                    if (c.f252549z) {
                        z = true;
                        bundle.putBoolean(String.valueOf(i4), z);
                    }
                }
                z = false;
                bundle.putBoolean(String.valueOf(i4), z);
            } else {
                bundle.putParcelable(String.valueOf(i4), bundledMessageNotification.mo84111b());
            }
        }
        if (tVar.mo79746e(C90126fx.f251428id)) {
            C22407c cVar = (C22407c) eVar;
            if (!cVar.f61902d.mo56113h() || !((C22585l) cVar.f61902d.mo56107c()).f62228b.mo56113h()) {
                bool = false;
            } else {
                C84349ah ahVar = (C84349ah) ((C22585l) cVar.f61902d.mo56107c()).f62228b.mo56107c();
                bool = !(ahVar instanceof C84349ah) ? false : Boolean.valueOf(((Query) ((C58847bk) C58833ax.m90834k(ahVar.f229566a)).f156646a).mo84363bw("android.opa.extra.QUERY_RESPONSE_GENERATED_BY_NGA"));
            }
            ((C59052c) ((C59052c) C93162bn.f259835a.mo56224b()).mo56372aa(13424)).mo56389s("isQueryResponseGeneratedByNga: %b", bool);
            bundle.putBoolean("android.opa.extra.QUERY_RESPONSE_GENERATED_BY_NGA", bool.booleanValue());
        }
        if (!arrayList.isEmpty() && i != 0) {
            Iterable subList = arrayList.subList(0, Math.min(i, arrayList.size()));
            if (!hashSet.isEmpty()) {
                subList = C58485gu.m89841i(C58431eu.m89654f(subList).mo55246e(new C93159bk(hashSet)).mo55248h());
            }
            C107555d dVar = (C107555d) C107556e.f299210c.createBuilder();
            dVar.copyOnWrite();
            C107556e eVar2 = (C107556e) dVar.instance;
            eVar2.f299213b = 1;
            eVar2.f299212a = 1 | eVar2.f299212a;
            C62940bt btVar = C107515ai.f299142a;
            C107516aj ajVar = (C107516aj) C107517ak.f299143b.createBuilder();
            ajVar.copyOnWrite();
            C107517ak akVar = (C107517ak) ajVar.instance;
            C62971cq cqVar2 = akVar.f299145a;
            if (!cqVar2.mo58948c()) {
                akVar.f299145a = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll(subList, (List) akVar.f299145a);
            dVar.mo58885m(btVar, (C107517ak) ajVar.build());
            C87684al alVar = new C87684al(C88244um.OPA_SESSION_SERVICE_EVENT);
            alVar.mo81965b(C107505a.f299120a, (C107556e) dVar.build());
            alVar.mo81966c(bundle);
            ServiceEventData a = alVar.mo81964a();
            C86775r rVar = ((C86610af) bnVar.f259838d.mo27525b()).f233977l;
            if (rVar != null) {
                rVar.f234383e.mo80379b(a);
            }
        }
        return C22402a.f61894b;
    }
}
