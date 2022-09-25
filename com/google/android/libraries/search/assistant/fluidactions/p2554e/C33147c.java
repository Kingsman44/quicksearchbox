package com.google.android.libraries.search.assistant.fluidactions.p2554e;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.e.c */
/* compiled from: PG */
final class C33147c extends C33162r {

    /* renamed from: a */
    private final String f88688a;

    /* renamed from: b */
    private final String f88689b;

    public C33147c(String str, String str2) {
        this.f88688a = str;
        this.f88689b = str2;
    }

    /* renamed from: a */
    public final String mo38552a() {
        return this.f88688a;
    }

    /* renamed from: b */
    public final String mo38553b() {
        return this.f88689b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C33162r) {
            C33162r rVar = (C33162r) obj;
            String str = this.f88688a;
            if (str != null ? str.equals(rVar.mo38552a()) : rVar.mo38552a() == null) {
                String str2 = this.f88689b;
                if (str2 != null ? str2.equals(rVar.mo38553b()) : rVar.mo38553b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.f88688a;
        String str2 = this.f88689b;
        return "ContactProviderKey{accountType=" + str + ", mimeType=" + str2 + "}";
    }

    public final int hashCode() {
        int i;
        String str = this.f88688a;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        String str2 = this.f88689b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 ^ i2;
    }
}
