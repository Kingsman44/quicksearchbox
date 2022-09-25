package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.analytics.internal.f */
/* compiled from: PG */
public class C142736f {

    /* renamed from: e */
    public final C142740j f387328e;

    protected C142736f(C142740j jVar) {
        C143919bh.m233958a(jVar);
        this.f387328e = jVar;
    }

    /* renamed from: a */
    private static String m231617a(Object obj) {
        if (obj == null) {
            return BuildConfig.FLAVOR;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            return obj == Boolean.TRUE ? "true" : "false";
        }
        if (obj instanceof Throwable) {
            return ((Throwable) obj).toString();
        }
        return obj.toString();
    }

    /* renamed from: h */
    protected static String m231618h(String str, Object obj, Object obj2, Object obj3) {
        String str2;
        String a = m231617a(obj);
        String a2 = m231617a(obj2);
        String a3 = m231617a(obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        } else {
            str2 = BuildConfig.FLAVOR;
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(a)) {
            sb.append(str2);
            sb.append(a);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str3);
            sb.append(a3);
        }
        return sb.toString();
    }

    /* renamed from: j */
    public static final boolean m231619j() {
        return Log.isLoggable((String) C142715al.f387255b.mo117506a(), 2);
    }

    /* renamed from: i */
    public final void mo117536i(int i, String str, Object obj, Object obj2, Object obj3) {
        C142740j jVar = this.f387328e;
        C142722as asVar = jVar != null ? jVar.f387337e : null;
        if (asVar != null) {
            String str2 = (String) C142715al.f387255b.mo117506a();
            if (Log.isLoggable(str2, i)) {
                Log.println(i, str2, C142722as.m231618h(str, obj, obj2, obj3));
            }
            if (i >= 5) {
                asVar.mo117511d(i, str, obj, obj2, obj3);
                return;
            }
            return;
        }
        String str3 = (String) C142715al.f387255b.mo117506a();
        if (Log.isLoggable(str3, i)) {
            Log.println(i, str3, m231618h(str, obj, obj2, obj3));
        }
    }
}
