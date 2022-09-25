package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.a.c */
/* compiled from: PG */
final class C78314c extends C78306ba {

    /* renamed from: a */
    public final String f215623a;

    /* renamed from: b */
    public final String f215624b;

    /* renamed from: c */
    public final String f215625c;

    /* renamed from: d */
    public final C80831aj f215626d;

    /* renamed from: e */
    public final int f215627e;

    public C78314c(String str, String str2, String str3, C80831aj ajVar, int i) {
        this.f215623a = str;
        this.f215624b = str2;
        this.f215625c = str3;
        this.f215626d = ajVar;
        this.f215627e = i;
    }

    /* renamed from: a */
    public final C78304az mo73293a() {
        return new C78305b(this);
    }

    /* renamed from: b */
    public final C80831aj mo73294b() {
        return this.f215626d;
    }

    /* renamed from: c */
    public final String mo73295c() {
        return this.f215623a;
    }

    /* renamed from: d */
    public final String mo73296d() {
        return this.f215625c;
    }

    /* renamed from: e */
    public final String mo73297e() {
        return this.f215624b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78306ba) {
            C78306ba baVar = (C78306ba) obj;
            return this.f215623a.equals(baVar.mo73295c()) && this.f215624b.equals(baVar.mo73297e()) && this.f215625c.equals(baVar.mo73296d()) && this.f215626d.equals(baVar.mo73294b()) && this.f215627e == baVar.mo73298f();
        }
    }

    /* renamed from: f */
    public final int mo73298f() {
        return this.f215627e;
    }

    public final int hashCode() {
        return ((((((((this.f215623a.hashCode() ^ 1000003) * 1000003) ^ this.f215624b.hashCode()) * 1000003) ^ this.f215625c.hashCode()) * 1000003) ^ this.f215626d.hashCode()) * 1000003) ^ this.f215627e;
    }

    public final String toString() {
        String str = this.f215623a;
        String str2 = this.f215624b;
        String str3 = this.f215625c;
        String obj = this.f215626d.toString();
        String num = Integer.toString(this.f215627e - 1);
        return "PrivacyUi{chipText=" + str + ", primaryText=" + str2 + ", clickText=" + str3 + ", clickAction=" + obj + ", type=" + num + "}";
    }
}
