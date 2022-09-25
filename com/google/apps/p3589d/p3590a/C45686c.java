package com.google.apps.p3589d.p3590a;

/* renamed from: com.google.apps.d.a.c */
/* compiled from: PG */
public final class C45686c extends C45704u {

    /* renamed from: a */
    private final String f120171a;

    /* renamed from: b */
    private final String f120172b;

    /* renamed from: c */
    private final int f120173c;

    public C45686c(String str, String str2, int i) {
        if (str != null) {
            this.f120171a = str;
            if (str2 != null) {
                this.f120172b = str2;
                this.f120173c = i;
                return;
            }
            throw new NullPointerException("Null latex");
        }
        throw new NullPointerException("Null displayString");
    }

    /* renamed from: a */
    public final int mo49748a() {
        return this.f120173c;
    }

    /* renamed from: b */
    public final String mo49749b() {
        return this.f120171a;
    }

    /* renamed from: c */
    public final String mo49750c() {
        return this.f120172b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45704u) {
            C45704u uVar = (C45704u) obj;
            return this.f120171a.equals(uVar.mo49749b()) && this.f120172b.equals(uVar.mo49750c()) && this.f120173c == uVar.mo49748a();
        }
    }

    public final int hashCode() {
        return ((((this.f120171a.hashCode() ^ 1000003) * 1000003) ^ this.f120172b.hashCode()) * 1000003) ^ this.f120173c;
    }

    public final String toString() {
        String str = this.f120171a;
        String str2 = this.f120172b;
        int i = this.f120173c;
        return "VariableStat{displayString=" + str + ", latex=" + str2 + ", count=" + i + "}";
    }
}
