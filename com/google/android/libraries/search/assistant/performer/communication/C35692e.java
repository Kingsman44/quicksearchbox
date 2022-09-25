package com.google.android.libraries.search.assistant.performer.communication;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.e */
/* compiled from: PG */
final class C35692e extends C35515ah {

    /* renamed from: a */
    private final String f93582a;

    /* renamed from: b */
    private final String f93583b;

    /* renamed from: c */
    private final String f93584c;

    public C35692e(String str, String str2, String str3) {
        this.f93582a = str;
        this.f93583b = str2;
        this.f93584c = str3;
    }

    /* renamed from: a */
    public final String mo39686a() {
        return this.f93582a;
    }

    /* renamed from: b */
    public final String mo39687b() {
        return this.f93583b;
    }

    /* renamed from: c */
    public final String mo39688c() {
        return this.f93584c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C35515ah) {
            C35515ah ahVar = (C35515ah) obj;
            String str = this.f93582a;
            if (str != null ? str.equals(ahVar.mo39686a()) : ahVar.mo39686a() == null) {
                String str2 = this.f93583b;
                if (str2 != null ? str2.equals(ahVar.mo39687b()) : ahVar.mo39687b() == null) {
                    String str3 = this.f93584c;
                    if (str3 != null ? str3.equals(ahVar.mo39688c()) : ahVar.mo39688c() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.f93582a;
        String str2 = this.f93583b;
        String str3 = this.f93584c;
        return "CallLogContact{contactId=" + str + ", name=" + str2 + ", phoneNumber=" + str3 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f93582a;
        int i3 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = (i ^ 1000003) * 1000003;
        String str2 = this.f93583b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        String str3 = this.f93584c;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 ^ i3;
    }
}
