package com.google.android.gms.cast.framework.p10772a.p10773a;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.cast.framework.p10772a.C143392c;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import com.google.common.p4552o.p4557d.p4558a.C59715c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.cast.framework.a.a.i */
/* compiled from: PG */
public final class C143390i {

    /* renamed from: a */
    public static final C143566ae f388879a = new C143566ae("FeatureUsageAnalytics");

    /* renamed from: b */
    public static final String f388880b = "21.2.0-eap02";

    /* renamed from: k */
    private static C143390i f388881k;

    /* renamed from: c */
    public final C143392c f388882c;

    /* renamed from: d */
    public final SharedPreferences f388883d;

    /* renamed from: e */
    public final String f388884e;

    /* renamed from: f */
    public final Runnable f388885f = new C143389h(this);

    /* renamed from: g */
    public final Handler f388886g = new C144861c(Looper.getMainLooper());

    /* renamed from: h */
    public final Set f388887h = new HashSet();

    /* renamed from: i */
    public final Set f388888i = new HashSet();

    /* renamed from: j */
    public long f388889j;

    private C143390i(SharedPreferences sharedPreferences, C143392c cVar, String str) {
        this.f388883d = sharedPreferences;
        this.f388882c = cVar;
        this.f388884e = str;
    }

    /* renamed from: a */
    public static synchronized C143390i m232666a(SharedPreferences sharedPreferences, C143392c cVar, String str) {
        C143390i iVar;
        synchronized (C143390i.class) {
            if (f388881k == null) {
                f388881k = new C143390i(sharedPreferences, cVar, str);
            }
            iVar = f388881k;
        }
        return iVar;
    }

    /* renamed from: b */
    public static C59715c m232667b(String str) {
        try {
            return C59715c.m92491a(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return C59715c.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        }
    }

    /* renamed from: c */
    static String m232668c(String str, String str2) {
        return String.format("%s%s", new Object[]{str, str2});
    }

    /* renamed from: e */
    public static void m232669e(C59715c cVar) {
        C143390i iVar = f388881k;
        if (iVar != null) {
            iVar.f388883d.edit().putLong(iVar.mo118564d(Integer.toString(cVar.f160290ac)), System.currentTimeMillis()).apply();
            iVar.f388887h.add(cVar);
            iVar.mo118566g();
        }
    }

    /* renamed from: d */
    public final String mo118564d(String str) {
        String c = m232668c("feature_usage_timestamp_reported_feature_", str);
        if (this.f388883d.contains(c)) {
            return c;
        }
        return m232668c("feature_usage_timestamp_detected_feature_", str);
    }

    /* renamed from: f */
    public final void mo118565f(Set set) {
        if (!set.isEmpty()) {
            SharedPreferences.Editor edit = this.f388883d.edit();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                edit.remove((String) it.next());
            }
            edit.apply();
        }
    }

    /* renamed from: g */
    public final void mo118566g() {
        this.f388886g.post(this.f388885f);
    }
}
