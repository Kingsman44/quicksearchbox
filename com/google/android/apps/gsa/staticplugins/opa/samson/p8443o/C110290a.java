package com.google.android.apps.gsa.staticplugins.opa.samson.p8443o;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.o.a */
/* compiled from: PG */
final class C110290a extends C110299j {

    /* renamed from: a */
    public final int f307398a;

    /* renamed from: b */
    private final String f307399b;

    /* renamed from: c */
    private final int f307400c;

    public C110290a(String str, int i, int i2) {
        this.f307399b = str;
        this.f307400c = i;
        this.f307398a = i2;
    }

    /* renamed from: a */
    public final int mo98540a() {
        return this.f307400c;
    }

    /* renamed from: b */
    public final int mo98541b() {
        return this.f307398a;
    }

    /* renamed from: c */
    public final String mo98542c() {
        return this.f307399b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C110299j) {
            C110299j jVar = (C110299j) obj;
            String str = this.f307399b;
            if (str != null ? str.equals(jVar.mo98542c()) : jVar.mo98542c() == null) {
                return this.f307400c == jVar.mo98540a() && this.f307398a == jVar.mo98541b();
            }
        }
    }

    public final int hashCode() {
        String str = this.f307399b;
        return (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f307400c) * 1000003) ^ this.f307398a;
    }

    public final String toString() {
        String str = this.f307399b;
        int i = this.f307400c;
        int i2 = this.f307398a;
        return "ConnectedDockRow{dockId=" + str + ", authenticated=" + i + ", connectionStatus=" + i2 + "}";
    }
}
