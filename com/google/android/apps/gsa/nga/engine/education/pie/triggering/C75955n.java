package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80269x;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.n */
/* compiled from: PG */
final class C75955n extends C75963s {

    /* renamed from: a */
    public final String f210745a;

    /* renamed from: b */
    public final C80269x f210746b;

    public C75955n(String str, C80269x xVar) {
        if (str != null) {
            this.f210745a = str;
            if (xVar != null) {
                this.f210746b = xVar;
                return;
            }
            throw new NullPointerException("Null followupQueries");
        }
        throw new NullPointerException("Null query");
    }

    /* renamed from: a */
    public final C80269x mo71979a() {
        return this.f210746b;
    }

    /* renamed from: b */
    public final String mo71980b() {
        return this.f210745a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C75963s) {
            C75963s sVar = (C75963s) obj;
            return this.f210745a.equals(sVar.mo71980b()) && this.f210746b.equals(sVar.mo71979a());
        }
    }

    public final int hashCode() {
        return ((this.f210745a.hashCode() ^ 1000003) * 1000003) ^ this.f210746b.hashCode();
    }

    public final String toString() {
        String str = this.f210745a;
        String obj = this.f210746b.toString();
        return "Configuration{query=" + str + ", followupQueries=" + obj + "}";
    }
}
