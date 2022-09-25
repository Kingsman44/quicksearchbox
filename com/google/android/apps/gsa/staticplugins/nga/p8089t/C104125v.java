package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.v */
/* compiled from: PG */
final class C104125v extends C103960cf {

    /* renamed from: a */
    private final String f289658a;

    /* renamed from: b */
    private final String f289659b;

    /* renamed from: c */
    private final C58485gu f289660c;

    /* renamed from: d */
    private final C58528ij f289661d;

    public C104125v(String str, String str2, C58485gu guVar, C58528ij ijVar) {
        this.f289658a = str;
        this.f289659b = str2;
        this.f289660c = guVar;
        this.f289661d = ijVar;
    }

    /* renamed from: a */
    public final C58485gu mo93895a() {
        return this.f289660c;
    }

    /* renamed from: b */
    public final C58528ij mo93896b() {
        return this.f289661d;
    }

    /* renamed from: c */
    public final String mo93897c() {
        return this.f289659b;
    }

    /* renamed from: d */
    public final String mo93898d() {
        return this.f289658a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C103960cf) {
            C103960cf cfVar = (C103960cf) obj;
            return this.f289658a.equals(cfVar.mo93898d()) && this.f289659b.equals(cfVar.mo93897c()) && C58597ky.m90218i(this.f289660c, cfVar.mo93895a()) && this.f289661d.equals(cfVar.mo93896b());
        }
    }

    public final int hashCode() {
        return ((((((this.f289658a.hashCode() ^ 1000003) * 1000003) ^ this.f289659b.hashCode()) * 1000003) ^ this.f289660c.hashCode()) * 1000003) ^ this.f289661d.hashCode();
    }

    public final String toString() {
        String str = this.f289658a;
        String str2 = this.f289659b;
        String obj = this.f289660c.toString();
        String obj2 = this.f289661d.toString();
        return "GroupSet{rawKey=" + str + ", languageRange=" + str2 + ", deviceModels=" + obj + ", requiredGroups=" + obj2 + "}";
    }
}
