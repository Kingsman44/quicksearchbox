package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import android.databinding.C0118a;
import android.location.Location;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e;
import com.google.android.apps.gsa.sidekick.main.entry.C91307al;
import com.google.android.apps.gsa.sidekick.main.entry.C91321az;
import com.google.android.apps.gsa.sidekick.main.trigger.TriggerConditionEvaluator;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7701gt;
import com.google.p375ai.p378b.C7702gu;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C7728ht;
import com.google.p375ai.p378b.C7744ii;
import com.google.p375ai.p378b.C8142xb;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.w */
/* compiled from: PG */
public final /* synthetic */ class C98141w implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C98064as f274052a;

    /* renamed from: b */
    public final /* synthetic */ long f274053b;

    public /* synthetic */ C98141w(C98064as asVar, long j) {
        this.f274052a = asVar;
        this.f274053b = j;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C98063ar o;
        C91321az azVar;
        int i;
        C98063ar arVar;
        C7744ii iiVar;
        C98064as asVar = this.f274052a;
        long j = this.f274053b;
        C98057al alVar = (C98057al) obj;
        C59104x b = C98064as.f273803a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "EntryProvider");
        C0118a.m109q(b, "Step 7: EntryProviderImpl:processEntryChanges", 30526, "NotificationFullFlow", C58975e.f156826a);
        Location a = alVar.mo90906a();
        C98063ar f = C98063ar.m162354f();
        C91307al alVar2 = (C91307al) asVar.f273818n.mo17428b();
        synchronized (asVar.f273819o) {
            C7744ii iiVar2 = (C7744ii) ((C58833ax) C60856cj.m92910s(asVar.f273822r.mo85612a())).mo56111f();
            if (iiVar2 == null) {
                asVar.f273820p.mo85270f("Creating EntryTree for pushed entry changes", C90996e.f254198a);
                asVar.f273823s.mo85630p();
                C7728ht htVar = (C7728ht) C7744ii.f27054p.createBuilder();
                C7726hr hrVar = C7726hr.f27008i;
                htVar.copyOnWrite();
                C7744ii iiVar3 = (C7744ii) htVar.instance;
                hrVar.getClass();
                iiVar3.f27057b = hrVar;
                iiVar3.f27056a |= 1;
                htVar.copyOnWrite();
                C7744ii iiVar4 = (C7744ii) htVar.instance;
                iiVar4.f27056a |= 512;
                iiVar4.f27069o = true;
                iiVar2 = (C7744ii) htVar.build();
            }
            C7702gu b2 = alVar.mo90907b();
            List b3 = asVar.f273812h.mo85659b(b2.f26881a);
            List b4 = asVar.f273812h.mo85659b(b2.f26882b);
            C7701gt gtVar = (C7701gt) b2.toBuilder();
            gtVar.copyOnWrite();
            ((C7702gu) gtVar.instance).f26881a = C7702gu.emptyProtobufList();
            gtVar.mo16937a(b3);
            gtVar.copyOnWrite();
            ((C7702gu) gtVar.instance).f26882b = C7702gu.emptyProtobufList();
            gtVar.copyOnWrite();
            C7702gu guVar = (C7702gu) gtVar.instance;
            C62971cq cqVar = guVar.f26882b;
            if (!cqVar.mo58948c()) {
                guVar.f26882b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) b4, (List) guVar.f26882b);
            C7702gu guVar2 = (C7702gu) gtVar.build();
            o = asVar.mo90920o(iiVar2, guVar2, alVar2);
            C7744ii iiVar5 = ((C98123e) o).f273992c;
            azVar = null;
            if (iiVar5 != null && o.mo90917g()) {
                C91321az azVar2 = new C91321az(a, j, new TriggerConditionEvaluator.APriori((List) C58485gu.m89845m()), true, asVar.f273815k);
                asVar.mo90927v(asVar.mo90924s(iiVar5, azVar2));
                azVar = azVar2;
            }
            if (asVar.f273816l.mo79746e(C90010bp.f246923S) && (iiVar = (C7744ii) ((C58833ax) C60856cj.m92910s(asVar.f273822r.mo85614c(false, C8142xb.UNKNOWN_SURFACE))).mo56111f()) != null) {
                f = asVar.mo90920o(iiVar, guVar2, alVar2);
                if (((C98123e) f).f273992c != null && f.mo90917g()) {
                    asVar.f273823s.mo85635u(((C98123e) f).f273992c);
                }
            }
        }
        C98123e eVar = (C98123e) o;
        C58485gu guVar3 = eVar.f273991b;
        int size = guVar3.size();
        for (int i2 = 0; i2 < size; i2++) {
            alVar2.mo85601b((C7718hj) guVar3.get(i2));
        }
        C98123e eVar2 = (C98123e) f;
        C58485gu guVar4 = eVar2.f273991b;
        int size2 = guVar4.size();
        for (i = 0; i < size2; i++) {
            alVar2.mo85601b((C7718hj) guVar4.get(i));
        }
        C60870cx b5 = asVar.f273806b.mo85607b(alVar2);
        C7744ii iiVar6 = eVar.f273992c;
        C7744ii iiVar7 = eVar2.f273992c;
        if (iiVar6 == null) {
            if (iiVar7 != null) {
                iiVar6 = iiVar7;
            } else {
                arVar = C98063ar.m162354f();
                return asVar.f273811g.mo28209i(b5, "internalUpdateFromPushedPartialEntries$resultFuture$flushFutureTransform", new C98046aa(asVar, azVar, arVar));
            }
        }
        arVar = C98063ar.m162353e(Math.max(eVar.f273990a, eVar2.f273990a), eVar.f273991b.isEmpty() ? eVar2.f273991b : eVar.f273991b, iiVar6);
        return asVar.f273811g.mo28209i(b5, "internalUpdateFromPushedPartialEntries$resultFuture$flushFutureTransform", new C98046aa(asVar, azVar, arVar));
    }
}
