package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.a */
/* compiled from: PG */
final class C100121a extends C100174bz {

    /* renamed from: a */
    public final List f279948a;

    /* renamed from: b */
    public final C100187m f279949b;

    /* renamed from: c */
    public final String f279950c;

    public C100121a(List list, C100187m mVar, String str) {
        this.f279948a = list;
        this.f279949b = mVar;
        this.f279950c = str;
    }

    /* renamed from: a */
    public final C100187m mo91744a() {
        return this.f279949b;
    }

    /* renamed from: b */
    public final String mo91745b() {
        return this.f279950c;
    }

    /* renamed from: c */
    public final List mo91746c() {
        return this.f279948a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C100174bz) {
            C100174bz bzVar = (C100174bz) obj;
            return this.f279948a.equals(bzVar.mo91746c()) && this.f279949b.equals(bzVar.mo91744a()) && this.f279950c.equals(bzVar.mo91745b());
        }
    }

    public final int hashCode() {
        return ((((this.f279948a.hashCode() ^ 1000003) * 1000003) ^ this.f279949b.hashCode()) * 1000003) ^ this.f279950c.hashCode();
    }

    public final String toString() {
        String obj = this.f279948a.toString();
        String obj2 = this.f279949b.toString();
        String str = this.f279950c;
        return "SqliteQueryStatement{arguments=" + obj + ", tableAlias=" + obj2 + ", query=" + str + "}";
    }
}
