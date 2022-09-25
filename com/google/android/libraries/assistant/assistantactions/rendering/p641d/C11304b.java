package com.google.android.libraries.assistant.assistantactions.rendering.p641d;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.d.b */
/* compiled from: PG */
public final class C11304b extends C11303a {

    /* renamed from: a */
    public final String f36740a;

    /* renamed from: b */
    public final String f36741b;

    /* renamed from: c */
    public final Double f36742c;

    /* renamed from: d */
    public final Double f36743d;

    public C11304b(String str, String str2, Double d, Double d2) {
        this.f36740a = str;
        this.f36741b = str2;
        this.f36742c = d;
        this.f36743d = d2;
    }

    /* renamed from: a */
    public final Double mo19733a() {
        return this.f36742c;
    }

    /* renamed from: b */
    public final Double mo19734b() {
        return this.f36743d;
    }

    /* renamed from: c */
    public final String mo19735c() {
        return this.f36740a;
    }

    /* renamed from: d */
    public final String mo19736d() {
        return this.f36741b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11303a) {
            C11303a aVar = (C11303a) obj;
            String str = this.f36740a;
            if (str != null ? str.equals(aVar.mo19735c()) : aVar.mo19735c() == null) {
                String str2 = this.f36741b;
                if (str2 != null ? str2.equals(aVar.mo19736d()) : aVar.mo19736d() == null) {
                    Double d = this.f36742c;
                    if (d != null ? d.equals(aVar.mo19733a()) : aVar.mo19733a() == null) {
                        Double d2 = this.f36743d;
                        if (d2 != null ? d2.equals(aVar.mo19734b()) : aVar.mo19734b() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.f36740a;
        String str2 = this.f36741b;
        Double d = this.f36742c;
        Double d2 = this.f36743d;
        return "AssistantPlace{address=" + str + ", name=" + str2 + ", latitude=" + d + ", longitude=" + d2 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.f36740a;
        int i4 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i5 = (i ^ 1000003) * 1000003;
        String str2 = this.f36741b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i6 = (i5 ^ i2) * 1000003;
        Double d = this.f36742c;
        if (d == null) {
            i3 = 0;
        } else {
            i3 = d.hashCode();
        }
        int i7 = (i6 ^ i3) * 1000003;
        Double d2 = this.f36743d;
        if (d2 != null) {
            i4 = d2.hashCode();
        }
        return i7 ^ i4;
    }
}
