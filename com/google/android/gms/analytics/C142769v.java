package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.C142720aq;
import com.google.android.gms.analytics.internal.C142732bb;
import com.google.android.gms.analytics.internal.C142737g;
import com.google.android.gms.analytics.internal.C142740j;
import com.google.android.gms.common.util.C144006f;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: com.google.android.gms.analytics.v */
/* compiled from: PG */
public final class C142769v extends C142737g {

    /* renamed from: a */
    public final Map f387411a;

    /* renamed from: b */
    public final Map f387412b = new HashMap();

    /* renamed from: c */
    public final C142720aq f387413c;

    /* renamed from: d */
    public final C142768u f387414d;

    public C142769v(C142740j jVar, String str) {
        super(jVar);
        HashMap hashMap = new HashMap();
        this.f387411a = hashMap;
        if (str != null) {
            hashMap.put("&tid", str);
        }
        hashMap.put("useSecure", "1");
        hashMap.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        C144006f fVar = this.f387328e.f387340h;
        this.f387413c = new C142720aq();
        this.f387414d = new C142768u(jVar);
    }

    /* renamed from: b */
    public static String m231693b(Map.Entry entry) {
        String str = (String) entry.getKey();
        if (!str.startsWith("&") || str.length() < 2) {
            return null;
        }
        return ((String) entry.getKey()).substring(1);
    }

    /* renamed from: c */
    public static void m231694c(Map map, Map map2) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String b = m231693b(entry);
                if (b != null) {
                    map2.put(b, (String) entry.getValue());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117488a() {
        this.f387414d.mo117538l();
        C142732bb j = this.f387328e.mo117550j();
        j.mo117537k();
        String str = j.f387319b;
        if (str != null) {
            mo117606d("&an", str);
        }
        C142732bb j2 = this.f387328e.mo117550j();
        j2.mo117537k();
        String str2 = j2.f387318a;
        if (str2 != null) {
            mo117606d("&av", str2);
        }
    }

    /* renamed from: d */
    public final void mo117606d(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f387411a.put(str, str2);
        }
    }
}
