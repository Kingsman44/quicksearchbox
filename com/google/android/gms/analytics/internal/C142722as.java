package com.google.android.gms.analytics.internal;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.util.C144014n;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.google.android.gms.analytics.internal.as */
/* compiled from: PG */
public final class C142722as extends C142737g {

    /* renamed from: a */
    public static C142722as f387299a;

    public C142722as(C142740j jVar) {
        super(jVar);
    }

    /* renamed from: e */
    protected static final String m231571e(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        String str = "-";
        if (obj instanceof Long) {
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            if (obj.toString().charAt(0) != '-') {
                str = BuildConfig.FLAVOR;
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            return str + Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1))) + "..." + str + Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            return obj instanceof Throwable ? obj.getClass().getCanonicalName() : str;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117488a() {
        synchronized (C142722as.class) {
            f387299a = this;
        }
    }

    /* renamed from: b */
    public final void mo117509b(C142718ao aoVar, String str) {
        super.mo117536i(5, "Discarding hit. ".concat(str), aoVar != null ? aoVar.toString() : "no hit data", (Object) null, (Object) null);
    }

    /* renamed from: c */
    public final void mo117510c(Map map, String str) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append((String) entry.getKey());
            sb.append('=');
            sb.append((String) entry.getValue());
        }
        super.mo117536i(5, "Discarding hit. ".concat(str), sb.toString(), (Object) null, (Object) null);
    }

    /* renamed from: d */
    public final synchronized void mo117511d(int i, String str, Object obj, Object obj2, Object obj3) {
        char c;
        C142708ae aeVar = this.f387328e.f387336d;
        if (aeVar.f387234b == null) {
            synchronized (aeVar) {
                if (aeVar.f387234b == null) {
                    ApplicationInfo applicationInfo = aeVar.f387233a.f387334b.getApplicationInfo();
                    String a = C144014n.m234194a();
                    if (applicationInfo != null) {
                        String str2 = applicationInfo.processName;
                        aeVar.f387234b = Boolean.valueOf(str2 != null && str2.equals(a));
                    }
                    if ((aeVar.f387234b == null || !aeVar.f387234b.booleanValue()) && "com.google.android.gms.analytics".equals(a)) {
                        aeVar.f387234b = Boolean.TRUE;
                    }
                    if (aeVar.f387234b == null) {
                        aeVar.f387234b = Boolean.TRUE;
                        aeVar.f387233a.mo117548h().mo117536i(6, "My process not in the list of running processes", (Object) null, (Object) null, (Object) null);
                    }
                }
            }
        }
        if (aeVar.f387234b.booleanValue()) {
            C142708ae aeVar2 = this.f387328e.f387336d;
            c = 'C';
        } else {
            C142708ae aeVar3 = this.f387328e.f387336d;
            c = 'c';
        }
        String str3 = "3" + "01VDIWEA?".charAt(i) + c + C142738h.f387330a + ":" + m231618h(str, m231571e(obj), m231571e(obj2), m231571e(obj3));
        if (str3.length() > 1024) {
            str3 = str3.substring(0, 1024);
        }
        C142726aw awVar = this.f387328e.f387338f;
        if (awVar == null || !awVar.mo117539m()) {
            awVar = null;
        }
        if (awVar != null) {
            C142725av avVar = awVar.f387311b;
            if (avVar.mo117519a() == 0) {
                avVar.mo117522d();
            }
            if (str3 == null) {
                str3 = BuildConfig.FLAVOR;
            }
            synchronized (avVar) {
                long j = avVar.f387308b.f387310a.getLong(avVar.mo117520b(), 0);
                if (j <= 0) {
                    SharedPreferences.Editor edit = avVar.f387308b.f387310a.edit();
                    edit.putString(avVar.mo117521c(), str3);
                    edit.putLong(avVar.mo117520b(), 1);
                    edit.apply();
                    return;
                }
                long j2 = j + 1;
                SharedPreferences.Editor edit2 = avVar.f387308b.f387310a.edit();
                if ((UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / j2) {
                    edit2.putString(avVar.mo117521c(), str3);
                }
                edit2.putLong(avVar.mo117520b(), j2);
                edit2.apply();
            }
        }
    }
}
