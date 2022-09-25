package com.google.android.apps.gsa.smartspace.p7258b;

import com.google.common.p4552o.all;

/* renamed from: com.google.android.apps.gsa.smartspace.b.a */
/* compiled from: PG */
final class C92037a extends C92044ag {

    /* renamed from: a */
    public final int f256594a;

    /* renamed from: b */
    public final all f256595b;

    /* renamed from: c */
    private final String f256596c;

    public C92037a(int i, String str, all all) {
        this.f256594a = i;
        if (str != null) {
            this.f256596c = str;
            if (all != null) {
                this.f256595b = all;
                return;
            }
            throw new NullPointerException("Null smartspaceEvent");
        }
        throw new NullPointerException("Null text");
    }

    /* renamed from: a */
    public final int mo86689a() {
        return this.f256594a;
    }

    /* renamed from: b */
    public final all mo86690b() {
        return this.f256595b;
    }

    /* renamed from: c */
    public final String mo86691c() {
        return this.f256596c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C92044ag) {
            C92044ag agVar = (C92044ag) obj;
            return this.f256594a == agVar.mo86689a() && this.f256596c.equals(agVar.mo86691c()) && this.f256595b.equals(agVar.mo86690b());
        }
    }

    public final int hashCode() {
        return ((((this.f256594a ^ 1000003) * 1000003) ^ this.f256596c.hashCode()) * 1000003) ^ this.f256595b.hashCode();
    }

    public final String toString() {
        int i = this.f256594a;
        String str = this.f256596c;
        String obj = this.f256595b.toString();
        return "Content{ve=" + i + ", text=" + str + ", smartspaceEvent=" + obj + "}";
    }
}
