package com.google.android.apps.gsa.assistant.settings.features.p550ai.p552b;

import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.assistant.settings.shared.p5792c.C73740a;
import com.google.android.libraries.search.assistant.proactive.p2775g.C36275ad;
import com.google.android.libraries.search.assistant.proactive.p2775g.C36280ai;
import com.google.assistant.p3803ag.p3809c.C49067ff;
import com.google.assistant.p3803ag.p3809c.C49076fo;
import com.google.assistant.p3861at.C49927ed;
import com.google.assistant.p3861at.C49937en;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p4985f.p5036r.C65319e;
import com.google.protos.p4985f.p5036r.C65321g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ai.b.d */
/* compiled from: PG */
public final class C10094d implements C73740a {

    /* renamed from: a */
    private final C36275ad f34375a;

    /* renamed from: b */
    private final C58833ax f34376b;

    public C10094d(C36275ad adVar, C58833ax axVar) {
        this.f34375a = adVar;
        this.f34376b = axVar;
    }

    /* renamed from: a */
    public final String mo18002a() {
        return "notificationTimestampInterface";
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18003b() {
    }

    @JavascriptInterface
    public String getLastReceivedTimestampsForCategoryGroups() {
        JSONArray jSONArray = new JSONArray();
        if (!this.f34376b.mo56113h()) {
            return jSONArray.toString();
        }
        C49076fo foVar = (C49076fo) C60856cj.m92910s(((C36280ai) this.f34376b.mo56107c()).mo40087a());
        HashMap hashMap = new HashMap();
        for (C49927ed edVar : ((C49067ff) C60856cj.m92910s(this.f34375a.mo40081f())).f126919a) {
            for (C49937en enVar : edVar.f129775b) {
                int a = C65319e.m96667a(enVar.f129797a);
                int i = 1;
                if (a == 0) {
                    a = 1;
                }
                Integer valueOf = Integer.valueOf(a - 1);
                int a2 = C65321g.m96668a(edVar.f129774a);
                if (a2 != 0) {
                    i = a2;
                }
                hashMap.put(valueOf, Integer.valueOf(i - 1));
            }
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : Collections.unmodifiableMap(foVar.f126936a).entrySet()) {
            int intValue = ((Integer) Map.EL.getOrDefault(hashMap, entry.getKey(), -1)).intValue();
            if (intValue > 0) {
                long longValue = ((Long) entry.getValue()).longValue();
                Integer valueOf2 = Integer.valueOf(intValue);
                hashMap2.put(valueOf2, Long.valueOf(Math.max(longValue, ((Long) Map.EL.getOrDefault(hashMap2, valueOf2, 0L)).longValue())));
            }
        }
        ArrayList arrayList = new ArrayList(hashMap2.entrySet());
        Collections.sort(arrayList, new C10093c());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Map.Entry entry2 = (Map.Entry) arrayList.get(i2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("groupId", entry2.getKey());
            jSONObject.put("lastTime", entry2.getValue());
            jSONArray.put(jSONObject);
        }
        return jSONArray.toString();
    }
}
