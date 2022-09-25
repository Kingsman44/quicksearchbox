package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8504b;

import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.b.a */
/* compiled from: PG */
final class C111391a extends C111418v {

    /* renamed from: a */
    private final String f309935a;

    /* renamed from: b */
    private final double f309936b;

    /* renamed from: c */
    private final Intent f309937c;

    public C111391a(String str, double d, Intent intent) {
        if (str != null) {
            this.f309935a = str;
            this.f309936b = d;
            if (intent != null) {
                this.f309937c = intent;
                return;
            }
            throw new NullPointerException("Null intent");
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public final double mo99128a() {
        return this.f309936b;
    }

    /* renamed from: b */
    public final Intent mo99129b() {
        return this.f309937c;
    }

    /* renamed from: c */
    public final String mo99130c() {
        return this.f309935a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C111418v) {
            C111418v vVar = (C111418v) obj;
            return this.f309935a.equals(vVar.mo99130c()) && Double.doubleToLongBits(this.f309936b) == Double.doubleToLongBits(vVar.mo99128a()) && this.f309937c.equals(vVar.mo99129b());
        }
    }

    public final int hashCode() {
        return ((((this.f309935a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f309936b) >>> 32) ^ Double.doubleToLongBits(this.f309936b)))) * 1000003) ^ this.f309937c.hashCode();
    }

    public final String toString() {
        String str = this.f309935a;
        double d = this.f309936b;
        String obj = this.f309937c.toString();
        return "PackageInfo{packageName=" + str + ", score=" + d + ", intent=" + obj + "}";
    }
}
