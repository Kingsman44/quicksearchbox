package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9334d;

import android.databinding.C0118a;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123751br;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124116cn;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.d.j */
/* compiled from: PG */
public final /* synthetic */ class C123892j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123904v f342210a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f342211b;

    public /* synthetic */ C123892j(C123904v vVar, AccountId accountId) {
        this.f342210a = vVar;
        this.f342211b = accountId;
    }

    public final C60870cx apply(Object obj) {
        Optional optional;
        C123904v vVar = this.f342210a;
        AccountId accountId = this.f342211b;
        List list = (List) obj;
        Map map = (Map) list.get(0);
        List<C123751br> list2 = (List) list.get(1);
        Integer valueOf = Integer.valueOf(C89885b.PCP_FAIL_TO_GET_REMINDER_DATA_FROM_DB_VALUE);
        Integer valueOf2 = Integer.valueOf(C89885b.PCP_FAIL_TO_ACCESS_REMINDER_EVENTS_VALUE);
        if (list2 == null) {
            C59104x d = C123904v.f342237a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PCP.ReminderData");
            C0118a.m108p(d, "Failed to get reminders", 35336, C38505d.f101863a, valueOf2);
            optional = Optional.empty();
        } else if (map == null) {
            C59104x d2 = C123904v.f342237a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "PCP.ReminderData");
            C0118a.m108p(d2, "Failed to get data from db", 35335, C38505d.f101863a, valueOf);
            optional = Optional.empty();
        } else {
            C59104x b = C123904v.f342237a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PCP.ReminderData");
            ((C59052c) ((C59052c) b).mo56372aa(35334)).mo56387q("size of fetched list is %d", list2.size());
            optional = Optional.m71637of((List) Collection.EL.stream(map.keySet()).filter(new C123891i((List) Collection.EL.stream(list2).map(C123890h.f342208a).collect(Collectors.toCollection(C123898p.f342223a)))).collect(Collectors.toCollection(C123898p.f342223a)));
        }
        if (!optional.isPresent()) {
            return C60866ct.f164955a;
        }
        List d3 = vVar.mo106159d((List) optional.get(), accountId, 100013, C53306j.OPA_SMARTSPACE);
        ArrayList<C123751br> arrayList = new ArrayList<>();
        if (list2 == null) {
            C59104x d4 = C123904v.f342237a.mo56226d();
            d4.mo56378ag(C58975e.f156826a, "PCP.ReminderData");
            C0118a.m108p(d4, "Failed to get reminders", 35341, C38505d.f101863a, valueOf2);
        } else if (map == null) {
            C59104x d5 = C123904v.f342237a.mo56226d();
            d5.mo56378ag(C58975e.f156826a, "PCP.ReminderData");
            C0118a.m108p(d5, "Failed to get data from db", 35340, C38505d.f101863a, valueOf);
        } else {
            for (C123751br brVar : list2) {
                String str = brVar.f341831d;
                if (!map.containsKey(str)) {
                    arrayList.add(brVar);
                } else if (!Arrays.equals(C124116cn.m203542b(brVar), (byte[]) map.get(str))) {
                    arrayList.add(brVar);
                }
                C59104x b2 = C123904v.f342237a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "PCP.ReminderData");
                ((C59052c) ((C59052c) b2).mo56372aa(35339)).mo56387q("number of reminders updated: %d", arrayList.size());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C123751br brVar2 : arrayList) {
            String str2 = brVar2.f341831d;
            C59104x b3 = C123904v.f342237a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "PCP.ReminderData");
            ((C59052c) ((C59052c) b3).mo56372aa(35332)).mo56389s("updating reminder for id: %s", str2);
            C60870cx c = vVar.mo106158c(str2, brVar2, accountId, 100013, C53306j.OPA_SMARTSPACE, arrayList2);
            d3.add(c);
            C46459k.m82829b(c, "update reminder event failure: %s", str2);
        }
        return vVar.mo106157b(arrayList2, d3);
    }
}
