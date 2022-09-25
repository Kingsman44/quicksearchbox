package com.google.apps.tiktok.experiments.phenotype;

import android.util.Log;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.experiments.C46889a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p5460g.p5461a.C69464a;
import p5462h.C69677g;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.w */
/* compiled from: PG */
public final class C47069w implements C47065s {

    /* renamed from: a */
    private final C69464a f122657a;

    /* renamed from: b */
    private final Map f122658b;

    /* renamed from: c */
    private final C47066t f122659c;

    /* renamed from: d */
    private final C46919am f122660d;

    public C47069w(C58833ax axVar, C46919am amVar, C69464a aVar, Map map) {
        C69664n.m101061g(amVar, "subpackager");
        C69664n.m101061g(aVar, "deviceProvider");
        C69664n.m101061g(map, "mendelPackages");
        this.f122660d = amVar;
        this.f122657a = aVar;
        this.f122658b = map;
        this.f122659c = (C47066t) ((C58847bk) axVar).f156646a;
    }

    /* renamed from: a */
    public final C60870cx mo50994a(String str) {
        C69664n.m101061g(str, "mendelPackage");
        String a = this.f122660d.mo50923a(str);
        C46889a aVar = (C46889a) this.f122658b.get(a);
        if (aVar == C46889a.UI_DEVICE || aVar == C46889a.DEVICE) {
            return ((C46937bd) this.f122657a.mo17428b()).mo50926a(a);
        }
        throw new IllegalStateException("Package " + a + " was not a device package. Instead was " + aVar);
    }

    /* renamed from: b */
    public final C60870cx mo50995b(String str, AccountId accountId) {
        C69664n.m101061g(str, "mendelPackage");
        C69664n.m101061g(accountId, "accountId");
        String a = this.f122660d.mo50923a(str);
        C46889a aVar = (C46889a) this.f122658b.get(a);
        if (aVar == C46889a.UI_USER || aVar == C46889a.USER) {
            return this.f122659c.mo50908a(a, accountId);
        }
        throw new IllegalStateException("Package " + a + " was not a user package. Instead was " + aVar);
    }

    /* renamed from: c */
    public final C60870cx mo50996c(String str) {
        C69664n.m101061g(str, "mendelPackage");
        String a = this.f122660d.mo50923a(str);
        C46889a aVar = (C46889a) this.f122658b.get(a);
        if (aVar == null) {
            Log.w("ConfigurationUpdater", "No Mendel package registered for ".concat(a));
            return C60866ct.f164955a;
        }
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new C69677g();
                    }
                }
            }
            return this.f122659c.mo50910c(a);
        }
        return ((C46937bd) this.f122657a.mo17428b()).mo50926a(a);
    }

    /* renamed from: d */
    public final C60870cx mo50997d(AccountId accountId) {
        Map map = this.f122658b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C46889a aVar = (C46889a) entry.getValue();
            if (aVar == C46889a.UI_USER || aVar == C46889a.USER) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set<String> keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(C69540x.m100804k(keySet, 10));
        for (String b : keySet) {
            arrayList.add(mo50995b(b, accountId));
        }
        return C47068v.m83725a(arrayList);
    }

    /* renamed from: e */
    public final C60870cx mo50998e() {
        Set<String> keySet = this.f122658b.keySet();
        ArrayList arrayList = new ArrayList(C69540x.m100804k(keySet, 10));
        for (String c : keySet) {
            arrayList.add(mo50996c(c));
        }
        return C47068v.m83725a(arrayList);
    }
}
