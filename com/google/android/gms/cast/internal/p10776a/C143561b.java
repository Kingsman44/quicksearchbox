package com.google.android.gms.cast.internal.p10776a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.common.images.WebImage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.internal.a.b */
/* compiled from: PG */
public final class C143561b {

    /* renamed from: a */
    private static final C143566ae f389260a = new C143566ae("MetadataUtils");

    /* renamed from: b */
    private static final String[] f389261b = {"Z", "+hh", "+hhmm", "+hh:mm"};

    /* renamed from: c */
    private static final String f389262c = "yyyyMMdd'T'HHmmss".concat(String.valueOf("Z"));

    /* renamed from: a */
    public static Calendar m233153a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            f389260a.mo118884b("Input string is empty or null", new Object[0]);
            return null;
        }
        String d = m233156d(str);
        if (TextUtils.isEmpty(d)) {
            f389260a.mo118884b("Invalid date format", new Object[0]);
            return null;
        }
        String e = m233157e(str);
        if (!TextUtils.isEmpty(e)) {
            d = d + "T" + e;
            str2 = e.length() == 6 ? "yyyyMMdd'T'HHmmss" : f389262c;
        } else {
            str2 = "yyyyMMdd";
        }
        Calendar instance = GregorianCalendar.getInstance();
        try {
            instance.setTime(new SimpleDateFormat(str2).parse(d));
            return instance;
        } catch (ParseException e2) {
            f389260a.mo118887e(e2, "Error parsing string", new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    public static void m233155c(List list, JSONArray jSONArray) {
        try {
            list.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                try {
                    Uri uri = Uri.EMPTY;
                    if (jSONObject.has("url")) {
                        try {
                            uri = Uri.parse(jSONObject.getString("url"));
                        } catch (JSONException unused) {
                        }
                    }
                    list.add(new WebImage(uri, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
                } catch (IllegalArgumentException unused2) {
                }
            }
        } catch (JSONException unused3) {
        }
    }

    /* renamed from: d */
    private static String m233156d(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return str.substring(0, 8);
            } catch (IndexOutOfBoundsException e) {
                f389260a.mo118887e(e, "Error extracting the date", new Object[0]);
                return null;
            }
        } else {
            f389260a.mo118884b("Input string is empty or null", new Object[0]);
            return null;
        }
    }

    /* renamed from: e */
    private static String m233157e(String str) {
        if (TextUtils.isEmpty(str)) {
            f389260a.mo118884b("string is empty or null", new Object[0]);
            return null;
        }
        int indexOf = str.indexOf(84);
        int i = indexOf + 1;
        if (indexOf != 8) {
            f389260a.mo118884b("T delimeter is not found", new Object[0]);
            return null;
        }
        try {
            String substring = str.substring(i);
            if (substring.length() == 6) {
                return substring;
            }
            char charAt = substring.charAt(6);
            if (charAt == '+' || charAt == '-') {
                int length = substring.length();
                String[] strArr = f389261b;
                if (length == strArr[1].length() + 6 || length == strArr[2].length() + 6 || length == strArr[3].length() + 6) {
                    return substring.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                }
            } else if (charAt == 'Z' && substring.length() == f389261b[0].length() + 6) {
                return String.valueOf(substring.substring(0, substring.length() - 1)).concat("+0000");
            } else {
                return null;
            }
            return null;
        } catch (IndexOutOfBoundsException e) {
            f389260a.mo118887e(e, "Error extracting the time substring: %s", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public static JSONArray m233154b(List list) {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WebImage webImage = (WebImage) it.next();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", webImage.f389996b.toString());
                jSONObject.put("width", webImage.f389997c);
                jSONObject.put("height", webImage.f389998d);
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
