package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4535g.C59203do;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.analytics.j */
/* compiled from: PG */
public abstract class C142757j {
    /* renamed from: a */
    public static String m231683a(Object obj, int i) {
        if (i > 10) {
            return "ERROR: Recursive toString calls";
        }
        if (obj == null) {
            return BuildConfig.FLAVOR;
        }
        if (obj instanceof String) {
            if (TextUtils.isEmpty((String) obj)) {
                return BuildConfig.FLAVOR;
            }
            return obj.toString();
        } else if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return BuildConfig.FLAVOR;
            }
            return obj.toString();
        } else if (obj instanceof Long) {
            if (((Long) obj).longValue() == 0) {
                return BuildConfig.FLAVOR;
            }
            return obj.toString();
        } else if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == C59203do.f157270a) {
                return BuildConfig.FLAVOR;
            }
            return obj.toString();
        } else if (obj instanceof Boolean) {
            if (!((Boolean) obj).booleanValue()) {
                return BuildConfig.FLAVOR;
            }
            return obj.toString();
        } else if (obj instanceof List) {
            StringBuilder sb = new StringBuilder();
            if (i > 0) {
                sb.append("[");
            }
            int length = sb.length();
            for (Object next : (List) obj) {
                if (sb.length() > length) {
                    sb.append(", ");
                }
                sb.append(m231683a(next, i + 1));
            }
            if (i > 0) {
                sb.append("]");
            }
            return sb.toString();
        } else if (!(obj instanceof Map)) {
            return obj.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            boolean z = false;
            int i2 = 0;
            for (Map.Entry entry : new TreeMap((Map) obj).entrySet()) {
                String a = m231683a(entry.getValue(), i + 1);
                if (!TextUtils.isEmpty(a)) {
                    if (i > 0 && !z) {
                        sb2.append("{");
                        i2 = sb2.length();
                        z = true;
                    }
                    if (sb2.length() > i2) {
                        sb2.append(", ");
                    }
                    sb2.append((String) entry.getKey());
                    sb2.append('=');
                    sb2.append(a);
                }
            }
            if (z) {
                sb2.append("}");
            }
            return sb2.toString();
        }
    }

    /* renamed from: b */
    public abstract void mo117461b(C142757j jVar);
}
