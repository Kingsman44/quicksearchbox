package com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a;

import com.google.common.base.C58833ax;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.ondevice.f.a.a.b */
/* compiled from: PG */
final class C24447b extends C24449d {

    /* renamed from: a */
    private final Locale f66940a;

    /* renamed from: b */
    private final String f66941b;

    /* renamed from: c */
    private final int f66942c;

    /* renamed from: d */
    private final int f66943d;

    /* renamed from: e */
    private final C58833ax f66944e;

    public C24447b(Locale locale, String str, int i, int i2, C58833ax axVar) {
        this.f66940a = locale;
        this.f66941b = str;
        this.f66942c = i;
        this.f66943d = i2;
        this.f66944e = axVar;
    }

    /* renamed from: a */
    public final int mo29896a() {
        return this.f66943d;
    }

    /* renamed from: b */
    public final int mo29897b() {
        return this.f66942c;
    }

    /* renamed from: c */
    public final C58833ax mo29898c() {
        return this.f66944e;
    }

    /* renamed from: d */
    public final String mo29899d() {
        return this.f66941b;
    }

    /* renamed from: e */
    public final Locale mo29900e() {
        return this.f66940a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24449d) {
            C24449d dVar = (C24449d) obj;
            Locale locale = this.f66940a;
            if (locale != null ? locale.equals(dVar.mo29900e()) : dVar.mo29900e() == null) {
                return this.f66941b.equals(dVar.mo29899d()) && this.f66942c == dVar.mo29897b() && this.f66943d == dVar.mo29896a() && this.f66944e.equals(dVar.mo29898c());
            }
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f66940a);
        String str = this.f66941b;
        int i = this.f66942c;
        int i2 = this.f66943d;
        String valueOf2 = String.valueOf(this.f66944e);
        return "ModelDownloadEvent{locale=" + valueOf + ", modelName=" + str + ", eventType=" + i + ", errorType=" + i2 + ", currentBytes=" + valueOf2 + "}";
    }

    public final int hashCode() {
        int i;
        Locale locale = this.f66940a;
        if (locale == null) {
            i = 0;
        } else {
            i = locale.hashCode();
        }
        return ((((((((i ^ 1000003) * 1000003) ^ this.f66941b.hashCode()) * 1000003) ^ this.f66942c) * 1000003) ^ this.f66943d) * 1000003) ^ this.f66944e.hashCode();
    }
}
