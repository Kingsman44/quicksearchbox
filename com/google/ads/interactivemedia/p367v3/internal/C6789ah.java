package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ah */
/* compiled from: PG */
public final class C6789ah {

    /* renamed from: a */
    static float f20641a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: b */
    private static WindowManager f20642b;

    /* renamed from: c */
    private static final String[] f20643c = {"x", "y", "width", "height"};

    /* renamed from: a */
    public static void m18699a(Context context) {
        if (context != null) {
            f20641a = context.getResources().getDisplayMetrics().density;
            f20642b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: b */
    public static JSONObject m18700b(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m18701c(i));
            jSONObject.put("y", (double) m18701c(i2));
            jSONObject.put("width", (double) m18701c(i3));
            jSONObject.put("height", (double) m18701c(i4));
        } catch (JSONException e) {
            asn.m19532s("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: c */
    static float m18701c(int i) {
        return ((float) i) / f20641a;
    }

    /* renamed from: d */
    public static void m18702d(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
            sb.append("JSONException during JSONObject.put for name [");
            sb.append(str);
            sb.append("]");
            asn.m19532s(sb.toString(), e);
        }
    }

    /* renamed from: e */
    public static void m18703e(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            asn.m19532s("Error with setting ad session id", e);
        }
    }

    /* renamed from: f */
    public static void m18704f(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            asn.m19532s("Error with setting not visible reason", e);
        }
    }

    /* renamed from: g */
    public static void m18705g(JSONObject jSONObject, C6790ai aiVar) {
        C7271s b = aiVar.mo14796b();
        JSONArray jSONArray = new JSONArray();
        ArrayList c = aiVar.mo14797c();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            jSONArray.put((String) c.get(i));
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", b.mo16420a());
            jSONObject.put("friendlyObstructionPurpose", b.mo16421b());
            jSONObject.put("friendlyObstructionReason", b.mo16422c());
        } catch (JSONException e) {
            asn.m19532s("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: h */
    public static void m18706h(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            auf.m19650b(e);
        }
    }

    /* renamed from: i */
    public static void m18707i(JSONObject jSONObject) {
        float f;
        float f2;
        if (f20642b != null) {
            Point point = new Point(0, 0);
            f20642b.getDefaultDisplay().getRealSize(point);
            f = m18701c(point.x);
            f2 = m18701c(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        C6787ag agVar = new C6787ag(f, f2);
        try {
            jSONObject.put("width", (double) agVar.f20606a);
            jSONObject.put("height", (double) agVar.f20607b);
        } catch (JSONException e) {
            auf.m19650b(e);
        }
    }

    /* renamed from: j */
    public static boolean m18708j(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = f20643c;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i < 4) {
                    String str = strArr[i];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i++;
                } else if (jSONObject.optString("adSessionId", BuildConfig.FLAVOR).equals(jSONObject2.optString("adSessionId", BuildConfig.FLAVOR))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (m18709k(optJSONArray, optJSONArray2)) {
                            int i2 = 0;
                            while (true) {
                                if (i2 < optJSONArray.length()) {
                                    if (!optJSONArray.optString(i2, BuildConfig.FLAVOR).equals(optJSONArray2.optString(i2, BuildConfig.FLAVOR))) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (!(optJSONArray3 == null && optJSONArray4 == null)) {
                        if (m18709k(optJSONArray3, optJSONArray4)) {
                            int i3 = 0;
                            while (i3 < optJSONArray3.length()) {
                                if (m18708j(optJSONArray3.optJSONObject(i3), optJSONArray4.optJSONObject(i3))) {
                                    i3++;
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    private static boolean m18709k(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
