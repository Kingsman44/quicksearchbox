package com.google.android.libraries.lens.view.infopanel.p2138a;

import com.google.common.p4552o.abp;

/* renamed from: com.google.android.libraries.lens.view.infopanel.a.c */
/* compiled from: PG */
public final class C26967c extends C26982r {

    /* renamed from: a */
    public final String f73542a;

    /* renamed from: b */
    private final abp f73543b;

    public C26967c(String str, abp abp) {
        if (str != null) {
            this.f73542a = str;
            if (abp != null) {
                this.f73543b = abp;
                return;
            }
            throw new NullPointerException("Null sourceForLogging");
        }
        throw new NullPointerException("Null query");
    }

    /* renamed from: a */
    public final abp mo32427a() {
        return this.f73543b;
    }

    /* renamed from: b */
    public final String mo32428b() {
        return this.f73542a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26982r) {
            C26982r rVar = (C26982r) obj;
            return this.f73542a.equals(rVar.mo32428b()) && this.f73543b.equals(rVar.mo32427a());
        }
    }

    public final int hashCode() {
        return ((this.f73542a.hashCode() ^ 1000003) * 1000003) ^ this.f73543b.hashCode();
    }

    public final String toString() {
        String str = this.f73542a;
        String num = Integer.toString(this.f73543b.f158221d);
        return "MultimodalQueryWrapper{query=" + str + ", sourceForLogging=" + num + "}";
    }
}
