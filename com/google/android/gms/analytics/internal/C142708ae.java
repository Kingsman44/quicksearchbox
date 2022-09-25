package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.analytics.internal.ae */
/* compiled from: PG */
public final class C142708ae {

    /* renamed from: a */
    public final C142740j f387233a;

    /* renamed from: b */
    public volatile Boolean f387234b;

    /* renamed from: c */
    private String f387235c;

    /* renamed from: d */
    private Set f387236d;

    protected C142708ae(C142740j jVar) {
        this.f387233a = jVar;
    }

    /* renamed from: b */
    public static final long m231544b() {
        return ((Long) C142715al.f387259f.mo117506a()).longValue();
    }

    /* renamed from: c */
    public static final long m231545c() {
        return ((Long) C142715al.f387258e.mo117506a()).longValue();
    }

    /* renamed from: d */
    public static final int m231546d() {
        return ((Integer) C142715al.f387262i.mo117506a()).intValue();
    }

    /* renamed from: e */
    public static final int m231547e() {
        return ((Integer) C142715al.f387261h.mo117506a()).intValue();
    }

    /* renamed from: f */
    public static final String m231548f() {
        return (String) C142715al.f387264k.mo117506a();
    }

    /* renamed from: g */
    public static final String m231549g() {
        return (String) C142715al.f387265l.mo117506a();
    }

    /* renamed from: h */
    public static final String m231550h() {
        return (String) C142715al.f387263j.mo117506a();
    }

    /* renamed from: i */
    public static final boolean m231551i() {
        return ((Boolean) C142715al.f387254a.mo117506a()).booleanValue();
    }

    /* renamed from: a */
    public final Set mo117496a() {
        String str;
        String str2 = (String) C142715al.f387273t.mo117506a();
        if (this.f387236d == null || (str = this.f387235c) == null || !str.equals(str2)) {
            String[] split = TextUtils.split(str2, ",");
            HashSet hashSet = new HashSet();
            for (String parseInt : split) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(parseInt)));
                } catch (NumberFormatException unused) {
                }
            }
            this.f387235c = str2;
            this.f387236d = hashSet;
        }
        return this.f387236d;
    }
}
