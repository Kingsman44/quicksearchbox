package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a.p8326a;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.a.a.a */
/* compiled from: PG */
final class C107804a extends C107819p {

    /* renamed from: a */
    public final Query f299972a;

    /* renamed from: b */
    public final Query f299973b;

    /* renamed from: c */
    public final String f299974c;

    /* renamed from: d */
    public final C58833ax f299975d;

    /* renamed from: e */
    public final C58833ax f299976e;

    public C107804a(Query query, Query query2, String str, C58833ax axVar, C58833ax axVar2) {
        this.f299972a = query;
        this.f299973b = query2;
        this.f299974c = str;
        this.f299975d = axVar;
        this.f299976e = axVar2;
    }

    /* renamed from: a */
    public final Query mo96288a() {
        return this.f299973b;
    }

    /* renamed from: b */
    public final Query mo96289b() {
        return this.f299972a;
    }

    /* renamed from: c */
    public final C58833ax mo96290c() {
        return this.f299975d;
    }

    /* renamed from: d */
    public final C58833ax mo96291d() {
        return this.f299976e;
    }

    /* renamed from: e */
    public final String mo96292e() {
        return this.f299974c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C107819p) {
            C107819p pVar = (C107819p) obj;
            Query query = this.f299972a;
            if (query != null ? query.equals(pVar.mo96289b()) : pVar.mo96289b() == null) {
                Query query2 = this.f299973b;
                if (query2 != null ? query2.equals(pVar.mo96288a()) : pVar.mo96288a() == null) {
                    String str = this.f299974c;
                    if (str != null ? str.equals(pVar.mo96292e()) : pVar.mo96292e() == null) {
                        return this.f299975d.equals(pVar.mo96290c()) && this.f299976e.equals(pVar.mo96291d());
                    }
                }
            }
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f299972a);
        String valueOf2 = String.valueOf(this.f299973b);
        String str = this.f299974c;
        String obj = this.f299975d.toString();
        String obj2 = this.f299976e.toString();
        return "StartOpaParameters{uiHandoverQuery=" + valueOf + ", cloudHandoverQuery=" + valueOf2 + ", userTranscription=" + str + ", extraOptional=" + obj + ", hideOpaOptional=" + obj2 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        Query query = this.f299972a;
        int i3 = 0;
        if (query == null) {
            i = 0;
        } else {
            i = query.hashCode();
        }
        int i4 = (i ^ 1000003) * 1000003;
        Query query2 = this.f299973b;
        if (query2 == null) {
            i2 = 0;
        } else {
            i2 = query2.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        String str = this.f299974c;
        if (str != null) {
            i3 = str.hashCode();
        }
        return ((((i5 ^ i3) * 1000003) ^ this.f299975d.hashCode()) * 1000003) ^ this.f299976e.hashCode();
    }
}
