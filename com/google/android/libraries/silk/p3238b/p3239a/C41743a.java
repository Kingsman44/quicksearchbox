package com.google.android.libraries.silk.p3238b.p3239a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.android.libraries.silk.p3238b.C41749b;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56847c;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.libraries.silk.b.a.a */
/* compiled from: PG */
public final class C41743a {

    /* renamed from: a */
    public static final JSONObject f109087a = m73204e("Raw message cannot be parsed to JSON");

    /* renamed from: b */
    public static final JSONObject f109088b;

    /* renamed from: c */
    private static final JSONObject f109089c = m73204e("Field 'id' is missing");

    /* renamed from: d */
    private static final JSONObject f109090d = m73204e("Field 'type' is neither method_call, event_subscription, nor event_unsubscription");

    /* renamed from: e */
    private static final JSONObject f109091e = m73204e("Field 'api_name' does not match the API");

    /* renamed from: f */
    private static final JSONObject f109092f = m73204e("Field 'method_name' does not match any methods");

    /* renamed from: g */
    private static final JSONObject f109093g = m73204e("Field 'event_name' does not match any events");

    /* renamed from: h */
    private static final JSONObject f109094h = m73204e("Unknown error");

    static {
        C56848d b = C41749b.m73223b("API is called out of lifecycle");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "method_error");
            jSONObject.put("error", C41748f.m73221b(b));
            f109088b = jSONObject;
        } catch (JSONException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public static MessageLite m73200a(JSONObject jSONObject, C63010eb ebVar, C62921ba baVar) {
        try {
            return C41748f.m73220a(jSONObject.getString("request"), ebVar, baVar);
        } catch (C62974ct | JSONException e) {
            throw new C41747e(e);
        }
    }

    /* renamed from: b */
    public static String m73201b(JSONObject jSONObject) {
        try {
            return jSONObject.getString("id");
        } catch (JSONException unused) {
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: c */
    public static JSONObject m73202c(String str, Throwable th) {
        if (th instanceof C41742a) {
            C41742a aVar = (C41742a) th;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", "method_error");
                jSONObject.put("id", str);
                jSONObject.put("error", C41748f.m73221b(C41749b.m73224c(aVar)));
                return jSONObject;
            } catch (JSONException e) {
                throw new AssertionError(e);
            }
        } else {
            String message = th.getMessage();
            if (message == null) {
                message = "Throwable with no detail.";
            }
            C56848d b = C41749b.m73223b(message);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("type", "method_error");
                jSONObject2.put("id", str);
                jSONObject2.put("error", C41748f.m73221b(b));
                return jSONObject2;
            } catch (JSONException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* renamed from: d */
    public static JSONObject m73203d(MessageLite messageLite, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "event");
            jSONObject.put("event_name", str);
            jSONObject.put("data", C41748f.m73221b(messageLite));
            return jSONObject;
        } catch (JSONException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public static JSONObject m73204e(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "protocol_error");
            C56847c cVar = (C56847c) C56848d.f151669d.createBuilder();
            cVar.copyOnWrite();
            C56848d dVar = (C56848d) cVar.instance;
            dVar.f151671a |= 1;
            dVar.f151672b = "protocol_error";
            cVar.copyOnWrite();
            C56848d dVar2 = (C56848d) cVar.instance;
            dVar2.f151671a |= 2;
            dVar2.f151673c = str;
            jSONObject.put("error", C41748f.m73221b((C56848d) cVar.build()));
            return jSONObject;
        } catch (JSONException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: f */
    public static JSONObject m73205f(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "method_result");
            jSONObject.put("id", str);
            return jSONObject;
        } catch (JSONException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: g */
    public static JSONObject m73206g(String str, MessageLite messageLite) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "method_result");
            jSONObject.put("id", str);
            jSONObject.put("response", C41748f.m73221b(messageLite));
            return jSONObject;
        } catch (JSONException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r4.contains(r1.getString("event_name")) != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r3.contains(r1.getString("method_name")) == false) goto L_0x004b;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m73207h(org.json.JSONObject r1, java.lang.String r2, com.google.common.p4522b.C58485gu r3, com.google.common.p4522b.C58485gu r4) {
        /*
            boolean r0 = m73213n(r1)
            if (r0 != 0) goto L_0x0010
            boolean r0 = m73215p(r1)
            if (r0 == 0) goto L_0x000d
            goto L_0x0010
        L_0x000d:
            org.json.JSONObject r1 = f109090d
            return r1
        L_0x0010:
            boolean r0 = m73214o(r1)
            if (r0 == 0) goto L_0x0019
            org.json.JSONObject r1 = f109089c
            return r1
        L_0x0019:
            boolean r0 = m73213n(r1)
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = "event_name"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ JSONException -> 0x002c }
            boolean r4 = r4.contains(r0)     // Catch:{ JSONException -> 0x002c }
            if (r4 == 0) goto L_0x002c
            goto L_0x002f
        L_0x002c:
            org.json.JSONObject r1 = f109093g
            return r1
        L_0x002f:
            boolean r4 = m73215p(r1)
            if (r4 == 0) goto L_0x0051
            java.lang.String r2 = m73212m(r2)
            boolean r2 = m73216q(r1, r2)
            if (r2 == 0) goto L_0x004e
            java.lang.String r2 = "method_name"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ JSONException -> 0x004b }
            boolean r1 = r3.contains(r1)     // Catch:{ JSONException -> 0x004b }
            if (r1 != 0) goto L_0x0051
        L_0x004b:
            org.json.JSONObject r1 = f109092f
            return r1
        L_0x004e:
            org.json.JSONObject r1 = f109091e
            return r1
        L_0x0051:
            org.json.JSONObject r1 = f109094h
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.silk.p3238b.p3239a.C41743a.m73207h(org.json.JSONObject, java.lang.String, com.google.common.b.gu, com.google.common.b.gu):org.json.JSONObject");
    }

    /* renamed from: i */
    public static boolean m73208i(JSONObject jSONObject, String str) {
        try {
            if (!jSONObject.getString("type").equals("event_subscription") || m73214o(jSONObject) || !jSONObject.getString("event_name").equals(str)) {
                return false;
            }
            return true;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: j */
    public static boolean m73209j(JSONObject jSONObject, String str) {
        try {
            if (!jSONObject.getString("type").equals("event_unsubscription") || !jSONObject.getString("event_name").equals(str)) {
                return false;
            }
            return true;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: k */
    public static boolean m73210k(JSONObject jSONObject, String str, String str2) {
        String m = m73212m(str);
        if (m73214o(jSONObject) || !m73215p(jSONObject) || !m73216q(jSONObject, m)) {
            return false;
        }
        try {
            return jSONObject.getString("method_name").equals(str2);
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: l */
    public static JSONObject m73211l(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "event_subscription_result");
            jSONObject.put("id", str);
            jSONObject.put("result", "success");
            return jSONObject;
        } catch (JSONException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: m */
    private static String m73212m(String str) {
        return "Silk" + str + "Api";
    }

    /* renamed from: n */
    private static boolean m73213n(JSONObject jSONObject) {
        try {
            if (jSONObject.getString("type").equals("event_subscription") || jSONObject.getString("type").equals("event_unsubscription")) {
                return true;
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: o */
    private static boolean m73214o(JSONObject jSONObject) {
        try {
            return jSONObject.getString("id").isEmpty();
        } catch (JSONException unused) {
            return true;
        }
    }

    /* renamed from: p */
    private static boolean m73215p(JSONObject jSONObject) {
        try {
            return jSONObject.getString("type").equals("method_call");
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: q */
    private static boolean m73216q(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getString("api_name").equals(str);
        } catch (JSONException unused) {
            return false;
        }
    }
}
