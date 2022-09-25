package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8006h;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.h.c */
/* compiled from: PG */
final class C102054c extends C102060i {

    /* renamed from: a */
    private final String f284734a;

    /* renamed from: b */
    private final String f284735b;

    /* renamed from: c */
    private final String f284736c;

    public C102054c(String str, String str2, String str3) {
        if (str != null) {
            this.f284734a = str;
            if (str2 != null) {
                this.f284735b = str2;
                if (str3 != null) {
                    this.f284736c = str3;
                    return;
                }
                throw new NullPointerException("Null queryThree");
            }
            throw new NullPointerException("Null queryTwo");
        }
        throw new NullPointerException("Null queryOne");
    }

    /* renamed from: a */
    public final String mo92829a() {
        return this.f284734a;
    }

    /* renamed from: b */
    public final String mo92830b() {
        return this.f284736c;
    }

    /* renamed from: c */
    public final String mo92831c() {
        return this.f284735b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C102060i) {
            C102060i iVar = (C102060i) obj;
            return this.f284734a.equals(iVar.mo92829a()) && this.f284735b.equals(iVar.mo92831c()) && this.f284736c.equals(iVar.mo92830b());
        }
    }

    public final int hashCode() {
        return ((((this.f284734a.hashCode() ^ 1000003) * 1000003) ^ this.f284735b.hashCode()) * 1000003) ^ this.f284736c.hashCode();
    }

    public final String toString() {
        String str = this.f284734a;
        String str2 = this.f284735b;
        String str3 = this.f284736c;
        return "ExampleQueries{queryOne=" + str + ", queryTwo=" + str2 + ", queryThree=" + str3 + "}";
    }
}
