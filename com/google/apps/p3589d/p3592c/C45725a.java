package com.google.apps.p3589d.p3592c;

import com.google.apps.p3589d.p3593d.C45763v;

/* renamed from: com.google.apps.d.c.a */
/* compiled from: PG */
public final class C45725a extends C45731g {

    /* renamed from: a */
    public final C45763v f120226a;

    /* renamed from: b */
    public final int f120227b;

    /* renamed from: c */
    public final int f120228c;

    /* renamed from: d */
    private final boolean f120229d;

    public C45725a(C45763v vVar, int i, int i2, boolean z) {
        if (vVar != null) {
            this.f120226a = vVar;
            this.f120227b = i;
            this.f120228c = i2;
            this.f120229d = z;
            return;
        }
        throw new NullPointerException("Null list");
    }

    /* renamed from: a */
    public final int mo49836a() {
        return this.f120228c;
    }

    /* renamed from: b */
    public final int mo49837b() {
        return this.f120227b;
    }

    /* renamed from: c */
    public final C45763v mo49838c() {
        return this.f120226a;
    }

    /* renamed from: d */
    public final boolean mo49839d() {
        return this.f120229d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45731g) {
            C45731g gVar = (C45731g) obj;
            return this.f120226a.equals(gVar.mo49838c()) && this.f120227b == gVar.mo49837b() && this.f120228c == gVar.mo49836a() && this.f120229d == gVar.mo49839d();
        }
    }

    public final int hashCode() {
        return ((((((this.f120226a.hashCode() ^ 1000003) * 1000003) ^ this.f120227b) * 1000003) ^ this.f120228c) * 1000003) ^ (true != this.f120229d ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f120226a.toString();
        int i = this.f120227b;
        int i2 = this.f120228c;
        boolean z = this.f120229d;
        return "DomSelectionLocation{list=" + obj + ", startListIndex=" + i + ", size=" + i2 + ", includeLastSupSub=" + z + "}";
    }
}
