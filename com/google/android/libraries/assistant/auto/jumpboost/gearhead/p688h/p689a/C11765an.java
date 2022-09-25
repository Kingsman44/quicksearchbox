package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a;

import android.text.TextUtils;
import androidx.p060c.C0985o;
import com.google.android.gearhead.sdk.assistant.GearheadStateSnapshot;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.an */
/* compiled from: PG */
final class C11765an {

    /* renamed from: a */
    private static final C58495hd f37892a;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(0, "UNKNOWN");
        gzVar.mo55429h(1, "MEDIA");
        gzVar.mo55429h(2, "NAVIGATION");
        gzVar.mo55429h(3, "OVERVIEW");
        gzVar.mo55429h(4, "PHONE");
        gzVar.mo55429h(5, "OEM");
        f37892a = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    static String m27433a(GearheadStateSnapshot gearheadStateSnapshot, C58485gu guVar) {
        JSONObject jSONObject = new JSONObject();
        C58495hd hdVar = f37892a;
        String str = (String) hdVar.get(Integer.valueOf(gearheadStateSnapshot.f387109b));
        if (str != null) {
            m27434b(jSONObject, "FACET_TYPE", str);
        }
        C0985o oVar = gearheadStateSnapshot.f387112e;
        if (oVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            C58800sl lA = hdVar.entrySet().iterator();
            while (lA.hasNext()) {
                Map.Entry entry = (Map.Entry) lA.next();
                String str2 = (String) oVar.mo3726e(((Integer) entry.getKey()).intValue());
                if (!TextUtils.isEmpty(str2)) {
                    m27434b(jSONObject2, (String) entry.getValue(), str2);
                }
            }
            m27434b(jSONObject, "DEFAULT_PACKAGES", jSONObject2);
        }
        if (!guVar.isEmpty()) {
            m27434b(jSONObject, "APP_WHITELIST", new JSONArray(guVar));
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    private static void m27434b(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            throw new AssertionError(e);
        }
    }
}
