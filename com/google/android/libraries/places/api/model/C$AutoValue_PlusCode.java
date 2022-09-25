package com.google.android.libraries.places.api.model;

/* renamed from: com.google.android.libraries.places.api.model.$AutoValue_PlusCode  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_PlusCode extends PlusCode {

    /* renamed from: a */
    public final String f85550a;

    /* renamed from: b */
    public final String f85551b;

    public C$AutoValue_PlusCode(String str, String str2) {
        this.f85550a = str;
        this.f85551b = str2;
    }

    /* renamed from: a */
    public final String mo37530a() {
        return this.f85550a;
    }

    /* renamed from: b */
    public final String mo37531b() {
        return this.f85551b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlusCode) {
            PlusCode plusCode = (PlusCode) obj;
            String str = this.f85550a;
            if (str != null ? str.equals(plusCode.mo37530a()) : plusCode.mo37530a() == null) {
                String str2 = this.f85551b;
                if (str2 != null ? str2.equals(plusCode.mo37531b()) : plusCode.mo37531b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.f85550a;
        String str2 = this.f85551b;
        return "PlusCode{compoundCode=" + str + ", globalCode=" + str2 + "}";
    }

    public final int hashCode() {
        int i;
        String str = this.f85550a;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        String str2 = this.f85551b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 ^ i2;
    }
}
