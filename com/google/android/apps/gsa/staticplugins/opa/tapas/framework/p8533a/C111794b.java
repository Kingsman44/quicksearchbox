package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8533a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.a.b */
/* compiled from: PG */
public final class C111794b extends C111809q {

    /* renamed from: a */
    public final C58485gu f310706a;

    /* renamed from: b */
    private final String f310707b;

    /* renamed from: c */
    private final String f310708c;

    /* renamed from: d */
    private final long f310709d;

    /* renamed from: e */
    private final Optional f310710e;

    /* renamed from: f */
    private final int f310711f;

    public C111794b(String str, String str2, long j, int i, C58485gu guVar, Optional optional) {
        this.f310707b = str;
        this.f310708c = str2;
        this.f310709d = j;
        this.f310711f = i;
        this.f310706a = guVar;
        this.f310710e = optional;
    }

    /* renamed from: a */
    public final long mo99239a() {
        return this.f310709d;
    }

    /* renamed from: b */
    public final C58485gu mo99240b() {
        return this.f310706a;
    }

    /* renamed from: c */
    public final Optional mo99241c() {
        return this.f310710e;
    }

    /* renamed from: e */
    public final String mo99242e() {
        return this.f310707b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C111809q) {
            C111809q qVar = (C111809q) obj;
            return this.f310707b.equals(qVar.mo99242e()) && this.f310708c.equals(qVar.mo99244f()) && this.f310709d == qVar.mo99239a() && this.f310711f == qVar.mo99245g() && C58597ky.m90218i(this.f310706a, qVar.mo99240b()) && this.f310710e.equals(qVar.mo99241c());
        }
    }

    /* renamed from: f */
    public final String mo99244f() {
        return this.f310708c;
    }

    /* renamed from: g */
    public final int mo99245g() {
        return this.f310711f;
    }

    public final int hashCode() {
        int hashCode = this.f310707b.hashCode();
        int hashCode2 = this.f310708c.hashCode();
        long j = this.f310709d;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f310711f) * 1000003) ^ this.f310706a.hashCode()) * 1000003) ^ this.f310710e.hashCode();
    }

    public final String toString() {
        String str = this.f310707b;
        String str2 = this.f310708c;
        long j = this.f310709d;
        int i = this.f310711f;
        String obj = this.f310706a.toString();
        String valueOf = String.valueOf(this.f310710e);
        return "SourceLatencyInfo{prefix=" + str + ", sourceName=" + str2 + ", latencyInMs=" + j + ", state=" + C111808p.m185661a(i) + ", suggestions=" + obj + ", exception=" + valueOf + "}";
    }
}
