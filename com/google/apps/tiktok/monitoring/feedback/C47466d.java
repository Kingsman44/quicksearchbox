package com.google.apps.tiktok.monitoring.feedback;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.apps.tiktok.monitoring.feedback.d */
/* compiled from: PG */
final class C47466d extends C47475l {

    /* renamed from: a */
    private final String f123257a;

    /* renamed from: b */
    private final C58833ax f123258b;

    /* renamed from: c */
    private final C58495hd f123259c;

    /* renamed from: d */
    private final boolean f123260d;

    /* renamed from: e */
    private final C58833ax f123261e;

    /* renamed from: f */
    private final int f123262f;

    public C47466d(String str, C58833ax axVar, C58495hd hdVar, boolean z, C58833ax axVar2, int i) {
        this.f123257a = str;
        this.f123258b = axVar;
        this.f123259c = hdVar;
        this.f123260d = z;
        this.f123261e = axVar2;
        this.f123262f = i;
    }

    /* renamed from: a */
    public final C58833ax mo51311a() {
        return this.f123261e;
    }

    /* renamed from: b */
    public final C58833ax mo51312b() {
        return this.f123258b;
    }

    /* renamed from: c */
    public final C58495hd mo51313c() {
        return this.f123259c;
    }

    /* renamed from: d */
    public final String mo51314d() {
        return this.f123257a;
    }

    /* renamed from: e */
    public final boolean mo51315e() {
        return this.f123260d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C47475l) {
            C47475l lVar = (C47475l) obj;
            return this.f123257a.equals(lVar.mo51314d()) && this.f123258b.equals(lVar.mo51312b()) && C58662ni.m90356o(this.f123259c, lVar.mo51313c()) && this.f123260d == lVar.mo51315e() && this.f123261e.equals(lVar.mo51311a()) && this.f123262f == lVar.mo51317f();
        }
    }

    /* renamed from: f */
    public final int mo51317f() {
        return this.f123262f;
    }

    public final int hashCode() {
        return ((((((((((this.f123257a.hashCode() ^ 1000003) * 1000003) ^ this.f123258b.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f123259c.entrySet())) * 1000003) ^ (true != this.f123260d ? 1237 : 1231)) * 1000003) ^ this.f123261e.hashCode()) * 1000003) ^ this.f123262f;
    }

    public final String toString() {
        String str = this.f123257a;
        String valueOf = String.valueOf(this.f123258b);
        String valueOf2 = String.valueOf(this.f123259c);
        boolean z = this.f123260d;
        String valueOf3 = String.valueOf(this.f123261e);
        int i = this.f123262f;
        String str2 = i != 1 ? i != 2 ? "DARK_THEME" : "LIGHT_THEME" : "SYSTEM_DEFAULT_THEME";
        return "FeedbackOptions{categoryTag=" + str + ", description=" + valueOf + ", psd=" + valueOf2 + ", includeScreenshot=" + z + ", customScreenshot=" + valueOf3 + ", colorTheme=" + str2 + "}";
    }
}
