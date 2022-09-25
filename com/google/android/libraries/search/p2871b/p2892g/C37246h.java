package com.google.android.libraries.search.p2871b.p2892g;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.libraries.search.b.g.h */
/* compiled from: PG */
public final class C37246h extends C37243e {

    /* renamed from: a */
    private final int f98925a;

    /* renamed from: b */
    private final String f98926b;

    /* renamed from: c */
    private final String f98927c;

    /* renamed from: d */
    private final C58495hd f98928d;

    public C37246h(int i, String str, String str2, C58495hd hdVar) {
        this.f98925a = i;
        this.f98926b = str;
        this.f98927c = str2;
        if (hdVar != null) {
            this.f98928d = hdVar;
            return;
        }
        throw new NullPointerException("Null customErrorSpaces");
    }

    /* renamed from: a */
    public final int mo40752a() {
        return this.f98925a;
    }

    /* renamed from: c */
    public final C58495hd mo40753c() {
        return this.f98928d;
    }

    /* renamed from: d */
    public final String mo40754d() {
        return this.f98927c;
    }

    /* renamed from: e */
    public final String mo40755e() {
        return this.f98926b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37243e) {
            C37243e eVar = (C37243e) obj;
            return this.f98925a == eVar.mo40752a() && this.f98926b.equals(eVar.mo40755e()) && this.f98927c.equals(eVar.mo40754d()) && this.f98928d.equals(eVar.mo40753c());
        }
    }

    public final int hashCode() {
        return ((((((this.f98925a ^ 1000003) * 1000003) ^ this.f98926b.hashCode()) * 1000003) ^ this.f98927c.hashCode()) * 1000003) ^ C58758qx.m90643a(this.f98928d.entrySet());
    }

    public final String toString() {
        int i = this.f98925a;
        String str = this.f98926b;
        String str2 = this.f98927c;
        String obj = this.f98928d.toString();
        return "AppMetadata{id=" + i + ", name=" + str + ", displayName=" + str2 + ", customErrorSpaces=" + obj + "}";
    }
}
