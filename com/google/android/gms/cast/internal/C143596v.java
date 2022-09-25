package com.google.android.gms.cast.internal;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.internal.v */
/* compiled from: PG */
public final class C143596v {

    /* renamed from: a */
    public static final Pattern f389362a = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");

    /* renamed from: b */
    public static final Random f389363b = new Random(SystemClock.elapsedRealtime());

    /* renamed from: a */
    public static double m233268a(long j) {
        double d = (double) j;
        Double.isNaN(d);
        return d / 1000.0d;
    }

    /* renamed from: b */
    public static long m233269b(double d) {
        return (long) (d * 1000.0d);
    }

    /* renamed from: c */
    public static long m233270c(long j) {
        return j * 1000;
    }

    /* renamed from: d */
    public static String m233271d(String str) {
        return "urn:x-cast:".concat(str);
    }

    /* renamed from: e */
    public static String m233272e(Locale locale) {
        StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-');
            sb.append(variant);
        }
        return sb.toString();
    }

    /* renamed from: f */
    public static String m233273f(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    /* renamed from: g */
    public static List m233274g(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: h */
    public static JSONObject m233275h(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static JSONObject m233276i(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    /* renamed from: j */
    public static void m233277j(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Namespace cannot be null or empty");
        } else if (str.length() > 128) {
            throw new IllegalArgumentException("Invalid namespace length");
        } else if (!str.startsWith("urn:x-cast:")) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
        } else if (str.length() == 11) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
        }
    }

    /* renamed from: k */
    public static boolean m233278k(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        return (obj == null || obj2 == null || !obj.equals(obj2)) ? false : true;
    }

    /* renamed from: l */
    public static int[] m233279l(Collection collection) {
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: m */
    public static long[] m233280m(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        long[] jArr = new long[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            jArr[i] = jSONArray.getLong(i);
        }
        return jArr;
    }
}
