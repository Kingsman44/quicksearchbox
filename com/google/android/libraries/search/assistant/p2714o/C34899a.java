package com.google.android.libraries.search.assistant.p2714o;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.o.a */
/* compiled from: PG */
public final class C34899a extends C34917c {

    /* renamed from: a */
    private final Optional f92549a;

    /* renamed from: b */
    private final C58485gu f92550b;

    /* renamed from: c */
    private final Optional f92551c;

    /* renamed from: d */
    private final int f92552d;

    public C34899a(Optional optional, C58485gu guVar, Optional optional2, int i) {
        if (optional != null) {
            this.f92549a = optional;
            if (guVar != null) {
                this.f92550b = guVar;
                if (optional2 != null) {
                    this.f92551c = optional2;
                    this.f92552d = i;
                    return;
                }
                throw new NullPointerException("Null componentName");
            }
            throw new NullPointerException("Null componentNames");
        }
        throw new NullPointerException("Null exception");
    }

    /* renamed from: a */
    public final C58485gu mo39612a() {
        return this.f92550b;
    }

    /* renamed from: b */
    public final Optional mo39613b() {
        return this.f92551c;
    }

    /* renamed from: c */
    public final Optional mo39614c() {
        return this.f92549a;
    }

    /* renamed from: d */
    public final int mo39615d() {
        return this.f92552d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C34917c) {
            C34917c cVar = (C34917c) obj;
            return this.f92549a.equals(cVar.mo39614c()) && C58597ky.m90218i(this.f92550b, cVar.mo39612a()) && this.f92551c.equals(cVar.mo39613b()) && this.f92552d == cVar.mo39615d();
        }
    }

    public final int hashCode() {
        return ((((((this.f92549a.hashCode() ^ 1000003) * 1000003) ^ this.f92550b.hashCode()) * 1000003) ^ this.f92551c.hashCode()) * 1000003) ^ this.f92552d;
    }

    public final String toString() {
        String obj = this.f92549a.toString();
        String obj2 = this.f92550b.toString();
        String obj3 = this.f92551c.toString();
        String str = this.f92552d != 1 ? "GET_RUNNING_APP_PROCESSES" : "GET_RUNNING_TASKS";
        return "ForegroundAppData{exception=" + obj + ", componentNames=" + obj2 + ", componentName=" + obj3 + ", mode=" + str + "}";
    }
}
