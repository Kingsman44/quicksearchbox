package com.google.android.libraries.search.p2871b.p2892g;

/* renamed from: com.google.android.libraries.search.b.g.g */
/* compiled from: PG */
public final class C37245g extends C37240b {

    /* renamed from: a */
    private final int f98923a;

    /* renamed from: b */
    private final String f98924b;

    public C37245g(int i, String str) {
        this.f98923a = i;
        if (str != null) {
            this.f98924b = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: a */
    public final int mo40750a() {
        return this.f98923a;
    }

    /* renamed from: c */
    public final String mo40751c() {
        return this.f98924b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37240b) {
            C37240b bVar = (C37240b) obj;
            return this.f98923a == bVar.mo40750a() && this.f98924b.equals(bVar.mo40751c());
        }
    }

    public final int hashCode() {
        return ((this.f98923a ^ 1000003) * 1000003) ^ this.f98924b.hashCode();
    }

    public final String toString() {
        int i = this.f98923a;
        String str = this.f98924b;
        return "AppFlowMetadata{id=" + i + ", name=" + str + "}";
    }
}
