package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9334d;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123750bq;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123751br;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.abe;
import com.google.assistant.p3897e.p3921j.abr;
import com.google.assistant.p3897e.p3921j.abu;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.d.w */
/* compiled from: PG */
public final class C123905w {

    /* renamed from: a */
    private final C58974d f342249a;

    /* renamed from: b */
    private final C123904v f342250b;

    public C123905w(C130603a aVar, C123904v vVar) {
        this.f342249a = aVar.mo109740b(this);
        this.f342250b = vVar;
    }

    /* renamed from: a */
    public final C60870cx mo106160a(aas aas, AccountId accountId) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        aas aas2 = aas;
        C62940bt r2 = C62942bv.checkIsLite(abu.f134764l);
        aas2.mo58887l(r2);
        if (!aas2.f169962ag.mo58857o(r2.f169971d)) {
            ((C58970a) ((C58970a) this.f342249a.mo56224b()).mo56372aa(35344)).mo56386p("NotificationArgs has no SmartSpaceNotificationArgs.");
            return C60866ct.f164955a;
        }
        C62940bt r22 = C62942bv.checkIsLite(abu.f134764l);
        aas2.mo58887l(r22);
        Object l = aas2.f169962ag.mo58854l(r22.f169971d);
        if (l == null) {
            obj = r22.f169969b;
        } else {
            obj = r22.mo58889c(l);
        }
        if ((((abu) obj).f134766a & 256) != 0) {
            C62940bt r23 = C62942bv.checkIsLite(abu.f134764l);
            aas2.mo58887l(r23);
            Object l2 = aas2.f169962ag.mo58854l(r23.f169971d);
            if (l2 == null) {
                obj2 = r23.f169969b;
            } else {
                obj2 = r23.mo58889c(l2);
            }
            if ((((abu) obj2).f134766a & 512) != 0) {
                C62940bt r24 = C62942bv.checkIsLite(abu.f134764l);
                aas2.mo58887l(r24);
                Object l3 = aas2.f169962ag.mo58854l(r24.f169971d);
                if (l3 == null) {
                    obj3 = r24.f169969b;
                } else {
                    obj3 = r24.mo58889c(l3);
                }
                abe a = abe.m86274a(((abu) obj3).f134775j);
                if (a == null) {
                    a = abe.UNSPECIFIED;
                }
                C62940bt r3 = C62942bv.checkIsLite(abu.f134764l);
                aas2.mo58887l(r3);
                Object l4 = aas2.f169962ag.mo58854l(r3.f169971d);
                if (l4 == null) {
                    obj4 = r3.f169969b;
                } else {
                    obj4 = r3.mo58889c(l4);
                }
                abr abr = ((abu) obj4).f134774i;
                if (abr == null) {
                    abr = abr.f134750d;
                }
                C123750bq bqVar = (C123750bq) C123751br.f341826e.createBuilder();
                long j = abr.f134753b;
                bqVar.copyOnWrite();
                C123751br brVar = (C123751br) bqVar.instance;
                brVar.f341828a |= 1;
                brVar.f341829b = j;
                String str = abr.f134752a;
                bqVar.copyOnWrite();
                C123751br brVar2 = (C123751br) bqVar.instance;
                str.getClass();
                brVar2.f341828a |= 2;
                brVar2.f341830c = str;
                String str2 = abr.f134754c;
                bqVar.copyOnWrite();
                C123751br brVar3 = (C123751br) bqVar.instance;
                str2.getClass();
                brVar3.f341828a |= 8;
                brVar3.f341831d = str2;
                C123751br brVar4 = (C123751br) bqVar.build();
                if (a.equals(abe.UPDATE)) {
                    C123904v vVar = this.f342250b;
                    C58485gu n = C58485gu.m89846n(brVar4);
                    C53306j jVar = C53306j.BLUECHIP_SMARTSPACE_TNG;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    C58801sm G = n.listIterator(0);
                    while (G.hasNext()) {
                        C123751br brVar5 = (C123751br) G.next();
                        String str3 = brVar5.f341831d;
                        C59104x b = C123904v.f342237a.mo56224b();
                        b.mo56378ag(C58975e.f156826a, "PCP.ReminderData");
                        ((C59052c) ((C59052c) b).mo56372aa(35333)).mo56389s("updating reminder for id: %s", str3);
                        C60870cx c = vVar.mo106158c(str3, brVar5, accountId, 100001, jVar, arrayList);
                        arrayList2.add(c);
                        C46459k.m82829b(c, "update reminder event failure: %s", str3);
                    }
                    return C47638k.m84753d(vVar.mo106157b(arrayList, arrayList2)).mo51521b(new C123893k(vVar, jVar), vVar.f342245i);
                } else if (!a.equals(abe.REMOVE)) {
                    return C60866ct.f164955a;
                } else {
                    C123904v vVar2 = this.f342250b;
                    C58485gu n2 = C58485gu.m89846n(brVar4);
                    C53306j jVar2 = C53306j.BLUECHIP_SMARTSPACE_TNG;
                    return C47638k.m84750a(vVar2.mo106159d((List) Collection.EL.stream(n2).map(C123888f.f342205a).collect(Collectors.toCollection(C123898p.f342223a)), accountId, 100001, jVar2)).mo51521b(new C123889g(vVar2, jVar2), vVar2.f342245i);
                }
            } else {
                ((C58970a) ((C58970a) this.f342249a.mo56224b()).mo56372aa(35342)).mo56386p("SmartSpaceNotificationArgs has no ActionType.");
                return C60866ct.f164955a;
            }
        } else {
            ((C58970a) ((C58970a) this.f342249a.mo56224b()).mo56372aa(35343)).mo56386p("SmartSpaceNotificationArgs has no ReminderContent.");
            return C60866ct.f164955a;
        }
    }
}
