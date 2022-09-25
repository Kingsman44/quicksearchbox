package com.google.android.libraries.mdi.p2213d.p2214a.p2215a;

/* renamed from: com.google.android.libraries.mdi.d.a.a.b */
/* compiled from: PG */
public final class C28614b extends C28613a {

    /* renamed from: a */
    public final String f77836a;

    /* renamed from: b */
    public final String f77837b;

    public C28614b(String str, String str2) {
        if (str != null) {
            this.f77836a = str;
            this.f77837b = str2;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public final String mo34286a() {
        return this.f77837b;
    }

    /* renamed from: b */
    public final String mo34287b() {
        return null;
    }

    /* renamed from: c */
    public final String mo34288c() {
        return this.f77836a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28613a) {
            C28613a aVar = (C28613a) obj;
            return this.f77836a.equals(aVar.mo34288c()) && aVar.mo34287b() == null && this.f77837b.equals(aVar.mo34286a());
        }
    }

    public final int hashCode() {
        return ((this.f77836a.hashCode() ^ 1000003) * -721379959) ^ this.f77837b.hashCode();
    }

    public final String toString() {
        String str = this.f77836a;
        String str2 = this.f77837b;
        return "ApplicationId{packageName=" + str + ", moduleName=null, instanceId=" + str2 + "}";
    }
}
