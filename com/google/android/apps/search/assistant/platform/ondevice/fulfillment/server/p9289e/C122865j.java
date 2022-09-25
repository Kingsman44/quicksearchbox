package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e;

import com.google.android.libraries.assistant.portable.p1586b.C19072d;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.p4152bb.p4153a.C55082fe;
import com.google.p4152bb.p4153a.C55093fp;
import com.google.protos.p4850an.p4851a.p4852a.C63324h;
import com.google.protos.p4985f.p5030q.C65195fb;
import com.google.protos.p4985f.p5030q.C65196fc;
import com.google.protos.p5127o.p5128a.C65628i;
import com.google.protos.p5127o.p5128a.C65629j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.e.j */
/* compiled from: PG */
public final class C122865j {
    /* renamed from: a */
    public static String m202184a(JSONObject jSONObject, String str) {
        String valueOf = String.valueOf(jSONObject);
        return str + ": " + valueOf;
    }

    /* renamed from: b */
    public static String m202185b(C65196fc fcVar) {
        C52076ei eiVar;
        try {
            JSONArray jSONArray = new JSONArray();
            C19088t tVar = fcVar.f176462h;
            if (tVar == null) {
                tVar = C19088t.f53533p;
            }
            for (C19072d dVar : tVar.f53548n) {
                JSONObject put = new JSONObject().put("name", dVar.f53499a);
                int i = dVar.f53500b;
                jSONArray.put(put.put("range", i + ":" + (dVar.f53501c + i)).put("score", (double) dVar.f53502d));
            }
            JSONObject jSONObject = new JSONObject();
            C65195fb a = C65195fb.m96585a(fcVar.f176458d);
            if (a == null) {
                a = C65195fb.UNRECOGNIZED;
            }
            JSONObject put2 = jSONObject.put("status", a.name()).put("isFallback", fcVar.f176463i);
            C63324h hVar = fcVar.f176460f;
            if (hVar == null) {
                hVar = C63324h.f171148d;
            }
            JSONObject jSONObject2 = new JSONObject();
            C61752n nVar = hVar.f171151b;
            if (nVar == null) {
                nVar = C61752n.f166808f;
            }
            JSONObject put3 = put2.put("interpretation", jSONObject2.put("intent", nVar.f166811b).put("score", (double) hVar.f171152c)).put("annotations", jSONArray);
            C52081en enVar = fcVar.f176461g;
            if (enVar == null) {
                enVar = C52081en.f136679i;
            }
            JSONArray jSONArray2 = new JSONArray();
            for (C52083ep epVar : enVar.f136684d) {
                if (epVar.f136692b == 4) {
                    eiVar = (C52076ei) epVar.f136693c;
                } else {
                    eiVar = C52076ei.f136664f;
                }
                C51809dy dyVar = eiVar.f136668c;
                if (dyVar == null) {
                    dyVar = C51809dy.f135933f;
                }
                jSONArray2.put(dyVar.f135936b);
            }
            return m202184a(put3.put("conversationDelta", new JSONObject().put("interactions", jSONArray2)), "PortableAssistantResponse");
        } catch (JSONException unused) {
            return "PortableAssistantResponse";
        }
    }

    /* renamed from: c */
    public static String m202186c(C65629j jVar) {
        String str;
        try {
            JSONArray jSONArray = new JSONArray();
            C55093fp fpVar = jVar.f178343b;
            if (fpVar == null) {
                fpVar = C55093fp.f144965l;
            }
            for (C55082fe feVar : fpVar.f144969c) {
                jSONArray.put(new JSONObject().put("cl_id", feVar.f144920g).put("phones", feVar.f144921h.size()).put("display_name_len", feVar.f144915b.length()));
            }
            JSONObject put = new JSONObject().put("infos", jSONArray);
            int a = C65628i.m96760a(jVar.f178344c);
            if (a != 0) {
                if (a != 1) {
                    str = "PERMISSION_DENIED";
                    return m202184a(put.put("code", str), "ContactLookupResponse");
                }
            }
            str = "NORMAL";
            return m202184a(put.put("code", str), "ContactLookupResponse");
        } catch (JSONException unused) {
            return "ContactLookupResponse";
        }
    }

    /* renamed from: d */
    public static JSONArray m202187d(C52091ex exVar) {
        JSONArray jSONArray = new JSONArray();
        for (C52232kc kcVar : exVar.f136712a) {
            jSONArray.put(kcVar.f137065b);
        }
        return jSONArray;
    }
}
