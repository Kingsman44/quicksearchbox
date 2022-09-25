package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.C143919bh;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.common.util.l */
/* compiled from: PG */
public final class C144012l {
    static {
        Pattern.compile("\\\\.");
        Pattern.compile("[\\\\\"/\b\f\n\r\t]");
    }

    /* renamed from: a */
    public static boolean m234191a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            JSONObject jSONObject2 = (JSONObject) obj2;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject2.has(next)) {
                    return false;
                }
                try {
                    C143919bh.m233958a(next);
                    if (!m234191a(jSONObject.get(next), jSONObject2.get(next))) {
                        return false;
                    }
                } catch (JSONException unused) {
                }
            }
            return true;
        } else if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
            return obj.equals(obj2);
        } else {
            JSONArray jSONArray = (JSONArray) obj;
            JSONArray jSONArray2 = (JSONArray) obj2;
            if (jSONArray.length() != jSONArray2.length()) {
                return false;
            }
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    if (!m234191a(jSONArray.get(i), jSONArray2.get(i))) {
                        return false;
                    }
                    i++;
                } catch (JSONException unused2) {
                }
            }
            return true;
        }
    }
}
