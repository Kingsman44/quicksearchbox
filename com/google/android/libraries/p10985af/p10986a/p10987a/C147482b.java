package com.google.android.libraries.p10985af.p10986a.p10987a;

/* renamed from: com.google.android.libraries.af.a.a.b */
/* compiled from: PG */
public final class C147482b extends C147477a {

    /* renamed from: a */
    public final String f398103a;

    /* renamed from: b */
    public final String f398104b;

    public C147482b(String str, String str2) {
        if (str != null) {
            this.f398103a = str;
            this.f398104b = str2;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public final String mo124225a() {
        return this.f398104b;
    }

    /* renamed from: b */
    public final String mo124226b() {
        return null;
    }

    /* renamed from: c */
    public final String mo124227c() {
        return this.f398103a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C147477a) {
            C147477a aVar = (C147477a) obj;
            return this.f398103a.equals(aVar.mo124227c()) && aVar.mo124226b() == null && this.f398104b.equals(aVar.mo124225a());
        }
    }

    public final int hashCode() {
        return ((this.f398103a.hashCode() ^ 1000003) * -721379959) ^ this.f398104b.hashCode();
    }

    public final String toString() {
        String str = this.f398103a;
        String str2 = this.f398104b;
        return "ApplicationId{packageName=" + str + ", moduleName=null, instanceId=" + str2 + "}";
    }
}
