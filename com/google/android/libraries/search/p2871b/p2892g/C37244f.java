package com.google.android.libraries.search.p2871b.p2892g;

/* renamed from: com.google.android.libraries.search.b.g.f */
/* compiled from: PG */
public final class C37244f extends C37239a {

    /* renamed from: a */
    private final int f98921a;

    /* renamed from: b */
    private final String f98922b;

    public C37244f(int i, String str) {
        this.f98921a = i;
        if (str != null) {
            this.f98922b = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: a */
    public final int mo40748a() {
        return this.f98921a;
    }

    /* renamed from: c */
    public final String mo40749c() {
        return this.f98922b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37239a) {
            C37239a aVar = (C37239a) obj;
            return this.f98921a == aVar.mo40748a() && this.f98922b.equals(aVar.mo40749c());
        }
    }

    public final int hashCode() {
        return ((this.f98921a ^ 1000003) * 1000003) ^ this.f98922b.hashCode();
    }

    public final String toString() {
        int i = this.f98921a;
        String str = this.f98922b;
        return "AppFlowEventMetadata{id=" + i + ", name=" + str + "}";
    }
}
