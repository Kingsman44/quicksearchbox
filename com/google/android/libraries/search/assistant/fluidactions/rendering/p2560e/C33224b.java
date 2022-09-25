package com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.e.b */
/* compiled from: PG */
public final class C33224b extends C33223a {

    /* renamed from: a */
    public final String f88846a;

    /* renamed from: b */
    public final String f88847b;

    /* renamed from: c */
    public final Double f88848c;

    /* renamed from: d */
    public final Double f88849d;

    public C33224b(String str, String str2, Double d, Double d2) {
        this.f88846a = str;
        this.f88847b = str2;
        this.f88848c = d;
        this.f88849d = d2;
    }

    /* renamed from: a */
    public final Double mo38607a() {
        return this.f88848c;
    }

    /* renamed from: b */
    public final Double mo38608b() {
        return this.f88849d;
    }

    /* renamed from: c */
    public final String mo38609c() {
        return this.f88846a;
    }

    /* renamed from: d */
    public final String mo38610d() {
        return this.f88847b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C33223a) {
            C33223a aVar = (C33223a) obj;
            String str = this.f88846a;
            if (str != null ? str.equals(aVar.mo38609c()) : aVar.mo38609c() == null) {
                String str2 = this.f88847b;
                if (str2 != null ? str2.equals(aVar.mo38610d()) : aVar.mo38610d() == null) {
                    Double d = this.f88848c;
                    if (d != null ? d.equals(aVar.mo38607a()) : aVar.mo38607a() == null) {
                        Double d2 = this.f88849d;
                        if (d2 != null ? d2.equals(aVar.mo38608b()) : aVar.mo38608b() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.f88846a;
        String str2 = this.f88847b;
        Double d = this.f88848c;
        Double d2 = this.f88849d;
        return "AssistantPlace{address=" + str + ", name=" + str2 + ", latitude=" + d + ", longitude=" + d2 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.f88846a;
        int i4 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i5 = (i ^ 1000003) * 1000003;
        String str2 = this.f88847b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i6 = (i5 ^ i2) * 1000003;
        Double d = this.f88848c;
        if (d == null) {
            i3 = 0;
        } else {
            i3 = d.hashCode();
        }
        int i7 = (i6 ^ i3) * 1000003;
        Double d2 = this.f88849d;
        if (d2 != null) {
            i4 = d2.hashCode();
        }
        return i7 ^ i4;
    }
}
