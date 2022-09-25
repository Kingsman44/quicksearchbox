package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.p979a;

import android.content.res.Resources;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13499a;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13510c;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13512e;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13513f;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p4184bj.p4189b.p4190a.C55872d;
import com.google.p4184bj.p4189b.p4190a.C55873e;
import com.google.p4184bj.p4189b.p4190a.C55876h;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.d.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C13503d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13508i f41427a;

    public /* synthetic */ C13503d(C13508i iVar) {
        this.f41427a = iVar;
    }

    public final C60870cx apply(Object obj) {
        C55873e eVar;
        C55873e eVar2;
        C13500a aVar;
        int i;
        C13508i iVar = this.f41427a;
        C58833ax axVar = (C58833ax) obj;
        C58976aa aaVar = C58975e.f156826a;
        if (!axVar.mo56113h()) {
            C60870cx b = iVar.f41435c.mo21191b();
            C13505f fVar = new C13505f(iVar);
            return C60922j.m93045h(b, C47810es.m84966f(fVar), iVar.f41434b);
        } else if (((C55876h) axVar.mo56107c()).f148689a == 2) {
            iVar.f41438f.mo22352b(C37179a.f97555cU);
            C55876h hVar = (C55876h) axVar.mo56107c();
            if (hVar.f148689a == 2) {
                eVar = (C55873e) hVar.f148690b;
            } else {
                eVar = C55873e.f148682b;
            }
            int size = eVar.f148684a.size();
            if (size <= 0) {
                C59104x d = C13508i.f41432a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "LocationEtaSelector");
                ((C59052c) ((C59052c) d).mo56372aa(44871)).mo56386p("No destination found");
                C13510c l = C13512e.m29782l();
                C13499a aVar2 = (C13499a) l;
                aVar2.f41418k = 6;
                aVar2.f41413f = C58833ax.m90834k(Integer.valueOf(size));
                return C60856cj.m92900i(l.mo21131a());
            }
            if (hVar.f148689a == 2) {
                eVar2 = (C55873e) hVar.f148690b;
            } else {
                eVar2 = C55873e.f148682b;
            }
            long epochSecond = ((C55872d) eVar2.f148684a.get(size - 1)).f148681c - iVar.f41437e.mo57444a().getEpochSecond();
            if (epochSecond < 0) {
                C59104x d2 = C13508i.f41432a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "LocationEtaSelector");
                ((C59052c) ((C59052c) d2).mo56372aa(44870)).mo56386p("Detected negative ETA");
                C13510c l2 = C13512e.m29782l();
                C13499a aVar3 = (C13499a) l2;
                aVar3.f41418k = 5;
                aVar3.f41412e = C58833ax.m90834k(Long.valueOf(epochSecond));
                return C60856cj.m92900i(l2.mo21131a());
            }
            int a = C13513f.m29794a(epochSecond);
            if (a <= iVar.f41436d.getResources().getInteger(R.integer.imminent_eta_threshold)) {
                Resources resources = iVar.f41436d.getResources();
                Integer valueOf = Integer.valueOf(a);
                aVar = new C13500a(resources.getQuantityString(R.plurals.share_eta_button, a, new Object[]{valueOf}), iVar.f41436d.getResources().getQuantityString(R.plurals.share_imminent_eta_message, a, new Object[]{valueOf}));
            } else {
                if (a % iVar.f41436d.getResources().getInteger(R.integer.eta_round_up_bucket) == 0) {
                    i = 0;
                } else {
                    i = iVar.f41436d.getResources().getInteger(R.integer.eta_round_up_bucket) - (a % iVar.f41436d.getResources().getInteger(R.integer.eta_round_up_bucket));
                }
                int i2 = a + i;
                Resources resources2 = iVar.f41436d.getResources();
                Integer valueOf2 = Integer.valueOf(i2);
                aVar = new C13500a(resources2.getQuantityString(R.plurals.share_eta_button, i2, new Object[]{valueOf2}), iVar.f41436d.getResources().getQuantityString(R.plurals.share_eta_message, i2, new Object[]{valueOf2}));
            }
            C13510c l3 = C13512e.m29782l();
            C13499a aVar4 = (C13499a) l3;
            aVar4.f41409b = aVar.f41420b;
            aVar4.f41408a = aVar.f41419a;
            aVar4.f41410c = "ETA";
            aVar4.f41418k = 8;
            aVar4.f41412e = C58833ax.m90834k(Long.valueOf(epochSecond));
            return C60856cj.m92900i(l3.mo21131a());
        } else if (((C55876h) axVar.mo56107c()).f148689a == 1) {
            C60870cx c = iVar.mo21140c();
            C13504e eVar3 = new C13504e(iVar, axVar);
            return C60922j.m93045h(c, C47810es.m84966f(eVar3), iVar.f41434b);
        } else {
            C59104x d3 = C13508i.f41432a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "LocationEtaSelector");
            ((C59052c) ((C59052c) d3).mo56372aa(44880)).mo56386p("Maps State is unregistered");
            C13510c l4 = C13512e.m29782l();
            ((C13499a) l4).f41418k = 7;
            l4.mo21132b(axVar);
            return C60856cj.m92900i(l4.mo21131a());
        }
    }
}
